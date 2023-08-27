package runner;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import util.DriverFactory;

public class Hooks {

    @Before
    public void beforeMethod(Scenario scenario){
        DriverFactory.driver();
    }

    @After
    public void afterMethod(Scenario scenario){
        DriverFactory.driverTearDown();
    }
}
