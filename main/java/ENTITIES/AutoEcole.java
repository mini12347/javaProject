package ENTITIES;

public class AutoEcole {
    private String nom;
    private int numtel;
    private String email;
    private String adresse;
    private Horaire horaire;
    public AutoEcole(String nom, int numtel, String email, String adresse) {
        this.nom = nom;
        this.numtel = numtel;
        this.email = email;
        this.adresse = adresse;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getNumtel() {
        return numtel;
    }
    public void setNumtel(int numtel) {
        this.numtel = numtel;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "AutoEcole{" +
                "nom='" + nom + '\'' +
                ", numtel=" + numtel +
                ", email='" + email + '\'' +
                ", adresse='" + adresse + '\'' +
                '}';
    }
}
