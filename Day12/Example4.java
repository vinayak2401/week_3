import java.util.Scanner;

class Repeated {
  public static void main(String args[]) {
    int count = 0;
    Scanner s = new Scanner(System.in);
    int arr[] = { 33, 55, 34, 12, 34, 21, 34, 56, 21, 67, 12 };
    System.out.println("Enter the element");
    int rep = s.nextInt();
    for (int i = 0; i < arr.length; i++) {
      if (rep == arr[i]) {
        count = count + 1;
      }
    }
    if (count != 0) {
      System.out.println(count);
    } else {
      System.out.println("Invalid");
    }

  }
}