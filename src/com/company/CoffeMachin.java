package com.company;

public  class  CoffeMachin implements Informational,FillableWatter,FillableCoffee {
    double watter ;
    double cofee ;

    public CoffeMachin() {
    }


    public void makeAmericano(){
       if((watter-0.5)>0 && (cofee-0.2)>0){
           watter = watter-0.5;
           cofee = cofee - 0.2;
           System.out.println("Ваш американо готов");
       } else if((watter-0.5)<=0){
           System.out.println("Не хватает воды.Заполните бак водой");
       } else if((cofee-0.2)<=0) {
           System.out.println("Не хватает кофе.Заполните бак кофе");
       }

    }
    public void makeEspresso(){
        if((watter-0.2)>0 && (cofee-0.2)>0){
            watter = watter-0.2;
            cofee = cofee - 0.2;
            System.out.println("Ваш эспрессо готов");
        } else if((watter-0.2)<=0){
            System.out.println("Не хватает воды.Заполните бак водой");
        } else if((cofee-0.2)<=0) {
            System.out.println("Не хватает кофе.Заполните бак кофе");
        }

    }
    public void makeDoubleEspresso(){
        if((watter-0.4)>0 && (cofee-0.4)>0){
            watter = watter-0.4;
            cofee = cofee - 0.4;
            System.out.println("Ваш двойной эспрессо готов");
        } else if((watter-0.4)<=0){
            System.out.println("Не хватает воды.Заполните бак водой");
        } else if((cofee-0.4)<=0) {
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
