package de.schlaukopf.uebung.metropolis.test;

import de.schlaukopf.uebung.metropolis.interfaces.Flieger;
import de.schlaukopf.uebung.metropolis.klassen.Flugzeug;
import de.schlaukopf.uebung.metropolis.klassen.Maschine;
import de.schlaukopf.uebung.metropolis.klassen.Spatz;
import de.schlaukopf.uebung.metropolis.klassen.Superman;

public class Casting {
    public static void main(String[] args) {
        System.out.println("---- Casting Test startet ----");

        Spatz spatz = new Spatz();
        Superman superman = new Superman();
        Flugzeug flugzeug = new Flugzeug();
        Maschine maschine = new Maschine();

        System.out.println("\\n--- Upcasting (immer sicher) ---");
        Flieger flieger1 = spatz; // Spatz zu Flieger
        Object obj1 = superman; // Superman zu Object
        Maschine maschineAlsFlugzeug = flugzeug; // Flugzeug zu Maschine

        System.out.println("Spatz als Flieger: " + flieger1.getClass().getSimpleName());
        System.out.println("Superman als Object: " + obj1.getClass().getSimpleName());
        System.out.println("Flugzeug als Maschine: " + maschineAlsFlugzeug.getClass().getSimpleName());

        System.out.println("\n--- Downcasting (kann ClassCastException werfen) ---");

        Flieger einFlieger = new Spatz();
        if(einFlieger instanceof Spatz){
            Spatz zurueckZuSpatz = (Spatz) einFlieger;
            System.out.println("Flieger (ursprünglich Spatz) zu Spatz erfolgreich.");
            zurueckZuSpatz.zwitschern();
        }

        einFlieger = new Superman();
        if(einFlieger instanceof Superman){
            Superman zurueckZuSuperman = (Superman) einFlieger;
            System.out.println("Flieger (ursprünglich Superman) zu Superman erfolgreich.");
            zurueckZuSuperman.weltRetten();
        }

        einFlieger = new Flugzeug();
        if(einFlieger instanceof Flugzeug){
            Flugzeug zurueckZuFluhzeug = (Flugzeug) einFlieger;
            System.out.println("Flieger (ursprüglich Flugzeug) zu Flugzeug erfolgreich.");
            zurueckZuFluhzeug.flugSteuern();
        }

        //  (ClassCastException)
        System.out.println("\n--- Fehlerhafte Castings (erwartete ClassCastException) ---");
        Flieger andererFlieger = new Superman(); //  Superman
        try {
            Spatz spatzAusSuperman = (Spatz) andererFlieger; //
            System.out.println("Superman zu Spatz erfolgreich (Sollte fehlschlagen!).");
        } catch (ClassCastException e) {
            System.out.println("ClassCastException erwartet: Superman kann nicht zu Spatz gecastet werden. (OK)");
        }

        Object obj = new Spatz(); //  Spatz
        try {
            Superman supermanAusSpatz = (Superman) obj; //
            System.out.println("Spatz zu Superman erfolgreich (Sollte fehlschlagen!).");
        } catch (ClassCastException e) {
            System.out.println("ClassCastException erwartet: Spatz kann nicht zu Superman gecastet werden. (OK)");
        }

        //
        try {
            Flieger fliegerAusMaschine = (Flieger) maschine; //
            System.out.println("Maschine zu Flieger erfolgreich (Sollte fehlschlagen!).");
        } catch (ClassCastException e) {
            System.out.println("ClassCastException erwartet: Maschine kann nicht zu Flieger gecastet werden. (OK)");
        }
    }
}
