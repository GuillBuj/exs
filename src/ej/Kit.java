package ej;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import ej.blocs.IBloc;
import ej.blocs.Mur;
import ej.blocs.Porte;

public class Kit {

    @SuppressWarnings("Convert2Diamond")
    List<IBloc> blocs = new ArrayList<IBloc>();
    @SuppressWarnings("Convert2Diamond")
    Set<String> motsCles = new HashSet<String>();

    public Kit() throws IllegalBlocException {
        this.blocs.add(new Mur(3,2,2,true));
        this.blocs.add(new Mur(3,2,2,true));
        this.blocs.add(new Mur(2,1,2,false));
        this.blocs.add(new Mur(2,1,2,false));
        this.blocs.add(new Porte(3,2,2,true));

        motsCles.add("Cabane");
        motsCles.add("Muraille");
    }

    public void afficherKit(){
        System.out.println("Nombre de blocs dans le kit:" + blocs.size());
        System.out.print("Liste des mots-clés du kit: ");
        for (Object motCle : motsCles) {
            System.out.print(motCle + " ");
        }
        }
}

    


