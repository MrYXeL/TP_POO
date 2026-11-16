package mryxel.github.io.astrouphf.Personnes;

import java.util.ArrayList;
import mryxel.github.io.astrouphf.Mission;
import mryxel.github.io.astrouphf.Enum.*;

public class Cadet extends Personne{
    Operateur tuteur;

    public Cadet(double id, String nom, String pnom, Genre genre, String tel, Operateur tuteur, ArrayList<Mission> missions_en_cour){
        super(id, nom, pnom, genre, tel, missions_en_cour);
        this.missions_en_cour = tuteur.getMissionEnCour();
        this.tuteur = tuteur;
    }

    ArrayList<Mission> getMissionEnCour(){
        return missions_en_cour;
    }

    void affecter_mission(Mission mission){
        if(missions_en_cour.size()<1){
            missions_en_cour.add(mission);
        }else{
            System.err.println("L'operateur "+ getNom() +" est déjà affecté à une mission");
        }
    }

    void desaffecter_mission(Mission mission){
        missions_en_cour.remove(mission);
    }
}
