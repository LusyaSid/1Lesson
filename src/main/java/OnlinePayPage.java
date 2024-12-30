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
    By buttonTypesOfServices=By.xpath("//*[@id='pay-section']//div[@class='select__wrapper']//button");
    By countryCodeOfUslugiSvyazi=By.xpath("//div[@class='input-wrapper input-wrapper_label-left']//label");
    By placeholderNumberPhoneOfUslugiSvyazi=By.xpath("//*[@id='connection-phone']");
    By placeholderSummaOfUslugiSvyazi=By.xpath("//*[@id='connection-sum']");
    By placeholderEmailOfUslugiSvyazi=By.xpath("//*[@id='connection-email']");
    By countryCodeOfHomeInternet=By.xpath("//*[@id='pay-internet']/div[1]/label");
    By placeholderNumberPhoneOfHomeInternet=By.xpath("//*[@id='internet-phone']");
    By placeholderSummaOfHomeInternet=By.xpath("//*[@id='internet-sum']");
    By placeholderEmailOfHomeInternet=By.xpath("//*[@id='internet-email']");
    By placeholderAccountNumberOfRassrochka=By.xpath("//*[@id='score-instalment']");
    By placeholderSummaOfRassrochka=By.xpath("//*[@id='instalment-sum']");
    By placeholderEmailOfRassrochka=By.xpath("//*[@id='instalment-email']");
    By placeholderAccountNumberOfDebt=By.xpath("//*[@id='score-arrears']");
    By placeholderSummaOfDebt=By.xpath("//*[@id='arrears-sum']");
    By placeholderEmailOfDebt=By.xpath("//*[@id='arrears-email']");
    By buttonUslugiSvyazi=By.xpath("//*[@id='pay-section']/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[1]/p");
    By buttonHomeInternet=By.xpath("//*[@id='pay-section']/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[2]/p");
    By buttonRassrochka=By.xpath("//*[@id='pay-section']/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[3]/p");
    By buttonDebt=By.xpath("//*[@id='pay-section']/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[4]/p");


    public void open(){
        driver.get("https://www.mts.by/");
    }

    public String getNameBlock(){
        return driver.findElement(nameBlock).getText();
    }

    public String getLogoVisa(){
        return driver.findElement(logoVisa).getDomAttribute("alt");
    }

    public String getLogoVerifiedByVisa(){
        return driver.findElement(logoVerifiedByVisa).getDomAttribute("alt");
    }

    public String getLogoMasterCard(){
        return driver.findElement(logoMasterCard).getDomAttribute("alt");
    }

    public String getLogoMasterCardSecureCode(){
        return driver.findElement(logoMasterCardSecureCode).getDomAttribute("alt");
    }

    public String getLogoBelcart(){
        return driver.findElement(logoBelcart).getDomAttribute("alt");
    }

    public LinkPage clickLink(){
         driver.findElement(link).click();
         return new LinkPage(driver);
    }

    public void clickCookies(){
        driver.findElement(cookies).click();
    }

    public OnlinePayPage typePhoneInput(String numberPhone){
        driver.findElement(phoneInput).sendKeys(numberPhone);
        return this;
    }

    public OnlinePayPage typeSumInput(String summa){
        driver.findElement(sumInput).sendKeys(summa);
        return this;
    }

    public PagePay clickButtonContinue(){
        driver.findElement(buttonContinue).click();
        return new PagePay(driver);
    }

    public PagePay oplataUslugi(String numberPhone,String summa){
        this.typePhoneInput(numberPhone);
        this.typeSumInput(summa);
        this.clickButtonContinue();
        return new PagePay(driver);
    }

    public OnlinePayPage clickButtonTypesOfServices(){
        driver.findElement(buttonTypesOfServices).click();
        return this;
    }

    public OnlinePayPage clickButtonUslugiSvyazi(){
        driver.findElement(buttonUslugiSvyazi).click();
        return this;
    }

    public String getCountryCodeOfUslugiSvyazi(){
        return driver.findElement(countryCodeOfUslugiSvyazi).getText();
    }

    public String getPlaceholderNumberPhoneOfUslugiSvyazi(){
        return driver.findElement(placeholderNumberPhoneOfUslugiSvyazi).getText();

    }

    public String getPlaceholderSummaOfUslugiSvyazi(){
        return driver.findElement(placeholderSummaOfUslugiSvyazi).getText();
    }

    public String getPlaceholderEmailOfUslugiSvyazi(){
        return driver.findElement(placeholderEmailOfUslugiSvyazi).getText();
    }

    public OnlinePayPage paymentUslugiSvyazi(){
        this.clickButtonTypesOfServices();
        this.clickButtonUslugiSvyazi();
        this.getCountryCodeOfUslugiSvyazi();
        this.getPlaceholderNumberPhoneOfUslugiSvyazi();
        this.getPlaceholderSummaOfUslugiSvyazi();
        this.getPlaceholderEmailOfUslugiSvyazi();
        return new OnlinePayPage(driver);
    }

    public OnlinePayPage clickButtonHomeInternet(){
        driver.findElement(buttonHomeInternet).click();
        return this;
    }

    public String getCountryCodeOfHomeInternet(){
        return driver.findElement(countryCodeOfHomeInternet).getText();
    }

    public String getPlaceholderNumberPhoneOfHomeInternet(){
        return driver.findElement(placeholderNumberPhoneOfHomeInternet).getText();
    }

    public String getPlaceholderSummaOfHomeInternet(){
        return driver.findElement(placeholderSummaOfHomeInternet).getText();
    }

    public String getPlaceholderEmailOfHomeInternet(){
        return driver.findElement(placeholderEmailOfHomeInternet).getText();
    }

    public OnlinePayPage paymentHomeInternet(){
        this.clickButtonTypesOfServices();
        this.clickButtonHomeInternet();
        this.getCountryCodeOfHomeInternet();
        this.getPlaceholderNumberPhoneOfHomeInternet();
        this.getPlaceholderSummaOfHomeInternet();
        this.getPlaceholderEmailOfHomeInternet();
        return new OnlinePayPage(driver);
    }

    public OnlinePayPage clickButtonRassrochka(){
        driver.findElement(buttonRassrochka).click();
        return this;
    }

    public String getPlaceholderAccountNumberOfRassrochka() {
        return driver.findElement(placeholderAccountNumberOfRassrochka).getText();
    }


    public String getPlaceholderSummaOfRassrochka(){
        return driver.findElement(placeholderSummaOfRassrochka).getText();
    }

    public String getPlaceholderEmailOfRassrochka(){
        return driver.findElement(placeholderEmailOfRassrochka).getText();
    }

    public OnlinePayPage paymentRassrochka(){
        this.clickButtonTypesOfServices();
        this.clickButtonRassrochka();
        this.getPlaceholderAccountNumberOfRassrochka();
        this.getPlaceholderSummaOfRassrochka();
        this.getPlaceholderEmailOfRassrochka();
        return new OnlinePayPage(driver);
    }

    public OnlinePayPage clickButtonDebt(){
        driver.findElement(buttonDebt).click();
        return this;
    }

    public String getPlaceholderAccountNumberOfDebt(){
        return driver.findElement(placeholderAccountNumberOfDebt).getText();
    }

    public String getPlaceholderSummaOfDebt(){
        return driver.findElement(placeholderSummaOfDebt).getText();
    }

    public String getPlaceholderEmailOfDebt(){
        return driver.findElement(placeholderEmailOfDebt).getText();
    }

    public OnlinePayPage paymentDebt(){
        this.clickButtonTypesOfServices();
        this.clickButtonDebt();
        this.getPlaceholderAccountNumberOfDebt();
        this.getPlaceholderSummaOfDebt();
        this.getPlaceholderEmailOfDebt();
        return new OnlinePayPage(driver);
    }
}
