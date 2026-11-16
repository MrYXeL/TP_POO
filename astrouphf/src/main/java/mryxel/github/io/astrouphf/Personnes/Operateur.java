package mryxel.github.io.astrouphf.Personnes;

import java.util.ArrayList;
import mryxel.github.io.astrouphf.Mission;
import mryxel.github.io.astrouphf.Enum.*;

public class Operateur extends Personne{
    ArrayList<Competence> competences = new ArrayList<Competence>();
    ArrayList<Cadet> subordonnes = new ArrayList<Cadet>();

    public Operateur(double id, String nom, String pnom, Genre genre, String tel, ArrayList<Mission> missions_en_cour, ArrayList<Competence> competences, ArrayList<Cadet> subordonnes){
        super(id, nom, pnom, genre, tel, missions_en_cour);
        this.missions_en_cour = missions_en_cour;
        if(!(competences.size() >= 1 && competences.size() <= 3)){
            System.err.println("Erreur des compétences de " + getNom());
        }
        this.subordonnes = subordonnes;
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

    ArrayList<Competence> getCompetences(){
        return competences;
    }


}
