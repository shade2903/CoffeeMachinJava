package com.company;

public class Redmond extends CoffeMachin {
    public Redmond() {
        super();
        this.cofee=2.5;
        this.watter=5.0;
    }

    @Override
    public void info() {
        System.out.println("Brand: Redmond, Watter = 5.0, Coffee = 2.5");

    }
    @Override
    public double fillWatter(){
        return watter=5.0;
    }
    @Override
    public double fillCoffee(){
        return cofee=2.5;
    }
}
