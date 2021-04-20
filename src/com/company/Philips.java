package com.company;

public class Philips extends CoffeeMachine implements FillableCoffee,FillableWatter,Informational {
    public Philips() {
        super();
        this.coffee=2.0f;
        this.watter=4.0f;
    }

    @Override
    public void info() {
        System.out.println("Brand: Philips, Watter = 4.0, Coffee = 2.0");

    }
    @Override
    public double fillWatter(){
        return watter=4.0f;
    }
    @Override
    public double fillCoffee(){
        return coffee=2.0f;
    }
}
