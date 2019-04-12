package Steps;

import Pages.Elements;
import Utilities.Driver;
import Utilities.MyLibrary;
import Utilities.TestBase;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Hooks extends TestBase {

    @Before(order = 1)
    public void setUp() {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Before(order = 2)
    public void setUp2() {
        act = new Actions(driver);
        wait = new WebDriverWait(driver, 10);
        e = new Elements();
        myLib = new MyLibrary(driver);
    }

    @Before(order = 3)
    public void setUp3() {

    }

    @After
    //every time test fail it will store failed tests cases in console to below variable
    public void endTest(Scenario result) {
        if (result.isFailed()) {
            TakesScreenshot ss = (TakesScreenshot) Driver.getDriver();
            result.embed(ss.getScreenshotAs(OutputType.BYTES), "image/png");
            //embed will put the screen shot to the report file
        }
        Driver.CloseDriver();
    }
}
