package Ecole.model;

public class Professeur {
    private String nom;
    private String matiere;

    public Professeur(String nom, String matiere) {
        this.nom = nom;
        this.matiere = matiere;
    }

    public String getNom() {
        return nom; }
    public String getMatiere() {
        return matiere; }

    @Override
    public String toString() {
        return "Professeur{" + "nom='" + nom  + ", matiere='" + matiere  + '}';
    }
}
