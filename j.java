import java.util.Base64;

public class j{
    public static void main(String[] args) {
        // Basic Encoding
        String originalInput = "Hello, World!";
        String encodedString = Base64.getEncoder().encodeToString(originalInput.getBytes());
        System.out.println("Encoded: " + encodedString);

        // Basic Decoding
        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        String decodedString = new String(decodedBytes);
        System.out.println("Decoded: " + decodedString);

        // URL Encoding
        String originalInput2 = "Hello, World!";
        String encodedString2 = Base64.getUrlEncoder().encodeToString(originalInput2.getBytes());
        System.out.println("URL Encoded: " + encodedString2);

        // URL Decoding
        byte[] decodedBytes2 = Base64.getUrlDecoder().decode(encodedString2);
        String decodedString2 = new String(decodedBytes2);
        System.out.println("URL Decoded: " + decodedString2);


        // MIME Encoding
        String originalInput3 = "Hello, World!";
        String encodedString3 = Base64.getMimeEncoder().encodeToString(originalInput3.getBytes());
        System.out.println("MIME Encoded: " + encodedString3);

        // MIME Decoding
        byte[] decodedBytes3 = Base64.getMimeDecoder().decode(encodedString3);
        String decodedString3 = new String(decodedBytes3);
        System.out.println("MIME Decoded: " + decodedString3);
        
    }
}
