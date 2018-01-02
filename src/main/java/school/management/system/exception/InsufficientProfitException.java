package school.management.system.exception;

import school.management.system.util.impl.PropertiesConfig;

public class InsufficientProfitException extends RuntimeException {

    private static String message = new PropertiesConfig().getInsufficientProfitMessage(); //"Sorry folks, you are not getting any salary this month. Our profit is not sufficient!";

    public InsufficientProfitException() {
        this(message);
    }

    public InsufficientProfitException(String message) {
        super();
        System.out.println(message);
    }

}