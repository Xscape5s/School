public class Lecture {

    private String book;
    private String author;
    private String link;
    private boolean online;
    private int numInventory;

    public Lecture(String book, String author, boolean online, String link) {
        this.book = book;
        this.author = author;
        this.online = online;
        this.link = link;
    }

    public Lecture(String book, String author, boolean online, int numInventory) {
        this.book = book;
        this.author = author;
        this.online = online;
        this.numInventory = numInventory;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public int getNumInventory() {
        return numInventory;
    }

    public void setNumInventory(int numInventory) {
        this.numInventory = numInventory;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "book='" + book + '\'' +
                ", author='" + author + '\'' +
                ", link='" + link + '\'' +
                ", online=" + online +
                ", numInventory=" + numInventory +
                '}';
    }
}
