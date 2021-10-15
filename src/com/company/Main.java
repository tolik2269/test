package com.company;

public class Main {

    public static void main(String[] args) {

        LibrarianAdministrator librarianAdministrator = new LibrarianAdministrator("Иван");
        ReaderAdministrator readerAdministrator = new ReaderAdministrator("Юлия");
        BookSupplierReader bookSupplierReader = new BookSupplierReader("Катя");

        librarianAdministrator.orderBooks(bookSupplierReader);
        readerAdministrator.takeBook(librarianAdministrator);
        bookSupplierReader.bringsBooks(librarianAdministrator);
    }

}
