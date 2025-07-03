package de.schlaukopf.uebung.metropolis.organisation;

import de.schlaukopf.uebung.metropolis.exceptions.CapeVergessenException;
import de.schlaukopf.uebung.metropolis.exceptions.NichtVollGetanktException;
import de.schlaukopf.uebung.metropolis.interfaces.Flieger;
import de.schlaukopf.uebung.metropolis.klassen.Batwing;
import de.schlaukopf.uebung.metropolis.klassen.Spatz;
import de.schlaukopf.uebung.metropolis.klassen.Superman;

import java.util.ArrayList;
import java.util.List;

public class MetropolisAirport {
    private List<Flieger> alleFlieger = new ArrayList<>();

    public MetropolisAirport() {
        alleFlieger.add(new Spatz());
        alleFlieger.add(new Superman());
        alleFlieger.add(new Batwing());
    }

    public void alleStarten() {
        System.out.println("\n--- Alle Flugobjekte starten vom Metropolis Airport ---");
        for (Flieger flieger : alleFlieger) {
            try {
                flieger.starten(); // اینجا ممکن است Exception پرتاب شود
            } catch (CapeVergessenException | NichtVollGetanktException e) {
                System.err.println("[FEHLER] Start von " + flieger.getClass().getSimpleName() + ": " + e.getMessage());
            }
            // ... اضافه کردن catch برای FederkleidNichtPerfektException در گام بعدی
            System.out.println(flieger.getClass().getSimpleName() + " ist bereit zu landen."); // نشان می‌دهد که اگر شروع موفق بود چه اتفاقی می‌افتد
            // flieger.landen(); // اینجا می‌توانست فرود بیاید اگر شروع موفق بود
        }
        System.out.println("--- Startvorgänge abgeschlossen ---");
        System.out.println("\n--- Alle Flugobjekte starten vom Metropolis Airport ---");
        for (Flieger flieger : alleFlieger) {
            try {
                flieger.starten(); // اینجا ممکن است Exception پرتاب شود
            } catch (CapeVergessenException | NichtVollGetanktException e) {
                System.err.println("Startfehler: " + e.getMessage());
                // cann log here
            }
            // if not throw then can landen
            // البته، این منطق ممکن است پیچیده‌تر شود اگر هر Flieger Exception خاص خود را داشته باشد
            // و شما بخواهید فقط بعد از شروع موفقیت آمیز فرود بیایند.
            // flieger.landen(); // این را ممکن است بخواهید به بعد از شروع موفقیت آمیز منتقل کنید
        }
        System.out.println("--- Startvorgänge abgeschlossen ---");
    }
    public static void main(String[] args) {
        MetropolisAirport airport = new MetropolisAirport();
        airport.alleStarten();


        Superman clark = new Superman();
        Batwing batmanFlieger = new Batwing();

        // Superman rettet ein paar Welten
        clark.weltRetten();
        clark.weltRetten();
        clark.weltRetten();

        // Batwing show information
        batmanFlieger.landen(); // here Batwing to Superman.getAnzahlGeretteterWelten()  access
    }
}
