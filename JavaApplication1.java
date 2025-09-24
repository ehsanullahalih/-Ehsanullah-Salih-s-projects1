package javaapplication1;

import java.util.Scanner;
public class JavaApplication1 {

    public static void main(String[] args) {
    Scanner num = new Scanner (System.in);    
  //Thi program will calculate the circle area
    
   System.out.println("enter the radius");
   double r = num.nextDouble();
    double Area =3.14* r * r ;
        System.out.println(Area);
 
     
        // this program is to find the leap year
        System.out.println("enter the Year");
        double Year = num.nextDouble();
        if (Year %4==0 || Year%400==0&& Year%100 !=0){
            System.out.println("this is a leap year");
        }else 
            System.out.println("it is not a leap year");
        
        
        
        
        
    }
}
