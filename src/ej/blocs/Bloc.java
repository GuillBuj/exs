package ej.blocs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ej.exceptions.IllegalBlocException;

public abstract class Bloc implements IBloc{

    protected int longueur;
    protected int largeur;
    protected int hauteur;
    protected Couleur couleur;

    private static Logger logger = LogManager.getLogger(Bloc.class);

    public Bloc(final int hauteur, final int largeur, final int longueur, final Couleur couleur)  throws IllegalBlocException{
        if (longueur<MIN_LONGUEUR||largeur<MIN_LARGEUR||hauteur<MIN_HAUTEUR){
            throw new IllegalBlocException();
        }
        
        this.hauteur = hauteur;
        this.largeur = largeur;
        this.longueur = longueur;
        this.couleur = couleur;

        logger.info("Bloc construit");
    }

    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }

    public int getLongueur() {
        return longueur;
    }

    public int getLargeur() {
        return largeur;
    }

    public int getHauteur() {
        return hauteur;
    }

    public Couleur getCouleur() {
        return couleur;
    }
    
    
}

