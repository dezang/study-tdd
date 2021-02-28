package net.dezang;

public abstract class Money {
    protected int amount;

    static Money dollar(int amount) {
        return new Dollar(amount);
    }

    static Money franc(int amount) {
        return new Franc(amount);
    }

    @Override
    public boolean equals(Object o) {
        Money money = (Money) o;
        return amount == money.amount
            && getClass().equals(money.getClass());
    }

    abstract Money times(int multiplier);
}
