import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LinkPage {

    protected WebDriver driver;

    public LinkPage(WebDriver driver){
        this.driver=driver;
    }

    By link=By.xpath("//div[@class='pay__wrapper']//a");

    public LinkPage getLinkText(){
        driver.findElement(link).getText();
        return new LinkPage(driver);
    }
}
