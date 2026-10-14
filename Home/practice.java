package Home;
public class practice  {
public static void main(String[] args) {
    
double numone = (int)(120.90/100);
              System.out.println(numone);
            numone += 1;
              System.out.println(numone);
            numone %= 10;
              System.out.println(numone);
            numone *= 100;
            System.out.println(numone);
            
  double numtwo = (int)(120.90/10);
            System.out.println(numtwo);
            numtwo %= 10;
System.out.println(numtwo);
            numtwo += 1;
System.out.println(numtwo);
            numtwo %= 10;
System.out.println(numtwo);
            numtwo *= 10;
System.out.println(numtwo);

  double numthree = (int)(120.90);
System.out.println(numthree);
        numthree %= 10;
System.out.println(numthree);
        numthree += 1;
System.out.println(numthree);
        numthree %= 10;
System.out.println(numthree);
          double numfour = (int)(120.90 * 10);
System.out.println(numfour);
        numfour %= 10;
System.out.println(numfour);
        numfour += 1;
System.out.println(numfour);
        numfour %= 10;
System.out.println(numfour);
        numfour /= 10;
System.out.println(numfour);
        double numfive = (int)(120.90 * 100);
System.out.println(numfive);
        numfive %= 10;
System.out.println(numfive);
        numfive += 1;
System.out.println(numfive);
        numfive %= 10;
System.out.println(numfive);
        numfive /= 100;
System.out.println(numfive);
        
        System.out.println(numone + numtwo + numthree + numfour + numfive);

}


}