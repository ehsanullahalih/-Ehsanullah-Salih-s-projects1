
package findingevenoroddnumbers;
import java.util.Scanner;

public class FindingEvenOROddnumbers {

  public static void main(String[] args) {
 Scanner num = new Scanner (System.in);
     
 //This program is to find the odd or even number
        System.out.println("enter the number");
        int Num = num.nextInt();
        if(Num%2==0 ){
            System.out.println("The number is even");
        }else
            if (Num%2==1){
                System.out.println("The number is odd");
            }
 
  
  
  }
    
}
