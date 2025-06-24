import java.util.Date;

public class Block{

    public String hash;
    public String previousHash;
    public String data;
    public long timeStamp;

    //block constructor
    public Block(String data, String previousHash){
        this.data = data;
        this.previousHash = previousHash;
        this.timeStamp = new Date().getTime();
    }

    public String calculatedHash(){
        String calculatedhash = StringUtil.applySha256(
            previousHash + Long.toString(timeStamp)+ data
        );
        return calculatedhash;
    }


}