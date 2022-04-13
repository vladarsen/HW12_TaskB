package com.vladarsenjtev;


public class Main {

    public static void main(String[] args) {

        Phonebook phonebook = new Phonebook();
        phonebook.addPhone("Vlad", "+380930331612");
        phonebook.addPhone("Anna", "+380965463717");
        phonebook.addPhone("Oleg", "+380930782634");
        phonebook.addPhone("Vlad", "+380676475616");


        System.out.println(phonebook.getPhonebook());
        System.out.println();
        System.out.println(phonebook.find("Anna"));
        System.out.println();
        System.out.println(phonebook.findAll("Vlad"));
    }
}
