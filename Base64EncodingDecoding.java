import java.util.*;
public class Base64EncodingDecoding {
    public static void main(String[] args) {
        String str = "Hello World";
        String encodedString = Base64.getEncoder().encodeToString(str.getBytes());
        System.out.println("Encoded String: "+encodedString);
        String decodedString = new String(Base64.getDecoder().decode(encodedString));
        System.out.println("Decoded String: "+decodedString);

        String url = "https://www.google.com";
        String encodedUrl = Base64.getUrlEncoder().encodeToString(url.getBytes());
        System.out.println("Encoded URL: "+encodedUrl);
        String decodedUrl = new String(Base64.getUrlDecoder().decode(encodedUrl));
        System.out.println("Decoded URL: "+decodedUrl);

        String mime = "Hello World";
        String encodedMime = Base64.getMimeEncoder().encodeToString(mime.getBytes());
        System.out.println("Encoded MIME: "+encodedMime);
        String decodedMime = new String(Base64.getMimeDecoder().decode(encodedMime));
        System.out.println("Decoded MIME: "+decodedMime);

        
    }
}
