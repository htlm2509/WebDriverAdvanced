package cucumber.steps;

import abstractpages.page.AbstractPage;
import constants.Constants;
import desktop.fragments.*;
import desktop.pages.Basket;
import desktop.pages.PaymentCheckout;
import desktop.pages.SearchResults;
import driver.SingletonDriver;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

public class BaseSteps {

    private static final Map<String, AbstractPage> pageNameToObjectMap = new HashMap<>();

    public BaseSteps() {
        pageNameToObjectMap.put("Search page", new SearchResults());
        pageNameToObjectMap.put("Checkout", new PaymentCheckout());
        pageNameToObjectMap.put("Basket page", new Basket());
    }

    SoftAssertions softAssertions = new SoftAssertions();

    WebDriver driver = SingletonDriver.getDriver();

    HomePage bookDepositoryHomePage = new HomePage();

    SearchResultsPage bookDepositorySearchResultsPage = new SearchResultsPage();

    ModalDialogPage modalDialogPage = new ModalDialogPage();

    BasketPage basketPage = new BasketPage();

    PaymentPage paymentPage = new PaymentPage();

    FiltersBlockComponent filtersBlock = new FiltersBlockComponent();

    CookieConsentComponent cookieConsent = new CookieConsentComponent();

    public Map<String, String> createSiteUrlsMap() {
        Map<String, String> siteUrls = new HashMap<>();
        siteUrls.put("Initial home page", Constants.HOME_PAGE_URL);
        return siteUrls;
    }

    public AbstractPage getPageByName(String name) {
        return pageNameToObjectMap.get(name);
    }
}
