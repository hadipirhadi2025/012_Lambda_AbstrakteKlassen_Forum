package de.schlaukopf.uebung.metropolis.interfaces;

import de.schlaukopf.uebung.metropolis.exceptions.CapeVergessenException;
import de.schlaukopf.uebung.metropolis.exceptions.FederkleidNichtPerfektException;
import de.schlaukopf.uebung.metropolis.exceptions.NichtVollGetanktException;

public interface Flieger {
    void starten()throws CapeVergessenException, NichtVollGetanktException, FederkleidNichtPerfektException;
    void landen();
}
