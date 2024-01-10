public class Librarian extends Human{

    int workingHours;

    public Librarian() {
        getPermission(0);
    }

    public void work(int hours){
        pay(hours, "librarian", super.age);
    }


}
