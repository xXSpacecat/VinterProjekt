//Självaste systemet där allting ska ske
import java.util.ArrayList;

public class LibrarySystem {

    static ArrayList<Book> horror = new ArrayList<>();
    static ArrayList<Book> romance = new ArrayList<>();
    static ArrayList<Book> sciFi = new ArrayList<>();
    static ArrayList<Book> philosophy = new ArrayList<>();

    //alla böcker kommer samlas i en och samma array
    ArrayList[] genre = {horror, romance, sciFi, philosophy};

    public LibrarySystem() {
        //Ett antal böcker skapas i förhand
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





    public void viewBooks() {
        //Loopar igenomalla böckerna i alla arrayer så att de ska kunna skrivas ut
        for(int i = 0; i<genre.length; i++){
            for (int j = 0; j< genre[i].size(); j++){
                Book currentbook = (Book)genre[i].get(j);
                System.out.println(currentbook.getTitle());
            }
        }
    }

    void removeBook() {
        //Tar bort valda böcker genom att jämföra titlar
        System.out.print("Enter the title of the book to remove: ");
        String rTitle = Main.scan.nextLine();

        for (int i = 0; i < genre.length; i++) {
            ArrayList<Book> booksInGenre = genre[i];
            for (int j = 0; j < booksInGenre.size(); j++) {
                Book book = booksInGenre.get(j);
                if (book.getTitle().equalsIgnoreCase(rTitle)) {
                    booksInGenre.remove(j);
                    System.out.println("Book removed successfully!");
                    return;
                }
            }
        }

        System.out.println("Book not found. Please check the title and try again.");

    }

    void addBook() {
        //lägger till en bok genom att skapa en bok klass med alla parametrar som användaren kan stoppa in
        System.out.println("Enter book details: ");
        System.out.print("Title: ");
        String title = Main.scan.nextLine();
        System.out.print("Author: ");
        String author = Main.scan.nextLine();
        System.out.print("Pages: ");
        int pages = Integer.parseInt(Main.scan.nextLine());

        System.out.println("Select genre: ");
        System.out.println("1. Horror");
        System.out.println("2. Romance");
        System.out.println("3. Sci-Fi");
        System.out.println("4. Philosophy");
        int genreNmr = Integer.parseInt(Main.scan.nextLine()) - 1;

        genre[genreNmr].add(new Book(title, author, pages));
        System.out.println("Book added successfully!");

    }


}
