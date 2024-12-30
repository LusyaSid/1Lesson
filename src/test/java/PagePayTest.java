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
    public void SumPay(){
        PagePay updatedPagePay=onlinePayPage.oplataUslugi("297777777","34");
        String text=updatedPagePay.getSumPay();
        System.out.println("Actual sum pay:"+text);
        Assert.assertEquals("34.00 BYN\n",text);
    }

    @Test
    public void NumberPhone(){
        onlinePayPage.oplataUslugi("297777777","34");
        String text=pagePay.getNumberPhone();
        Assert.assertEquals("Оплата: Услуги связи Номер:375297777777",text);
    }

    @Test
    public void ButtonPay(){
        onlinePayPage.oplataUslugi("297777777","34");
        String text= String.valueOf(pagePay.getButtonPay());
        Assert.assertEquals("Оплатить 34.00 BYN",text);
    }

    @Test
    public void NumberCard(){
        onlinePayPage.oplataUslugi("297777777","34");
        String text=pagePay.getNumberCard();
        Assert.assertEquals("Номер карты",text);
    }
}
