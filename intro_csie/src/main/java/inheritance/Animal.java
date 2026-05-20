package inheritance;

/**
 * Clasa Animal - clasa de baza (parinte / superclasa) pentru ierarhia de animale.
 *
 * Mostenirea (inheritance) permite claselor derivate (Dog, Cat) sa reutilizeze
 * campurile si metodele definite aici, fara a le rescrie.
 *
 * Campurile sunt "package-private" (fara modificator de acces) =>
 * sunt accesibile in acelasi pachet, dar nu din afara lui.
 */
public class Animal {

    // campuri mostenite de clasele derivate
    String name;
    int age;

    /**
     * Metoda sound() - comportament implicit al oricarui animal.
     * Clasele derivate pot suprascrie aceasta metoda (method overriding)
     * pentru a oferi un comportament specific.
     */
    void sound() {
        System.out.println("Animal makes a sound");
    }

    /**
     * Constructor fara argumente - necesar pentru apelul super() din clasele derivate.
     */
    public Animal() {}

    /**
     * Constructor cu argumente - initializeaza campurile name si age.
     *
     * @param name - numele animalului
     * @param age  - varsta animalului
     */
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

/**
 * Clasa Dog - extinde Animal si implementeaza interfata Ibehaviour.
 *
 * "extends Animal" => Dog mosteneste campurile (name, age) si metoda sound() din Animal.
 * "implements Ibehaviour" => Dog trebuie sa implementeze metoda breath().
 *
 * Aceasta clasa demonstreaza mostenirea simpla si implementarea unei interfete simultan.
 */
class Dog extends Animal implements Ibehaviour {

    /**
     * Constructor fara argumente - apeleaza constructorul clasei parinte cu super().
     * super() trebuie sa fie prima instructiune intr-un constructor al clasei derivate.
     */
    public Dog() {
        super(); // apeleaza Animal()
    }

    /**
     * Constructor cu argumente - transmite parametrii catre constructorul din Animal.
     *
     * @param name - numele cainelui
     * @param age  - varsta cainelui
     */
    public Dog(String name, int age) {
        super(name, age); // apeleaza Animal(name, age)
    }

    /**
     * Suprascrierea metodei sound() din Animal (method overriding).
     * Cand se apeleaza a.sound() pe un obiect Dog, se executa aceasta versiune.
     *
     * super.sound() apeleaza explicit versiunea metodei din clasa parinte (Animal).
     */
    void sound() {
        System.out.println("Dog barks");
        super.sound(); // afiseaza si "Animal makes a sound"
    }

    /**
     * Implementarea metodei din interfata Ibehaviour.
     * Fara aceasta, clasa Dog ar trebui declarata abstracta.
     */
    @Override
    public void breath() {
        System.out.println(); // implementare minima - doar o linie goala
    }
}

/**
 * Clasa Cat - extinde Animal, suprascrie metoda sound() cu zgomotul specific pisicii.
 * Nu implementeaza nicio interfata suplimentara.
 */
class Cat extends Animal {

    void sound() {
        System.out.println("Cat makes meow");
    }
}
