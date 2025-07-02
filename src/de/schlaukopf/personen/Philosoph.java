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
 *
 *     Abstrakte Klassen dürfen konkrete Methoden enthalten: schlafen, trinken, denken
 *     Abstrakte Klassen dürfen abstrakte Methone enthalten: rauchen, reden
 *     Abstrakte Klassen dürfen finale Methoden enthalten: schlafen
 *     Abstrake Klassen dürfen Objekt-Attriebut enthalten: Jahre
 *                      haben(mindestens) einen Konstruktor (Explizit oder implizit)
 *                       können nicht instantiate werden(kein new Philosoph();)
 *                       können beerbt/erweitert werden: extends Philosoph{}
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

    public void trinken(){
        System.out.println("Am liebsten trinke ich Rotwein.");
    }
    /**
     * Nur abstrakte Klassen können abstrakte Methoden enthalten.
     * soll
     */

    public abstract void rauchen();
    public final void schlaufen(){
        String wissen = redern();
        System.out.println("Seit " + jahreInEinsamkeit + " schlafe ich nicht mehr, denn " +
                "ich weiß: " + wissen);
    }

}
