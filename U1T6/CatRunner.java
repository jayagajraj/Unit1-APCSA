public class CatRunner {
   public static void main(String[] args) {

       // creating one instance/object from the Cat class
       Cat cat1 = new Cat("Fluffy", 8, 4.5);
       cat1.introduce();  // calling a method on the object
       cat1.printCatInfo();  // calling a method on the object
    
       Cat cat2 = new Cat("Whiskers", 5, 6.2);
     cat2.printCatInfo();  // calling a method on the object
cat2.introduce();  // calling a method on the object
   }
}