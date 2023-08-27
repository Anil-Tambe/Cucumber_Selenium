package stepDefinitions;

import io.cucumber.java.en.When;
import object.Login;

public class LoginStepDef {
    Login login;
    public LoginStepDef(Login login){
        this.login = login;
    }
    @When("User opens the url")
    public void userOpensTheUrl() throws InterruptedException {
        login.login();
    }
}
