package de.schlaukopf.foren;

import de.schlaukopf.organisation.Schlaukopf;

import java.util.HashMap;
import java.util.Map;

/**
 * <pre>
 *     Das Schlaukopfforum nimmt schlaue Köpfe auf und ordnet ihnen einen Nichname zu.
 *
 *     Esstartet die Diskussion aller aufgenohmmenen Schlauköpfe.
 *
 *     Und regt die schlauen Köpfe zum Nachdenken an
 * </pre>
 */
public class SchlauKopfForum {
    /**
     * key: isz ein Objekt vom Typ Schlaukopf, ermöglich ist jeder typ , der das Schlaue kopfInterface implementiert
     * Value: ist ein String fürden Nickname
     */
    private Map<Schlaukopf, String> schlaueKopfe = new HashMap<>();

    public void aufnehmen(Schlaukopf schlauKopf, String nick){
        schlaueKopfe.put(schlauKopf, nick);
        System.out.println(nick + ", ein schlauer Kopf betritt das Forum");
    }
    /**
     * Alle schlue Köpfe diskuteren: Schleife über Attribut schlaueKopfe
     * jeder von denen redet
     * schlauKoepfe.get(genie) ; liefert zum Schlüssel vom Datentyp Schlaukopf den Nickname mit Datentyp String
     */

    public void alleDiskutieren(){
        System.out.println("\nHören wir zu, was die schlauen Köpfe zu sagen haben:\n");

        for(Schlaukopf genie: schlaueKopfe.keySet()){
            System.out.println(schlaueKopfe.get(genie) + " sagt: " + genie.redern() + "\n");
        }
    }

    /**
     * Scleife über alle schlauen Köpfe, jeder von dennen soll denken
     * genie.denken(); default Methode aus dem Interface: Sie kann überschreiben werden, muss sie aber nicht
     */
    public void alleDenken(){
        System.out.println("Über das Gehörte muss nachgedact werden.\n");

        for(Schlaukopf genie : schlaueKopfe.keySet()){
            System.out.println("\n-------------" + schlaueKopfe.get(genie) + "----------------\n") ;
            System.out.println("Ich kann denken,denn  ich binvom typ;" + genie.getClass().getName());
            genie.denken();
            System.out.println("--------------------------------------------------------");
        }
    }
}
