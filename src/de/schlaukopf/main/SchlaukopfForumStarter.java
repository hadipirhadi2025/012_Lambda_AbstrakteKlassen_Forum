package de.schlaukopf.main;

import de.schlaukopf.foren.SchlaukopfForum;
import de.schlaukopf.organisation.Schlaukopf;
import de.schlaukopf.personen.NaturPhilosoph;
import de.schlaukopf.personen.Philosoph;

/**
 * <pre>
 * Hier werden verschieden Objekte erstellt, doe mit dem Referenztyp Schlaukopf angesprochen werden
 * können.
 * Damit können sie beim Schlaukopf Forum gegistriert werden (aufnehmen)
 * Verschiede Varianten werden verwendet: Instanzen von Klasse, von inneren Klassen, von anonymen
 * inneren Klasse und Instanzen erstellt als Lambda Ausruck
 *
 * Dann werden die registriertn Schlauköpfe reden (alleReden)
 * Dann werden alle registrierten Schlauköofe denken (alleDenken)
 * </pre>
 */
public class SchlaukopfForumStarter {
    public static void main(String[] args) {
        System.out.println("\tWillkommen im Forum für schlaue Leute!\n");
        SchlaukopfForum dasForum = new SchlaukopfForum();

        // *********** NaturPhilosoph: Objekt der Klasse NaturPhilosoph ********* //
        NaturPhilosoph isaac = new NaturPhilosoph();
        dasForum.aufnehmen(isaac, "Newton der AppleSpotter");

        // ***** Philosoph: Objekt einer anonymen Klasse, die Philosoph erweitert: ....extends Philosoph **//
        Philosoph diogenes = new Philosoph() {
            public void rauchen() {
                System.out.println("Ein kleines Feuerchen ab und zu wärmt die alten Knochen");
            }
            public String reden() {
                return "Ich brauche einen Tonne, ich brauche Sonne und sonst nichts";
            }
        };
        dasForum.aufnehmen(diogenes,"Diogenes in der Tonne");

        // *** Fragezeichen: Lokale Klasse, die das Schlaukopf Interface implementiert *** //
        class Fragezeichen implements Schlaukopf{
            public String reden() {
                return "Wir lösen den Fall auf jeden Fall.";
            }
            public void denken() {
                System.out.println("Treffen in der Zentrale: der Fall ist gelöst!");
            }
            public String visitenkartenVerteilen(){
                return "??? lösen jeden Fall";
            }
        }
        Fragezeichen justus = new Fragezeichen();
        System.out.println(justus.visitenkartenVerteilen());
        dasForum.aufnehmen(justus, "Der erste Detektiv");

        // *** Schlaukopf: anonyme Klasse, die das Schlaukopf Interface implementiert .... implements Schlaukopf *** //
        Schlaukopf einstein = new Schlaukopf(){
            public String reden(){
                String wichtiges = berechnen();
                return "E = mc²    " + wichtiges;
            }
            public void denken(){
                System.out.println("Alles ist relativ");
            }
            public String berechnen(){
                return "Lichtgeschwindigkeit:  299.792.458 m/s";
            }
        };
        //Wunsch: berechnen aufrufen DAS IST NICHT MÖGLICH, diese Klasse hat keinen Referenztyp!
        dasForum.aufnehmen(einstein, "Einstein");

        // **** Eine Lambda Ausdruck: implementieren der reden-Methode (mit  Rückgabe) **** //
        Schlaukopf influencer = () -> "100 Likes sind mehr wert, als ein Nobelpreis! #Weisheit";
        dasForum.aufnehmen(influencer,"Clickbait Charlie");

        Schlaukopf schlaubiSchlumpf = () -> {
            String taetigkeit = "schlumpfe";
            return "Ich " + taetigkeit + " also  " + taetigkeit + " ich.";
        };
        dasForum.aufnehmen(schlaubiSchlumpf, "Schlaubi, der klügste Schlumpf von allen.");

        // *** Aufnehmen enes Schlaukopfs als anonymes Objekt, das über Lambda Ausdruck erstellt ist *** //
        dasForum.aufnehmen( ()->"C# ist eine Strafe!","Java Guru");

        dasForum.alleDiskutieren();
        dasForum.alleDenken();
    }
}
