package bsu.rfe.java.group6.lab1.AnastasiaHirel.var4;

public class Cheese extends Food{

    public Cheese() {
        super("Cheese");
    }
    public void consume() {
        System.out.println(this + " " + "has been consumed!");
    }

    @Override
    public String toString() {
        return name;
    }
}

