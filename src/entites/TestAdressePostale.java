package entites;

public class TestAdressePostale {
    public static void main(String[] args) {
        AdressePostale adr1 = new AdressePostale();
        adr1.numeroDeRue = 1;
        adr1.libelleDeLaRue = "rue 1";
        adr1.codePostal = 12345;
        adr1.ville = "Montpellier";
        AdressePostale adr2 = new AdressePostale();
        adr2.numeroDeRue = 2;
        adr2.libelleDeLaRue = "rue 2";
        adr2.codePostal = 12345;
        adr2.ville = "Montpellier";
    }
}
