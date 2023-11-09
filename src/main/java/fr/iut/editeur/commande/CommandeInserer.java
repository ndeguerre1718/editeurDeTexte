package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeInserer extends CommandeDocument{
    public CommandeInserer(Document document, String[] parameters) {
        super(document, parameters);
    }
    public void executer() {
        if(parameters[0].equals("inserer") &&(parameters.length==1)){
            System.out.println(getDescriptionCommande());
        }else if(parameters.length < 3) {
            System.err.println("Format attendu : inserer;index;chaine");
            return;
        }else {
            int debut = Integer.parseInt(parameters[1]);
            this.document.inserer(debut, parameters[2]);
            this.document.ajouter(getDescriptionCommande());
            super.executer();
        }
    }

    @Override
    public String getDescriptionCommande() {
        return "Commande : inserer";
    }
}
