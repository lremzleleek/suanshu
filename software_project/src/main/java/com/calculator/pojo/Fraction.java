package com.calculator.pojo;

public class Fraction {
    private int num1;
    private int num2;
    private char symbol;

    public Fraction() {
        this.symbol='/';
    }

    public Fraction(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        this.symbol = '/';
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return "Division{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                ", symbol=" + symbol +
                '}';
    }
}
