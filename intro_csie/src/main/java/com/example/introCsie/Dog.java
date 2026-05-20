package com.example.introCsie;

/**
 * Clasa Dog - reprezinta un obiect de tip caine.
 *
 * "implements Behaviour" inseamna ca aceasta clasa este obligata sa implementeze
 * toate metodele definite in interfata Behaviour (in acest caz, metoda bark()).
 *
 * Campurile sunt declarate "private" => principiul incapsularii:
 * datele nu pot fi accesate direct din afara clasei, ci doar prin getteri/setteri.
 */
public class Dog implements Behaviour {

    // campuri private - nu sunt accesibile direct din afara clasei
    private String name;
    private int age;
    private String race;

    // camp static - apartine clasei, nu instantei; este partajat de toate obiectele Dog
    static int value = 10;

    /**
     * Constructor fara argumente (no-arg constructor).
     * Creeaza un obiect Dog cu campurile neinitializate (null / 0).
     * Este folosit cand nu se cunosc datele la momentul crearii obiectului.
     */
    public Dog() {}

    /**
     * Constructor cu argumente - permite initializarea campurilor la creare.
     * "this.name" se refera la campul obiectului curent, nu la parametrul local.
     *
     * @param name - numele cainelui
     * @param age  - varsta
     * @param race - rasa
     */
    public Dog(String name, int age, String race) {
        this.name = name;
        this.age = age;
        this.race = race;
    }

    // ========== GETTERI ==========
    // Metodele getter permit citirea valorii unui camp privat din exterior.

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getRace() {
        return race;
    }

    // ========== SETTERI ==========
    // Metodele setter permit modificarea valorii unui camp privat din exterior.

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRace(String race) {
        this.race = race;
    }

    /**
     * Metoda toString() - suprascrie implementarea din clasa Object.
     * Este apelata automat cand se face System.out.println(obiect).
     * Returneaza o reprezentare text a obiectului.
     *
     * @Override indica faptul ca aceasta metoda suprascrie o metoda din clasa parinte.
     */
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", race='" + race + '\'' +
                '}';
    }

    /**
     * Implementarea metodei bark() din interfata Behaviour.
     * Fara aceasta implementare, clasa ar fi abstracta si nu s-ar putea instantia.
     */
    @Override
    public void bark() {
        System.out.println("HAM HAM");
    }
}
