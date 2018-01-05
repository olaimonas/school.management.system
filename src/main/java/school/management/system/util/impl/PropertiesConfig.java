package school.management.system.util.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesConfig {
	
	private static final String PROPERTIES_FILENAME = "Application.properties";
	
    private static ClassLoader objClassLoader = null;
    private static Properties properties = new Properties();
    
    public PropertiesConfig() {
    	objClassLoader = getClass().getClassLoader();
    }
    
    public static String readKey(String propertiesFilename, String key) {
    	if(propertiesFilename != null && !propertiesFilename.trim().isEmpty() && key != null && !key.trim().isEmpty()) {
    		// Try-with-resource
    		try(FileInputStream objFileInputStream = new FileInputStream(objClassLoader.getResource(propertiesFilename).getFile());) {
    			// Load file into properties
    			properties.load(objFileInputStream);
    			// Get the value of key
    			return String.valueOf(properties.get(key));
    		} catch(FileNotFoundException e) {
    			e.printStackTrace();
    		} catch(IOException e) {
    			e.printStackTrace();
    		}
    	}
    	return null;
    }

	public static String getPropertiesFilename() {
		return PROPERTIES_FILENAME;
	}
	
}