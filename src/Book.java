//Böckerna kommer vara det inehållet i biblioteket och det som kommer flyttas runt
public class Book {
    private String title;
    private int pages;
    private int currentPage = 0;
    private double bookState = 1.0;
    public int lendingPeriod = 30;
    private String author;

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
