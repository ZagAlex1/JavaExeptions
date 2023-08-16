package HomeWorkThree;

public class Main {
    public static void main(String[] args) {
        User user = Data.createNewUser();
        if (user.counter == 6)
            WriteFile.saveNewUser(user);
        else
            System.out.println("\nПовторите попытку");
    }
}


