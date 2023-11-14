package fr.iut.editeur.document;

import junit.framework.TestCase;
import org.junit.Test;

public class DocumentTest extends TestCase {

    @Test
    public void testAjouter() {
        Document document = new Document();
        document.ajouter("Bonjour ");
        document.ajouter("le monde!");

        assertEquals("Bonjour le monde!", document.getTexte());
    }

    @Test
    public void testRemplacer() {
        Document document = new Document();
        document.setTexte("Ceci est un exemple.");

        document.remplacer(5, 8, "était");

        assertEquals("Ceci était un exemple.", document.getTexte());
    }

    @Test
    public void testMajuscules() {
        Document document = new Document();
        document.setTexte("hello world");

        document.majuscules(0, 5);

        assertEquals("HELLO world", document.getTexte());
    }

    @Test
    public void testMinuscules() {
        Document document = new Document();
        document.setTexte("HELLO WORLD");

        document.minuscules(6, 11);

        assertEquals("HELLO world", document.getTexte());
    }

    @Test
    public void testEffacer() {
        Document document = new Document();
        document.setTexte("Ceci est un exemple.");

        document.effacer(8, 11);

        assertEquals("Ceci est exemple.", document.getTexte());
    }

    @Test
    public void testInserer() {
        Document document = new Document();
        document.setTexte("Ceci un exemple.");

        document.inserer(5, "est ");

        assertEquals("Ceci est un exemple.", document.getTexte());
    }

}
