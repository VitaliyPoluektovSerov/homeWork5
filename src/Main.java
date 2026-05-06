//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задача 1
        byte clientOS = 0; // 0 - iOS 1 - Android предполагаем что значения могум быть только 0 или 1
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }


        //Задача 2
        short clientDeviceYear = 2018; //год выпуска телефона
        if (clientDeviceYear < 2015) {
            switch (clientOS) {
                case 0:
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    break;
            }
        } else {
            switch (clientOS) {
                case 0:
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
            }
        }

        //Задача 3
        short year = 1704;
        if (year <= 1584) {
            System.out.println(year + " год должен быть больше, чем 1584");
        } else {
            boolean isVisokos = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            if (isVisokos) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        }

        //Задача 4
        short deliveryDistance = 95;
        int deliveryDays = 0;
        if (deliveryDistance <= 20) {
            deliveryDays = 1;
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDays = 2;
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDays = 3;
        }
        if (deliveryDays > 0) {
            System.out.println("Потребуется дней: " + deliveryDays);
        }
        if (deliveryDays == 0) {
            System.out.println("Не доставляем в Ваш район");
        }

        // Задача 5
        byte monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Номер месяца не равен больше 12");


        }
    }
}