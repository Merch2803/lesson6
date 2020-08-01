package ru.GeekBrains.lesson6;

public abstract class Animal {
    protected double lengthOfRunning;
    protected double lengthOfSwimming;
    protected double heightOfJumping;

    protected String name;

    public Animal(String name, double lengthOfRunning, double lengthOfSwimming, double heightOfJumping) {
        this.name = name;
        this.lengthOfRunning = lengthOfRunning;
        this.lengthOfSwimming = lengthOfSwimming;
        this.heightOfJumping = heightOfJumping;
    }

    public abstract boolean run(double lengthOfRunning);

    public abstract boolean swim(double lengthOfSwimming);

    public abstract boolean jump(double heightOfJumping);
}
