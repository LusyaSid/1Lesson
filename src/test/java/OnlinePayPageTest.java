import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class OnlinePayPageTest {
    private WebDriver driver;
    private OnlinePayPage onlinePayPage;

    @BeforeEach
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.mts.by/");
        onlinePayPage=new OnlinePayPage(driver);
        onlinePayPage.clickCookies();
    }

    @AfterEach
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void blockNameTest(){
       String text=onlinePayPage.getNameBlock();
       Assertions.assertEquals("Онлайн пополнение\n" + "без комиссии",text);
    }

    @ParameterizedTest
    @CsvSource({
            "Visa,https://www.mts.by/local/templates/new_design/assets/html/images/pages/index/pay/visa.svg",
            "Verified By Visa,https://www.mts.by/local/templates/new_design/assets/html/images/pages/index/pay/visa-verified.svg",
            "MasterCard,https://www.mts.by/local/templates/new_design/assets/html/images/pages/index/pay/mastercard.svg",
            "MasterCard Secure Code,https://www.mts.by/local/templates/new_design/assets/html/images/pages/index/pay/mastercard-secure.svg",
            "Белкарт,https://www.mts.by/local/templates/new_design/assets/html/images/pages/index/pay/belkart.svg"})

    public void logoTest(String logoName,String expectedSrc){
        By logoLocator;

        switch (logoName){
            case "Visa":
                logoLocator=onlinePayPage.logoVisa;
                break;
            case "Verified By Visa":
                logoLocator=onlinePayPage.logoVerifiedByVisa;
                break;
            case "MasterCard":
                logoLocator=onlinePayPage.logoMasterCard;
                break;
            case "MasterCard Secure Code":
                logoLocator=onlinePayPage.logoMasterCardSecureCode;
                break;
            case "Белкарт":
                logoLocator=onlinePayPage.logoBelcart;
                break;
            default:
                throw new IllegalArgumentException("Unknown logo: " + logoName);

        }
        String logoSrc=onlinePayPage.getLogoSrc(logoLocator);
        assertTrue(logoSrc.contains(expectedSrc),"Логотип" + logoName + "имеет неправильный URL:" + logoSrc);
    }

    @Test
    public void linkTextTest(){
        LinkPage linkPage=onlinePayPage.clickLink();
        String currentUrl= driver.getCurrentUrl();
        Assertions.assertEquals("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/",currentUrl);
    }

    @Test
    public void buttonContinueTest(){
        onlinePayPage.oplataUslugi("297777777","34");
    }

    @Test
    public void paymentUslugiSvyaziTest(){
        onlinePayPage.paymentUslugiSvyazi();
    }

    @Test
    public void paymentHomeInternetTest(){
        onlinePayPage.paymentHomeInternet();
    }

    @Test
    public void paymentRassrochkaTest(){
        onlinePayPage.paymentRassrochka();
    }

    @Test
    public void paymentDebtTest(){
        onlinePayPage.paymentDebt();
    }
}
