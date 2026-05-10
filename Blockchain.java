import java.util.HashMap;
import java.util.Map;

/**
 * Ova klasa simulira backend procesor koji prima podatke sa HTML stranice
 * i priprema ih za ulazak u Blockchain mrežu.
 */
public class WebBlockchainParser {

    private Map<String, String> pageData;

    public WebBlockchainParser() {
        this.pageData = new HashMap<>();
        initializeData();
    }

    /**
     * Simulacija prikupljanja meta-podataka iz index.html fajla
     */
    private void initializeData() {
        pageData.put("title", "Blockchain Tehnologije");
        pageData.put("description", "Decentralizirana budućnost digitalnog svijeta");
        pageData.put("language", "bs");
        pageData.put("year", "2026");
    }

    /**
     * Konvertuje podatke sa stranice u format spreman za hashiranje
     */
    public String convertToBlockchainString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HEADER: ").append(pageData.get("title")).append(" | ");
        sb.append("CONTENT: ").append(pageData.get("description")).append(" | ");
        sb.append("TS: ").append(System.currentTimeMillis());
        
        return sb.toString();
    }

    public static void main(String[] args) {
        WebBlockchainParser parser = new WebBlockchainParser();
        String result = parser.convertToBlockchainString();
        
        System.out.println("Podaci su uspješno mapirani sa HTML stranice:");
        System.out.println(result);
        System.out.println("Spremno za generisanje bloka!");
    }
}
