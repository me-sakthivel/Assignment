import java.util.Scanner;
public class GFG {
   public static void main(String args[]){
      int a, b, i, hcf = 0;
      Scanner s = new Scanner(System.in);
      System.out.println("Enter first number :: ");
      a = s.nextInt();
      System.out.println("Enter second number :: ");
      b = s.nextInt();

      for(i = 1; i <= a || i <= b; i++) {
         if( a%i == 0 && b%i == 0 )
         hcf = i;
      }
      System.out.println("GFG of given two numbers is ::"+hcf);  
   }
}