import java.util.Scanner;
public class U1T4Lab2 {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = scan.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.print("Please enter your age: ");
        int age = scan.nextInt();
        scan.nextLine();
        if (age > 18) {               
            System.out.println("You are an adult.");
        } else if (age < 18) { // player 2 is greater
            System.out.println("You are not an adult.");
        } else {                       // they are equal
            System.out.println("You are 18 years old.");
        }
        age++; 
        System.out.println("Next year, you will be " + age + " years old.");
        age-= 2;
        System.out.println("1 year ago, you were " + age + " years old.");
        age--;
        System.out.println("2 years ago, you were " + age + " years old.");
        age += 4;
        System.out.println("In 2 years, you will be " + age + " years old.");
        age -= 2;
        age *= age;
        System.out.println("If your current age was multiplied by itself, you would be " + age + " years");
        age /= 2;
        System.out.println("If that age was divided by 2, you would be " + age + " years old.");
        age %= age;
        System.out.println("IF your current age was subtracted from itself, you would be " + age);
    scan.close();
    }
    }