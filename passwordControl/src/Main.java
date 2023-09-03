import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int password;
        boolean isPasswordSuccess = true;

        Scanner scanner = new Scanner(System.in);


        while (isPasswordSuccess) {
            System.out.print("şifrenizi giriniz: ");
            password = scanner.nextInt();
            if (password == 123456789) {
                System.out.println("Doğru");
                isPasswordSuccess = false;
            } else {
                System.out.println("Yanlış");
            }
        }


    }
}