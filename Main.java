public class Main {
   public static void singRootBeerSong(int numRootBeers){
   System.out.println(numRootBeers + " bottles of root beer on the wall");
   System.out.println(numRootBeers + " bottles of root beer");
   System.out.println("Take one down, pass it around,");
   System.out.println(numRootBeers - 1 + " bottles of root beer on the wall");
   System.out.println("");
   
   }
   
   public static void main(String[] args) {
   int numRootBeers = 10;
   while (numRootBeers >= 1) {
    singRootBeerSong(numRootBeers);
    numRootBeers--;
    }
   }
}