import java.time.LocalDate;

public class Main {

    public static void checkLeapYear(int year)
    {
        System.out.println("Задание 1");

        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
        {
            System.out.println(year + " год является високосным");
        }
        else
        {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void getApp(int clientOS, int yearProduction)
    {
        System.out.println("Задание 2");
        int currentYear = LocalDate.now().getYear();


        if (yearProduction < currentYear && clientOS == 0)
        {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if (yearProduction == currentYear && clientOS == 0)
        {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (yearProduction < currentYear && clientOS == 1)
        {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        else
        {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void getDeliveryDay(int deliveryDistance)
    {
        System.out.println("Задача 3");

        int deliveryTime = 1;
        if (deliveryDistance <= 20)
        {
            System.out.println("Потребуется дней: " + deliveryTime);
        }
        else if (deliveryDistance > 20 && deliveryDistance <=60)
        {
            deliveryTime += 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        }
        else if (deliveryDistance > 60 && deliveryDistance <=100)
        {
            deliveryTime += 2;
            System.out.println("Потребуется дней: " + deliveryTime);
        }
        else
        {
            System.out.println("Доставки нет");
        }
    }

    public static void changeNumericReverse(int[] a)
    {
        System.out.println("Задание 4 Повышенная сложность");
        for(int i = a.length - 1; i >= 0; i--)
        {
            System.out.print(a[i]);
        }
        System.out.println();
    }

    public static void findDublicate(String a)
    {
        System.out.println("Задание 5 Повышенная сложность");

        StringBuilder sb = new StringBuilder(a);
        String result = new String();

        for(int i = 0; i < a.length() - 1; i++)
        {
            if(sb.charAt(i) == sb.charAt(i + 1))
            {
                System.out.println("Присутсвует дубль символа " + sb.charAt(i));
                return;
            }
        }
    }

    public static int[] generateRandomArray()
    {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static double calcPaymentSum(int[] arr) {
        double total = 0;

        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }

    public static double calcMonthMiddleValue(double x) {
        double middleValue = x / 30;
        return middleValue;
    }

    public static void printMiddleValue(double x)
    {
        System.out.println("Задание 6 Повышенная сложность");
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей", x);
    }

    public static void main(String[] args)
    {
        int year = 2010;
        checkLeapYear(year); //Задание 1

        int yearMyPhone = 2023;
        int myOS = 0; // 0 - iOS 1 - Android
        getApp(myOS, yearMyPhone); //Задание 2

        int distanceDelivery = 95;
        getDeliveryDay(distanceDelivery);//Задание 3

        int[] reversNumber = {3, 2, 1, 6, 5};
        changeNumericReverse(reversNumber);//Задание 4 Повышенная сложность

        String sortStr = "aabccddefgghiijjkk";
        findDublicate(sortStr); //Задание 5 Повышенная сложность

        int[] arrRandom = generateRandomArray();
        double paymentSum = calcPaymentSum(arrRandom);
        double middleValue = calcMonthMiddleValue(paymentSum);//
        printMiddleValue(middleValue);//Задание 6 Повышенная сложность
    }
}