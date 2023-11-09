package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeAjouter extends CommandeDocument {


    public CommandeAjouter(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters[0].equals("ajouter") &&(parameters.length==1)){
            System.out.println(getDescriptionCommande());
        }else if(parameters.length < 2) {
            System.err.println("Format attendu : ajouter;texte");
            return;
        }
        String texte = parameters[1];
        this.document.ajouter(texte);
        this.document.ajouter(getDescriptionCommande());
        super.executer();
    }

    @Override
    public String getDescriptionCommande() {
       return "Commande : Ajouter";
    }

}
