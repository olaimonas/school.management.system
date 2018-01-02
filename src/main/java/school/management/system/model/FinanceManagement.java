package school.management.system.model;

import school.management.system.exception.InsufficientProfitException;
import school.management.system.util.impl.IdGenerator;

import java.math.BigDecimal;

public class FinanceManagement extends Department {

    private Money totalIncome = new Money(0);
    private Money totalExpenses = new Money(0);
    private Money profit = new Money(0);
    private Stipend stipend = new Stipend();

    public FinanceManagement() {
        super();
    }

    public void paySalary(Teacher teacher) {
        setTotalExpenses(getTotalExpenses().add(teacher.getSalary()));
    }

    public void payBasicStipend(Student student) {
        setTotalExpenses(getTotalExpenses().add(stipend.getBasicStipend()));
    }

    public void payHigherStipend(Student student) {
        setTotalExpenses(getTotalExpenses().add(stipend.getHigherStipend()));
    }

    public void payHighestStipend(Student student) {
        setTotalExpenses(getTotalExpenses().add(stipend.getHighestStipend()));
    }

    // Use only to count the profit
    private Money updateProfit() {
        profit = getTotalIncome().minus(getTotalExpenses());
        if(profit.getAmount().compareTo(BigDecimal.ZERO) < 0) {
            throw new InsufficientProfitException();
        }
        return profit;
    }

    public Money getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(Money totalIncome) {
        this.totalIncome = totalIncome;
    }

    public Money getTotalExpenses() {
        return totalExpenses;
    }

    public void setTotalExpenses(Money totalExpenses) {
        this.totalExpenses = totalExpenses;
    }

    public Money getProfit() {
        return updateProfit();
    }

    public void setProfit(Money profit) {
        this.profit = profit;
    }

    public Stipend getStipend() {
        return stipend;
    }

    public void setStipend(Stipend stipend) {
        this.stipend = stipend;
    }

}