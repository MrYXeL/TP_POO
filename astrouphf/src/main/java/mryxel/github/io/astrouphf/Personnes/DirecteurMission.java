package mryxel.github.io.astrouphf.Personnes;

import java.util.ArrayList;
import mryxel.github.io.astrouphf.Mission;
import mryxel.github.io.astrouphf.Enum.*;

public class DirecteurMission extends Personne {
    double budget_total;

    public DirecteurMission(double id, String nom, String pnom, Genre genre, String tel, double budget_total, ArrayList<Mission> missions_en_cour){
        super(id, nom, pnom, genre, tel, missions_en_cour);
        this.budget_total = budget_total;
        this.missions_en_cour = missions_en_cour;
    }

    double getBudgetTotal(){
        return budget_total;
    }

    public void ajouter_budget(double somme){
        this.budget_total += somme;
    }


}
