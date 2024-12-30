import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.awt.SystemColor.text;

public class PagePay {
    protected WebDriver driver;

    public PagePay(WebDriver driver){
        this.driver=driver;
    }


    By sumPay=By.xpath("//div[@class='pay-description__cost']//span[contains(text(), 'BYN')]");
    By numberPhone=By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/div/div[2]/span");
    By buttonPay=By.xpath("//div[@class='card-page__card']//button[@type='submit']/text()");
    By numberCard=By.xpath("//div[@class='content ng-tns-c46-1']//label");
    By validityPeriod=By.xpath("//div[@class='content ng-tns-c46-4']//label");
    By cvc=By.xpath("//div[@class='content ng-tns-c46-5']//label");
    By holderCard=By.xpath("//div[@class='content ng-tns-c46-3']//label");
    By logoVisa1=By.xpath("//div[@class='cards-brands ng-tns-c46-1']//img[@src='assets/images/payment-icons/card-types/visa-system.svg']");
    By logoMasterCard1=By.xpath("//div[@class='cards-brands ng-tns-c46-1']//img[@src='assets/images/payment-icons/card-types/mastercard-system.svg']");
    By logoBelcart1=By.xpath("//div[@class='cards-brands ng-tns-c46-1']//img[@src='assets/images/payment-icons/card-types/belkart-system.svg']");
    By logoCardMir=By.xpath("//div[@class='cards-brands ng-tns-c46-1']//img[@src='assets/images/payment-icons/card-types/mir-system-ru.svg']");

    public String getSumPay(){
        WebElement frameElement=driver.findElement(By.xpath("//div[@class='bepaid-app']//iframe"));
        driver.switchTo().frame(frameElement);
        String text = driver.findElement(sumPay).getText();
        driver.switchTo().defaultContent();
        return  text;
    }

    public String getNumberPhone(){
        WebElement frameElement=driver.findElement(By.xpath("//div[@class='bepaid-app']//iframe"));
        driver.switchTo().frame(frameElement);
        String text =driver.findElement(numberPhone).getText();
        return text;
        driver.switchTo().defaultContent();

    }

    public boolean getButtonPay(){
        return driver.findElement(buttonPay).isDisplayed();
    }

    public String getNumberCard(){
        return driver.findElement(numberCard).getText();
    }

    public String getValidityPeriod(){
        return driver.findElement(validityPeriod).getText();
    }

    public String getCvc(){
        return driver.findElement(cvc).getText();
    }

    public String getHolderCard(){
        return driver.findElement(holderCard).getText();
    }

    public String getLogoVisa1(){
        return driver.findElement(logoVisa1).getDomAttribute("src");
    }

    public String getLogoMasterCard1(){
        return driver.findElement(logoMasterCard1).getDomAttribute("src");
    }

    public String getLogoBelcart1(){
        return driver.findElement(logoBelcart1).getDomAttribute("src");

    }

    public String getLogoCardMir(){
        return driver.findElement(logoCardMir).getDomAttribute("src");
    }
}



















