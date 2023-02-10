package desktop.fragments;

import abstractpages.fragment.AbstractFragment;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasketPage extends AbstractFragment {

    @FindBy(xpath = "//dl[@class='total']//dd")
    private WebElement orderTotal;

    @FindBy(xpath = "//dl[@class='delivery-text']//dd")
    private WebElement delivery;

    @FindBy(css = ".checkout-head-wrap .checkout-btn.first-variant")
    private WebElement checkoutButton;

    public void clickCheckoutButton() {
        clickButton(checkoutButton);
    }

    public String getOrderTotal() {
        waitUntilPageIsLoaded();
        return getElementText(orderTotal);
    }

    public String getDeliveryCost() {
        waitUntilPageIsLoaded();
        return getElementText(delivery);
    }
}
