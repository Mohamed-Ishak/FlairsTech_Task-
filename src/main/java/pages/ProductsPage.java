package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends PageBase{

    @FindBy(xpath = "//div[@class='-paxs row _no-g _4cl-3cm-shs']/article[1]/footer")
    WebElement firstProduct ;

    @FindBy(xpath = "//div[@class='-paxs row _no-g _4cl-3cm-shs']/article[2]/footer")
    WebElement secondProduct;

    @FindBy(xpath = "//a/span[@id='ci']")
    WebElement cartBTN ;

    public ProductsPage(WebDriver driver) {
        super(driver);
    }


    public void clickOnFirstProduct(){
        firstProduct.click();
    }

    public void clickOnSecondProduct(){
        secondProduct.click();
    }
    public void clickOnCartBTN(){
        cartBTN.click();
    }
}
