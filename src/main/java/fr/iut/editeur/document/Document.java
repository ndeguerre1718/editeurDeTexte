package fr.iut.editeur.document;

/**
 * La classe Document représente un document texte et fournit des méthodes pour
 * manipuler le contenu de ce document.
 */
public class Document {

    private String texte;

    /**
     * Constructeur par défaut qui initialise un document avec une chaîne vide.
     */
    public Document() {
        this.texte = "";
    }

    /**
     * Récupère le texte actuel du document.
     *
     * @return Le texte actuel du document.
     */
    public String getTexte() {
        return texte;
    }

    /**
     * Modifie le texte du document.
     *
     * @param texte Le nouveau texte à définir pour le document.
     */
    public void setTexte(String texte) {
        this.texte = texte;
    }

    /**
     * Ajoute du texte à la fin du document.
     *
     * @param texte Le texte à ajouter à la fin du document.
     */
    public void ajouter(String texte) {
        this.texte += texte;
    }

    /**
     * Remplace une portion du texte par une nouvelle chaîne de caractères.
     *
     * @param start        Index de début de la portion à remplacer.
     * @param end          Index de fin (non inclus) de la portion à remplacer.
     * @param remplacement La nouvelle chaîne de caractères pour la portion.
     */
    public void remplacer(int start, int end, String remplacement) {
        if (remplacement.isEmpty()) {
            remplacement = " ";
        }
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        texte = leftPart + remplacement + rightPart;
    }

    /**
     * Met en majuscules une portion spécifiée du texte.
     *
     * @param start Index de début de la portion à convertir en majuscules.
     * @param end   Index de fin (non inclus) de la portion à convertir.
     */
    public void majuscules(int start, int end) {
        String portionEnMajuscules = texte.substring(start, end).toUpperCase();
        remplacer(start, end, portionEnMajuscules);
    }

    /**
     * Met en minuscules une portion spécifiée du texte.
     *
     * @param start Index de début de la portion à convertir en minuscules.
     * @param end   Index de fin (non inclus) de la portion à convertir.
     */
    public void minuscules(int start, int end) {
        String portionEnMinuscule = texte.substring(start, end).toLowerCase();
        remplacer(start, end, portionEnMinuscule);
    }

    /**
     * Efface une portion spécifiée du texte.
     *
     * @param start Index de début de la portion à effacer.
     * @param end   Index de fin (non inclus) de la portion à effacer.
     */
    public void effacer(int start, int end) {
        String texteAvant = texte.substring(0, start);
        String texteApres = texte.substring(end);
        texte = texteAvant + texteApres;
    }

    /**
     * Efface tout le contenu du document.
     */
    public void clear() {
        remplacer(0, this.texte.length(), "");
    }

    /**
     * Insère une chaîne de caractères à une position spécifiée dans le texte.
     *
     * @param index      Index où insérer la chaîne de caractères.
     * @param chainChara La chaîne de caractères à insérer.
     * @throws IllegalArgumentException Si l'indice est en dehors des limites du texte.
     */
    public void inserer(int index, String chainChara) {
        if (index < 0 || index > texte.length()) {
            throw new IllegalArgumentException("L'indice doit être compris entre 0 et la longueur du texte inclus.");
        }

        String texteAvant = texte.substring(0, index);
        String texteApres = texte.substring(index);
        texte = texteAvant + chainChara + texteApres;
    }

    /**
     * Retourne une représentation textuelle du document.
     *
     * @return Le texte actuel du document.
     */
    @Override
    public String toString() {
        return this.texte;
    }
}
