import com.sun.security.jgss.GSSUtil;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PagePayTest {
    private WebDriver driver;
    private PagePay pagePay;
    private OnlinePayPage onlinePayPage;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.mts.by/");
        pagePay=new PagePay(driver);
        onlinePayPage=new OnlinePayPage(driver  );
        onlinePayPage.clickCookies();
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void SumPayTest(){
        onlinePayPage.oplataUslugi("297777777","34");
        String text=pagePay.getSumPay();
        Assert.assertEquals("34.00 BYN",text);
    }

    @Test
    public void NumberPhoneTest(){
        onlinePayPage.oplataUslugi("297777777","34");
        String text=pagePay.getNumberPhone();
        Assert.assertEquals("Оплата: Услуги связи Номер:375297777777",text);
    }

    @Test
    public void ButtonPayTest(){
        onlinePayPage.oplataUslugi("297777777","34");
        String text= pagePay.getButtonPay();
        Assert.assertEquals("Оплатить 34.00 BYN",text);
    }

    @Test
    public void NumberCardTest(){
        onlinePayPage.oplataUslugi("297777777","34");
        String text=pagePay.getNumberCard();
        Assert.assertEquals("Номер карты",text);
    }

    @Test
    public void ValidityPeriodTest(){
        onlinePayPage.oplataUslugi("297777777","34");
        String text=pagePay.getValidityPeriod();
        Assert.assertEquals("Срок действия",text);
    }

    @Test
    public void CvcTest(){
        onlinePayPage.oplataUslugi("297777777","34");
        String text=pagePay.getCvc();
        Assert.assertEquals("CVC",text);
    }

    @Test
    public void HolderCardTest(){
        onlinePayPage.oplataUslugi("297777777","34");
        String text=pagePay.getHolderCard();
        Assert.assertEquals("Имя держателя (как на карте)",text);
    }

    @Test
    public void logoVisaTest(){
        onlinePayPage.oplataUslugi("297777777","34");
        String logo=pagePay.getLogoVisa1();
        Assert.assertEquals("assets/images/payment-icons/card-types/visa-system.svg",logo);
    }

    @Test
    public void LogoBelcart1Test(){
        onlinePayPage.oplataUslugi("297777777","34");
        String logo=pagePay.getLogoBelcart1();
        Assert.assertEquals("assets/images/payment-icons/card-types/belkart-system.svg",logo);
    }

    @Test
    public void LogoMasterCard1Test(){
        onlinePayPage.oplataUslugi("297777777","34");
        String logo=pagePay.getLogoMasterCard1();
        Assert.assertEquals("assets/images/payment-icons/card-types/mastercard-system.svg",logo);
    }

    @Test
    public void LogoCardMirTest(){
        onlinePayPage.oplataUslugi("297777777","34");
        String logo=pagePay.getLogoCardMir();
        Assert.assertEquals("assets/images/payment-icons/card-types/mir-system-ru.svg",logo);
    }
}
