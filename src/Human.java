//Basklassen för alla klasser som kommer ha en roll i programmet

import java.util.ArrayList;

public class Human {
    String name;
    String password;
    int age;
    int bankNMR;
    private int bankBalance = 30;
    private boolean lendingPermission;

    private ArrayList <Book> pocket = new ArrayList<>();

    public Human() {
    }

    public void getPermission(double amount){
//För att se vem som har rätt till att låna eller inte, librarians har den automatisk och utan kostnad
        if (bankBalance >= amount) {
            bankBalance -= amount;
            this.lendingPermission = true;
        } else {
            System.out.println(name + " does not have enough funds to pay the membership fee.");
        }
    }

    public static void pay(int Hours, String job, int age){

    }

    private void payMembershipFee(double amount) {

    }
    public void printer(){
        //Kommer att skriva ut allt som behöver ske för en civilian som loggat in
        System.out.println("o7");
        while (true) {
            System.out.println("1. Lend Book");
            System.out.println("2. Return Book");
            System.out.println("3. Become member");
            System.out.println("4. View available books");
            String v = Main.scan.nextLine();
            if (v.equalsIgnoreCase("1")){
                Book borrowedBook = Main.system.lendBook(lendingPermission);

                if (borrowedBook != null) {
                    System.out.println("You are now in possession of "+ borrowedBook.title + ", Please return in "+ borrowedBook.lendingPeriod + "days.");
                    pocket.add(borrowedBook);

                }

            } else if (v.equalsIgnoreCase("2")) {
                Main.system.returnBook();
            } else if (v.equalsIgnoreCase("3")) {
                int fee;
                if (this.age < 25 || this.age >60){
                    fee = 10;
                }
                else{
                    fee = 10;
                }
                getPermission(fee);
            }else if (v.equalsIgnoreCase("4")) {
                Main.system.viewBooks();
            }else{
                System.out.println("I'm sorry, I did not quite get that, please try again");
                printer();
            }
        }

    }


}
