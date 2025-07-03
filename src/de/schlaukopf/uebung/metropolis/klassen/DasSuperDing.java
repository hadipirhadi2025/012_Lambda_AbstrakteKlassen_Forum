package de.schlaukopf.uebung.metropolis.klassen;

import de.schlaukopf.uebung.metropolis.interfaces.FlieWaTuet;

/**
 * Klasse DasSuperDing, die das Interface FlieWaTuet implementiert.
 * Es kann fliegen, schwimmen, fahren und Himbeersaft tanken.
 */
public class DasSuperDing implements FlieWaTuet {
    @Override
    public void starten() {
        System.out.println("Das SuperDing fliegt mit Überschallgeschwindigkeit los!");
    }

    @Override
    public void landen() {
        System.out.println("Das SuperDing landet präzise.");
    }

    @Override
    public String schwimmen() {
        return "Das SuperDing taucht elegant durch die Ozeane.";
    }

    @Override
    public void tauchen() {

    }

    @Override
    public String fahren() {
        return "Das SuperDing rast über Autobahnen und Schienen.";
    }

    @Override
    public String himbeerSaftTanken() {
        return "Das SuperDing tankt aromatischen Himbeersaft. Mmmh!";
    }

    public void transformieren() {
        System.out.println("Das SuperDing transformiert seine Form!");
    }
}