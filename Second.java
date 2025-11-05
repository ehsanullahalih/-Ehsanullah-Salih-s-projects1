import java.util.Scanner;
public class Second {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Seconds");
        double Seconds = input.nextDouble();

        double Minutes = Seconds/60;
        System.out.println("Minutes are :" + Minutes);
       double ramainSeconds = Seconds%60;
        System.out.println("Ramain Seconds are:"+ ramainSeconds);


    }
}
