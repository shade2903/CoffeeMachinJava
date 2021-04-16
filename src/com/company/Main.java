package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CoffeMachin cm = new CoffeMachin();
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите марку машины:");
        System.out.println("1.Samsung");
        System.out.println("2.Filips");
        System.out.println("3.Redmond");
        int brand = in.nextInt();

        int n =0;
        while (n !=8){
            System.out.println("1. Показать текущий объем воды и кофе");
            System.out.println("2. Приготовить Американо");
            System.out.println("3. Приготовить Эспрессо");
            System.out.println("4. Приготовить Двойной эспрессо");
            System.out.println("5. Заполнить бак водой");
            System.out.println("6. Заполнить бак водой");
            System.out.println("7. Заполнить бак водой");
            System.out.println("8. Заполнить бак водой");

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
                    System.out.println("Производитель: "+cm.getClass()+"Объем воды: " +
                           cm.watter + "Объем кофе: " + cm.cofee);
                    break;
                case 8:
                    // выключить кофе машину
                    System.out.println("Машина выключена1");
                    break;
            }
        }


    }


}

