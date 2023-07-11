package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import testBase.TestBasePage;

@CucumberOptions(features = "src/test/java/features",glue="steps",tags = "@login",monochrome = true,plugin = {"html:target/cucumber.html"})
public class TestNGRunner extends TestBasePage {
}
