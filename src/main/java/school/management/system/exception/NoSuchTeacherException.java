package school.management.system.exception;

import school.management.system.util.impl.PropertiesConfig;

public class NoSuchTeacherException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6143986615125941932L;
	
	private static String message = PropertiesConfig.readKey(PropertiesConfig.PROPERTIES_FILENAME,"noSuchTeacherExceptiosn");

    public NoSuchTeacherException() {
        this(message);
    }

    public NoSuchTeacherException(String message) {
        super();
        System.out.println(message);
    }

}