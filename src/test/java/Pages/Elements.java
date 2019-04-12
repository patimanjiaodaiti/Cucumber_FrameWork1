package Pages;

import Utilities.Driver;
import Utilities.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements extends TestBase {
    //first we need to create page factory with constructor method
    public Elements(){
        PageFactory.initElements(driver,this);
    }
    //I can not put static cz i haven't create import static
    public @FindBy(xpath = ".//input[@class='gLFyf gsfi' and @type='text']")
    WebElement searchbox;
    public  @FindBy(xpath = ".//input[@type=\"text\" and @id=\"twotabsearchtextbox\"]")
    WebElement AmazonSearch;
}
