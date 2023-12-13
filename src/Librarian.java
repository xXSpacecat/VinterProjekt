public class Librarian extends Human{

int workingHours;


public void work(int hours){
    pay(hours, "librarian", super.age);
}


}
