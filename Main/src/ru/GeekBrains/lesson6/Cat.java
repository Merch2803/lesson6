package ru.GeekBrains.lesson6;

public class Cat extends Animal {


    public Cat(String name, double lengthOfRunning, double lengthOfSwimming, double heightOfJumping) {
        super(name, lengthOfRunning, lengthOfSwimming, heightOfJumping);
    }

    @Override
    public boolean run(double lengthOfRunning) {
        if(super.lengthOfRunning < lengthOfRunning) {
            return false;
        }
        return true;
    }

    @Override
    public boolean swim(double lengthOfSwimming) {
        return false;
    }

    @Override
    public boolean jump(double heightOfJumping) {
        if(super.heightOfJumping < heightOfJumping) {
            return false;
        }
        return true;
    }

}
