package Home;
import java.util.Scanner;
public class percentageCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter original value: ");
        double originalValue = scan.nextDouble();
        System.out.print("Enter change: ");
        double change = scan.nextDouble();
        double almostpercent = (change * originalValue);
        double percent = almostpercent / 100;
        System.out.println("The percentage change is: " + percent + "%");












        scan.close();


    }
}
