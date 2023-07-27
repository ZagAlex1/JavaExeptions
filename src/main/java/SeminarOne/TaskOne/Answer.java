package SeminarOne.TaskOne;

public class Answer {
    public static void arrayOutOfBoundsException() {
        int[] array = {1, 2, 3, 4};
        System.out.println(array[5]);
    }

    public static void divisionByZero() {
        int a = 10;
        int b = 0;
        int c = a / b;

    }

    public static void numberFormatException() {
        String s = String.valueOf("");
        Integer a = Integer.parseInt(s);
    }
}

class Printer {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}
