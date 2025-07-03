package de.schlaukopf.uebung.metropolis.klassen;

import de.schlaukopf.uebung.metropolis.interfaces.Schwimmer;

/**
 * Klasse Schiff implementiert das Interface Schwimmer.
 */
public class Schiff implements Schwimmer {
    @Override
    public String schwimmen() {
        return "Das Schiff gleitet majestätisch durch das Wasser.";
    }

    @Override
    public void tauchen() {
        System.out.println("Schiff taucht");
    }

    public void anlegen() {
        System.out.println("Das Schiff legt im Hafen an.");
    }
}
