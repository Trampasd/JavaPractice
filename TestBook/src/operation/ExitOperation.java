package operation;

import book.Book;
import book.BookList;

public class ExitOperation implements IOperation{
    @Override
    public void work(BookList bookList) {

        System.out.println("退出系统！");

        int curUsed = bookList.getUsedSize();

        for (int i = 0; i < curUsed; i++) {
             bookList.setBooks(i, null);
        }
        bookList.setUsedSize(0);

        System.exit(0);
    }
}
