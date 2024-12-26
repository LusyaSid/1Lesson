import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PayPage {
    private WebDriver driver;

    public PayPage(WebDriver driver){
        this.driver=driver;
    }

    By nameBlok= By.xpath("//div[@id='pay-section']/div/div/div[2]/section/div/h2");
    By logoVisa=By.xpath("//img[@alt='Visa']");
    By logoVerifiedByVisa=By.xpath("//img[@alt='Verified By Visa']");
    By logoMasterCard=By.xpath("//img[@alt='MasterCard']");
    By logoMasterCardSecureCode=By.xpath("//img[@alt='MasterCard Secure Code']");
    By logoBelcart=By.xpath("//img[@alt='Белкарт']");
    By link=By.xpath("//div[@class='pay__wrapper']//a");
    By buttonContinue=By.xpath("//*[@id='pay-connection']/button");
    By cookies=By.xpath("//*[@id='cookie-agree']");
    By phoneInput=By.xpath("//*[@id='connection-phone']");
    By sumInput=By.xpath("//*[@id='connection-sum']");
    By uslugiSvyazi=By.xpath("//p[ text()='Услуги связи']");
    By homeInternet=By.xpath("//p[ text()='Домашний интернет']");
    By rassrochka=By.xpath("//p[ text()='Рассрочка']");
    By debt=By.xpath("//p[ text()='Задолженность']");
    By totalAmount=By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/div/div[1]/span[1]");
    By numberPhone=By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/div/div[2]/span");
    By buttonPay=By.xpath("//div[@class='card-page__card']//button[@type='submit']/text()");
    By numberCard=By.xpath("//div[@class='content ng-tns-c46-1']//label");
    By validityPeriod=By.xpath("//div[@class='content ng-tns-c46-4']//label");
    By cvc=By.xpath("//div[@class='content ng-tns-c46-5']//label");
    By holderCard =By.xpath("//div[@class='content ng-tns-c46-3']//label");
    By logoVisa1=By.xpath("//div[@class='cards-brands ng-tns-c46-1']//img[@src='assets/images/payment-icons/card-types/visa-system.svg']");
    By logoMasterCard1=By.xpath("//div[@class='cards-brands ng-tns-c46-1']//img[@src='assets/images/payment-icons/card-types/mastercard-system.svg']");
    By logoBelcart1=By.xpath("//div[@class='cards-brands ng-tns-c46-1']//img[@src='assets/images/payment-icons/card-types/belkart-system.svg']");
    By logoCardMir=By.xpath("//div[@class='cards-brands ng-tns-c46-1']//img[@src='assets/images/payment-icons/card-types/mir-system-ru.svg']");




}
