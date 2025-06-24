public class NoobChain {
    public static void main(String[] args) {
        Block firstBLock= new Block("Hello i'm the first block", "0");
        System.out.println("Hash for block 1: "+firstBLock.hash);

        Block secondBlock = new Block("Hi i'm the second block", "0");
        System.out.println("Hash for block 2: "+secondBlock.hash);

        


    }
}
