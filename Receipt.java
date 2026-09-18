package UNIT_1;
public class Receipt {
    public static void main(String[] args) {
  String customername = "Stacey"; 
  int numberofitems = 17;
  double appleprice = 0.60;
  int numberofapples = 12;
  int numberofpineapples = 2;
  double pineappleprice = 3.59;
  int ricebags = 3;
  double weightofricebags = 13.2277;
  double costofricebags = weightofricebags * 1.39;
 double totalcost = (numberofapples * appleprice) + (numberofpineapples * pineappleprice) + costofricebags;
  double roundedavgcost = Math.round((totalcost / numberofitems) * 100.0) / 100.0;
double rounded = Math.round(totalcost * 100.0) / 100.0;
double cashtendered = 40.00;
double roundedchange = Math.round((cashtendered - totalcost) * 100.0) / 100.0;
System.out.println("-----------------------------");
  System.out.println("Customer: " + customername);
  System.out.println("Number of Items: " + numberofitems);
 System.out.println("Total Cost: $" + rounded);
  System.out.println("Average Cost: $" + roundedavgcost);
  System.out.println(" ");
  System.out.println("Cash Tendered: $" + cashtendered);
  System.out.println("Change Received: $" + roundedchange);
System.out.println("-----------------------------");


}
}