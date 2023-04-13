import java.util.Scanner;

class AllOccurence {
  public static void main(String args[]) {
    int arr[] = { 10, 89, 10, 12, 77, 12, 90, 41 };
    Scanner s = new Scanner(System.in);
    System.out.println("Enter key value");
    int key = s.nextInt();
    int index = 0;

    for (int i = 0; i < arr.length; i++) {
      if (key == arr[i]) {
        index = i;
        
      }

    }
    for (int i = index; i < arr.length-1; i++) {
      arr[i] = arr[i + 1];
    }
    for (int i = 0; i < arr.length - 1; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
