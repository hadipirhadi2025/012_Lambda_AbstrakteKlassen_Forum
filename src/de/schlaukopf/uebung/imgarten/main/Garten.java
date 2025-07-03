package de.schlaukopf.uebung.imgarten.main;

import de.schlaukopf.uebung.imgarten.interfaces.Graber;
import de.schlaukopf.uebung.imgarten.objects.Bagger;
import de.schlaukopf.uebung.imgarten.objects.Minibagger;
import de.schlaukopf.uebung.imgarten.verwaltung.GartenVerwaltung;

public class Garten {
    public static void main(String[] args) {
        System.out.println("--- Projekt: Im Garten startet ---");

        // 1.
        GartenVerwaltung verwaltung = new GartenVerwaltung();

        // 2.
        Minibagger meinMinibagger = new Minibagger("Komatsu PC20");
        verwaltung.registrieren(meinMinibagger);

        // 3.
        verwaltung.registrieren(new Bagger("Schaufelradbagger XXL") {
            @Override
            public String graben(double flaechenGroesse, double tiefe) {
                return  "Als Schaufelradbagger kann ich " + flaechenGroesse + " qm " + " und tief "+ tiefe + " m "+
                "auf einmal umgraben! Ich verlange eine ganze Kohlemine als Bezahlung!";
            }


        });

        // 4.
        class Schaufel implements Graber {

            @Override
            public String graben(double flaechenGroesse, double tiefe) {
                return "Ich bin nur eine Schaufel. " + flaechenGroesse + " qm "+ tiefe +" m sind sehr viel!" +
                        " Ich brauche einen starken Menschen und viel Geduld.";
            }
        }
        verwaltung.registrieren(new Schaufel());

        // 5.
        verwaltung.registrieren(new Graber() {
            @Override
            public String graben(double flaechenGroesse, double tiefe) {
                return "Ich bin ein alter Spaten. " + flaechenGroesse + " qm? " + tiefe + " m? " +
                        "Das dauert bei mir den ganzen Tag und ich möchte Feierabendbier!";
            }
        });

        // 6.
        verwaltung.registrieren((f, t)->{
            String nachricht = "Ich bin der Maulwurf! Für " + f + " qm " + t + " m "+
                    "grabe ich, aber ich will danach einen großen Haufen Regenwürmer!";
            return nachricht;
        });

        // 7. und 8. Lambda Ausdruck
        Graber roboterLambda = (flaeche, tief) -> "Wenn ich " + flaeche + " qm " + tief +
                " m umgraben soll, will ich " + (int)(flaeche / 10) + " kWh Strom.";
        verwaltung.registrieren(roboterLambda);

        //
        verwaltung.registrieren((area, deep) -> "Für " + area + " qm und " +deep + " m " +
                " grabe ich präzise und schnell, aber ich bestehe auf eine Wartung nach jedem Auftrag!");

        // 1.  ‘vorstellen‘
        verwaltung.vorstellen();

        // 2.‘beauftragen‘ for 150m² und 2.1m deep
        verwaltung.beauftragen(150.0, 2.1);

        System.out.println("\n--- Projekt: Im Garten beendet ---");
    }
}
