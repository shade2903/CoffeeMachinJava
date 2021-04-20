package com.company;

public class Samsung extends CoffeeMachine {

    public Samsung() {
        super();
        this.coffee=3.0f;
        this.watter=6.0f;
    }

    @Override
    public void info() {
        System.out.println("Brand: Samsung, Watter = 6.0, Coffee = 3.0");

    }
    @Override
    public double fillWatter(){
        return watter=6.0f;
    }
    @Override
    public double fillCoffee(){
        return coffee=3.0f;
    }
}
