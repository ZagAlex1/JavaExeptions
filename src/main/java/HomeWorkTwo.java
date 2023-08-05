import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeWorkTwo {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
        task4();
    }

    private static void task1() {
        while (true) {
            Scanner iScanner = new Scanner(System.in);
            try {
                System.out.println("Введите дробное число: ");
                float n = iScanner.nextFloat();
                System.out.println(n);
                iScanner.close();
                break;

            } catch (InputMismatchException e) {
                System.out.println("Неверный формат\n");
            }
        }
    }

    private static void task2() {
        try {
            int[] arr = { 3, 5, 1, 9, 4 };
            int d = 3;

            if (d == 0)
                throw new ArithmeticException("Делить на ноль нельзя");

            double catchedRes1 = (double) arr[4] / d;
            System.out.println(catchedRes1);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void task3() {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера");
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

    private static void task4() {
        try {
            System.out.println("Введите строку");
            String str = new Scanner(System.in).nextLine();

            if (str.equals("")) {
                throw new RuntimeException("Пустые строки вводить нельзя");
            }
            System.out.println(str);
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

