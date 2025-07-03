package de.schlaukopf.uebung.metropolis.klassen;

import de.schlaukopf.uebung.metropolis.interfaces.Flieger;

public class Spatz implements Flieger {

    @Override
    public void starten() {
        System.out.println("Spatz fliegt los!");
    }

    @Override
    public void landen() {
        System.out.println("Spatz landet sanft.");
    }

    public void zwitschern(){
        System.out.println("Spatz zwitschert fröhlich.");
    }
}
