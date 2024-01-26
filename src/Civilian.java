//Civiian ska vara klassen som kan låna och lämna tillbaka böcker

public class Civilian extends Human{
    int debt;

    public Civilian(String name, String password, int age, int bankNMR) {
        //konstruktorn kommer säga till att bara en viss ålder av civilians kan skapas
        this.name = name;
        this.password = password;
        this.bankNMR = bankNMR;
        if (age < 16){
            System.out.println("You have to be at least 16 years old to create an account.");
        }else{
            this.age = age;
            System.out.println("Account created!\nWelcome!");

        }
    }

    public void buyMembership() {

        

    }


}
