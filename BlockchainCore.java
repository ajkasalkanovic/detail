import java.util.ArrayList;

/**
 * Logička simulacija Blockchain lanca. 
 * Ovaj fajl osigurava GitHub prepoznavanje Java jezika u projektu.
 */
public class BlockchainCore {
    public static void main(String[] args) {
        ArrayList<String> blockchain = new ArrayList<>();
        
        blockchain.add("Genesis Block - Podaci");
        blockchain.add("Drugi Blok - Podaci");
        blockchain.add("Treci Blok - Podaci");

        System.out.println("Blockchain je uspješno kreiran!");
        for (String block : blockchain) {
            System.out.println("Sadržaj: " + block);
        }
    }
}
