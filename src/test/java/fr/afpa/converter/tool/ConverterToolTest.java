package fr.afpa.converter.tool;
                                                                                      
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/***
 * Classe regroupant les tests à compléter.
 * 
 * Il vous est demandé de la compléter en suivant un approche TDD - Test Driven Development
 * 
 * Marche à suivre pour suivre le cycle "Rouge-Vert-Refactor" :
 * 1. Focalisez vous sur 1 fonction (par exemple "testHexadecimalToDecimal")
 * 2. Construisez un jeu de test complet (par exemple une liste de nombres à héxadécimaux à convertir)
 * 3. Ajoutez UNE SEULE assertion qui vérifie un TEST INDIVIDUEL
 * 4. Développez la fonction associée pour qu'elle retourne le bon résultat (that's tour "baby step")
 * 5. Ajoutez UNE AUTRE assertion
 * 6. Vérifiez si le test passe, développez la fonction pour qu'elle retourne le bon résultat
 * 7. Ainsi de suite jusqu'à ce que votre jeu de test soit couvert.
 * 
 * Pour certaines de ces fonctions le jeu de test vous est donné.
 * Pour d'autre, il vous faudra le créer.
 */
class ConverterToolTest {

    @DisplayName("Conversion des nombres binaires en décimaux")
    @Test
    void testBinaryToDecimal() {

        String bin1 = "10";

        // 1. Test de la première donnée de test
        assertEquals(2, ConverterTool.binaryToDecimal(bin1));

        // 2. Test d'un autre donnée de test
        // ...
        String bin2 = "0111";
        assertEquals(7, ConverterTool.binaryToDecimal(bin2));

        // Bien faire attention de bien penser aux erreurs dans la conception du jeu de test
        String bin3 = "sdsd";
        assertEquals(-1, ConverterTool.binaryToDecimal(bin3));

        String bin4 = "";
        assertEquals(-1,  ConverterTool.binaryToDecimal(bin4));
    }

    @DisplayName("Conversion des nombres décimaux en binaire")
    @Test
    void testDecimalToBinary() {

        int dec1 = 10;
        int dec2 = -1;
//        int dec3 = 0101;
        int dec4 = 0;

        assertEquals("1010", ConverterTool.decimalToBinary(dec1));
        assertEquals("-1", ConverterTool.decimalToBinary(dec2));
//        assertEquals("1100101", ConverterTool.decimalToBinary(dec3));
        assertEquals("0", ConverterTool.decimalToBinary(dec4));
    }

    @DisplayName("Conversion des nombres binaire en hexadécimaux")
    @Test
    void testBinaryToHexadecimal() {
        String hex = "-1";
        String hex1 = "7F";
        String hex2 = "0";
        String hex3 = "3FE";
        String hex4 = "1FF";

        String bin = "";
        String bin1 = "01111111";
        String bin2 = "0";
        String bin3 = "-1";
        String bin4 = "-0";
        String bin5 = "sfsdfs";
        String bin6 = "1111111110";
        String bin7 = "1111111";
        String bin8 = "111111111";

        assertEquals(hex, ConverterTool.binaryToHexadecimal(bin));
        assertEquals(hex1, ConverterTool.binaryToHexadecimal(bin1));
        assertEquals(hex2, ConverterTool.binaryToHexadecimal(bin2));
        assertEquals(hex, ConverterTool.binaryToHexadecimal(bin3));
        assertEquals(hex, ConverterTool.binaryToHexadecimal(bin4));
        assertEquals(hex, ConverterTool.binaryToHexadecimal(bin5));
        assertEquals(hex3, ConverterTool.binaryToHexadecimal(bin6));
        assertEquals(hex1, ConverterTool.binaryToHexadecimal(bin7));
        assertEquals(hex4, ConverterTool.binaryToHexadecimal(bin8));

    }

    @DisplayName("Conversion des nombres décimaux en hexadécimaux")
    @Test
    void testDecimalToHexadecimal() {
        String hex = "-1";
        String hex1 = "A";
        String hex2 = "0";
        String hex3 = "384";

        int dec = -1;
        int dec1 = 10;
        int dec2 = 0;
        int dec3 = 900;

        assertEquals(hex, ConverterTool.decimalToHexadecimal(dec));
        assertEquals(hex1, ConverterTool.decimalToHexadecimal(dec1));
        assertEquals(hex2, ConverterTool.decimalToHexadecimal(dec2));
        assertEquals(hex3, ConverterTool.decimalToHexadecimal(dec3));
    }

    @DisplayName("Conversion des nombres hexadécimaux en décimaux")
    @Test
    void testHexadecimalToDecimal() {
        String hex = "-1";
        String hex1 = "fsdfsdf";
        String hex2 = "900";
        String hex3 = "0900";
        String hex4 = "1E";
        String hex5 = "0";
        String hex6 = "";

        int dec = -1;
        int dec1 = 2304;
        int dec2 = 30;
        int dec3 = 0;


        assertEquals(dec, ConverterTool.hexadecimalToDecimal(hex));
        assertEquals(dec, ConverterTool.hexadecimalToDecimal(hex1));
        assertEquals(dec1, ConverterTool.hexadecimalToDecimal(hex2));
        assertEquals(dec1, ConverterTool.hexadecimalToDecimal(hex3));
        assertEquals(dec2, ConverterTool.hexadecimalToDecimal(hex4));
        assertEquals(dec3, ConverterTool.hexadecimalToDecimal(hex5));
        assertEquals(dec, ConverterTool.hexadecimalToDecimal(hex6));
    }
    
    @DisplayName("Vérification de la nature hexadécimale d'une chaîne de caractère")
    @Test
    void testIfHexadecimal() {
        
        // TODO : compléter le test
    }

    // TODO : ajouter les fonctions de test pour chacune de celles qui sont utilisées dans l'application
}
