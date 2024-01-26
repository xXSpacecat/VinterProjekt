//En gren av human som kommer kunna göraa ändringar i librarysystemet
public class Librarian extends Human{

    int workingHours;

    public Librarian(String name, String password, int age, int bankNMR) {
        getPermission(0);
        this.name = name;
        this.password = password;
        this.age = age;
        this.bankNMR = bankNMR;
    }

    public void work(int hours){
        pay(hours, "librarian", super.age);
    }


}
