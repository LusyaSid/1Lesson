import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OnlinePayPage{
    protected WebDriver driver;

    public OnlinePayPage(WebDriver driver){
        this.driver=driver;
    }

    By nameBlock= By.xpath("//div[@id='pay-section']/div/div/div[2]/section/div/h2");
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

    public void open(){
        driver.get("https://www.mts.by/");
    }

    public OnlinePayPage getNameBlock(){
        driver.findElement(nameBlock).getText();
        return new OnlinePayPage(driver);
    }

    public OnlinePayPage getLogoVisa(){
        driver.findElement(logoVisa).getDomAttribute("alt");
        return new OnlinePayPage(driver);
    }

    public OnlinePayPage getLogoVerifiedByVisa(){
        driver.findElement(logoVerifiedByVisa).getDomAttribute("alt");
        return new OnlinePayPage(driver);
    }

    public OnlinePayPage getLogoMasterCard(){
        driver.findElement(logoMasterCard).getDomAttribute("alt");
        return new OnlinePayPage(driver);
    }

    public OnlinePayPage getLogoMasterCardSecureCode(){
        driver.findElement(logoMasterCardSecureCode).getDomAttribute("alt");
        return new OnlinePayPage(driver);
    }

    public OnlinePayPage getLogoBelcart(){
        driver.findElement(logoBelcart).getDomAttribute("alt");
        return new OnlinePayPage(driver);
    }

    public LinkPage getLink(){
        driver.findElement(link).getCurrentUrl();
        return new LinkPage(driver);
    }

    public OnlinePayPage clickCookies(){
        driver.findElement(cookies).click();
        return new OnlinePayPage(driver);
    }

    public OnlinePayPage typePhoneInput(String numberPhone){
        driver.findElement(phoneInput).sendKeys(numberPhone);
        return this;
    }

    public OnlinePayPage typeSumInput(String summa){
        driver.findElement(sumInput).sendKeys(summa);
        return this;
    }

    public PayPage clickButtonContinue(){
        driver.findElement(buttonContinue).click();
        return new PayPage(driver);
    }

    public OnlinePayPage getUslugiSvyazi(){
        driver.findElement(uslugiSvyazi).getText();
        return new OnlinePayPage(driver);
    }

    public OnlinePayPage getHomeInternet(){
        driver.findElement(homeInternet).getText();
        return new OnlinePayPage(driver);
    }

    public OnlinePayPage getRassrochka(){
        driver.findElement(rassrochka).getText();
        return new OnlinePayPage(driver);
    }

    public OnlinePayPage getDebt(){
        driver.findElement(debt).getText();
        return new OnlinePayPage(driver);
    }
    public LinkPage
}
