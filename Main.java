import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int[] seats = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };//Number of seats in class
    String[] names = new String[15]; //Number of students in class 

    Scanner scan = new Scanner(System.in);// Scanner added to get user's name 

    for (int i = 0; i < names.length; i++) 
    {
      System.out.println("What is you name");//asking user to give name
      names [i] = scan.next();   
    }
    int i = 0;
    while (seats [i] < names.length)
    {
     System.out.println( names [i] + " sits in seat " + seats [i]);//assigns seat to the user's name  
     i++;
    }
  }
}