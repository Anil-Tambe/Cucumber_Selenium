package stepDefinitions;

import io.cucumber.java.en.When;
import object.Login;

public class LoginStepDef {
    Login login;
    public LoginStepDef(Context context){
        this.login = context.getLoginPage();
    }
    @When("User opens the url")
    public void userOpensTheUrl() throws InterruptedException {
        login.login();
    }
}
