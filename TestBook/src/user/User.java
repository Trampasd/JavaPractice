package user;

import book.BookList;
import operation.IOperation;

public abstract class User {
    protected String name;
    public IOperation[] iOperations;

    public User(String name) {
        this.name = name;
    }

    public abstract int menu();

    public void doOperation(int choice, BookList bookList) {
        iOperations[choice].work(bookList);
    }
}
