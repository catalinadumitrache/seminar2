package inheritance;

/**
 * Interfata Ibehaviour - defineste un comportament comun pe care animalele il pot implementa.
 *
 * Interfetele in Java reprezinta un "contract": orice clasa care implementeaza aceasta
 * interfata trebuie sa furnizeze implementarea metodei breath().
 *
 * Conventia de denumire: numele interfetelor incepe adesea cu "I" (de la "Interface").
 */
public interface Ibehaviour {

    /**
     * Metoda abstracta breath() - reprezinta comportamentul de a respira.
     * Nu are implementare aici; clasa care implementeaza interfata o va defini.
     */
    public void breath();
}
