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
    public void makeCofee(float ingridientWatter, float ingridientCofee){
        if((watter-ingridientWatter)>0 && (coffee-ingridientCofee)>0){
            watter = watter-ingridientWatter;
            coffee = coffee - ingridientCofee;
            System.out.println("Ваш американо готов");
        } else if((watter-ingridientWatter)<=0){
            System.out.println("Не хватает воды.Заполните бак водой");
        } else if((coffee-ingridientCofee)<=0) {
            System.out.println("Не хватает кофе.Заполните бак кофе");
        }

    }

    public void makeAmericano(){
       makeCofee(0.5f,0.2f);

    }
    public void makeEspresso(){
        makeCofee(0.2f,0.2f);

    }
    public void makeDoubleEspresso(){
        makeCofee(0.4f,0.4f);

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
