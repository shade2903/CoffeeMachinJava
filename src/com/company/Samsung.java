package com.company;

public class Samsung extends CoffeeMachine {
    private final static String nameCoffeeMachine = "Samsung";
    private final static float maxWatter = 2.5f;
    private final static float maxCoffee = 5.0f;

    public Samsung() {
        this.name = nameCoffeeMachine;
        this.coffee = maxCoffee;
        this.watter = maxWatter;
        this.tankMaxWatter = maxWatter;
        this.tankMaxCoffee = maxCoffee;
    }


}
