
package simpleinterst;
import java.util.Scanner;

public class SImpleInterst {

    public static void main(String[] args) {
       Scanner num = new Scanner (System.in);
           // this program calculate the simple interset
        System.out.println("enter the Rate : ");
        double R = num.nextDouble();
        System.out.println("enter the principl :");
        double P = num.nextDouble();
        System.out.println("enter the year ");
        double Y = num.nextDouble();
        double I = (R*P*Y/100);
        System.out.println("The simple interset is :" +I);
 
    }
    
}
