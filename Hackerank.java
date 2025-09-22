package hackerank;

import java.util.Scanner;


public class Hackerank {

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int n = scanner.nextInt();

    if ( n % 2 == 1 )
    {System.out.println("Weird");}
    else if (n % 2 == 0 && n >=2 && n <= 5)
    {System.out.println("Not Weird");}
    else if (n % 2 == 0 && n >= 6 && n<=20 )
        
     {System.out.println("Weird");}
    else 
        if ( n  % 2 == 0 && n>=20)
        {System.out.println("Not Weird");}
    
        System.out.println("=========================");
        for(int i=0;i<3;i++) {
        String s1 = scanner.next();
        int x = scanner.nextInt();
            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("=========================");
scanner.close();    
    }
    
}