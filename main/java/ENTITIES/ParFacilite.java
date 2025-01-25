package ENTITIES;

import java.sql.Time;
import java.time.LocalDate;

public class ParFacilite extends Paiement{
    private int nbmois;//or private List<Double> montants;
    public ParFacilite(int idPaiement, LocalDate date, Time time, int idClient, String description, Double montant,int nbmois) {
        super(idPaiement, date, time, idClient, description, montant);
        this.nbmois = nbmois;
    }
    public int getNbmois() {
        return nbmois;
    }
    public void setNbmois(int nbmois) {
        this.nbmois = nbmois;
    }

    @Override
    public String toString() {
        return "ParFacilite{" +
                super.toString()+
                "nbmois=" + nbmois +
                "} " ;
    }
}
