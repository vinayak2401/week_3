class Example6 {
  public static void main(String args[]) {
    int arr[] = { 23, 78, 4, 220, 23, 34, 23, 56, 33 };
    int even[] = new int[arr.length];
    int odd[] = new int[arr.length];
    int evenIndex = -1, oddIndex = -1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 == 0) {
        even[++evenIndex] = arr[i];
      } else {
        odd[++oddIndex] = arr[i];
      }
    }
    System.out.println("Even values are: ");
    for (int i = 0; i <= evenIndex; i++) {
      System.out.print(even[i] + " ");
    }
    System.out.println("\nOdd values are: ");
    for (int i = 0; i <= oddIndex; i++) {
      System.out.print(odd[i] + " ");
    }
  }
}