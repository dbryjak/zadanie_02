import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("jak masz na imę?");
        String name1 =sc.nextLine();
        System.out.println("jak masz na nazwisko?");
        String name2 =sc.nextLine();
        System.out.println("ile masz lat?");
        int age =sc.nextInt();
        if (age <18) {
            System.out.println("C_U");

        } else {
            System.out.println("Welcome");
        }

    }
}
