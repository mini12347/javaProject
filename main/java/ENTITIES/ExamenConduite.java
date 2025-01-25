package ENTITIES;

import java.sql.Time;
import java.time.LocalDate;

public class ExamenConduite extends Examen<Boolean>{
    private String localisation;
    private Ingenieur ingenieur;
    public ExamenConduite(LocalDate date, Time time, Candidat candidat, Ingenieur ingenieur, Boolean resultat, String localisation) {
        super(date, time, candidat, resultat);
        this.ingenieur = ingenieur;
        this.localisation=localisation;
    }
    public String getLocalisation() {
        return localisation;
    }
    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }
    public Ingenieur getIngenieur() {
        return ingenieur;
    }
    public void setIngenieur(Ingenieur ingenieur) {
        this.ingenieur = ingenieur;
    }

    @Override
    public String toString() {
        return "ExamenConduite{" + super.toString()+
                "localisation='" + localisation + '\'' +
                ", ingenieur=" + ingenieur +
                "} " ;
    }
}
