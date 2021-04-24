package com.company;

public class Redmond extends CoffeeMachine {
    private final static String nameCoffeeMachine = "Redmond";
    private final static float maxWatter = 2.5f;
    private final static float maxCoffee = 5.0f;

    public Redmond() {
        super();
        this.name = nameCoffeeMachine;
        this.coffee = maxCoffee;
        this.watter = maxWatter;
        this.tankMaxWatter = maxWatter;
        this.tankMaxCoffee = maxCoffee;
    }


}
