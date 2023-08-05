package SeminarTwo;

import java.util.Arrays;
import java.util.Scanner;

public class CheckCode {
    public static void main(String[] args) {
//        firstExample();
        String[][] str = {{"1","2"},{"9","2"}};
        System.out.println(sum2d(str));
    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    int val = Integer.parseInt(arr[i][j]);
                    sum += val;
                }
            }
        }catch (NumberFormatException e){
            System.out.println("Неверный формат данных");
        }
        return sum;
    }

    private static void firstExample() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Укажите индекс элемента массива, в который хотите записать значение 1");
        int index = scanner.nextInt();
        try {
            arr[index] = 1;
        } catch (Exception e) {
            System.out.println("Указан индекс за пределами массива");
        }
        System.out.println(Arrays.toString(arr));
    }
}
