package sumofcontinusenaturalnombers;
import java.util.Scanner;
public class SumOfContinuseNaturalNombers {

    public static void main(String[] args) {
    Scanner num = new Scanner (System.in);
      
    //  This program calculate the sum of continuse natural numbers

        System.out.println("Enter the number of natural numbers");
        int N = num.nextInt();
        int sum = N*(N+1)/2;
        System.out.println("The sum of numbers is ; " +sum);
 
    
    }
    
}
