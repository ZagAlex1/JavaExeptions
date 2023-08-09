package SeminarThree;

public class TaskFour {
    public static void main(String[] args) {
        String[][] array = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        try {
            int sum = checkArray(array);
            System.out.println(sum);
        } catch (NumberFormatException e){
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int checkArray(String[][] array) {
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException(array.length, array[0].length);
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
}

class MyArraySizeException extends RuntimeException {
    public MyArraySizeException(int size, int size2) {
        super("Не подходящий размер массива. Ваш массив: " + size + "x" + size2);
    }
}

class MyArrayDataException extends NumberFormatException {
    public MyArrayDataException(int row, int column) {
        super("Не удалось преобразовать в int элемент: " + row + column);
    }
}


