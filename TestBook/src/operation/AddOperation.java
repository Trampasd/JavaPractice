package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class AddOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("添加图书！");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入书名：");
        String bName = scanner.nextLine();
        System.out.println("请输入作者：");
        String aName = scanner.nextLine();
        System.out.println("请输入价格：");
        int price = scanner.nextInt();
        scanner.nextLine();
        System.out.println("请输入类型：");
        String type = scanner.nextLine();

        Book book = new Book(bName, aName, price, type);

        int curSize = bookList.getUsedSize();

        for (int i = 0; i < curSize; i++) {
            if (bookList.getBook(i).getName().equals(bName)) {
                System.out.println("书架已存在这本书");
                return;
            }
        }

        //将书放入书架
        bookList.setBooks(curSize, book);

        bookList.setUsedSize(curSize+1);
    }
}
