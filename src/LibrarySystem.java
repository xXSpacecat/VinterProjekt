import java.util.ArrayList;

public class LibrarySystem {

    static ArrayList<Book> horror = new ArrayList<>();
    static ArrayList<Book> romance = new ArrayList<>();
    static ArrayList<Book> sciFi = new ArrayList<>();
    static ArrayList<Book> philosophy = new ArrayList<>();

    ArrayList[] genre = {horror, romance, sciFi, philosophy};

    public LibrarySystem() {
        horror.add(new Book("Murder on Rue Morgue", "Edgar Allan Poe", 112));
        horror.add(new Book("The Back Rooms", "", 0));
        horror.add(new Book("Cujo","Stephen King" ,453));
        romance.add(new Book("Pride & Predjudice", "Jane Austen", 312));
        romance.add(new Book("Great expectations","Charles Dickens", 387));
        romance.add(new Book("Of love and other demons", "Gabriel Garciá Marquez",226));
        sciFi.add(new Book("Golden Son", "Pierce Brown",418));
        sciFi.add(new Book("The handmaids tale", "Margret Atwood",314));
        sciFi.add(new Book("Metro 2033", "Dmitrij Gluchovskij",326));
        philosophy.add(new Book("The red book", "Carl Gustav Jung",343));
        philosophy.add(new Book("The art of war", "Sun Tzu",54));
    }

    public void printer(){
        System.out.println("o7");
        while (true) {
            System.out.println("1. Lend Book");
            System.out.println("2. Log in");
            System.out.println("3. Log in as Admin");
            String v = Main.scan.nextLine();
            if (v.equalsIgnoreCase("1")){

            } else if (v.equalsIgnoreCase("2")) {

            }else{
                System.out.println("I'm sorry, I did not quite get that, please try again");
                printer();
            }
        }

    }




}
