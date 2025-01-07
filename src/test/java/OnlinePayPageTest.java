import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


public class OnlinePayPageTest {
    private WebDriver driver;
    private OnlinePayPage onlinePayPage;

    @BeforeEach
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
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

    @Test
    public void logoVisaTest(){
       String logo=onlinePayPage.getLogoVisa();
        Assertions.assertEquals("Visa",logo);
    }

    @Test
    public void logoVerifiedByVisaTest(){
        String logo=onlinePayPage.getLogoVerifiedByVisa();
        Assertions.assertEquals("Verified By Visa",logo);
    }

    @Test
    public void logoMasterCardTest(){
        String logo=onlinePayPage.getLogoMasterCard();
        Assertions.assertEquals("MasterCard",logo);
    }

    @Test
    public void logoMasterCardSecureCodeTest(){
        String logo=onlinePayPage.getLogoMasterCardSecureCode();
        Assertions.assertEquals("MasterCard Secure Code",logo);
    }

    @Test
    public void logoBelcartTest(){
        String logo=onlinePayPage.getLogoBelcart();
        Assertions.assertEquals("Белкарт",logo);
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
}
