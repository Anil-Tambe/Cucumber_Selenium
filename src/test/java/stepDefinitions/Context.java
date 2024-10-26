package stepDefinitions;

import object.Login;

import java.util.Objects;

public class Context {
    public Context(){
    }

    private Login login = null;
    public Login getLoginPage(){
        if (Objects.isNull(login)){
            login = new Login();
        }
        return login;
    }
}
