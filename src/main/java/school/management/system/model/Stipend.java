package school.management.system.model;

public class Stipend {

    private final Money basicStipend = new Money(125);
    private final Money higherStipend = new Money(250);
    private final Money highestStipend = new Money(390);

    public Money getBasicStipend() {
        return basicStipend;
    }

    public Money getHigherStipend() {
        return higherStipend;
    }

    public Money getHighestStipend() {
        return highestStipend;
    }
}
