package de.schlaukopf.uebung.metropolis.test;

import de.schlaukopf.uebung.metropolis.exceptions.CapeVergessenException;
import de.schlaukopf.uebung.metropolis.exceptions.FederkleidNichtPerfektException;
import de.schlaukopf.uebung.metropolis.exceptions.NichtVollGetanktException;
import de.schlaukopf.uebung.metropolis.interfaces.*;
import de.schlaukopf.uebung.metropolis.klassen.*;

public class SuperDingTest {
    public static void main(String[] args) throws CapeVergessenException, NichtVollGetanktException, FederkleidNichtPerfektException {
        System.out.println("--- Test von DasSuperDing startet ---");

        // Alle Referenztypen für ein DasSuperDing Objekt
        DasSuperDing dasDing = new DasSuperDing();
        FlieWaTuet flieWaTuetRef = dasDing;
        Flieger fliegerRef = dasDing;
        Schwimmer schwimmerRef = dasDing;
        Fahrer fahrerRef = dasDing;
        Object objectRef = dasDing;

        System.out.println("\n--- Methodenaufrufe über verschiedene Referenztypen ---");
        // Über DasSuperDing-Referenz (alle Methoden zugänglich)
        dasDing.starten();
        dasDing.landen();
        System.out.println(dasDing.schwimmen());
        System.out.println(dasDing.fahren());
        System.out.println(dasDing.himbeerSaftTanken());
        dasDing.transformieren();

        // Über FlieWaTuet-Referenz (alle Methoden von FlieWaTuet zugänglich)
        System.out.println("\nFlieWaTuet-Referenz:");
        flieWaTuetRef.starten();
        System.out.println(flieWaTuetRef.schwimmen());
        System.out.println(flieWaTuetRef.fahren());
        System.out.println(flieWaTuetRef.himbeerSaftTanken());
        // flieWaTuetRef.transformieren(); // FEHLER: transformieren() ist nicht Teil von FlieWaTuet

        // Über Flieger-Referenz (nur Flieger-Methoden zugänglich)
        System.out.println("\nFlieger-Referenz:");
        fliegerRef.starten();
        fliegerRef.landen();
        // fliegerRef.schwimmen(); // FEHLER: schwimmen() ist nicht Teil von Flieger

        // Über Schwimmer-Referenz (nur Schwimmer-Methoden zugänglich)
        System.out.println("\nSchwimmer-Referenz:");
        System.out.println(schwimmerRef.schwimmen());

        // Über Fahrer-Referenz (nur Fahrer-Methoden zugänglich)
        System.out.println("\nFahrer-Referenz:");
        System.out.println(fahrerRef.fahren());

        System.out.println("\n--- Mögliche Castings für DasSuperDing ---");
        // Upcasting (immer implizit möglich und sicher)
        FlieWaTuet castedToFlieWaTuet = dasDing;
        Flieger castedToFlieger = dasDing;
        Schwimmer castedToSchwimmer = dasDing;
        Fahrer castedToFahrer = dasDing;
        Object castedToObject = dasDing;
        System.out.println("Upcastings sind immer sicher.");

        // Downcasting (explizit, kann ClassCastException werfen)
        // از یک نوع کلی تر به یک نوع جزئی تر
        if (fliegerRef instanceof DasSuperDing) {
            DasSuperDing dingAusFlieger = (DasSuperDing) fliegerRef;
            System.out.println("Flieger zu DasSuperDing: Erfolgreich.");
            dingAusFlieger.transformieren(); // اکنون می‌توان transformieren را فراخوانی کرد
        }

        if (objectRef instanceof FlieWaTuet) {
            FlieWaTuet fwtAusObject = (FlieWaTuet) objectRef;
            System.out.println("Object zu FlieWaTuet: Erfolgreich.");
            System.out.println(fwtAusObject.himbeerSaftTanken());
        }

        // Castings بین اینترفیس‌ها
        if (fliegerRef instanceof Schwimmer) { // true, چون DasSuperDing هر دو را پیاده‌سازی می‌کند
            Schwimmer schwimmerAusFlieger = (Schwimmer) fliegerRef;
            System.out.println("Flieger zu Schwimmer: Erfolgreich (da beide von DasSuperDing implementiert).");
            System.out.println(schwimmerAusFlieger.schwimmen());
        }

        // مثال یک Casting ناموفق (برای تست مفهوم)
        // فرض کنید کلاس Spatz فقط Flieger است، نه Schwimmer
        Flieger spatzFlieger = new Spatz();
        try {
            Schwimmer schwimmerAusSpatz = (Schwimmer) spatzFlieger; // ClassCastException erwartet
            System.out.println("Spatz zu Schwimmer: Erfolgreich (Sollte fehlschlagen!).");
        } catch (ClassCastException e) {
            System.out.println("ClassCastException erwartet: Spatz kann nicht zu Schwimmer gecastet werden. (OK)");
        }


        System.out.println("--- Test von DasSuperDing beendet ---");
    }
}
