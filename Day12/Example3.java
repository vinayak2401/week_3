import java.util.Scanner;

class Search {

  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int arr[] = { 34, 45, 67, 21, 42, 90 };
    System.out.println("Enter a number to search");
    int search = s.nextInt();
    for (int i = 0; i < arr.length; i++) {
      if (search == arr[i]) {
        System.out.println("Yes it is present");
        break;
      } else  {
        System.out.println("No,its not present");
        break;
      } 
    }

  }
}