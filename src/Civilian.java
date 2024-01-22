public class Civilian extends Human{
    String[] job = { "Store Manager", "Store Assistant", "Pilot", "BusDriver"};
    int debt;
    int activeJob;

    public Civilian(String name, String password, int age, int bankNMR) {
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
