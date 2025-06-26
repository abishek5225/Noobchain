import java.util.ArrayList;
import com.google.gson.GsonBuilder;

public class NoobChain {
     public static ArrayList<Block> blockchain= new ArrayList<Block>();
     
     public static int difficulty=5;

    public static Boolean isChainValid(){
        Block currentBlock;
        Block previousBlock;
        String hashTarget= new String(new char[difficulty]).replace('\0', '0');

        //loop to check hashes in the block chain
        for(int i=1; i<blockchain.size();i++){
            currentBlock=blockchain.get(i);
            previousBlock=blockchain.get(i-1);

            if (!currentBlock.hash.equals(currentBlock.calculatedHash())) {
                System.out.println("Current hashes is not equal");
                return false;
            }
            if (!previousBlock.hash.equals(currentBlock.previousHash)) {
                System.out.println("Previous hashes not equal");
                return false;
            }
            if (!currentBlock.hash.substring(0,difficulty).equals(hashTarget)) {
               System.out.println("The block hasn't been mined");
               return false;
            }
        }

        return true;

    }

   
    public static void main(String[] args) {
        
        blockchain.add(new Block("Hi i am first block", "0"));
        System.out.println("Mining block 1....");
        blockchain.get(0).mineBlock(difficulty);

        blockchain.add(new Block("I am second block",blockchain.get(blockchain.size()-1).hash));
        System.out.println("Mining block 2....");
        blockchain.get(1).mineBlock(difficulty);

        blockchain.add(new Block("I am third block", blockchain.get(blockchain.size()-1).hash));
         System.out.println("Mining block 3....");
        blockchain.get(2).mineBlock(difficulty);

        System.out.println("\nBlockchain is valid: "+ isChainValid());

       String blockchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockchain);
       System.out.println("Block Chain:");
       System.out.println(blockchainJson);
    }
}
