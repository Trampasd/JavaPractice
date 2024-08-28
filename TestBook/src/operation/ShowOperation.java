package operation;

import book.Book;
import book.BookList;

public class ShowOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("显示图书！");

        int curUsed = bookList.getUsedSize();
        for (int i = 0; i < curUsed; i++) {
            Book book = bookList.getBook(i);
            System.out.println(book);
        }
    }
}
