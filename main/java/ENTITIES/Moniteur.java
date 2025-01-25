package ENTITIES;

import java.util.Date;

public class Moniteur extends Personne {
    private Vehicule vehicule;
    private Horaire horaire;
    public Moniteur(int cin, String nom, String prenom, String adresse, String mail, int numTelephone, Date dateNaissance, Vehicule vehicule, Horaire horaire) {
        super(cin, nom, prenom, adresse, mail, numTelephone, dateNaissance);
        this.vehicule = vehicule;
        this.horaire = horaire;
    }
    public Vehicule getVehicule() {
        return vehicule;
    }
    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }
    public Horaire getHoraire() {
        return horaire;
    }
    public void setHoraire(Horaire horaire) {
        this.horaire = horaire;
    }

    @Override
    public String toString() {
        return "Moniteur{" +
                  super.toString()+horaire.toString()+"vehicule=" + vehicule +"} ";
    }
}
