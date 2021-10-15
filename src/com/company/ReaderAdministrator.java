package com.company;

public class ReaderAdministrator extends LibraryUser implements Administrator, Reader{
  public ReaderAdministrator (String name){
      super (name);
  }

    @Override
    public void overdueNotification(Reader reader) {
      System.out.println("Администратор "+ this.name + "обнаружил невозврат у "+ reader);
    }

    @Override
    public void takeBook(Administrator administrator) {
        System.out.println("Администратор "+ this.name + "взял книгу у "+ administrator);
    }

    @Override
    public void returnBook(Administrator administrator) {
        System.out.println("Администратор "+ this.name + "вернул книгк  "+ administrator);
    }
}
