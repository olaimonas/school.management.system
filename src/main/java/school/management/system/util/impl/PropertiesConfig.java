package school.management.system.util.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesConfig {
	
    public String getExceptionMessage(String message) {

    	String rootPath = Thread.currentThread().getContextClassLoader().getResource("Application.properties").getPath();
    	String appConfigPath = rootPath + "Application.properties";
    	
        Properties appProps = new Properties();
        try {
			appProps.load(new FileInputStream(appConfigPath));
			return appProps.getProperty(message);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return appProps.getProperty(message);
    }

}