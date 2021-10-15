package com.company;
//пользователи библиотеки

public abstract  class LibraryUser{

    public String name;

    public LibraryUser (String name){
        this.name=name;
    }
@Override
    public String toString(){

    return "с именем "+  name;
}
}
