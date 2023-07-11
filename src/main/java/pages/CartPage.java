package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends PageBase{

    @FindBy(xpath = "//h2[@class='-fs20 -m -phm -pvxs']")
    WebElement cartQuantity ;


    @FindBy(xpath = "//div[@class='-df -i-ctr -j-bet -m -fs14 -pas']/p[@class='-fs20 -plm -tar']")
    WebElement subtotal ;


    public CartPage(WebDriver driver) {
        super(driver);
    }

    public String getCartQuantity(){
        return cartQuantity.getText();
    }

    public String getTotal(){
        return subtotal.getText();
    }
}
