import com.sun.security.jgss.GSSUtil;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PagePayTest {
    private WebDriver driver;
    private PagePay pagePay;
    private OnlinePayPage onlinePayPage;

    @BeforeEach
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.mts.by/");
        pagePay=new PagePay(driver);
        onlinePayPage=new OnlinePayPage(driver  );
        onlinePayPage.clickCookies();
    }

    @AfterEach
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void sumPayTest(){
        onlinePayPage.oplataUslugi("297777777","34");
        String text=pagePay.getSumPay();
        Assertions.assertEquals("34.00 BYN",text);
    }

    @Test
    public void numberPhoneTest(){
        onlinePayPage.oplataUslugi("297777777","34");
        String text=pagePay.getNumberPhone();
        Assertions.assertEquals("Оплата: Услуги связи Номер:375297777777",text);
    }

    @Test
    public void buttonPayTest(){
        onlinePayPage.oplataUslugi("297777777","34");
        String text= pagePay.getButtonPay();
        Assertions.assertEquals("Оплатить 34.00 BYN",text);
    }

    @Test
    public void numberCardTest(){
        onlinePayPage.oplataUslugi("297777777","34");
        String text=pagePay.getNumberCard();
        Assertions.assertEquals("Номер карты",text);
    }

    @Test
    public void validityPeriodTest(){
        onlinePayPage.oplataUslugi("297777777","34");
        String text=pagePay.getValidityPeriod();
       Assertions.assertEquals("Срок действия",text);
    }

    @Test
    public void cvcTest(){
        onlinePayPage.oplataUslugi("297777777","34");
        String text=pagePay.getCvc();
        Assertions.assertEquals("CVC",text);
    }

    @Test
    public void holderCardTest(){
        onlinePayPage.oplataUslugi("297777777","34");
        String text=pagePay.getHolderCard();
        Assertions.assertEquals("Имя держателя (как на карте)",text);
    }
    /*
    @Test
    public void logoVisaTest(){
        onlinePayPage.oplataUslugi("297777777","34");
        String logo=pagePay.getLogoVisa1();
        Assertions.assertEquals("assets/images/payment-icons/card-types/visa-system.svg",logo);
    }

    @Test
    public void logoBelcart1Test(){
        onlinePayPage.oplataUslugi("297777777","34");
        String logo=pagePay.getLogoBelcart1();
       Assertions.assertEquals("assets/images/payment-icons/card-types/belkart-system.svg",logo);
    }

    @Test
    public void logoMasterCard1Test(){
        onlinePayPage.oplataUslugi("297777777","34");
        String logo=pagePay.getLogoMasterCard1();
       Assertions.assertEquals("assets/images/payment-icons/card-types/mastercard-system.svg",logo);
    }

    @Test
    public void logoCardMirTest(){
        onlinePayPage.oplataUslugi("297777777","34");
        String logo=pagePay.getLogoCardMir();
       Assertions.assertEquals("assets/images/payment-icons/card-types/mir-system-ru.svg",logo);
    }     */

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
