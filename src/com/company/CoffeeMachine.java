package com.company;

public abstract class CoffeeMachine implements Informational,FillableWatter,FillableCoffee {
    String name;
     float watter ;
     float coffee ;
     float tankMaxWatter;
     float tankMaxCoffee;
     float ingridientWatter= 0.2f ;
     float ingridientCofee=0.2f;

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
       if((watter-2.5*ingridientWatter)>0 && (coffee-ingridientCofee)>0){
           watter = watter-0.5f;
           coffee = coffee - ingridientCofee;
           System.out.println("Ваш американо готов");
       } else if((watter-2.5*ingridientWatter)<=0){
           System.out.println("Не хватает воды.Заполните бак водой");
       } else if((coffee-ingridientCofee)<=0) {
           System.out.println("Не хватает кофе.Заполните бак кофе");
       }

    }
    public void makeEspresso(){
        if((watter-ingridientWatter)>0 && (coffee-ingridientCofee)>0){
            watter = watter-ingridientWatter;
            coffee = coffee - ingridientCofee;
            System.out.println("Ваш эспрессо готов");
        } else if((watter-ingridientWatter)<=0){
            System.out.println("Не хватает воды.Заполните бак водой");
        } else if((coffee-ingridientCofee)<=0) {
            System.out.println("Не хватает кофе.Заполните бак кофе");
        }

    }
    public void makeDoubleEspresso(){
        if((watter-2*ingridientWatter)>0 && (coffee-2*ingridientCofee)>0){
            watter = watter-2*ingridientWatter;
            coffee = coffee - 2*ingridientWatter;
            System.out.println("Ваш двойной эспрессо готов");
        } else if((watter-2*ingridientWatter)<=0){
            System.out.println("Не хватает воды.Заполните бак водой");
        } else if((coffee-2*ingridientCofee)<=0) {
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
