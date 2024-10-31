package ej.blocs;

import ej.IllegalBlocException;
import ej.PorteVerrouilleeException;

public class Porte extends Bloc{

    private boolean verrouillee;

    public Porte(final int longueur, final int largeur, final int hauteur, final boolean verrouillee) throws IllegalBlocException{
        super(longueur, largeur, hauteur);
        this.verrouillee = verrouillee;
        this.couleur = Couleur.BLEU;
    }

    public void verouiller() throws PorteVerrouilleeException{
        if (!verrouillee) {
            verrouillee=true;}
        else {
            throw new PorteVerrouilleeException();}
    }

    public boolean estVerrouillee(){
        return verrouillee;
    }

}
