import java.util.ArrayList;
import com.google.gson.GsonBuilder;

public class NoobChain {
     public static ArrayList<Block> blockchain= new ArrayList<Block>();

    public static Boolean isChainValid(){
        Block currentBlock;
        Block previousBlock;

        //loop to check hashes in the block chain
        for(int i=1; i<blockchain.size();i++){
            currentBlock=blockchain.get(i);
            previousBlock=blockchain.get(i-1);
        }

        return true;

    }

   
    public static void main(String[] args) {
        
        blockchain.add(new Block("Hi i am first block", "0"));
        blockchain.add(new Block("I am second block",blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("I am third block", blockchain.get(blockchain.size()-1).hash));

       String blockchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockchain);
       System.out.println(blockchainJson);
    }
}
