import java.util.Scanner;
public class ExactChange {
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         
         System.out.print("Please enter an amount in dollars and cents: ");
         double amount = scan.nextDouble();
        int totalCents = (int) Math.round(amount * 100);
         int quarters = totalCents / 25;
         totalCents %= 25;
         int dimes = totalCents / 10;
         totalCents %= 10;
         int nickels = totalCents / 5;
         totalCents %= 5;
         int pennies = totalCents / 5;
          pennies = totalCents % 5;
         int totalCoins = quarters + dimes + nickels + pennies;
            System.out.println("The minimum number of coins is: " + totalCoins);
            System.out.println("Quarters: " + quarters);
            System.out.println("Dimes: " + dimes);
            System.out.println("Nickels: " + nickels);
            System.out.println("Pennies: " + pennies);
         scan.close();
     }
}
