//Böckerna kommer vara det inehållet i biblioteket och det som kommer flyttas runt
public class Book {
    String title;
    int pages;
    int currentPage = 0;
    double bookState = 1.0;
    int lendingPeriod = 30;
    String author;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public void placeBookmark(){

    }

    public String getTitle(){
        return this.title;
    }







}
