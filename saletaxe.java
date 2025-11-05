import java.util.Scanner;

public class saletaxe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the price:");
                double purchaseAmount = input.nextDouble();

                double tax = purchaseAmount * 0.10;

        System.out.printf("The Sales tax is: $%.2f\n" ,tax);
       double newPrice = purchaseAmount+tax;
        System.out.println("New price is " + "$" +newPrice);
            }
        }





