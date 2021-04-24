package com.company;

public class Philips extends CoffeeMachine implements FillableCoffee,FillableWatter,Informational {
    private final static String nameCoffeeMachine = "Philips";
    private final static float maxWatter = 4.0f;
    private final static float maxCoffee = 2.0f;
    public Philips() {
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
