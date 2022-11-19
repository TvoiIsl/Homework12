public class Main {
    public static int examination(int[] year) {
        for (int i = 0; i < year.length; i++) {
            int year1 = year[i];
            if (year1 % 4 == 0 && year1 % 100 != 0) {
                System.out.println(year1 + " год является високосным");
            } else if (year1 % 400 == 0) {
                System.out.println(year1 + " год не является високосным");
            } else {
                System.out.println(year1 + " год не является високосным");
            }
        }
        return 5;
    }

    public static int installation(int clientOS1, int clientDeviceYear) {
        if (clientOS1 == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS1 == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите lite-версию приложения для Android по ссылке");
        }
        if (clientOS1 == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS1 == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите lite-версию приложения для iOS по ссылке");
        }
        if (clientOS1 != 1 && clientOS1 != 0) {
            System.out.println("Такой ОС нет!");
        }
        return 5;
    }

    public static int delivery(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется 1 день для доставки ");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется 2 дня для доставки");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется 3 дня доставки");
        } else {
            System.out.println("Доставка не работает!");
        }
        return 5;
    }

    public static void main(String[] args) {
        System.out.println("Задача 1");
        int year[] = {2008, 2011, 2013, 2020,};
        int examination1 = examination(year);
        System.out.println(examination1);

        System.out.println("Задача 2");
        int clientOS1 = 0;
        int clientDeviceYear = 2018;
        int installation1 = installation(clientOS1, clientDeviceYear);
        System.out.println(installation1);

        System.out.println("Задача 3");
        int deliveryDistance = 90;
        int delivery1 = delivery(deliveryDistance);
        System.out.println(delivery1);
    }
}
