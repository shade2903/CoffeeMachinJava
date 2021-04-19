package com.company;

public abstract class  CoffeMachin implements Informational,FillableWatter,FillableCoffee {
     float watter ;
     float coffee ;

    public CoffeMachin() {
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
    public void info() {

    }

    @Override
    public double fillCoffee() {
        return 0;
    }

    @Override
    public double fillWatter() {
        return 0;
    }
}
