package Ecole.business;

import Ecole.model.Etudiant;
import Ecole.model.Professeur;

import java.util.ArrayList;
import java.util.List;

public class EcoleServiceImpl implements EcoleService{
    private List<Etudiant> etudiants = new ArrayList<>();
    private List<Professeur> professeurs = new ArrayList<>();
    @Override
    public void ajouterEtudiant(Etudiant etudiant) {
          etudiants.add(etudiant);
    }

    @Override
    public void ajouterProfesseur(Professeur professeur) {
        professeurs.add(professeur);

    }

    @Override
    public void afficherEtudiants() {
        System.out.println("Liste des etiudiants : " + etudiants);

    }

    @Override
    public void afficherProfesseurs() {
        System.out.println("Liste des professeurs : " + professeurs);

    }

    @Override
    public Etudiant chercherEtudiant(String nom) {
        for (Etudiant etu : etudiants) {
            if (etu.getNom().equals(nom)) {
                return etu;
            }
        }
        return null;
    }

    @Override
    public Professeur chercherProfesseur(String nom) {
        for (Professeur prof : professeurs) {
            if (prof.getNom().equals(nom)) {
                return prof;
            }
        }
        return null;
    }
}
