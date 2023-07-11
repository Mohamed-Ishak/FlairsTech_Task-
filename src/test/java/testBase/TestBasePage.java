package testBase;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class TestBasePage extends AbstractTestNGCucumberTests {


   public static WebDriver driver ;


    @BeforeTest
    public void startDriver(){
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }


    @AfterTest
    public void closeDriver(){
        driver.quit();
    }
}
