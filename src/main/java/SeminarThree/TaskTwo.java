package SeminarThree;

import java.io.IOException;

public class TaskTwo {
    public static void main(String[] args) {
        try (Counter counter = new Counter()){
            counter.add();
            System.out.println(counter.getValue());
            counter.close();
            System.out.println(counter.getValue());
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
    }
}

class Counter implements AutoCloseable {

    private Integer value = 0;

    public void add() throws IOException {
        if (value == null)
            throw new IOException("Значение закрыто");
        value += 1;

    }

    public Integer getValue() throws Exception{
        if (value == null)
            throw new IOException("Значение закрыто");
        return value;
    }

    @Override
    public void close() throws Exception {
        value = null;
    }
}
