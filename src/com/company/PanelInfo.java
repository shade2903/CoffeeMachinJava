package com.company;
import java.util.Scanner;

public class PanelInfo {

    public void panelInfo() {
        CoffeeMachine cofeeMachin = null;

        Scanner in = new Scanner(System.in);
        int brand = 0;
        while (brand != 1 && brand != 2 && brand != 3) {
            System.out.println("Выберите марку машины:");
            System.out.println("1.Samsung");
            System.out.println("2.Philips");
            System.out.println("3.Redmond");

            brand = in.nextInt();

            if (brand == 1) {
                cofeeMachin = new Samsung();
            } else if (brand == 2) {
                cofeeMachin = new Philips();
            } else if (brand == 3) {
                cofeeMachin = new Redmond();
            } else {
                System.out.println("Некорректный ввод");

            }
        }

        int n = 0;
        while (n != 8) {
            System.out.println("1. Показать текущий объем воды и кофе");
            System.out.println("2. Приготовить Американо");
            System.out.println("3. Приготовить Эспрессо");
            System.out.println("4. Приготовить Двойной эспрессо");
            System.out.println("5. Заполнить бак с водой");
            System.out.println("6. Заполнить бак с кофе");
            System.out.println("7. Информация");
            System.out.println("8. Выключить кофемашину");

            n = in.nextInt();
            switch (n) {
                case 1:
                    //текущие состояние баков с кофе и водой
                    System.out.print("Вода: ");
                    System.out.print(cofeeMachin.watter);
                    System.out.print(" Кофе: ");
                    System.out.println(cofeeMachin.coffee);
                    break;
                case 2:
                    cofeeMachin.makeAmericano();
                    break;
                case 3:
                    // делаем экспрессо
                    cofeeMachin.makeEspresso();
                    break;
                case 4:
                    // делаем двойной экспрессо
                    cofeeMachin.makeDoubleEspresso();
                    break;
                case 5:
                    // заполняем бак водой
                    cofeeMachin.fillWatter();
                    break;
                case 6:
                    // заполняем бак кофе
                    cofeeMachin.fillCoffee();
                    break;
                case 7:
                    // иформация
                    cofeeMachin.info();
                    break;
                case 8:
                    // выключить кофе машину
                    System.out.println("Машина выключена");
                    break;
                default:
                    System.out.println("Не корректный ввод команды");
            }
        }

    }

}
