package school.management.system.exception;

import school.management.system.util.impl.PropertiesConfig;

public class InsufficientProfitException extends RuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static String message = PropertiesConfig.readKey(PropertiesConfig.getPropertiesFilename(), "insufficientProfitMessage");

    public InsufficientProfitException() {
        this(message);
    }

    public InsufficientProfitException(String message) {
        super();
        System.out.println(message);
    }

}