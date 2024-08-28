package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class BorrowedOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("借阅图书！");

        Scanner scanner = new Scanner(System.in);
        int curSize = bookList.getUsedSize();
        System.out.println("请输入你要借的书：");
        String name = scanner.nextLine();

        for (int i = 0; i < curSize; i++) {
            Book book1 = bookList.getBook(i);
            if (book1.getName().equals(name)) {
                if (book1.isBorrowed() == true) {
                    System.out.println("书已被借出");
                    return;
                }else {
                    book1.setBorrowed(true);
                    System.out.println("借阅成功");
                    return;
                }
            }
        }

        System.out.println("不存在这本书");
    }
}
