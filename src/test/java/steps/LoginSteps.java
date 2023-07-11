package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.*;
import testBase.TestBasePage;



import java.util.List;
import java.util.concurrent.TimeUnit;




public class LoginSteps extends TestBasePage {

   LandingPage landingPage ;
   EnterEmailPage enterEmailPage;
   EnterPassConfirmPass passConfirmPass;
   ProductsPage productsPage ;
   CartPage cartPage ;

    @And("User select My Account option")
    public void userSelectMyAccountOption() {
    landingPage = new LandingPage(driver);
    landingPage.clickONMyAccountOption();

    }

    @And("User is entered a valid {string} and press on Continue button")
    public void userIsEnteredAValidAndPressOnContinueButton(String email) {
        enterEmailPage = new EnterEmailPage(driver);
        enterEmailPage.enterEmail(email);
        enterEmailPage.clickOnSubmit();
    }

    @And("User is entered a valid {string}")
    public void userIsEnteredAValidAndClickedTheContinueButton(String password) {
        passConfirmPass = new EnterPassConfirmPass(driver);
        passConfirmPass.enterPass(password);
    }


    @And("User press on Login button")
    public void userPressOnLoginButton() {
       passConfirmPass.clickOnLoginBTN();
    }

    @And("User hover on the hamburger menu then hover on Supermarket")
    public void userHoverOnTheHamburgerMenuThenHoverOnSupermarket() {
        landingPage = new LandingPage(driver);
        landingPage.hoverOnHamburgerMenu();


    }

    @And("User select two items")
    public void userSelectTwoItems() throws InterruptedException {
        productsPage = new ProductsPage(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        productsPage.clickOnFirstProduct();
        Thread.sleep(2000);
        productsPage.clickOnSecondProduct();
    }

    @And("user checked that items are added successfully")
    public void userCheckedThatItemsAreAddedSuccessfully() throws InterruptedException {
        Thread.sleep(2000);
        productsPage =new ProductsPage(driver);
        productsPage.clickOnCartBTN();
        cartPage = new CartPage(driver);
        String cartNumber = cartPage.getCartQuantity();
        int x =  cartNumber.charAt(6);
        int value = Character.getNumericValue(x);
        System.out.println(value);
        Assert.assertEquals(2,value);
    }

    @Then("User checked that the total price of items is calculated correctly")
    public void userCheckedThatTheTotalPriceOfItemsIsCalculatedCorrectly() {

        List<WebElement> prices = driver.findElements(By.xpath("//article/a/div/div[@class='prc']"));
        int sum = 0;

        for (int i = 0; i < prices.size(); i++) {

             //System.out.println(prices.get(i).getText());
              String rel1 = prices.get(i).getText().substring(4);
              System.out.println(rel1);
            //  sum = Integer.parseInt(rel1);
        }
       // System.out.println(sum);

        String calculatedTotal = cartPage.getTotal().substring(4);
        System.out.println(calculatedTotal);


    }
}