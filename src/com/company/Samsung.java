package com.company;

public class Samsung extends CoffeMachin {
    public Samsung() {
        super();
        this.cofee=3.0;
        this.watter=6.0;
    }

    @Override
    public void info() {
        System.out.println("Brand: Samsung, Watter = 6.0, Coffee = 3.0");

    }
    @Override
    public double fillWatter(){
        return watter=6.0;
    }
    @Override
    public double fillCoffee(){
        return cofee=3.0;
    }
}
