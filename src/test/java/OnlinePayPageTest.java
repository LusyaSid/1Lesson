import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;



public class OnlinePayPageTest {
    private WebDriver driver;
    private OnlinePayPage onlinePayPage;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.mts.by/");
        onlinePayPage=new OnlinePayPage(driver);
        onlinePayPage.clickCookies();
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void blockName(){
       String text=onlinePayPage.getNameBlock();
       Assert.assertEquals("Онлайн пополнение\n" + "без комиссии",text);
    }

    @Test
    public void logoVisa(){
       String logo=onlinePayPage.getLogoVisa();
        Assert.assertEquals("Visa",logo);
    }

    @Test
    public void logoVerifiedByVisa(){
        String logo=onlinePayPage.getLogoVerifiedByVisa();
        Assert.assertEquals("Verified By Visa",logo);
    }

    @Test
    public void logoMasterCard(){
        String logo=onlinePayPage.getLogoMasterCard();
        Assert.assertEquals("MasterCard",logo);
    }

    @Test
    public void logoMasterCardSecureCode(){
        String logo=onlinePayPage.getLogoMasterCardSecureCode();
        Assert.assertEquals("MasterCard Secure Code",logo);
    }

    @Test
    public void logoBelcart(){
        String logo=onlinePayPage.getLogoBelcart();
        Assert.assertEquals("Белкарт",logo);
    }

    @Test
    public void linkText(){
        LinkPage linkPage=onlinePayPage.clickLink();
        String currentUrl= driver.getCurrentUrl();
        Assert.assertEquals("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/",currentUrl);
    }

    @Test
    public void buttonContinue(){
        onlinePayPage.oplataUslugi("297777777","34");
    }

    @Test
    public void paymentUslugiSvyazi(){
        onlinePayPage.paymentUslugiSvyazi();
    }

    @Test
    public void paymentHomeInternet(){
        onlinePayPage.paymentHomeInternet();
    }

    @Test
    public void paymentRassrochka(){
        onlinePayPage.paymentRassrochka();
    }

    @Test
    public void paymentDebt(){
        onlinePayPage.paymentDebt();
    }
}
