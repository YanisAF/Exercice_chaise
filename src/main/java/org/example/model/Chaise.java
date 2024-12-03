package org.example.model;

public class Chaise {

    private int nombrePieds;
    private String materiaux;
    private String couleur;
    private double prix;

    public Chaise(int nombrePieds, String materiaux, String couleur, double prix) {
        this.nombrePieds = nombrePieds;
        this.materiaux = materiaux;
        this.couleur = couleur;
        this.prix = prix;
    }

    public int getNombrePieds() {
        return nombrePieds;
    }

    public void setNombrePieds(int nombrePieds) {
        this.nombrePieds = nombrePieds;
    }

    public String getMateriaux() {
        return materiaux;
    }

    public void setMateriaux(String materiaux) {
        this.materiaux = materiaux;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public double getPrix(){
        return prix;
    }

    public void gsetPrix(int prix){
        this.prix = prix;
    }

    @Override
    public String toString(){
        return "Je suis une chaise avec "+nombrePieds+
                " pied(s) en "+materiaux+
                " de couleur "+couleur+
                " à un prix de "+prix;

    }
}
