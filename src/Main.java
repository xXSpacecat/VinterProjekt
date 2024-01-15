import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Civilian> civies = new ArrayList<>();
    public static void main(String[] args) {

        Librarian Lib1 = new Librarian("Vivian", "vivian1", 65, 1111);
        while(true) {
            printer();
        }


    }

    static void printer(){
        System.out.println("1. Sign up");
        System.out.println("2. Log in");
        String v = scan.nextLine();
        if (v.equalsIgnoreCase("1")){
            makeAciv();
        } else if (v.equalsIgnoreCase("2")) {

        }else{
            System.out.println("I'm sorry, I did not quite get that, please try again");
            printer();
        }

    }

    static void makeAciv(){
        System.out.println("Sign up\n---------");
        System.out.print("Name: ");
        String name = scan.next();
        System.out.print("Password: ");
        String password = scan.next();
        System.out.print("Age: ");
        int age = scan.nextInt();
        System.out.print("bankNMR: ");
        int bankNMR = scan.nextInt();

        civies.add(new Civilian(name, password, age, bankNMR));
        System.out.println("Account created!\nWelcome!");

    }
}