import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class PagePayTest {
    private WebDriver driver;
    private PagePay pagePay;
    private OnlinePayPage onlinePayPage;
    private WebDriverWait wait;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.mts.by/");
        pagePay = new PagePay(driver);
        onlinePayPage = new OnlinePayPage(driver);
        wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        onlinePayPage.clickCookies();
    }

    @AfterEach
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void SumPayTest(){
        onlinePayPage.oplataUslugi("297777777","34");
        String text=pagePay.getSumPay();
        Assertions.assertEquals("34.00 BYN",text);
    }

    @Test
    public void NumberPhoneTest(){
        onlinePayPage.oplataUslugi("297777777","34");
        String text=pagePay.getNumberPhone();
        Assertions.assertEquals("Оплата: Услуги связи\n" + "Номер:375297777777",text);
    }

    @Test
    public void ButtonPayTest(){
        onlinePayPage.oplataUslugi("297777777","34");
        String text= pagePay.getButtonPay();
        Assertions.assertEquals(" Оплатить  34.00 BYN ",text);
    }

    @Test
    public void NumberCardTest(){
        onlinePayPage.oplataUslugi("297777777","34");
        String text=pagePay.getNumberCard();
        Assertions.assertEquals("Номер карты",text);
    }

    @Test
    public void ValidityPeriodTest(){
        onlinePayPage.oplataUslugi("297777777","34");
        String text=pagePay.getValidityPeriod();
        Assertions.assertEquals("Срок действия",text);
    }

    @Test
    public void CvcTest(){
        onlinePayPage.oplataUslugi("297777777","34");
        String text=pagePay.getCvc();
        Assertions.assertEquals("CVC",text);
    }

    @Test
    public void HolderCardTest(){
        onlinePayPage.oplataUslugi("297777777","34");
        String text=pagePay.getHolderCard();
        Assertions.assertEquals("Имя держателя (как на карте)",text);
    }

    @ParameterizedTest
    @CsvSource({
            "visa-system.svg,logoVisa1",
            "belkart-system.svg,logoBelcart1",
            "mastercard-system.svg,logoMasterCard1",
            "mir-system-ru.svg,logoCardMir"
    })
    public void logoTest(String expectedLogo,String logoVariable){
        onlinePayPage.oplataUslugi("297777777","34");

        By logoLocator;
        switch (logoVariable){
            case "logoVisa1":
                logoLocator=pagePay.logoVisa1;
                break;
            case "logoBelcart1":
                logoLocator=pagePay.logoBelcart1;
                break;
            case "logoMasterCard1":
                logoLocator=pagePay.logoMasterCard1;
                break;
            case "logoCardMir":
                logoLocator=pagePay.logoCardMir;
                break;
            default:
                throw new IllegalArgumentException("Неизвестная переменная:" + logoVariable);
        }
        String logoSrc=pagePay.getLogoSrc(logoLocator);
        Assertions.assertEquals("https://checkout.bepaid.by/widget_v2/assets/images/payment-icons/card-types/" + expectedLogo, logoSrc);
    }
}
