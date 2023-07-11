package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnterEmailPage extends PageBase{

    @FindBy(css = "div[class='center'] h2")
    WebElement welcomeMessage ;

    @FindBy(id = "input_identifierValue")
    WebElement emailAddress;

    @FindBy(xpath = "//button [@type='submit']")
    WebElement submitBTN ;

    public EnterEmailPage(WebDriver driver) {
        super(driver);
    }


    public String welcomeMeS(){

       return welcomeMessage.getText();
    }

    public void enterEmail(String mail){
        emailAddress.sendKeys(mail);
    }

    public void clickOnSubmit(){
        submitBTN.click();
    }
}
