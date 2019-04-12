package Tests;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)//run the cucumber with junit
@CucumberOptions(features = "Features", tags = "@Google",glue = "Steps" ,dryRun = false,
        plugin = {"html:CucumberReports",
                "junit:CucumberReports/JunitReport.xml",
                "usage:CucumberReports/UsageReport.json",
                "pretty:CucumberReports/PrettyReport.txt",
        })
//if we run it like this it will generate test steps even tho if don't glue it
//hooks are before and after annotations in cucumber
//in testNG we must extend testBase class but in cucumber we don't have to
//ANY CLASS THAT CONTAINS CUCUMBER ANNOTATION CAN NO BE EXTENDS
//ANY CLASS THAT CONTAINS CUCUMBER STEP DEFINITION CAN NOT BE EXTENDS
//IN JAVA FINAL CLASS CAN NOT BE EXTEND JUST LIKE CUCUMBER
//IF THE STEP DEFINITION AND THE CUCUMBER ANNOTATIONS ARE NOT IN THE SAME PACKAGE WITH THE GLUE PACKAGE
     //ANNOTATION AND STEP DEFINITION WILL NOT APPLY
//glue decides where the cucumber step definition and annotation starts
//explicitly wait we must declare before each steps we execute but implicitly wait(find Element(s) waits
     //until html to appear)only once in before method

public class SomeTest {

}
