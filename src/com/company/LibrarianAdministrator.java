package com.company;

public class LibrarianAdministrator extends LibraryUser implements Librarian, Administrator{
    public LibrarianAdministrator (String name){
        super(name);
    }
    @Override
    public void overdueNotification(Reader reader) {
System.out.println("Библиотекарь "+ this.name+ "узнал о невозврате книг от"+ reader);
    }

    @Override
    public void orderBooks(BookSupplier bookSupplier) {
        System.out.println("Библиотекарь "+ this.name+ "заказал книги у поставщика "+ bookSupplier);
    }

    @Override
    public void receiveBooks(BookSupplier bookSupplier) {
        System.out.println("Библиотекарь "+ this.name+ "получили книги от поставщика "+ bookSupplier);
    }
}
