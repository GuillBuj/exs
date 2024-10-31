package ej;

public abstract class Bloc implements IBloc{

    protected int longueur;
    protected int largeur;
    protected int hauteur;
    protected Couleur couleur;

    public Bloc(final int hauteur, final int largeur, final int longueur) {
        this.hauteur = hauteur;
        this.largeur = largeur;
        this.longueur = longueur;
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

