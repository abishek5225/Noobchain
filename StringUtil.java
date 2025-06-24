import java.security.MessageDigest;

public class StringUtil {
    public static void main(String input) {
     try{
        MessageDigest digest= MessageDigest.getInstance("SHA-256");//CRYPTOGRAPHIC ALGORITHM "SHA-256"

        byte[] hash=digest.digest(input.getBytes("UTF-8"));
        StringBuffer hexString= new StringBuffer();//This will contain digital fingerprint
        for(int i=0;i<hash.length;i++){
            String hex= Integer.toHexString(0xff & hash[i]);
            if(hex.length()==1) hexString.append('0');
        }

     }   
    }
}
