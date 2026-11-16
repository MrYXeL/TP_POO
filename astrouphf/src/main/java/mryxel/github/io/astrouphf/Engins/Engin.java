package mryxel.github.io.astrouphf.Engins;

import mryxel.github.io.astrouphf.Mission;
import mryxel.github.io.astrouphf.Enum.*;

public abstract class Engin {
    double id;
    String nom;
    double lon;
    double lat;
    Etat etat;
    Mission mission;

    public Engin(double id, String nom, double lon, double lat, Etat etat, Mission mission){
        this.id = id;
        this.nom = nom;
        this.lon = lon;
        this.lat = lat;
        this.etat = etat;
        this.mission = mission;
    }
}
