package ej.blocs;

import ej.exceptions.IllegalBlocException;

public class Toit extends Bloc{

    public Toit(final int hauteur, final int largeur, final int longueur) throws IllegalBlocException {
        super(hauteur, largeur, longueur, Couleur.MARRON);
    }

    
}
