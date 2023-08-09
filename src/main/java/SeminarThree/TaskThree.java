package SeminarThree;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TaskThree {
    public static void main(String[] args) throws FileNotExists {
//        try {
//            Integer[] a = {null, 1, 2};
//            a[0] += 1;
//        } catch (NullPointerException e) {
//            throw new EmptyArrayElement();
//        }
        try {
            File file = new File("text");
            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
        } catch (FileNotFoundException e) {
            throw new FileNotExists();
        }
    }
}

class DivByZero extends ArithmeticException {
    public DivByZero() {
        super("Невозможно поделить на ноль");
    }
}

class EmptyArrayElement extends NullPointerException {
    public EmptyArrayElement(int index) {
        super("Обращение к пустому элементу массива: " + index);
    }

    public EmptyArrayElement() {
        super("Обращение к пустому элементу массива");
    }
}

class FileNotExists extends FileNotFoundException {
    public FileNotExists(String path) {
        super("Такого файла не существует: " + path);
    }
    public FileNotExists() {
        super("Такого файла не существует");
    }
}

