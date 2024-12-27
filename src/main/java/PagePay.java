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

    public PagePay getSumPay(){
        driver.findElement(sumPay).getText();
        return new PagePay(driver);
    }

    public PagePay getNumberPhone(){
        driver.findElement(numberPhone).getText();
        return PagePay(driver);
    }

    public PagePay getButtonPay(){
        driver.findElement(buttonPay).getText();
        return new PagePay(driver);
    }

    public PagePay getNumberCard(){
        driver.findElement(numberCard).getText();
        return new PagePay(driver);
    }

    public PagePay getValidityPeriod(){
        driver.findElement(validityPeriod).getText();
        return new PagePay(driver);
    }

    public PagePay getCvc(){
        driver.findElement(cvc).getText();
        return new PagePay(driver);
    }

    public PagePay getHolderCard(){
        driver.findElement(holderCard).getText();
        return new PagePay(driver);
    }

    public PagePay getLogoVisa1(){
        driver.findElement(logoVisa1).getText();
        return new PagePay(driver);
    }

    public PagePay getLogoMasterCard1(){
        driver.findElement(logoMasterCard1).getText();
        return new PagePay(driver);
    }

    public PagePay getLogoBelcart1(){
        driver.findElement(logoBelcart1).getText();
        return new PagePay(driver);
    }

    public PagePay getLogoCardMir(){
        driver.findElement(logoCardMir).getText();
        return new PagePay(driver);
    }
}



















