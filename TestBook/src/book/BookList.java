package book;

public class BookList {
    private Book[] books = new Book[10];
    private int usedSize;//计数器 来记录当前实际放的书的数目

    public BookList() {
        this.books[0] = new Book("三国演义", "罗贯中", 100, "小说");
        this.books[1] = new Book("西游记", "吴承恩", 150, "小说");;
        this.books[2] = new Book("红楼梦", "曹雪芹", 200, "小说");;
        this.usedSize = 3;

    }

    public Book getBook(int pos) {
        return books[pos];
    }

    public void setBooks(int pos, Book book) {
        books[pos] = book;
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }


}
