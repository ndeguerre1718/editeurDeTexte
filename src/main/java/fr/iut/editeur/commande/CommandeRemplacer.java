package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument {

    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if (parameters[0].equals("remplacer") &&(parameters.length==1)) {
            System.out.println(getDescriptionCommande());
        }else if(parameters.length < 4) {
                System.err.println("Format attendu : remplacer;debut;fin;texte");
        }else {
            int debut = Integer.parseInt(parameters[1]);
            int fin = Integer.parseInt(parameters[2]);
            String texte = parameters[3];
            this.document.remplacer(debut, fin, texte);
            this.document.ajouter(getDescriptionCommande());
            super.executer();
        }
    }

    @Override
    public String getDescriptionCommande() {
        return "Commande : remplacer";
    }
}
