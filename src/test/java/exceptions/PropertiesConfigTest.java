package exceptions;

import org.junit.Test;
import school.management.system.exception.NoStipendException;

public class PropertiesConfigTest {

    @Test
    public void noStipendExceptionTest() {
        new NoStipendException();
    }

}