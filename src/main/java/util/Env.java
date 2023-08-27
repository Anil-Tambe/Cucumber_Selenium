package util;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigFactory;

@Config.Sources("classpath:{env}.properties")
public interface Env extends Config {
    Env config = ConfigFactory.create(Env.class,System.getenv(),System.getProperties());

    @Key("url")
    String url();
}
