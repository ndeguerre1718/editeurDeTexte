package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeEffacer extends CommandeDocument{
    public CommandeEffacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters[0].equals("effacer") &&(parameters.length==1)){
            System.out.println(getDescriptionCommande());
        } else if(parameters.length < 2) {
            System.err.println("Format attendu : effacer;debut;fin");
            return;
        }
        int debut = Integer.parseInt(parameters[1]);
        int fin = Integer.parseInt(parameters[2]);
        this.document.effacer(debut,fin);
        this.document.ajouter(getDescriptionCommande());
        super.executer();
    }

    @Override
    public String getDescriptionCommande() {
        return "Commande : effacer";
    }
}
