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
    By buttonTypesOfServices=By.xpath("//div[@class='select__wrapper opened']//button");
    By countryCodeOfUslugiSvyazi=By.xpath("//div[@class='input-wrapper input-wrapper_label-left']//label");
    By placeholderNumberPhoneOfUslugiSvyazi=By.xpath("//*[@id='connection-phone']");
    By placeholderSummaOfUslugiSvyazi=By.xpath("//*[@id='connection-sum']");
    By placeholderEmailOfUslugiSvyazi=By.xpath("//*[@id='connection-email']");
    By buttonSelectedNow=By.xpath("//*[@id='pay-section']/div/div/div[2]/section/div/div[1]/div[1]/div[2]/button");
    By countryCodeOfHomeInternet=By.xpath("//*[@id=pay-internet']/div[1]/label");
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

    public PagePay clickButtonContinue(){
        driver.findElement(buttonContinue).click();
        return new PagePay(driver);
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

    public OnlinePayPage clickButtonTypesOfServices(){
        driver.findElement(buttonTypesOfServices).click();
        return new OnlinePayPage(driver);
    }

    public OnlinePayPage clickButtonUslugiSvyazi(){
        driver.findElement(buttonUslugiSvyazi).click();
        return new OnlinePayPage(driver);
    }

    public OnlinePayPage getCountryCodeOfUslugiSvyazi(){
        driver.findElement(countryCodeOfUslugiSvyazi).getText();
        return new OnlinePayPage(driver);
    }

    public OnlinePayPage getPlaceholderNumberPhoneOfUslugiSvyazi(){
        driver.findElement(placeholderNumberPhoneOfUslugiSvyazi).getText();
        return new OnlinePayPage(driver);
    }

    public OnlinePayPage getPlaceholderSummaOfUslugiSvyazi(){
        driver.findElement(placeholderSummaOfUslugiSvyazi).getText();
        return new OnlinePayPage(driver);
    }

    public OnlinePayPage getPlaceholderEmailOfUslugiSvyazi(){
        driver.findElement(placeholderEmailOfUslugiSvyazi).getText();
        return new OnlinePayPage(driver);
    }

    public OnlinePayPage clickButtonHomeInternet(){
        driver.findElement(buttonHomeInternet).click();
        return new OnlinePayPage(driver);
    }

    public OnlinePayPage getCountryCodeOfHomeInternet(){
        driver.findElement(countryCodeOfHomeInternet).getText();
        return new OnlinePayPage(driver);
    }

    public OnlinePayPage getPlaceholderNumberPhoneOfHomeInternet(){
        driver.findElement(placeholderNumberPhoneOfHomeInternet).getText();
        return new OnlinePayPage(driver);
    }

    public OnlinePayPage getPlaceholderSummaOfHomeInternet(){
        driver.findElement(placeholderSummaOfHomeInternet).getText();
        return new OnlinePayPage(driver);
    }

    public OnlinePayPage getPlaceholderEmailOfHomeInternet(){
        driver.findElement(placeholderEmailOfHomeInternet).getText();
        return new OnlinePayPage(driver);
    }

    public OnlinePayPage clickButtonRassrochka(){
        driver.findElement(buttonRassrochka).click();
        return new OnlinePayPage(driver);
    }

    public OnlinePayPage getPlaceholderAccountNumberOfRassrochka(){
        driver.findElement(placeholderAccountNumberOfRassrochka).getText();
        return new OnlinePayPage(driver);
    }

    public OnlinePayPage getPlaceholderSummaOfRassrochka(){
        driver.findElement(placeholderSummaOfRassrochka).getText();
        return new OnlinePayPage(driver);
    }

    public OnlinePayPage getPlaceholderEmailOfRassrochka(){
        driver.findElement(placeholderEmailOfRassrochka).getText();
        return new OnlinePayPage(driver);
    }

    public OnlinePayPage clickDuttonDebt(){
        driver.findElement(buttonDebt).click();
        return new OnlinePayPage(driver);
    }

    public OnlinePayPage getPlaceholderAccountNumberOfDebt(){
        driver.findElement(placeholderAccountNumberOfDebt).getText();
        return new OnlinePayPage(driver);
    }

    public OnlinePayPage getPlaceholderSummaOfDebt(){
        driver.findElement(placeholderSummaOfDebt).getText();
        return new OnlinePayPage(driver);
    }

    public OnlinePayPage getPlaceholderEmailOfDebt(){
        driver.findElement(placeholderEmailOfDebt).getText();
        return new OnlinePayPage(driver);
    }















}
