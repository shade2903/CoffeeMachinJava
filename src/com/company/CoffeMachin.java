package com.company;

public class  CoffeMachin {
    double watter = 2;
    double cofee = 1;
    public void makeCoffe(){
       if((watter-0.5)>0 && (cofee-0.2)>0){
           watter = watter-0.5;
           cofee = cofee - 0.2;
           System.out.println("Ваш кофе готов");
       } else if((watter-0.5)<=0){
           System.out.println("Нехватает воды.Заполните бак водой");
       } else if((cofee-0.2)<=0) {
           System.out.println("Нехватает кофе.Заполните бак кофе");
       }

    }
    public double fillWateer(){
       return watter =2 ;
    }
    public double fillUpCofee(){
        return cofee =1 ;
    }

}
