import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Civilian> civies = new ArrayList<>();
    static ArrayList<Librarian> librarians= new ArrayList<>();
    static LibrarySystem system = new LibrarySystem();
    public static void main(String[] args) {


        librarians.add(new Librarian("Vivian", "vivian1", 65, 1111));
        while(true) {
            printer();
        }


    }

    static void printer(){
        System.out.println("1. Sign up");
        System.out.println("2. Log in");
        System.out.println("3. Log in as Admin");
        String v = scan.nextLine();
        if (v.equalsIgnoreCase("1")){
            makeAciv();
        } else if (v.equalsIgnoreCase("2")) {
            logIn();

        } else if (v.equalsIgnoreCase("3")) {
            adminLogIn();
        }else{
            System.out.println("I'm sorry, I did not quite get that, please try again");
            printer();
        }

    }

    private static void adminLogIn() {

        //loggar in i en Admin
        System.out.print("Name: ");
        String logInName = scan.next();
        System.out.print("Password: ");
        String logInPass = scan.next();
        scan.nextLine();

        int i = 0;
        for (;i < librarians.size(); i++) {
            if (librarians.get(i).name.equals(logInName)) {
                if (librarians.get(i).password.equals(logInPass)) {
                    System.out.println("You're in!");
                    system.adminPrinter();
                    break;
                } else {
                    System.out.println("wrong password");
                }

            } else if (civies.size() == i+1) {
                System.out.println("No admin with name");
            }
        }
    }

    static void makeAciv(){
        //skapar en civil
        System.out.println("Sign up\n---------");
        System.out.print("Name: ");
        String name = scan.next();
        System.out.print("Password: ");
        String password = scan.next();
        System.out.print("Age: ");
        int age = scan.nextInt();
        System.out.print("bankNMR: ");
        int bankNMR = scan.nextInt();
        scan.nextLine();

        civies.add(new Civilian(name, password, age, bankNMR));

    }

    static void logIn(){
        //loggar in i en människa
        System.out.print("Name: ");
        String logInName = scan.next();
        System.out.print("Password: ");
        String logInPass = scan.next();
        scan.nextLine();

        int i = 0;
        for (;i < civies.size(); i++) {

            if (civies.get(i).name.equals(logInName)) {
                if (civies.get(i).password.equals(logInPass)) {
                    System.out.println("You're in!");
                    system.printer();
                    break;
                } else {
                    System.out.println("wrong password");
                }

            } else if (civies.size() == i+1) {
                System.out.println("No user with name");
            }
        }



    }
}