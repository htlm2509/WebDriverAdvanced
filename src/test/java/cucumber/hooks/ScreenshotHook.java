package cucumber.hooks;

import driver.SingletonDriver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenshotHook {

    @After
    public void takeScreenshot(Scenario scenario) {
        byte[] screenshot = ((TakesScreenshot) SingletonDriver
                .getDriver())
                .getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/jpg", scenario.getName());
    }
}
