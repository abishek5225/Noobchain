import java.security.MessageDigest;

public class StringUtil {
    public static void main(String input) {
     try{
        MessageDigest digest= MessageDigest.getInstance("SHA-256");

        byte[] hash=digest.digest(input.getBytes("UTF-8"));
     }   
    }
}
