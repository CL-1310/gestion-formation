package educentre;

public class Educentre {
    
    // Créer un nouveau projet => OK

    //Menu avec 2 choix : admin ou user

    //Utilisateur Administrateur (identifiant: admin / mot de passe: admin123) => voir Login.java (même méthode)
    //Utilisateur Elève (identifiant: NOM_ELEVE mot de passe: user123) => voir Login.java mais attention car identifiant lié à la liste des élèves (pour l'admin après)
    //Liste des élèves statique (List<String>)

    //Administreur : Menu avec 4 choix (1 ou 2 ou 3 ou 4 à taper)
    // . Saisir des notes (stockées dans une liste String et l'associer à l'élève par rapport à l'index) => Insertion dans la liste<String>
    // . Voir la moyenne des notes pour un élève (il faut choisir l'élève par son index) => Voir Moyenne.java + println() en fonction de l'élève
    // . Voir la présence des élèves => println()

    //Utilisateur : Menu avec 3 choix (1 ou 2 ou 3 à taper)
    // . Enregistrer sa présence: séléction d'un cours, saisie du nom complet pour signer => Choix du cours par nombre (1 pour français, 2 pour maths) + ajout dans le tableau cours le nom de l'élève + la date du jour
    // . Date d'aujourd'hui =>  SimpleDateFormat
    // . Donner son avis pour une date et un cours => Menu avec choix pour chaque cours + séléction de la date puis saisir une note de 1 à 5

    //Option Déconnection/Connection => Demander une confirmation via println() + scan.nextLine() puis confirmer la déconnexion avec un return sur la connexion
    
    // petit test


}
