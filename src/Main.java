//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Задачи № 1
        byte clientOS = 0;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Не удалось определить операционную систему");
        }

        // Задача № 2
        // Переменная с ОС уже есть
        int clientDeviceYear = 2012;
        int serverOsYear = 2015;

        if (clientOS == 0 && clientDeviceYear < serverOsYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < serverOsYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= serverOsYear) {
            System.out.println("Вы можете установить свежую версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= serverOsYear) {
            System.out.println("Вы можете установить свежую версию приложения для Android по ссылке");
        }

        // Задача № 3
        int year = 2021;

        if (year <= 1584) {
            System.out.println("Год должен быть больше значения 1584");
        } else if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        // Задача № 4
        int deliveryDistance = 95;

        if (deliveryDistance < 0) {
            System.out.println("Дистанция не может содержать отрицательное значение");
        } else if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + 1);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + 2);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + 3);
        } else {
            System.out.println("Доставка не осуществляется");
        }

        // Задача № 5
        int monthNumber = 13;

        // Решение № 1 без указания месяца в выводе
        if (monthNumber >= 1 && monthNumber <= 12) {
            switch (monthNumber) {
                case 1, 2, 12:
                    System.out.println("На улице зима");
                    break;
                case 3, 4, 5:
                    System.out.println("На улице весна");
                    break;
                case 6, 7, 8:
                    System.out.println("На улице лето");
                    break;
                case 9, 10, 11:
                    System.out.println("На улице осень");
                    break;
            }
        } else {
            System.out.println("Выбранный месяц не входит в диапазон от 1 (Январь) до 12 (Декабрь)");
        }
    }
}