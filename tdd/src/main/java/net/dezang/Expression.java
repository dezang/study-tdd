package net.dezang;

interface Expression {
    Money reduce(Bank bank, String to);
}
