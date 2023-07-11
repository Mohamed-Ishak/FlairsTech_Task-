package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnterPassConfirmPass extends PageBase {
////input[@class='mdc-text-field__input password-input  ']
    @FindBy(xpath = "//input[@class='mdc-text-field__input password-input  ']")
    WebElement pass ;

    @FindBy(xpath = "//input[@class='mdc-text-field__input confirm-password-input']")
    WebElement confirmPass ;

    @FindBy(xpath = "//button[@class='mdc-button mdc-button--touch mdc-button--raised to-personal-details mdc-ripple-upgraded']")
    WebElement continueBTN ;

    @FindBy(id = "loginButton")
    WebElement loginBTN ;

    public EnterPassConfirmPass(WebDriver driver) {
        super(driver);
    }

    public void enterPass(String password){
        pass.sendKeys(password);
    }

    public void enterConfirmPass(String password){
        confirmPass.sendKeys(password);
    }

    public void clickOnContinue(){
        continueBTN.click();
    }

    public void clickOnLoginBTN(){
        loginBTN.click();
    }
}
