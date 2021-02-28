package net.dezang;

import java.util.Objects;

class Dollar extends Money {

    public Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
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
