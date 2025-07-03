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

        // *** Schlaukpf:
    }
}
