package com.company;

public class Philips extends CoffeMachin {
    public Philips() {
        super();
        this.cofee=2.0;
        this.watter=4.0;
    }

    @Override
    public void info() {
        System.out.println("Brand: Philips, Watter = 4.0, Coffee = 2.0");

    }
    @Override
    public double fillWatter(){
        return watter=4.0;
    }
    @Override
    public double fillCoffee(){
        return cofee=2.0;
    }
}
