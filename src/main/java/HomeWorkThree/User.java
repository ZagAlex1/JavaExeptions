package HomeWorkThree;

public class User {
    public String firstName;
    public String secondName;
    public String lastName;
    public String birthday;
    public Character gender;
    public String numberPhone;

    public int counter = 0;

    public User() {
    }

    public void showInfo() {
        System.out.printf(
                "\nКонтакт:\nФамилия: %s\nИмя: %s\nОтчество: %s\nДата рождения: %s\nНомер телефона: %s\nПол: %c",
                secondName, firstName, lastName, birthday, numberPhone, gender);
    }
}
