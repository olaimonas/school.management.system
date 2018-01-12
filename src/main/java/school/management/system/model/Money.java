package school.management.system.model;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Locale;

public class Money {

    private Locale currentLocale;
    private Currency currency;
    private BigDecimal amount;

    public Money(double amount) {
        currentLocale = Locale.getDefault();
        currency = Currency.getInstance(currentLocale);
        this.amount = new BigDecimal(amount);
    }

    public Money(BigDecimal amount) {
        currentLocale = Locale.getDefault();
        currency = Currency.getInstance(currentLocale);
        this.amount = amount;
    }

    public Money add(Money amount) {
        return new Money(this.getAmount().add(amount.getAmount()));
    }

    public Money minus(Money amount) {
        return new Money(this.getAmount().subtract(amount.getAmount()));
    }

    public Money multiply(Money amount) {
        return new Money(this.getAmount().multiply(amount.getAmount()));
    }

    public Money divide(Money amount) {
        return new Money(this.getAmount().divide(amount.getAmount()));
    }

    public Locale getCurrentLocale() {
        return currentLocale;
    }

    public void setCurrentLocale(Locale currentLocale) {
        this.currentLocale = currentLocale;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

}