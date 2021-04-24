package com.company;

public class Redmond extends CoffeeMachine {
    private final static String nameCoffeeMachine = "Redmond";
    private final static float maxWatter = 2.5f;
    private final static float maxCoffee = 5.0f;
    public Redmond() {
        super();
        this.name =nameCoffeeMachine;
        this.coffee=maxCoffee;
        this.watter=maxWatter;
    }

    @Override
    public void info() {
        System.out.print("Brand: ");
        System.out.print(name);
        System.out.print( " Watter = ");
        System.out.print(maxWatter);
        System.out.print(" Coffee = ");
        System.out.println(maxCoffee);

    }


    @Override
    public double fillWatter(){
        return watter=maxWatter;
    }
    @Override
    public double fillCoffee(){
        return coffee=maxCoffee;
    }
}
