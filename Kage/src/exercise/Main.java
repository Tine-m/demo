package exercise;

public class Main {

    public static void main(String[] args) {
        int gramSukker = 100;
        int teskefuldeVanilje = 1;
        int antalÆg = 3;
        int gramMel = 200;
        int gramIngredienser = gramSukker + teskefuldeVanilje*3 + antalÆg + gramMel;
        System.out.println("samlet ingrediensmængde " + gramIngredienser);
        double gramfærdigKage = gramIngredienser * 0.9;
        System.out.println("vægt færdig kage " + gramfærdigKage);
        double proteinPerÆg = 7.4;
        double proteinÆgSamlet = antalÆg * proteinPerÆg;
        System.out.println("samlet proteingmængde æg " + proteinÆgSamlet);
        double proteinSukker = 0.0;
        double proteinSukkerSamlet = gramSukker * proteinSukker;
        System.out.println("samlet proteingmængde æg " + proteinÆgSamlet);
        double samletProtein = proteinÆgSamlet + proteinSukkerSamlet;
        int kalorierMelPer100G = 353;
        int kalorierSamletMel = gramMel/100*kalorierMelPer100G;
        System.out.println("kalorier for mel " + kalorierSamletMel);
        int kalorierSukkerPer100G = 406;
        int kalorierSamletSukker = gramSukker/100*kalorierSukkerPer100G;
        System.out.println("kalorier for sukker " + kalorierSamletSukker);
        double samletKalorier = kalorierSamletMel + kalorierSamletSukker;
        double prisÆg10stk = 22.6;
        //double prisKagensÆg = ((double) 22/10) * antalÆg;
        double prisKagensÆg =  22.0/10.0 * antalÆg;
        System.out.println("Pris for æg i kagen " + prisKagensÆg);
        System.out.printf("Pris for æg i kagen %.2f", prisKagensÆg);
    }
}
