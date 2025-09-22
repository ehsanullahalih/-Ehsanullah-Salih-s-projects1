package swapoftwonumbers;

import java.util.Scanner;
public class SwapOfTwoNumbers {

    public static void main(String[] args) {
        Scanner num = new Scanner (System.in);
               
     // This Program calculate swap of two numbers
     
        System.out.println("Befor swap the 1st value of a = ");
    int a = num.nextByte();
        System.out.println("After swap the 2nd value of b = ");
    int b = num.nextByte();
    a = a+b ;
    b = a-b ;
    a = a-b ;
        System.out.println("after swap the a = " +a);
        System.out.println("after swap the b = " +b);
 
    }
    
}
