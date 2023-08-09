package SeminarThree;

import java.io.IOException;

public class TaskOne {
    public static void main(String[] args) {
        try {
            doSomthing();
        } catch (IOException e) {
            System.out.println("Поймано исключение");
        }
    }

    public static void doSomthing() throws IOException {
        throw new IOException();
    }
}
