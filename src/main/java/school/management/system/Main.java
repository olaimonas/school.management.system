package school.management.system;

import school.management.system.ctx.Registry;
import school.management.system.exception.InsufficientProfitException;
import school.management.system.util.impl.IdGenerator;
import school.management.system.util.impl.IdGeneratorImpl;

public class Main {

    public static void main(String[] args) {

        // Test
        Registry.add(IdGenerator.class, new IdGeneratorImpl());

        // Test
    }
}