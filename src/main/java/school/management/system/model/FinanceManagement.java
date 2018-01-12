package school.management.system.model;

import org.springframework.stereotype.Component;
import school.management.system.exception.InsufficientProfitException;

import java.math.BigDecimal;

@Component
public class FinanceManagement extends Department {

    private Money totalIncome = new Money(0);
    private Money totalExpenses = new Money(0);
    private Money profit = new Money(0);

    public FinanceManagement() {
        super();
    }

    public void paySalary(Teacher teacher) {
        setTotalExpenses(getTotalExpenses().add(teacher.getSalary()));
    }

    public void payStipend(Student student) {
        setTotalExpenses(getTotalExpenses().add(student.getStipend()));
    }

    // Use only to count the profit
    private Money updateProfit() {
        profit = getTotalIncome().minus(getTotalExpenses());
        if (profit.getAmount().compareTo(BigDecimal.ZERO) < 0) {
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

}