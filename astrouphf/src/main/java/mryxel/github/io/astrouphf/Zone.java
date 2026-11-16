package mryxel.github.io.astrouphf;

import mryxel.github.io.astrouphf.Engins.Rover;
import mryxel.github.io.astrouphf.Enum.*;

public class Zone {
    double lon;
    double lat;
    Terrain type;
    int interet;
    Boolean cartographiee;

    public Zone(double lon, double lat, Terrain type, int interet){
        this.lat = lat;
        this.lon = lon;
        this.type = type;
        if(interet <= 10 && interet >= 0){
            this.interet = interet;
        }else{
            System.err.println("Interet pas entre 0 et 10");
        }
    }

    public void cartographie(){
        this.cartographiee = true;
    }

    public Echantillon explorer(Rover rover){
        //TODO
    }
}
