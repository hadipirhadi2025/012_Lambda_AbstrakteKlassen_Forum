package de.schlaukopf.personen;

import de.schlaukopf.organisation.Schlaukopf;

import java.util.Random;

/**
 * <pre>
 *     Ein Philosoph ist ein schlauer Kopf : implementiert das Schlaukopf Interface.
 *     Verschiede Strömungen der Philosophie, verschiedene Philosophen haben ganz unterschiedliche Dinge zu sagen:
 *          die reden Methode soll hier noch gar nicht überschrieben werden.
 *     Erbende Klassen, Erweiterungen von Philosoph sollen ihre eigenen reden-Methode habe: Lösung: abstrakte Klasse
 *     Damit kann die Klasse Philosoph nicht instanziiert werden, kein new Philosoph();
 *
 *     Abstrakte Klassen dürfen konkrete Methoden enthalten: schlafen, trinken, denken
 *     Abstrakte Klassen dürfen abstrakte Methoden enthalten: rauchen, reden
 *     Abstrakte Klassen dürfen finale Methoden enthalten: schlafen
 *     Abstrakte Klassen dürfen Objekt-Attribute enthalten: jahreInEinsamkeit
 *     Abstrakte Klassen haben (mindestens) einen Konstruktor (Explizit oder implizit)
 *
 *     Abstrakte Klassen können nicht instanziier werden (kein new Philosoph();)
 *     Abstrakte Klassen können beerbt/erweitert werden: extends Philosoph{...}
 *
 * </pre>
 */
public abstract class Philosoph implements Schlaukopf {
    /**
     * Objekt-Attribut, in einem Interface nicht möglich
     */
    protected int jahreInEinsamkeit;

    /**
     * Nur Klassen haben Konstruktoren, in einem Interface nicht möglich
     * Wird in den erbenden Klasse aufgerufen (implizit, oder explizit mit super(); )
     */
    public Philosoph(){
        Random wuerfel = new Random();
        jahreInEinsamkeit = wuerfel.nextInt(2,25);

    }

    /**
     * "normale" Methode: hat einen Körper ({}) ist eine konkrete Methode.
     * Methode kann in erbenden Klasse überschrieben werden, muss sie aber nicht
     */
    public void trinken(){
       System.out.println("Am liebsten trinke ich Rotwein");
   }

    /**
     * Nur abstrakte Klassen können abstrakte Methoden enthalten.
     * Soll die Kindklasse instanziiert werden, muss sie diese Methode überschreiben
     */
   public abstract void rauchen();

    /**
     * Kein Philosoph kann gut schlafen, Der weiß einfach zu viel
     * Diese Methode soll in erbenden Klassen nicht überschreiben werden: final
     */
   public final void schlafen(){
       String wissen = reden();
       System.out.println("Seit " + jahreInEinsamkeit + " schlafe ich nicht mehr, denn " +
               "ich weiß: " + wissen);
   }
}




