package com.company;

public class Redmond extends CoffeMachin {
    public Redmond() {
        super();
        this.coffee=2.5f;
        this.watter=5.0f;
    }

    @Override
    public void info() {
        System.out.println("Brand: Redmond, Watter = 5.0, Coffee = 2.5");

    }
    @Override
    public double fillWatter(){
        return watter=5.0f;
    }
    @Override
    public double fillCoffee(){
        return coffee=2.5f;
    }
}
