package inheritance;

/**
 * Clasa Main - demonstreaza conceptul de mostenire si polimorfism.
 */
public class Main {

    public static void main(String[] args) {

        // declararea unei variabile de tip Dog (referinta)
        Dog a;

        // instantierea obiectului - se aloca memorie si se apeleaza constructorul Dog()
        // care la randul lui apeleaza super() => Animal()
        a = new Dog();

        // apelul metodei sound():
        // intai se afiseaza "Dog barks" (versiunea suprascrisa din Dog)
        // apoi se afiseaza "Animal makes a sound" (prin super.sound() din Dog)
        a.sound();
    }
}
