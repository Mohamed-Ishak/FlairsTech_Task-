package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecondPersonalDetailsPage extends PageBase{

   @FindBy(css = "div[class='fields full-width']")
    WebElement genderList ;

   @FindBy(css = "div ul li[data-value='M']")
   WebElement genderType ;

   @FindBy(id = "input_birth_date")
   WebElement birthdateField;

   @FindBy(id = "input_birth_date")
   WebElement birthdateDate ;

   @FindBy(xpath = "//input[@type='checkbox']")
   WebElement checkBox ;

   @FindBy(id = "confirmBtn")
   WebElement confirmButton ;

    public SecondPersonalDetailsPage(WebDriver driver) {
        super(driver);
    }

    public void fillOtherMandatoryDetails(String birthday){
        genderList.click();
        genderType.click();
        birthdateField.click();
        birthdateDate.sendKeys(birthday);
        checkBox.click();
        confirmButton.click();
    }
}
