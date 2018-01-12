package school.management.system.exception;

import school.management.system.util.impl.PropertiesConfig;

public class NoStipendException extends RuntimeException {

    private static final long serialVersionUID = -8930781785794725431L;

    private static String message = PropertiesConfig.readKey(PropertiesConfig.PROPERTIES_FILENAME, "noStipendException");

    public NoStipendException() {
        this(message);
    }

    public NoStipendException(String message) {
        super();
        System.out.println(message);
    }

}