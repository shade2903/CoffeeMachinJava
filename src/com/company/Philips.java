package com.company;

public class Philips extends CoffeeMachine  {
    private final static String nameCoffeeMachine = "Philips";
    private final static float maxWatter = 4.0f;
    private final static float maxCoffee = 2.0f;

    public Philips() {
        super();
        this.name = nameCoffeeMachine;
        this.coffee = maxCoffee;
        this.watter = maxWatter;
        this.tankMaxWatter = maxWatter;
        this.tankMaxCoffee = maxCoffee;
    }


}
