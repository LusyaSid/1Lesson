import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.crome.driver","C:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        driver.get("http://www.google.com");

        OnlinePayPage onlinePayPage=new OnlinePayPage(driver);
        onlinePayPage.open();

        onlinePayPage.clickCookies();
       onlinePayPage.paymentUslugiSvyazi();
       onlinePayPage.paymentRassrochka();



    }
}