package Steps;


import Utilities.TestBase;
import cucumber.api.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class SearchSteps extends TestBase {
    //WE CANNOT EXTEND ANY CLASS THAT CONTAINS ANNOTATION OR TEST STEPS

    @When("go to {string} website")
    public void go_to_website(String string) {
        driver.navigate().to(string);
        //act.pause(2000).perform();
        myLib.sleep(2);
        wait.until(ExpectedConditions.visibilityOf(e.searchbox));

    }

    @Then("Enter {string} in search box")
    public void enter_in_search_box(String string) throws InterruptedException {
        e.searchbox.click();
        e.searchbox.sendKeys(string+ Keys.ENTER);
        myLib.TakeScreenshotsplease(string);
//        act.pause(1000).perform();
    }
    @When("enter {string} in the new Search box")
    public void enter_in_the_new_Search_box(String string) {
        e.AmazonSearch.click();
//        act.moveToElement(e.AmazonSearch).click().sendKeys(string+Keys.ENTER).perform();
       e.AmazonSearch.sendKeys(string+Keys.ENTER);

    }

}
