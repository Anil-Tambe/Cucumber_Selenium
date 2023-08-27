package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Base {
    WebDriverWait wait;
    public Base(){
        wait = new WebDriverWait(driver(), Duration.ofSeconds(2000));
    }

    public WebDriver driver(){
        return DriverFactory.driver();
    }

}
