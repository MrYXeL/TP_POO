package mryxel.github.io.astrouphf;

import java.util.ArrayList;

public class CorpsCeleste {
    String nom;
    Boolean atmosphere;
    ArrayList<Zone> carte = new ArrayList<Zone>();
    public CorpsCeleste(String nom, Boolean atmosphere, ArrayList<Zone> carte){
        this.nom = nom;
        this.atmosphere = atmosphere;
        this.carte = carte;
    }
}