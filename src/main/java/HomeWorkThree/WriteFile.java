package HomeWorkThree;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void saveNewUser(User user) {
        try {
            File file = new File("/Users/aleksejzagorodnyh/Documents/Projects/JavaProjects/JavaExeptions/JavaExeptions/src/main/java/HomeWorkThree/Users/" + user.secondName + ".txt");

            BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
            String date = String.format("<%s> <%s> <%s> <%s> <%s> <%c>",
                    user.secondName, user.firstName, user.lastName, user.birthday,
                    user.numberPhone, user.gender);
            bw.write(date);
            bw.newLine();
            bw.close();
            System.out.println("\n\nЗапись прошла успешно");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
