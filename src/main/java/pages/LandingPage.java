package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class LandingPage extends  PageBase{

  // WebElement closeButton = driver.findElement(By.xpath("//section[@class='cw']/button")) ;
    @FindBy(xpath = "//section[@class='cw']/button")
    WebElement closeBtn ;

    @FindBy(xpath = "//div[@class='dpdw _pcent'][1]")
    WebElement AccountDropdown ;

    @FindBy(xpath = "//div[@class='inbox']/div/a")
    WebElement signBtn ;

    @FindBy(xpath = "//div[@class='inbox']/div[@class='-pam -hr-bb']/following-sibling::a[1]")
    WebElement myAccountOption ;

    @FindBy(xpath = "//div[@class='dpdw _tail _auto-w _hov _pleft -df -i-ctr -prs -mra']")
    public WebElement hamburgerMenu ;

    @FindBy(linkText = "Supermarket")
    WebElement superMarketOption ;

    @FindBy(linkText = "Bakery")
    WebElement bakeryProducts ;

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    public void closePOP(){
        closeBtn.click();
    }

    public void clickOnMyAccountDropdownList(){
        AccountDropdown.click();
    }

    public void clickOnSignUpBtn(){
          signBtn.click();
    }

    public void clickONMyAccountOption(){
        myAccountOption.click();
    }

    public void hoverOnHamburgerMenu(){

      Actions actions = new Actions(driver);
      actions.moveToElement(hamburgerMenu).build().perform();
      actions.moveToElement(superMarketOption).build().perform();
      bakeryProducts.click();
    }
}
