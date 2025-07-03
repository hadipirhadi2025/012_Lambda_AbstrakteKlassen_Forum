package de.schlaukopf.uebung.metropolis.klassen;

import de.schlaukopf.uebung.metropolis.interfaces.Flieger;

public class Flugzeug extends Maschine implements Flieger {
    @Override
    public void starten() {
        System.out.println("Flugzeug startet von der Landebahn!");
    }

    @Override
    public void landen() {
        System.out.println("Flugzeug landet auf der Landebahn.");
    }
    public void flugSteuern(){
        System.out.println("Flugzeug wird gesteuert.");
    }
}
