package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.asserts.SoftAssert;

public class DriverFactory {
    private static final ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();
    private static final ThreadLocal<Data> dataThreadLocal = new ThreadLocal<>();
    private static final ThreadLocal<SoftAssert> softAssertThreadLocal = new ThreadLocal<>();

    public static WebDriver driver(){
        if(driverThreadLocal.get()==null){
            WebDriver driver = new EdgeDriver();
            driverThreadLocal.set(driver);
            data();
        }
        return driverThreadLocal.get();
    }

    public static Data data(){
        if(dataThreadLocal.get()==null){
            Data data = new Data();
            dataThreadLocal.set(data);
        }
        return dataThreadLocal.get();
    }

    public static SoftAssert softAssert(){
        if(softAssertThreadLocal.get()==null){
            SoftAssert softAssert = new SoftAssert();
            softAssertThreadLocal.set(softAssert);
        }
        return softAssertThreadLocal.get();
    }

    public static void driverTearDown(){
        driverThreadLocal.get().quit();
        driverThreadLocal.remove();
        dataThreadLocal.remove();
        SoftAssert softAssert = softAssert();
        softAssertThreadLocal.remove();
        softAssert.assertAll();
    }
}
