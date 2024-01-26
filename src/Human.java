//Basklassen för alla klasser som kommer ha en roll i programmet

public class Human {
    String name;
    String password;
    int age;
    int bankNMR;
    private int bankBalance = 0;
    private boolean lendingPermission;

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

    public void pay(int Hours, String job, int age){

    }

    public void payMembershipFee(double amount) {

    }

}
