package de.schlaukopf.uebung.metropolis.organisation;

import de.schlaukopf.uebung.metropolis.interfaces.Schwimmer;

import java.util.ArrayList;
import java.util.List;

public class Wasserpolizei {
    List<Schwimmer> schwimmerListe = new ArrayList<>();

    public void schwimmerHinzufuegen(Schwimmer schwimmer){
        schwimmerListe.add(schwimmer);
        System.out.println("Ein neuer Schwimmer wurde der Wasserpolizei hinzugefügt.");
    }

    public void alleSchwimmen() {
        System.out.println("\n--- Die Wasserpolizei befiehlt: Alle schwimmen! ---");
        if (schwimmerListe.isEmpty()) {
            System.out.println("Keine Schwimmer registriert.");
            return;
        }
        for (Schwimmer schwimmer : schwimmerListe) {
            System.out.println(schwimmer.schwimmen()); //  schwimmen()
        }
        System.out.println("--- Schwimmübung beendet. ---");
    }
    public void alleTauchen() {
        System.out.println("\n--- Alle tauchen ab! ---");
        for (Schwimmer schwimmer : schwimmerListe) {
            schwimmer.tauchen();
        }
    }

}
