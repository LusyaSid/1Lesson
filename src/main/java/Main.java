import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        driver.get("http://www.google.com");

        OnlinePayPage onlinePayPage=new OnlinePayPage(driver);
        PagePay pagePay=new PagePay(driver);
        driver.getPageSource();
        onlinePayPage.open();

        onlinePayPage.clickCookies();
        onlinePayPage.oplataUslugi("297777777","34");
        pagePay.getSumPay();

    }
}