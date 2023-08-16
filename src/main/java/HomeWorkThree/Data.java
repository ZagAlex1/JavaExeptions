package HomeWorkThree;


import java.util.Scanner;

public class Data {
    static Scanner iScanner = new Scanner(System.in);

    public static User createNewUser() {
        User user = new User();
        try {
            String[] fullName = prompt("Введите ФИО через пробел ").split(" ");
            if (fullName.length != 3)
                throw new Exception("Неверный формат ФИО ");
            else {
                if (isValidFullName(fullName[0])) {
                    user.secondName = fullName[0];
                    user.counter++;
                } else
                    throw new Exception("Неверный формат фамилии");

                if (isValidFullName(fullName[1])) {
                    user.firstName = fullName[1];
                    user.counter++;
                } else
                    throw new Exception("Неверный формат имени");

                if (isValidFullName(fullName[2])) {
                    user.lastName = fullName[2];
                    user.counter++;
                } else
                    throw new Exception("Неверный формат отчества");
            }

            String birthday = prompt("\nВведите дату рождения в формате dd.mm.yyyy ");
            if (isValidDate(birthday)) {
                user.birthday = birthday;
                user.counter++;
            } else {
                throw new Exception("Неверный формат даты ");
            }

            String numberPhone = prompt("\nВведите номер телефона без пробелов, букв и дефисов ");
            if (isValidNumberPhone(numberPhone)) {
                if (numberPhone.length() > 15)
                    throw new Exception("Превышена длина номера");

                user.numberPhone = numberPhone;
                user.counter++;
            } else {
                throw new Exception("Неверный формат телефона ");
            }

            char[] gender = prompt("\nВведите пол буквой 'f' или 'm'").toLowerCase().toCharArray();
            if (isValidGender(gender)) {
                user.gender = gender[0];
                user.counter++;
            } else {
                throw new Exception("Неверный формат поля 'пол'");
            }
            user.showInfo();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        iScanner.close();
        return user;
    }

    private static String prompt(String msg) {
        System.out.println(msg);
        return iScanner.nextLine();
    }

    private static boolean isValidFullName(String name) {
        for (int i = 0; i < name.length(); i++) {
            if (!Character.isLetter(name.charAt(i)))
                return false;
        }
        return true;
    }

    private static boolean isValidDate(String birthday) {
        int[] data = new int[3];
        try {
            String[] strs = new String[3];
            strs = birthday.split("\\.");

            if (strs.length != 3)
                return false;

            for (int i = 0; i < data.length; i++) {
                if (strs[i] == "")
                    throw new NullPointerException("Пустой элемент");
                data[i] = Integer.parseInt(strs[i]);
            }
        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
        } catch (NumberFormatException ex) {
            System.out.println("Неверный формат данных");
        }

        if ((data[0] > 0 && data[0] < 32) && (data[1] > 0 && data[1] < 13) && (data[2] >= 1920 && data[2] <= 2022))
            return true;

        return false;
    }

    private static boolean isValidNumberPhone(String numberPhone) {
        for (int i = 0; i < numberPhone.length(); i++) {
            if (!Character.isDigit(numberPhone.charAt(i)))
                return false;
        }
        return true;
    }

    private static boolean isValidGender(char[] gender) {
        if (gender.length != 1)
            return false;
        else if (gender[0] == 'f' || gender[0] == 'm')
            return true;
        return false;
    }
}

