package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

import java.util.Objects;

public class CommandeMajuscule extends CommandeDocument{

    public CommandeMajuscule(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters[0].equals("majuscules") &&(parameters.length==1)){
            System.out.println(getDescriptionCommande());
        }else if(parameters.length < 3) {
            System.err.println("Format attendu : masjucules;depart;fin");
        }else {

            int debut = Integer.parseInt(parameters[1]);
            int fin = Integer.parseInt(parameters[2]);
            this.document.majuscules(debut, fin);
            super.executer();
        }
    }

    @Override
    public String getDescriptionCommande() {
        return "/ Commande : majuscules";
    }
}
