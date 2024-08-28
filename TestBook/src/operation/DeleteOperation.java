package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class DeleteOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("删除图书！");
        Scanner scanner = new Scanner(System.in);

        int curSize = bookList.getUsedSize();
        if (curSize == 0) {
            System.out.println("书架为空不能删除！");
            return;
        }

        System.out.println("请输入要删除的书名：");
        String name = scanner.nextLine();


        int index = -1;

        for (int i = 0; i < curSize; i++) {
            if (bookList.getBook(i).getName().equals(name)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("没有这本书！");
            return;
        }

        for (int i = index; i < curSize-1; i++) {
            Book book1 = bookList.getBook(i+1);
            bookList.setBooks(i, book1);

        }

        bookList.setUsedSize(curSize-1);
        System.out.println("删除成功");
    }
}
