public class Human {
    String name;
    int age;
    int bankNMR;
    private int bankBalance;
    private boolean lendingPermission;

    public Human() {
    }

    public void getPermission(double amount){

        if (bankBalance >= amount) {
            bankBalance -= amount;
            this.lendingPermission = true;
            System.out.println(name + " paid membership fee of $" + amount + ". Remaining balance: $" + bankBalance);
        } else {
            System.out.println(name + " does not have enough funds to pay the membership fee.");
        }
    }

    public void pay(int Hours, String job, int age){

    }

    public void payMembershipFee(double amount) {

    }

}
