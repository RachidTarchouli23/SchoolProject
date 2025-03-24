package Ecole.business;

import Ecole.model.Etudiant;
import Ecole.model.Professeur;

public interface EcoleService {

    void ajouterEtudiant(Etudiant etudiant);
    void ajouterProfesseur(Professeur professeur);
    void afficherEtudiants();
    void afficherProfesseurs();
    Etudiant chercherEtudiant(String nom);
    Professeur chercherProfesseur(String nom);


}

