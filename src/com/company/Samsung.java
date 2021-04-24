package com.company;

public class Samsung extends CoffeeMachine {
    private final static String nameCoffeeMachine = "Samsung";
    private final static float maxWatter = 2.5f;
    private final static float maxCoffee = 5.0f;

    public Samsung() {
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
