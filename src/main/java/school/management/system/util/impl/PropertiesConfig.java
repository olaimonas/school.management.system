package school.management.system.util.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesConfig {

    public String getInsufficientProfitMessage() {

        Properties properties = new Properties();

        // How the heck is this first try written?
        try (InputStream in = this.getClass().getClassLoader().getResourceAsStream("Application.properties")) {
            try {
                properties.load(in);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return properties.getProperty("insufficientProfitMessage");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty("insufficientProfitMessage");
    }

}