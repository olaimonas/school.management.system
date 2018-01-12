package school.management.system.exception;

import school.management.system.util.impl.PropertiesConfig;

public class NoSuchStudentException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private static String message = PropertiesConfig.readKey(PropertiesConfig.PROPERTIES_FILENAME, "noSuchStudentException");

    public NoSuchStudentException() {
        this(message);
    }

    public NoSuchStudentException(String message) {
        super();
        System.out.println(message);
    }

}