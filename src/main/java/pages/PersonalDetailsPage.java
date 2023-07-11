package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalDetailsPage extends PageBase{

    @FindBy(id = "input_first_name")
    WebElement fName ;

    @FindBy(id = "input_last_name")
    WebElement lName;

    @FindBy(xpath = "//input[@type='tel']")
    WebElement phoneNUM ;

    @FindBy(xpath = "//button[@class='mdc-button mdc-button--touch mdc-button--raised to-personal-details-part-2 mdc-ripple-upgraded']")
    WebElement continueBTn ;

    public PersonalDetailsPage(WebDriver driver) {
        super(driver);
    }

    public void enterPersonaDetails(String first_Name , String last_Name , String phone_Num){
        fName.sendKeys(first_Name);
        lName.sendKeys(last_Name);
        phoneNUM.sendKeys(phone_Num);

    }
    public void clickOnConBTN(){
        continueBTn.click();
    }
}
