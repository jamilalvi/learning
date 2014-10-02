public class Fibonacci {  
  public static void main(String[] args) {
    
    int x1 = 0;
    int x2 = 1;
    int x3 = x1 + x2;
    
    // Print out first 2 numbers in sequence
    System.out.print(x1 + " " + x2 + " ");
    
    // Print out the rest
    for(int i=0; i<10; i++) {
      System.out.print(x3 + " ");
      
      // Track previous values
      x1 = x2;
      x2 = x3;
      x3 = x1 + x2;
    }
    System.out.println("");
  }
}
 

