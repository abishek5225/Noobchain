import java.security.*;

public class Wallet{
    public PrivateKey privateKey;
    public PublicKey publicKey;

    public Wallet(){
        generateKeyPair();
    }

    public void generateKeyPair(){
        try{

        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}