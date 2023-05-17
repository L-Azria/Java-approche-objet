package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        Personne pers1 = new Personne();
        pers1.nom = "David";
        pers1.prenom = "Azria";
        pers1.adressePostale.numeroDeRue = 1;
        pers1.adressePostale.libelleDeLaRue = "rue example 1";
        pers1.adressePostale.codePostal = 12345;
        pers1.adressePostale.ville = "Montpellier";
        Personne pers2 = new Personne();
        pers2.nom = "Lan";
        pers2.prenom = "Azria";
        pers2.adressePostale.numeroDeRue = 1;
        pers2.adressePostale.libelleDeLaRue = "rue example 1";
        pers2.adressePostale.codePostal = 12345;
        pers2.adressePostale.ville = "Montpellier";
        System.out.println(pers1);
        System.out.println(pers2);
    }
}
