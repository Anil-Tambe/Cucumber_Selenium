package object;

import org.openqa.selenium.support.PageFactory;
import util.Base;
import util.Env;

public class Login extends Base {
    public Login(){
        super();
        PageFactory.initElements(driver(),this);

    }

    public void login() {
        driver().get(Env.config.url());
    }

}
