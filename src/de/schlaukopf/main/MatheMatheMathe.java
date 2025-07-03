package de.schlaukopf.main;

import de.schlaukopf.organisation.Rechner;

import java.util.HashMap;
import java.util.Map;

/**
 * <pre>
 *     Demonstration von Lambda Ausdrück mit mehrere Parameter
 *     Instanziiert das Rechner Interface mit Lambda Ausdrücken
 *     (Anonyme Klassen)
 * </pre>
 */
public class MatheMatheMathe {
    public static void main(String[] args) {
        Rechner addierer = (ersterSummand , zweiterSummand) -> ersterSummand + zweiterSummand ;
        Rechner multiplizierer =(factor1, factor2) -> factor1 * factor2;
        Rechner potenzErsteller =(basis , exponent) -> Math.pow(basis, exponent);
        Rechner abstandsRechner = (anfang, ende) -> {
            if(anfang>ende){
                return anfang - ende;
            }
            else{
                return ende - anfang;
            }
        };
        Rechner abstandKurz = (a,b) -> a>b ? a - b : b - a;
        Rechner[] alleRechner = {addierer, multiplizierer, potenzErsteller, abstandsRechner, abstandKurz};



        for(Rechner einRechner : alleRechner){
            double ergebnis = einRechner.berechnen(3.1, 5.4);
            System.out.println("Ergebnis der Verknüpfung: " + ergebnis);
            System.out.printf("Ergebnis %.2f\n", ergebnis);
        }

        Map<Rechner, String> mitNamen = new HashMap<>();
        mitNamen.put(addierer, "+");
        mitNamen.put(multiplizierer, "*");
        mitNamen.put(potenzErsteller, "^");
        mitNamen.put(abstandsRechner, "_");

        mitNamen.forEach(((rechner, s) -> System.out.println("Ergebnis " + s + " = " + rechner.berechnen(3.7, 2.99))));

    }
}
