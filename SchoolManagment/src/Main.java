import Ecole.business.EcoleService;
import Ecole.business.EcoleServiceImpl;
import Ecole.model.Etudiant;
import Ecole.model.Professeur;

public class Main {
    public static void main(String[] args) {
        EcoleService ecoleService = new EcoleServiceImpl();
        Etudiant etudiant1 = new Etudiant("rachid", 455);
       Etudiant etudiant2= new Etudiant("rachid", 4);
        ecoleService.ajouterEtudiant(etudiant1);
        ecoleService.ajouterEtudiant(etudiant2);

           Professeur professeur1 = new Professeur("karim","maths");
        Professeur professeur2 = new Professeur("karim","maths");


        ecoleService.ajouterProfesseur(professeur1);
        ecoleService.ajouterProfesseur(professeur2);

        ecoleService.afficherEtudiants();
        ecoleService.afficherProfesseurs();
    }
}