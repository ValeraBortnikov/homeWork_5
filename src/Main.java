//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Задачи № 1
        byte clientOS = 0;

        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
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
        } else if ((year % 400 == 0 || year % 4 == 0) && year % 100 != 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        // Задача № 4
        int deliveryDistance = 95;
        int deliveryTime = 0;

        if (deliveryDistance <= 20) {
            deliveryTime += 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryTime += 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryTime += 3;
        }

        switch (deliveryTime) {
            case 0:
                System.out.println("Доставка не осуществляется");
            default:
                System.out.println("Потребуется дней: " + deliveryTime);
        }

        // Задача № 5
        int monthNumber = 12;

        // Решение № 1 без указания месяца в выводе
        if (monthNumber > 0 && monthNumber <= 12) {
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
        }

        // Решение № 2 с указанием месяца в выводе
        /*
        if (monthNumber > 0 && monthNumber <= 12) {
            switch (monthNumber) {
                case 1:
                    System.out.println("На улице зима, месяц Январь");
                    break;
                case 2:
                    System.out.println("На улице зима, месяц Февраль");
                    break;
                case 12:
                    System.out.println("На улице зима, месяц Декабрь");
                    break;
                case 3:
                    System.out.println("На улице весна, месяц Март");
                    break;
                case 4:
                    System.out.println("На улице весна, месяц Апрель");
                    break;
                case 5:
                    System.out.println("На улице весна, месяц Май");
                    break;
                case 6:
                    System.out.println("На улице лето, месяц Июнь");
                    break;
                case 7:
                    System.out.println("На улице лето, месяц Июль");
                    break;
                case 8:
                    System.out.println("На улице лето, месяц Август");
                    break;
                case 9:
                    System.out.println("На улице осень, месяц Сентябрь");
                    break;
                case 10:
                    System.out.println("На улице осень, месяц Октябрь");
                    break;
                case 11:
                    System.out.println("На улице осень, месяц Ноябрь");
                    break;
            }
        }*/

    }
}