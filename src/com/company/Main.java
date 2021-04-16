package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CoffeMachin cm = new CoffeMachin();
        Scanner in = new Scanner(System.in);
        int brand = 0;
        while(brand !=1&& brand!=3 && brand!=2) {
        System.out.println("Выберите марку машины:");
        System.out.println("1.Samsung");
        System.out.println("2.Filips");
        System.out.println("3.Redmond");
             brand = in.nextInt();

           if (brand == 1) {
               Samsung cofeeMachin = new Samsung();
           } else if (brand == 2) {
               Philips cofeeMachin = new Philips();
           } else if (brand == 3) {
               Redmond cofeeMachin = new Redmond();
           } else {
               System.out.println("Не корректный ввод");
               break;
           }
       }

        int n =0;
        while (n !=8){
            System.out.println("1. Показать текущий объем воды и кофе");
            System.out.println("2. Приготовить Американо");
            System.out.println("3. Приготовить Эспрессо");
            System.out.println("4. Приготовить Двойной эспрессо");
            System.out.println("5. Заполнить бак с водой");
            System.out.println("6. Заполнить бак с кофе");
            System.out.println("7. Информация");
            System.out.println("8. Выключить кофемашину");

            n = in.nextInt();
            switch (n){
                case 1:
                    System.out.println("Вода: " +cm.watter + " Кофе: " + cm.cofee);
                    break;
                case 2:
                    // делаем американо
                    break;
                case 3:
                    // делаем экспрессо
                    break;
                case 4:
                    // делаем двойной экспрессо
                    break;
                case 5:
                    // заполняем бак водой
                    break;
                case 6:
                    // заполняем бак кофе
                    break;
                case 7:
                    // иформация
                    System.out.println("Производитель: "+cm.getClass()+" Объем воды: " +
                           cm.watter + " Объем кофе: " + cm.cofee);
                    break;
                case 8:
                    // выключить кофе машину
                    System.out.println("Машина выключена1");
                    break;
            }
        }


    }


}

