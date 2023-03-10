package desktop.pages;

import abstractpages.page.AbstractPage;
import constants.Constants;

public class PaymentCheckout extends AbstractPage {

    private static final String URL_PATTERN = ".*/payment.*";

    public PaymentCheckout() {
        setPageUrlPattern(URL_PATTERN);
        setPageUrl(Constants.PAYMENT_CHECKOUT_PAGE);
    }
}
