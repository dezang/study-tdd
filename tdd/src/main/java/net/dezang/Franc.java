package net.dezang;

import java.util.Objects;

class Franc extends Money {
    public Franc(int amount, String currency) {
        super(amount, currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
