import java.util.Scanner;
import java.text.MessageFormat;

public class introduce1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your Name : " );

        String Name = input.nextLine();

        System.out.print("Enter your Age : ");

        int Age = input.nextInt();
        System.out.print(" Enter your Last Name : ");
        String LastName = input.next();

        System.out.println(MessageFormat.format( "Name : {0} , LastName : {1} , Age : {3}" , Name , LastName , Age ));



    }


}
