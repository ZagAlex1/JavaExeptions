package SeminarTwo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadNames {
    public static void main(String[] args) {
        File file = new File("/Users/aleksejzagorodnyh/Documents/Projects/JavaProjects/JavaExeptions/JavaExeptions/src/main/java/names");
        List<String[]> list = readFile(file);
        changeSymbol(list);
        writeFile(list, file);
    }

    public static List<String[]> readFile(File file) {
        List<String[]> list = new ArrayList<>();
        try {
            FileReader reader = new FileReader(file);
            BufferedReader br = new BufferedReader(reader);
            String line;
            while ((line = br.readLine()) != null) {
                list.add(line.split("="));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            throw new RuntimeException();
        }
        return list;
    }

    public static void changeSymbol(List<String[]> list) {
        for (String[] element : list) {
            if (!checkExeption(element[1]) && !element[1].equals("?")) {
                throw new RuntimeException("Неверный формат данных");
            }
            if (element[1].equals("?")) {
                element[1] = String.valueOf(element[0].length());
            }
        }

    }

    public static boolean checkExeption(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void writeFile(List<String[]> list, File file) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for (String[] str : list) {
                bw.write(str[0] + "=" + str[1]);
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
