package ENTITIES;

import java.sql.Time;
import java.time.LocalDate;

public class SeanceConduite extends Seance {
    private Moniteur moniteur;
    private String Localisation;
    public SeanceConduite(int id, LocalDate date, Time time, Double price,Moniteur moniteur, String Localisation) {
        super(id, date, time, price);
        this.moniteur = moniteur;
        this.Localisation = Localisation;
    }
    public Moniteur getMoniteur() {
        return moniteur;
    }
    public void setMoniteur(Moniteur moniteur) {
        this.moniteur = moniteur;
    }
    public String getLocalisation() {
        return Localisation;
    }
    public void setLocalisation(String Localisation) {
        this.Localisation = Localisation;
    }

    @Override
    public String toString() {
        return "SeanceConduite{" +
                super.toString()+
                "moniteur=" + moniteur +
                ", Localisation='" + Localisation + '\'' +
                "} "  ;
    }
}
