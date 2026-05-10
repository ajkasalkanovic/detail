import java.util.ArrayList;
import java.security.MessageDigest;

public class BlockchainCore {
    public static void main(String[] args) {
        ArrayList<String> blockchain = new ArrayList<>();
        blockchain.add("Genesis Block");
        blockchain.add("Transakcija 01: 50 BTC");
        blockchain.add("Transakcija 02: 10 BTC");
        
        System.out.println("Blockchain status: Aktivan");
        for (String block : blockchain) {
            System.out.println("Podatak u lancu: " + block);
        }
    }

    public static String applySha256(String input) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(input.getBytes("UTF-8"));
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
