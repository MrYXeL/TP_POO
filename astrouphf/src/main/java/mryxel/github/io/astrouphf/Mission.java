package mryxel.github.io.astrouphf;

import java.util.ArrayList;
import java.util.Date;

import mryxel.github.io.astrouphf.Engins.Engin;
import mryxel.github.io.astrouphf.Enum.EtatMission;
import mryxel.github.io.astrouphf.Personnes.DirecteurMission;
import mryxel.github.io.astrouphf.Personnes.Operateur;

public class Mission {
    String nom;
    CorpsCeleste corps;
    Date lancement;
    double budget;
    DirecteurMission directeur;
    ArrayList<Operateur> operateur = new ArrayList<Operateur>();
    ArrayList<Engin> engin = new ArrayList<Engin>();
    EtatMission etat;
}