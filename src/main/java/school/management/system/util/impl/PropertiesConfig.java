package school.management.system.util.impl;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Properties;

public class PropertiesConfig {
	
	public static final String PROPERTIES_FILENAME = "Application.properties";
	
    public PropertiesConfig() {
    }
    
    public static String readKey(String propertiesFilename, String key) {
		Properties properties = new Properties();
    	if(propertiesFilename != null && !propertiesFilename.trim().isEmpty() && key != null && !key.trim().isEmpty()) {
    		try(FileInputStream fileInputStream = new FileInputStream(PropertiesConfig.class.getClassLoader().getResource(propertiesFilename).getFile())) {
    			properties.load(fileInputStream);
    			return String.valueOf(properties.get(key));
    		} catch(FileNotFoundException e) {
    			e.printStackTrace();
    		} catch(IOException e) {
    			e.printStackTrace();
    		}
    	}
    	return null;
    }
	
}