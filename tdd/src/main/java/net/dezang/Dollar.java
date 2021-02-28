package net.dezang;

import java.util.Objects;

class Dollar extends Money {
    public Dollar(int amount, String currency) {
        super(amount, currency);
    }

    @Override
    Money times(int multiplier) {
        return Money.dollar(amount * multiplier);
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
    public int hashCode() {
        return Objects.hash(amount);
    }
}
