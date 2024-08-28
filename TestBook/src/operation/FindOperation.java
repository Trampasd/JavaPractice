package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class FindOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("查找图书！");

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要查找的书名：");
        String name = scanner.nextLine();

        int curUsed = bookList.getUsedSize();
        for (int i = 0; i < curUsed; i++) {
            Book book = bookList.getBook(i);
            if (book.getName().equals(name)) {
                System.out.println("找到了:");
                System.out.println(book);
                return;
            }
        }

        System.out.println("好像没有这本书！！");
    }
}
