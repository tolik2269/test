package com.company;

public class BookSupplierReader extends LibraryUser implements BookSupplier, Reader{
    public BookSupplierReader (String name){
        super (name);
    }
    @Override
    public void bringsBooks(Librarian librarian) {
        System.out.println("Поставщик "+ this.name + "доставил книги библиотекарю "+ librarian);
    }

    @Override
    public void takeBook(Administrator administrator) {
        System.out.println("Поставщик "+ this.name + "взял почитать книгу у админа "+ administrator);
    }

    @Override
    public void returnBook(Administrator administrator) {
        System.out.println("Поставщик "+ this.name + "вернул книгу админу "+ administrator);
    }
}
