class Frequency {
  public static void main(String args[]) {
    int arr[] = { 10, 89, 10, 12, 77, 12, 90, 41 };
    int count = 1;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          count++;
          arr[j] = -1;
        }
      }
      if (arr[i] != -1) {
        System.out.println(arr[i] + " frequency is: " + count);
      }
      count = 1;
    }
  }
}