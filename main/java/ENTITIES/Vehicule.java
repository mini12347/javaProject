package ENTITIES;

import java.util.Date;

public class Vehicule {
    private String matricule;
    private Date datem;
    private int kilometrage;
    private Typev type;
    private int kilometrageE;
    public Vehicule(String matricule, Date datem, int kilometrage, Typev type) {
        this.matricule = matricule;
        this.datem = datem;
        this.kilometrage = kilometrage;
        this.type = type;
        switch (type){
            case MOTO:
                kilometrageE = kilometrage;
                break;
            case CAMION:
                kilometrageE = kilometrage;
                break;
            case VOITURE:
                kilometrageE = kilometrage;
                break;
            default:
                kilometrageE = kilometrage;
                break;
        }
    }
    public String getMatricule() {
        return matricule;
    }
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
    public Date getDatem() {
        return datem;
    }
    public void setDatem(Date datem) {
        this.datem = datem;
    }
    public int getKilometrage() {
        return kilometrage;
    }
    public void setKilometrage(int kilometrage) {
        this.kilometrage = kilometrage;
    }
    public Typev getType() {
        return type;
    }
    public void setType(Typev type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "matricule='" + matricule + '\'' +
                ", datem=" + datem +
                ", kilometrage=" + kilometrage +
                ", type=" + type +
                '}';
    }
    public int getKilometrageE() {
        return kilometrageE;
    }
    public void setKilometrageE(int kilometrageE) {
        this.kilometrageE = kilometrageE;
    }
    //methode permettant de déterminer  le nombre de km qui reste pour le prochain entretient
    public double NbKP(){
        return kilometrage;
    }
}
