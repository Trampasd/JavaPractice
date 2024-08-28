package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class ReturnOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("归还图书！");

        Scanner scanner = new Scanner(System.in);
        int curSize = bookList.getUsedSize();
        System.out.println("请输入你要还的书：");
        String name = scanner.nextLine();

        for (int i = 0; i < curSize; i++) {
            Book book1 = bookList.getBook(i);
            if (book1.getName().equals(name)) {
                book1.setBorrowed(false);
                System.out.println("归还成功");
                return;
            }
        }

        System.out.println("不存在这本书");
    }
}
