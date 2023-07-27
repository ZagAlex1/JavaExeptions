package LectionOne;

public class Task1 {
    public static void main(String[] args) {

    }

    public static Integer CheckArray(Integer[] array, int value) {
        if (array == null) return -3;
        if (array.length < 5) {
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) return i;
        }
        return -2;
    }
    public static String printErrors(int error){
        if (error == -1) return "Длинна массива меньше мин";
        if (error == -2) return "Искомый элемент не найден";
        if (error == -3) return "Массив = null";
        return "Индекс искомого элемента :" + error;
    }
}
