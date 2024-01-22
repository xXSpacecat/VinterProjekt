import java.util.ArrayList;

public class LibrarySystem {

    static ArrayList<Book> horror = new ArrayList<>();
    static ArrayList<Book> romance = new ArrayList<>();
    static ArrayList<Book> sciFi = new ArrayList<>();
    static ArrayList<Book> philosophy = new ArrayList<>();

    ArrayList[] genre = {horror, romance, sciFi, philosophy};

    public LibrarySystem() {
        horror.add(new Book("Murder on Rue Morgue", 112));
        horror.add(new Book("The Back Rooms", 0));
        sciFi.add(new Book("Golden Son", 418));
        sciFi.add(new Book("The handmaids tale", 314));
        sciFi.add(new Book("Golden Son", 418));
        sciFi.add(new Book("Golden Son", 418));
        sciFi.add(new Book("Golden Son", 418));
    }






}
