import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PagePay {
    protected WebDriver driver;

    public PagePay(WebDriver driver){
        this.driver=driver;
    }

    By sumPay=By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/div/div[1]/span[1]");
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
        return driver.findElement(sumPay).getText();
    }

    public String getNumberPhone(){
        return driver.findElement(numberPhone).getText();
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



















