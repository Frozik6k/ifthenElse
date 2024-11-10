public class Main {
    public static void main(String[] args) {
        // task 1
        System.out.println("Задача №1");
        int clientOS = 0;
        if (clientOS == 0){
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке");
        } else{
            System.out.println("У вас неизвестная операционная система, зайдите либо под Android, либо под IOS");
        }

        // task 2
        System.out.println("Задача №2");
        int clientDeviceYear = 2015;
        if (clientDeviceYear >= 2015){
            if (clientOS == 0){
                System.out.println("Установите версию приложения для IOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else {
            if (clientOS == 0){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }

        // task 3
        System.out.println("Задача №3");
        int year = 2021;
        if ((year >= 1584) && (((year%4==0) && (year%100!=0)) || (year % 400 == 0))){
            System.out.println("Год " + year +" является высокостным!");
        } else {
            System.out.println("Год " + year +" невысокостный!");
        }

        // task 4
        System.out.println("Задача №4");
        int deliveryDistance = 95;

        if (deliveryDistance <= 20){
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance <= 60){
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance <= 100){
            System.out.println("Потребуется дней: 3");
        } else
            System.out.println("В ваш регион нет доставки");

        // task 5
        System.out.println("Задача №5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12, 1, 2: {
                System.out.println("Данный месяц относится к зиме");
                break;
            }
            case 3, 4, 5: {
                System.out.println("Данный месяц относится к весне");
                break;
            }
            case 6, 7, 8: {
                System.out.println("Данный месяц относится к лету");
                break;
            }
            case 9, 10, 11: {
                System.out.println("Данный месяц относится к осени");
                break;
            }
            default:{
                System.out.println("Такого месяца не существует");
            }
        }
    }
}
