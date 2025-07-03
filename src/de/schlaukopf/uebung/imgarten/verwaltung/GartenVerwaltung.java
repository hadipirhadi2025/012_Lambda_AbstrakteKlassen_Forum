package de.schlaukopf.uebung.imgarten.verwaltung;

import de.schlaukopf.uebung.imgarten.interfaces.Graber;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Klasse zur Verwaltung und Vorstellung von Graber-Objekten im Garten.
 */
public class GartenVerwaltung {
    private List<Graber> graberListe = new ArrayList<>();
    private Random random = new Random();

    /**
     * Registriert einen Graber in der Liste.
     * @param graber das Grabber-Objekt.
     */
    public void registrieren(Graber graber) {
        graberListe.add(graber);
        System.out.println("Ein Graber wurde registriert: " + graber.getClass().getSimpleName());
    }

    public void vorstellen() {
        System.out.println("\n--- Alle Graber stellen sich vor und nennen ihre Forderungen ---");
        if (graberListe.isEmpty()) {
            System.out.println("Keine Graber registriert.");
            return;
        }
        double testFlaeche = 50.0;
        double testTief = 1.0;

        for (Graber graber : graberListe) {

            System.out.println(graber.getClass().getSimpleName() + ": " + graber.graben(testFlaeche, testTief));
        }
        System.out.println("--- Vorstellung beendet ---");
    }

    /**
     * Wählt zufällig einen Graber aus, um einen Auftrag zu erhalten.
     * @param flaeche  Die zu bearbeitende Fläche für den Auftrag.
     */
    public void beauftragen(double flaeche, double tief) {
        System.out.println("\n--- Beauftragung eines Grabers ---");
        if (graberListe.isEmpty()) {
            System.out.println("Keine Graber verfügbar für den Auftrag.");
            return;
        }
        // Grabber
        int index = random.nextInt(graberListe.size());
        Graber ausgewaehlterGraber = graberListe.get(index);

        System.out.println("Der Auftrag (" + flaeche + " qm umgraben) geht an: " + ausgewaehlterGraber.getClass().getSimpleName());
        //
        System.out.println("Forderungen des beauftragten Grabers: " + ausgewaehlterGraber.graben(flaeche, tief));
        System.out.println("--- Auftrag vergeben ---");
    }
}
