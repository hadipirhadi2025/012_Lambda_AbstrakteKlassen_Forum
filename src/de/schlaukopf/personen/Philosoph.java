package de.schlaukopf.personen;

import de.schlaukopf.organisation.Schlaukopf;

import java.util.Random;

/**
 * <pre>
 *     Ein Philosoph ist ein schlauer Kopf : implementiert das Schlaukopf Interface
 *     Verschiedene Strömungen der Philosophie, verschiedene Philosophen haben ganz unterschiedlische Dinge zu sagen:
 *         die reden Methode soll hier gar nicht überschreiben werden.
 *     Erbende Klassen, Erweiterungen von philosoph soll ihre eigenen reden-Methode habe: Lösung: abstrakte Klasse
 *     Damit kann die Klasse Philosoph nict instanziert werden, kein new Philosoph();
 * </pre>
 */
public abstract class Philosoph implements Schlaukopf {
    /**
     * objekt-Attribut, in einem Interface nicht möglich
     */
    protected int jahreInEinsamkeit;
    /**
     * Nur Klassen haben Konstruktoren, in einem Interface nicht möglich
     * Wird in dern erbenden Klasse aufgerufen (implizit, oder explizit mit super();
     */
    public Philosoph(){
        Random wuerfel = new Random();
        jahreInEinsamkeit = wuerfel.nextInt(2, 25);
    }

}
