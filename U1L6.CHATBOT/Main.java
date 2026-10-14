
public class Main {

public static void main (String[] args) {
final ChatBot debbie = new ChatBot("Debbie", 42);
debbie.greeting("Me bai");
debbie.favoriteNumber(23);
debbie.weather();

double meters = debbie.convertFeetToMeters(20);
System.out.println("There are " + meters + " in 20 feet");

int sum = debbie.addNumbers(13,26,24);
System.out.println("The sum is " + sum);

String mess = debbie.love();
System.out.println(mess);

int product = debbie.multiply(5, 6);
System.out.println("The product is " + product);

String food = "sushi";
debbie.favoritefood(food);

String nickname = debbie.generateNickname("Alice");
System.out.println("Your nickname is: " + nickname);


debbie.complimentHobby("photography");


int hours = debbie.convertDaysToHours(5);
System.out.println("There are " + hours + " hours in 5 days.");
String message = debbie.goodbye();
System.out.println(message);


}
}
