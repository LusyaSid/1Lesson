import jdk.jfr.Description;

import org.junit.jupiter.api.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.awt.*;
import java.util.concurrent.TimeUnit;


public class TestMts {

    @Test

    public void sometest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mts.by/");

        WebElement element = driver.findElement(By.xpath("//div[@id='pay-section']/div/div/div[2]/section/div/h2"));
        String text = element.getText();

        Assert.assertEquals(text, "Онлайн пополнение\n" + "без комиссии");

        driver.quit();
    }

    @Test
    public void someTest1() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        WebElement element = driver.findElement(By.xpath("//img[@alt='Visa']"));
        String logotip = element.getDomAttribute("alt");
        Assert.assertEquals(logotip, "Visa");
        driver.quit();
    }

    @Test
    public void someTest2() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        WebElement element = driver.findElement(By.xpath("//img[@alt='Verified By Visa']"));
        String logotip = element.getDomAttribute("alt");
        Assert.assertEquals(logotip, "Verified By Visa");
        driver.quit();
    }

    @Test
    public void someTest3() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        WebElement element = driver.findElement(By.xpath("//img[@alt='MasterCard']"));
        String logotip = element.getDomAttribute("alt");
        Assert.assertEquals(logotip, "MasterCard");
        driver.quit();
    }

    @Test
    public void someTest4() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        WebElement element = driver.findElement(By.xpath("//img[@alt='MasterCard Secure Code']"));
        String logotip = element.getDomAttribute("alt");
        Assert.assertEquals(logotip, "MasterCard Secure Code");
        driver.quit();
    }

    @Test
    public void someTest5() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        WebElement element = driver.findElement(By.xpath("//img[@alt='Белкарт']"));
        String logotip = element.getDomAttribute("alt");
        Assert.assertEquals(logotip, "Белкарт");
        driver.quit();
    }

    @Test
    public void someTest6() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mts.by/");


        WebElement element = driver.findElement(By.xpath("//div[@class='pay__wrapper']//a"));
        element.click();
        String link = driver.getCurrentUrl();
        Assert.assertEquals(link, "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/");
        driver.quit();

    }
}















