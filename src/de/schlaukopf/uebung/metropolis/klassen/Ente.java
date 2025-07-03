package de.schlaukopf.uebung.metropolis.klassen;

import de.schlaukopf.uebung.metropolis.interfaces.Flieger;
import de.schlaukopf.uebung.metropolis.interfaces.Schwimmer;

public class Ente implements Schwimmer, Flieger {
    public void quaken() {
        System.out.println("Quak! Quak!");
    }
    @Override
    public void starten() {
        System.out.println("Die Ente flattert in die Luft!");
    }

    @Override
    public void landen() {
        System.out.println("Die Ente landet im Wasser oder auf dem Boden.");
    }

    @Override
    public String schwimmen() {
        return "Die Ente paddelt gemütlich im Teich.";
    }

    @Override
    public void tauchen() {
        System.out.println("Die Ente tauchen im Wasser.");
    }
}
