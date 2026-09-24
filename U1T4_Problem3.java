import java.util.Scanner;
public class U1T4_Problem3{

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a 3-digit integer: ");
        int num = scan.nextInt();
        scan.nextLine();

        int hundreds = num / 100;
        int tens = (num % 100) / 10;
        int ones = (num % 100) % 10;
        
        System.out.println(" The reverse of " + num + " is: " + ones + tens + hundreds);
        scan.close();
    }
}
