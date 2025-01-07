import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
    By buttonPay=By.xpath("//div[@class='card-page__card']//button[@class='colored disabled']");
    By numberCard=By.xpath("//app-input[@class='full-width ng-tns-c61-0 ng-tns-c46-1 ng-star-inserted']/div/div/div[1]/label");
    By validityPeriod=By.xpath("//div[@class='content ng-tns-c46-4']//label");
    By cvc=By.xpath("//div[@class='content ng-tns-c46-5']//label");
    By holderCard=By.xpath("//app-input[@class='full-width ng-tns-c61-0 ng-tns-c46-3 ng-star-inserted']//label");
    By logoVisa1=By.xpath("//div[@class='cards-brands ng-tns-c46-1']//img");
    By logoMasterCard1=By.xpath("//div[@class='cards-brands ng-tns-c46-1']//img[2]");
    By logoBelcart1=By.xpath("//div[@class='cards-brands ng-tns-c46-1']//img[3]");
    By logoCardMir=By.xpath("//div[@class='cards-brands cards-brands_random ng-tns-c61-0 ng-star-inserted']//img[2]");

    public void switchToIframe(){
        WebElement frameElement= driver.findElement(By.xpath("//div[@class='bepaid-app']//iframe"));
        driver.switchTo().frame(frameElement);
    }

    public void switchToDefaultContent(){
        driver.switchTo().defaultContent();
    }

    public String getSumPay(){
        switchToIframe();
        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(sumPay));
        String text = element.getAttribute("textContent");
        switchToDefaultContent();
        return  text;
    }

    public String getNumberPhone(){
        switchToIframe();
        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(numberPhone));
        String text =element.getAttribute("textContent");
        switchToDefaultContent();
        return  text;
    }

    public String getButtonPay(){
        switchToIframe();
        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(buttonPay));
        String text=element.getAttribute("textContent");
        switchToDefaultContent();
        return text;
    }

    public String getNumberCard(){
        switchToIframe();
        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(numberCard));
        String text=element.getAttribute("textContent");
        switchToDefaultContent();
         return text;
    }

    public String getValidityPeriod(){
        switchToIframe();
        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(validityPeriod));
        String text=element.getAttribute("textContent");
        switchToDefaultContent();
        return text;
    }

    public String getCvc(){
        switchToIframe();
        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(cvc));
        String text=element.getAttribute("textContent");
        switchToDefaultContent();
        return text;
    }

    public String getHolderCard(){
        switchToIframe();
        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(holderCard));
        String text=element.getAttribute("textContent");
        switchToDefaultContent();
        return text;
    }

    public String getLogoVisa1(){
        switchToIframe();
        String text= driver.findElement(logoVisa1).getDomAttribute("src");
        switchToDefaultContent();
        return text;
    }

    public String getLogoMasterCard1(){
        switchToIframe();
        String text=driver.findElement(logoMasterCard1).getDomAttribute("src");
        switchToDefaultContent();
        return text;
    }

    public String getLogoBelcart1(){
        switchToIframe();
        String text=driver.findElement(logoBelcart1).getDomAttribute("src");
        switchToDefaultContent();
        return text;

    }

    public String getLogoCardMir(){
        switchToIframe();
        String text=driver.findElement(logoCardMir).getDomAttribute("src");
        switchToDefaultContent();
        return text;
    }
}



















