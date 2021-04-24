package com.company;

public abstract class CoffeeMachine implements Informational,FillableWatter,FillableCoffee {
    String name;
     float watter ;
     float coffee ;
     float tankMaxWatter;
     float tankMaxCoffee;

    public CoffeeMachine() {
    }
    @Override
    public void info() {

        System.out.print("Brand: ");
        System.out.print(name);
        System.out.print( " Watter = ");
        System.out.print(tankMaxWatter);
        System.out.print(" Coffee = ");
        System.out.println(tankMaxCoffee);

    }

    public void makeAmericano(){
       if((watter-0.5)>0 && (coffee-0.2)>0){
           watter = watter-0.5f;
           coffee = coffee - 0.2f;
           System.out.println("Ваш американо готов");
       } else if((watter-0.5)<=0){
           System.out.println("Не хватает воды.Заполните бак водой");
       } else if((coffee-0.2)<=0) {
           System.out.println("Не хватает кофе.Заполните бак кофе");
       }

    }
    public void makeEspresso(){
        if((watter-0.2)>0 && (coffee-0.2)>0){
            watter = watter-0.2f;
            coffee = coffee - 0.2f;
            System.out.println("Ваш эспрессо готов");
        } else if((watter-0.2)<=0){
            System.out.println("Не хватает воды.Заполните бак водой");
        } else if((coffee-0.2)<=0) {
            System.out.println("Не хватает кофе.Заполните бак кофе");
        }

    }
    public void makeDoubleEspresso(){
        if((watter-0.4)>0 && (coffee-0.4)>0){
            watter = watter-0.4f;
            coffee = coffee - 0.4f;
            System.out.println("Ваш двойной эспрессо готов");
        } else if((watter-0.4)<=0){
            System.out.println("Не хватает воды.Заполните бак водой");
        } else if((coffee-0.4)<=0) {
            System.out.println("Не хватает кофе.Заполните бак кофе");
        }

    }



    @Override
    public double fillCoffee() {
        return coffee = tankMaxCoffee;
    }

    @Override
    public double fillWatter() {
        return watter= tankMaxWatter;
    }
}
