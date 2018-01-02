package school.management.system.util.impl;

public class IdGeneratorProvider {

    private static IdGenerator idGenerator = new IdGeneratorImpl();

    public static IdGenerator getIdGenerator() {
        return idGenerator;
    }

    public void setIdGenerator(IdGenerator idGenerator) {
        this.idGenerator = idGenerator;
    }

}