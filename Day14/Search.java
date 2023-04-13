import java.util.Scanner;
class Search {
  public static void main(String args[]) {
    int arr[] = { 23, 89, 45, 12, 77, 44, 90, 41 };
    int count = 0, index = -1;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter key value ");
    int key = s.nextInt(); // 12     
    for (int i = 0; i < arr.length; i++) {
      if (key == arr[i]) {
        count++;
        index = i;
        break;
      }
  }
  if (count != 0) {
  System.out.println("Yes, it is present in " + index + " index");
}
else {
  System.out.println("No");
}
}
}
