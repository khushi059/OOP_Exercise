package book;

class Book {
    private String title;
    private String author;
    private String publisher;
    private int copyright;

    // Constructor to accept and initialize title, author, publisher, and copyright
    public Book(String title, String author, String publisher, int copyright){
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this. copyright = copyright;
    }

    // Getter and setter methods for title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getter and setter methods for author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter and setter methods for publisher
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    // Getter and setter methods for copyright
    public int getCopyright() {
        return copyright;
    }

    public void setCopyright(int copyright){
        this. copyright = copyright;
    }

    // toString method to return a nicely formatted, multiline description of the book
    @Override
    public String toString(){
        return "Title: " + title + "\nAuthor: " + author + "\nPublisher: " + publisher + "\nCopyright: " + copyright;
    }
}

