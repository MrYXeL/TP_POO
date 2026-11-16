package mryxel.github.io.astrouphf.Personnes;

import java.util.ArrayList;

import mryxel.github.io.astrouphf.Mission;
import mryxel.github.io.astrouphf.Enum.*;

public abstract class Personne {
    double id;
    String nom;
    String pnom;
    Genre genre;
    String tel;
    ArrayList<Mission> missions_en_cour = new ArrayList<Mission>();

    public Personne(double id, String nom, String pnom, Genre genre, String tel, ArrayList<Mission> missions_en_cour){
        this.id = id;
        this.nom = nom;
        this.pnom = pnom;
        this.genre = genre;
        this.tel = tel;
    }

    public double getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPnom() {
        return pnom;
    }

    public Genre getGenre() {
        return genre;
    }

    public String getTel() {
        return tel;
    }
}
