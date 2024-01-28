import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Human> people = new ArrayList<>();
    static LibrarySystem system = new LibrarySystem();

    public static void main(String[] args) {


        people.add(new Librarian("Vivian", "vivian1", 65, 1111));
        while(true) {
            printer();
        }


    }

    static void printer(){
        //Skriver ut startskärmen för att påbörja interaktion
        System.out.println("1. Sign up");
        System.out.println("2. Log in");
        String v = scan.nextLine();
        if (v.equalsIgnoreCase("1")){
            makeAciv();
        } else if (v.equalsIgnoreCase("2")) {
            logIn();
        }else{
            System.out.println("I'm sorry, I did not quite get that, please try again");
            printer();
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

        people.add(new Civilian(name, password, age, bankNMR));

    }

    static void logIn(){
        //loggar in i en människa
        System.out.print("Name: ");
        String logInName = scan.next();
        System.out.print("Password: ");
        String logInPass = scan.next();
        scan.nextLine();

        int i = 0;
        for (;i < people.size(); i++) {

            if (people.get(i).name.equals(logInName)) {
                if (people.get(i).password.equals(logInPass)) {
                    System.out.println("You're in!");
                    people.get(i).printer();
                    break;
                } else {
                    System.out.println("wrong password");
                }

            } else if (people.size() == i+1) {
                System.out.println("No user with name");
            }
        }



    }
}