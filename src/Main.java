public class Main {
    public static void examination(int[] year3) {
        for (int i = 0; i < year3.length; i++) {
            int year1 = year3[i];
            if (year1 % 4 == 0 && year1 % 100 != 0) {
                System.out.println(year1 + " год является високосным");
            } else if (year1 % 400 == 0) {
                System.out.println(year1 + " год не является високосным");
            } else {
                System.out.println(year1 + " год не является високосным");
            }
        }
    }

    public static void installation(int clientOS3, int clientDeviceYear3) {
        if (clientOS3 == 1 && clientDeviceYear3 >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS3 == 1 && clientDeviceYear3 <= 2015) {
            System.out.println("Установите lite-версию приложения для Android по ссылке");
        }
        if (clientOS3 == 0 && clientDeviceYear3 >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS3 == 0 && clientDeviceYear3 <= 2015) {
            System.out.println("Установите lite-версию приложения для iOS по ссылке");
        }
        if (clientOS3 != 1 && clientOS3 != 0) {
            System.out.println("Такой ОС нет!");
        }
    }

    public static void delivery(int deliveryDistance3) {
        if (deliveryDistance3 <= 20) {
            System.out.println("Потребуется 1 день для доставки ");
        } else if (deliveryDistance3 > 20 && deliveryDistance3 <= 60) {
            System.out.println("Потребуется 2 дня для доставки");
        } else if (deliveryDistance3 > 60 && deliveryDistance3 <= 100) {
            System.out.println("Потребуется 3 дня доставки");
        } else {
            System.out.println("Доставка не работает!");
        }
    }

    public static void main(String[] args) {
        System.out.println("Задача 1");
        int year[] = {2008, 2011, 2013, 2020,};
        examination(year);

        System.out.println("Задача 2");
        int clientOS1 = 1;
        int clientDeviceYear = 2013;
        installation(clientOS1, clientDeviceYear);

        System.out.println("Задача 3");
        int deliveryDistance = 50;
        delivery(deliveryDistance);
    }
}
