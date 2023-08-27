package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import util.Data;

public class DriverFactory {
    private static ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();
    private static ThreadLocal<Data> dataThreadLocal = new ThreadLocal<>();

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

    public static void driverTearDown(){
        driverThreadLocal.get().quit();
        driverThreadLocal.set(null);
        dataThreadLocal.set(null);
    }
}
