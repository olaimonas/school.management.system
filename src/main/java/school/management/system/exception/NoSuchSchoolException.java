package school.management.system.exception;

import school.management.system.util.impl.PropertiesConfig;

public class NoSuchSchoolException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1722073196266825972L;
	
	private static String message = new PropertiesConfig().getExceptionMessage("noSuchSchoolException");

    public NoSuchSchoolException() {
        this(message);
    }

    public NoSuchSchoolException(String message) {
        super();
        System.out.println(message);
    }
	
}
