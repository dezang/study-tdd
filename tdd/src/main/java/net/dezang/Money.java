package net.dezang;

public class Money implements Expression {
    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

// Auto Generate
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Dollar dollar = (Dollar) o;
//        return amount == dollar.amount;
//    }

    @Override
    public boolean equals(Object o) {
        Money money = (Money) o;
        return amount == money.amount
            && currency().equals(money.currency());
    }

    String currency() {
        return currency;
    }

    @Override
    public String toString() {
        return "Money{" +
            "amount=" + amount +
            ", currency='" + currency + '\'' +
            '}';
    }

    Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    Expression plus(Money addend) {
        return new Sum(this, addend);
    }

    @Override
    public Money reduce(Bank bank, String to)  {
        int rate = bank.rate(currency, to);
        return new Money(amount / rate, to);
    }
}
