import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class PagePay {
    private WebDriver driver;
    private WebDriverWait wait;

    public PagePay(WebDriver driver){
        this.driver=driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    By sumPay=By.xpath("//div[@class='pay-description__cost']//span[contains(text(), 'BYN')]");
    By numberPhone=By.xpath("//div[@class='pay-description__text']//span");
    By buttonPay=By.xpath("//div[@class='card-page__card']//button[@type='submit']/text()");
    By numberCard=By.xpath("//app-input[@class='full-width ng-tns-c61-0 ng-tns-c46-1 ng-star-inserted']/div/div/div[1]/label");
    By validityPeriod=By.xpath("//div[@class='content ng-tns-c46-4']//label");
    By cvc=By.xpath("//div[@class='content ng-tns-c46-5']//label");
    By holderCard=By.xpath("//app-input[@class='full-width ng-tns-c61-0 ng-tns-c46-3 ng-star-inserted']//label");
    By logoVisa1=By.xpath("//div[@class='cards-brands ng-tns-c46-1']//img");
    By logoMasterCard1=By.xpath("//div[@class='cards-brands ng-tns-c46-1']//img[2]");
    By logoBelcart1=By.xpath("//div[@class='cards-brands ng-tns-c46-1']//img[3]");
    By logoCardMir=By.xpath("//div[@class='cards-brands cards-brands_random ng-tns-c61-0 ng-star-inserted']//img[2]");


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
        String text = driver.findElement(numberPhone).getText();
        driver.switchTo().defaultContent();
        return  text;
    }

    public String getButtonPay(){
        WebElement frameElement=driver.findElement(By.xpath("//div[@class='bepaid-app']//iframe"));
        driver.switchTo().frame(frameElement);
       String text=driver.findElement(buttonPay).getText();
        driver.switchTo().defaultContent();
        return text;
    }

    public String getNumberCard(){
        WebElement frameElement=driver.findElement(By.xpath("//div[@class='bepaid-app']//iframe"));
        driver.switchTo().frame(frameElement);
        String text=driver.findElement(numberCard).getText();
        driver.switchTo().defaultContent();
         return text;
    }

    public String getValidityPeriod(){
        WebElement frameElement=driver.findElement(By.xpath("//div[@class='bepaid-app']//iframe"));
        driver.switchTo().frame(frameElement);
        String text=driver.findElement(validityPeriod).getText();
        driver.switchTo().defaultContent();
        return text;
    }

    public String getCvc(){
        WebElement frameElement=driver.findElement(By.xpath("//div[@class='bepaid-app']//iframe"));
        driver.switchTo().frame(frameElement);
        String text=driver.findElement(cvc).getText();
        driver.switchTo().defaultContent();
        return text;
    }

    public String getHolderCard(){
        WebElement frameElement=driver.findElement(By.xpath("//div[@class='bepaid-app']//iframe"));
        driver.switchTo().frame(frameElement);
        String text=driver.findElement(holderCard).getText();
        driver.switchTo().defaultContent();
        return text;
    }

    public String getLogoVisa1(){
        WebElement frameElement=driver.findElement(By.xpath("//div[@class='bepaid-app']//iframe"));
        driver.switchTo().frame(frameElement);
        String text= driver.findElement(logoVisa1).getDomAttribute("src");
        driver.switchTo().defaultContent();
        return text;
    }

    public String getLogoMasterCard1(){
        WebElement frameElement=driver.findElement(By.xpath("//div[@class='bepaid-app']//iframe"));
        driver.switchTo().frame(frameElement);
        String text=driver.findElement(logoMasterCard1).getDomAttribute("src");
        driver.switchTo().defaultContent();
        return text;
    }

    public String getLogoBelcart1(){
        WebElement frameElement=driver.findElement(By.xpath("//div[@class='bepaid-app']//iframe"));
        driver.switchTo().frame(frameElement);
        String text=driver.findElement(logoBelcart1).getDomAttribute("src");
        driver.switchTo().defaultContent();
        return text;

    }

    public String getLogoCardMir(){
        WebElement frameElement=driver.findElement(By.xpath("//div[@class='bepaid-app']//iframe"));
        driver.switchTo().frame(frameElement);
        String text=driver.findElement(logoCardMir).getDomAttribute("src");
        driver.switchTo().defaultContent();
        return text;
    }


}



















