package com.example.introCsie;

/**
 * Clasa Main - contine metoda principala pentru testarea clasei Dog.
 * Demonstreaza crearea obiectelor, utilizarea constructorilor si a metodelor.
 */
public class Main {

    public static void main(String[] args) {

        // afisare simpla in consola
        System.out.println("Hello world");

        // creare obiect Dog cu constructorul fara argumente (campurile sunt null / 0)
        Dog dog1 = new Dog();

        // getName() returneaza null deoarece campul nu a fost initializat
        System.out.println(dog1.getName());

        // println apeleaza automat toString() => afiseaza reprezentarea text a obiectului
        System.out.println(dog1);

        // creare obiect Dog cu constructorul cu argumente - campurile sunt initializate direct
        Dog dog2 = new Dog("azorel", 5, "cocker");
        System.out.println(dog2);

        // variabila primitiva de tip int
        int val = 10;

        // Integer.parseInt() converteste un String in int
        // util cand datele vin dintr-un fisier sau de la utilizator (ca text)
        int val2 = Integer.parseInt("11");
    }
}
