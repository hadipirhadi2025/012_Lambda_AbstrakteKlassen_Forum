package de.schlaukopf.uebung.imgarten.objects;

import de.schlaukopf.uebung.imgarten.interfaces.Graber;

/**
 * Eine abstrakte Basisklasse für alle Bagger, die das Graber-Interface implementiert.
 * Da sie abstrakt ist, muss sie die graben()-Methode nicht implementieren.
 * Dies wird den konkreten Subklassen überlassen.
 */
public abstract class Bagger implements Graber {
    protected String modell;

    //Konstruktor
    public Bagger(String modell) {
        this.modell = modell;
    }

    public void motorStarten() {
        System.out.println(modell + " Motor wird gestartet.");
    }
}
