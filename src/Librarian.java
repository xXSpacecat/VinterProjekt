//En gren av human som kommer kunna göraa ändringar i librarysystemet
public class Librarian extends Human{

    int workingHours;

    public Librarian(String name, String password, int age, int bankNMR) {
        getPermission(0);
        this.name = name;
        this.password = password;
        this.age = age;
        this.setBankNMR(bankNMR);
    }

    public void work(int hours){
        Librarian.pay(hours, "librarian", super.age);
    }

    @Override
    public void printer(){
        //Här kommer alla val för admin skapas och kunna interageras med
        System.out.println("o7");
        while (true) {
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Pick up Book");
            System.out.println("4. View available books");
            String v = Main.scan.nextLine();
            if (v.equalsIgnoreCase("1")){
                Main.system.addBook();
            } else if (v.equalsIgnoreCase("2")) {
                Main.system.removeBook();
            }else if (v.equalsIgnoreCase("3")) {
                Main.system.lendBook(this.isLendingPermission());
            }else if (v.equalsIgnoreCase("4")) {
                Main.system.viewBooks();
            }else{
                System.out.println("I'm sorry, I did not quite get that, please try again");
                printer();
            }
        }

    }

}
