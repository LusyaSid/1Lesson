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


public class TestMts{

    @Test

    public void sometest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        WebElement element=driver.findElement(By.xpath("//div[@id='pay-section']/div/div/div[2]/section/div/h2"));
        String text=element.getText();
        Assert.assertEquals(text,"Онлайн пополнение\n" + "без комиссии");


        driver.quit();

    }

}







