package fr.univ.amu.miage.m1.glq.tp.tp1.exo2.compte;

public class ExceptionSoldeInsuffisant extends RuntimeException {
    public ExceptionSoldeInsuffisant(String message) {
        super(message);
    }
}
