package ej;

public class Porte extends Bloc{

    private boolean verrouillee;

    public Porte(final int longueur, final int largeur, final int hauteur, final boolean verrouillee) {
        super(longueur, largeur, hauteur, Couleur.BLEU);
        this.verrouillee = verrouillee;
    }

    public boolean estVerrouillee(){
        return verrouillee;
    }

}