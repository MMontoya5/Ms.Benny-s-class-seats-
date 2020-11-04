import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int[] seats = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
    String[] names = new String[15];

    for (int i = 0; i < names.length; i++) 
    {
      Scanner scan = new Scanner(System.in); 
      System.out.println("What is you name");
      String name = scan.next();
      System.out.println( name + "sits in seat"); 
    }
  }
}