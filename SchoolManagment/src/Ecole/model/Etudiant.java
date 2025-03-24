package Ecole.model;

public class Etudiant {


    private String nom;
    private int ages;

    public Etudiant(String nom, int age) {
        this.nom = nom;
        this.ages = age;
    }

    public String getNom() {
        return nom; }
    public int getAge() {
        return ages; }

    @Override
    public String toString() {
        return "Etudiant{" + "nom='" + nom  + ", age=" + ages + '}';
    }
}
