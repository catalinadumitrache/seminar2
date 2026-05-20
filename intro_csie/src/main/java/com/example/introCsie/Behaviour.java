package com.example.introCsie;

/**
 * Interfata Behaviour - defineste un contract (comportament) pe care clasele care o implementeaza
 * trebuie sa il respecte.
 *
 * O interfata nu contine implementare (corp de metoda), ci doar semnatura metodelor.
 * Orice clasa care e capabila sa "implements Behaviour" este obligata sa implementeze metoda bark().
 */
public interface Behaviour {

    /**
     * Metoda abstracta - nu are corp, doar semnatura.
     * Clasele care implementeaza aceasta interfata trebuie sa furnizeze implementarea concreta.
     */
    public void bark();
}
