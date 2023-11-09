package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeInserer extends CommandeDocument{
    public CommandeInserer(Document document, String[] parameters) {
        super(document, parameters);
    }
    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : inserer;index;chaine");
            return;
        }
        int debut = Integer.parseInt(parameters[1]);
        this.document.inserer(debut,parameters[2]);
        super.executer();
    }
}
