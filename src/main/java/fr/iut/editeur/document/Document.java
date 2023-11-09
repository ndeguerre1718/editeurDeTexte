package fr.iut.editeur.document;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }


	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void ajouter(String texte) {
        this.texte += texte;
    }

    public void remplacer(int start, int end, String remplacement) {
        if (remplacement.isEmpty()) {
            remplacement = " ";
        }
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        texte = leftPart + remplacement + rightPart;
    }

    public void majuscules(int start, int end) {
        String portionEnMajuscules = texte.substring(start, end).toUpperCase();
        remplacer(start, end, portionEnMajuscules);
    }

    public void effacer(int start, int end) {
        String texteAvant = texte.substring(0, start);
        String texteApres = texte.substring(end);
        texte = texteAvant + texteApres;
    }

    public void clear() {
        texte = texte.substring(0, texte.length());
    }

    public void inserer(int index, String chainChara) {
        if (index < 0 || index > texte.length()) {
            throw new IllegalArgumentException("L'indice doit être compris entre 0 et la longueur du texte inclus.");
        }

        String texteAvant = texte.substring(0, index);
        String texteApres = texte.substring(index);
        texte = texteAvant + chainChara + texteApres;
    }
    @Override
    public String toString() {
        return this.texte;
    }
}
