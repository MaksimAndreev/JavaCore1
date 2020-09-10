public class HomeWork1 {

    public static float calculate(int a,int b,int c,int d) {
        return (float) a * (b + (c / d));
    }


    public static boolean task10and20(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }


    public static void isPositiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("Число положительное.");
        } else {
            System.out.println("Число отрицательное.");
        }
    }


    public static boolean isNegative(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }


    public static void greeting(String name) {
        System.out.println("Привет, " + name + "! Как тебе Java?");
    }


    public static void bissextile(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - високосный год.");
        } else {
            System.out.println(year + " - невисокосный год.");
        }
    }

    public static void main(String[] args) {
        System.out.println(calculate(2, 2, 2, 2));
        System.out.println(task10and20(0, 0));
        isPositiveOrNegative(0);
        System.out.println(isNegative(-4));
        greeting("Пётр");
        bissextile(2020);
    }
}
