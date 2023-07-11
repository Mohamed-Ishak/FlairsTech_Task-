package steps;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;
import runners.TestNGRunner;
import testBase.TestBasePage;


import java.util.concurrent.TimeUnit;

public class RegistrationSteps extends TestBasePage {


    LandingPage landingPage ;
    EnterEmailPage enterEmailPage ;
    EnterPassConfirmPass passConfirmPass ;
    PersonalDetailsPage personalDetailsPage;
    SecondPersonalDetailsPage secondPersonalDetailsPage ;

    @BeforeTest
    @Given("User is navigated to Jumia website URL")
    public void user_is_navigated_to_Jumia_website_URL() {


        driver.navigate().to("https://www.jumia.com.eg/");
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);


    }

    @When("User shall close the POP-UP subscriber window")
    public void user_shall_close_the_POP_UP_subscriber_window() {
        landingPage = new LandingPage(driver);
        landingPage.closePOP();


    }

    @When("User click on the Account dropdownList")
    public void user_click_on_the_Account_dropdownList() {
        landingPage.clickOnMyAccountDropdownList();

    }

    @And("User click on Sign-In button")
    public void userClickOnSignInButton() {
        landingPage.clickOnSignUpBtn();
    }

    @Then("Welcome to Jumia context is displayed and user can enter a valid email")
    public void thenWelcomeToJumiaContextIsDisplayedAndUserCanEnterAValidEmail() {
        enterEmailPage = new EnterEmailPage(driver);
        String welcomeMessage = enterEmailPage.welcomeMeS();
        Assert.assertEquals("Welcome to Jumia",welcomeMessage);

    }

    @When("User is entered a valid {string} and click on Continue button")
    public void userIsEnteredAValidAndClickOnContinueButton(String email) {
        enterEmailPage.enterEmail(email);
        enterEmailPage.clickOnSubmit();
    }

    @And("User is entered a valid {string},confirmPassword and click on Continue button")
    public void userIsEnteredAValidConfirmPasswordAndClickOnContinueButton(String password) throws InterruptedException {
        passConfirmPass = new EnterPassConfirmPass(driver);
        passConfirmPass.enterPass(password);
        passConfirmPass.enterConfirmPass(password);
       // driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        Thread.sleep(3000);
        passConfirmPass.clickOnContinue();
    }

    @And("Personal details context is displayed and user cam enter {string},{string} , {string} and click on continue button")
    public void personalDetailsContextIsDisplayedAndUserCamEnterAndClickOnContinueButton(String firstName, String lastName, String phoneNum) {
        personalDetailsPage = new PersonalDetailsPage(driver);
        personalDetailsPage.enterPersonaDetails(firstName,lastName,phoneNum);
        personalDetailsPage.clickOnConBTN();
    }

    @And("User can select a gender , {string} and checked terms and conditions checkBox then click on continue button")
    public void userCanSelectAGenderBirthdateAndCheckedTermsAndConditionsCheckBoxThenClickOnContinueButton(String birth) {
        secondPersonalDetailsPage = new SecondPersonalDetailsPage(driver);
        secondPersonalDetailsPage.fillOtherMandatoryDetails(birth);

    }


}
