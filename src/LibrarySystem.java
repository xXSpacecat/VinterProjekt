import java.util.ArrayList;

public class LibrarySystem {

    static ArrayList<Book> horror = new ArrayList<>();
    static ArrayList<Book> romance = new ArrayList<>();
    static ArrayList<Book> sciFi = new ArrayList<>();
    static ArrayList<Book> philosophy = new ArrayList<>();

    ArrayList[] genre = {horror, romance, sciFi, philosophy};

    public LibrarySystem() {
        horror.add(new Book("Murder on Rue Morgue", "Poe, Edgar Allan", 112));
        horror.add(new Book("The Back Rooms", "", 0));
        horror.add(new Book("Cujo","King, Stephen" ,453));
        romance.add(new Book("Pride & Predjudice", "Austen, Jane", 312));
        romance.add(new Book("Great expectations","Dickens, Charles", 387));
        romance.add(new Book("Of love and other demons", "Marquez, Gabriel Garciá",226));
        sciFi.add(new Book("Golden Son", "Brown, Pierce",418));
        sciFi.add(new Book("The handmaids tale", "Atwood, Margret",314));
        sciFi.add(new Book("Metro 2033", "Gluchovskij, Dmitrij",326));
        philosophy.add(new Book("The red book", "Jung, Carl Gustav",343));
        philosophy.add(new Book("The art of war", "Tzu, Sun",54));
    }

    public void printer(){
        System.out.println("o7");
        while (true) {
            System.out.println("1. Lend Book");
            System.out.println("2. Return Book");
            System.out.println("3. View available books");
            String v = Main.scan.nextLine();
            if (v.equalsIgnoreCase("1")){

            } else if (v.equalsIgnoreCase("2")) {

            } else if (v.equalsIgnoreCase("3")) {
                viewBooks();
            }else{
                System.out.println("I'm sorry, I did not quite get that, please try again");
                printer();
            }
        }

    }

    public void adminPrinter(){
        System.out.println("o7");
        while (true) {
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. View available books");
            String v = Main.scan.nextLine();
            if (v.equalsIgnoreCase("1")){
                addBook();
            } else if (v.equalsIgnoreCase("2")) {
                removeBook();
            }else if (v.equalsIgnoreCase("3")) {
                viewBooks();
            }else{
                System.out.println("I'm sorry, I did not quite get that, please try again");
                printer();
            }
        }

    }

    private void viewBooks() {
        for(int i = 0; i<genre.length; i++){
            for (int j = 0; j< genre[i].size(); j++){
                System.out.println(genre[i].get.name);
            }
        }
    }

    private void removeBook() {

    }

    private void addBook() {

    }


}
