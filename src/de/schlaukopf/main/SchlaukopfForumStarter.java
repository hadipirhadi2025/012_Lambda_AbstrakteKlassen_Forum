package de.schlaukopf.main;

import de.schlaukopf.foren.SchlauKopfForum;
import de.schlaukopf.organisation.Schlaukopf;
import de.schlaukopf.personen.NaturPhilosoph;
import de.schlaukopf.personen.Philosoph;

/**
 * <pre>
 *     Hier werden verschiedene Objekte erstellt, doe mit dem Referenztyp Schlaukopf angesprochen werden
 *     können.
 *     Damit können sie beim Schalukopf Forum gegistiert werden (aufnehmen)
 *
 * </pre>
 */
public class SchlaukopfForumStarter {
    public static void main(String[] args) {
        System.out.println("\tWillkommwn im Forum für schlaue Leute!\n");
        SchlauKopfForum dasForum = new SchlauKopfForum();

        // ************** NaturPhilosoph: Objekt der Klasse NaturPhilosoph *****************//
        NaturPhilosoph issac = new NaturPhilosoph();
        dasForum.aufnehmen(issac, "Newton der AppelSpotter");

        // ************** Philosoph: Objekt einer anonymen Klasse, die Philosoph erweitert: ... extends Pholosof *****************//
        Philosoph diogenes = new Philosoph() {
            @Override
            public void rauchen() {
                System.out.println("Ein kleines Feuerchen ab und zu wärmt die alten Knochen");
            }

            @Override
            public String redern() {
                return "Ich brauche einen Tonne, ich brauche Sonne und sonst nicht";
            }
        };
        dasForum.aufnehmen(diogenes, "Diognes in der Tonne");


        // ************** Fragezeichen: Lokale Klasse, die das Schaukopf Interface implementuert *****************//
        class Fragezeichen implements Schlaukopf{

            @Override
            public String redern() {
                return "Wir lösen den Fall auf jeden Fall";
            }

            @Override
            public void denken() {
                //1Schlaukopf.super.denken();
                System.out.println("Treffen in der Zentrale: der Fall ist gelöst!");
            }

            public String visitwnkartenVerteilen(){
                return "??? lösen jeden Fall";
            }
        }
        Fragezeichen justus = new Fragezeichen();
        System.out.println(justus.visitwnkartenVerteilen());
        dasForum.aufnehmen(justus, "Der erste Detektiv");

        // *** Schlaukpf: anonyme Klasse, die das Schlaukopf Interface implementiert .... implements Schlaukopf ****//
        Schlaukopf einstein = new Schlaukopf() {
            @Override
            public String redern() {
                String wichriges = berechnen();
                return "E = mc²  " + wichriges;
            }

            @Override
            public void denken() {
                //Schlaukopf.super.denken();
                System.out.println("Alles ist relativ");
            }

            public String berechnen(){
                return "Lichtgeschwindigkeit: 299.792.458 m/s"
            }
            //Wunsch: berechnen aufrufen DAS IST NICHT MÖGLICH, die Klasse hat keinen Referenztyp!
        };
        dasForum.aufnehmen(einstein, "Einstein");

        // **** Eine Lambda Ausdruck: Impelmentieren der reden-Methode (mit Rückgabe) *****///
        Schlaukopf influencer = () -> "100 Likes sind mehr wert, als ein Nobelpreis! #Weisheit";
        dasForum.aufnehmen(influencer, "Clickbait Charlie");

        Schlaukopf schlaubiSchlumpf = () ->{
            String teatigkeit = "Schlumpfe";
            return "Ich " + teatigkeit + " also " + teatigkeit + " ich.";

        };
        dasForum.aufnehmen(schlaubiSchlumpf, "Schlaubi, der klügste Schlaumpg von allen");

        // *** Aufnehmen eines Schlaukopfs als anonymes Objekt, das über Lambda Ausdruck erstellt ist ***//
        dasForum.aufnehmen(()->"C# ist eine Strafe! ", "Java Guru");
    }
}
