

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;


public class TestMts {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
    }


    @Test
    public void nameTest() {

        WebElement element = driver.findElement(By.xpath("//div[@id='pay-section']/div/div/div[2]/section/div/h2"));
        String text = element.getText();

        Assert.assertEquals(text, "Онлайн пополнение\n" + "без комиссии");
    }

    @Test
    public void VisaTest() {

        WebElement element = driver.findElement(By.xpath("//img[@alt='Visa']"));
        String logo = element.getDomAttribute("alt");

        Assert.assertEquals(logo, "Visa");
    }

    @Test
    public void verifiedByVisaTest() {

        WebElement element = driver.findElement(By.xpath("//img[@alt='Verified By Visa']"));
        String logo = element.getDomAttribute("alt");

        Assert.assertEquals(logo, "Verified By Visa");
    }

    @Test
    public void masterCardTest() {

        WebElement element = driver.findElement(By.xpath("//img[@alt='MasterCard']"));
        String logo = element.getDomAttribute("alt");

        Assert.assertEquals(logo, "MasterCard");

    }

    @Test
    public void masterCardSecureCodeTest() {

        WebElement element = driver.findElement(By.xpath("//img[@alt='MasterCard Secure Code']"));
        String logo = element.getDomAttribute("alt");

        Assert.assertEquals(logo, "MasterCard Secure Code");
    }

    @Test
    public void belcartTest() {

        WebElement element = driver.findElement(By.xpath("//img[@alt='Белкарт']"));
        String logo = element.getDomAttribute("alt");

        Assert.assertEquals(logo, "Белкарт");
    }

    @Test
    public void linkTest() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement cookiesAgreement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='cookie-agree']")));
        cookiesAgreement.click();

        WebElement element = driver.findElement(By.xpath("//div[@class='pay__wrapper']//a"));
        element.click();

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/"));

        String link = driver.getCurrentUrl();
        Assert.assertEquals(link, "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/");
    }


    @Test
    public void buttonContinueTest() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        WebElement cookiesAgreement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='cookie-agree']")));
        cookiesAgreement.click();

        WebElement phoneInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='connection-phone']")));
        phoneInput.click();
        phoneInput.sendKeys("297777777");

        WebElement sumInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='connection-sum']")));
        sumInput.click();
        sumInput.sendKeys("55");

        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='pay-connection']/button")));
        button.click();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}



