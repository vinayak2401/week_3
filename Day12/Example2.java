class MiddleElement {
  public static void main(String args[]) {
    int arr[] = { 23, 45, 65, 34, 34, 6 };
    for (int i = 0; i < arr.length; i++) {
      if (arr.length % 2 == 0) {
        System.out.Println(arr[(arr.length / 2) - 1]);
        System.out.Println(arr[(arr.length / 2)]);
      } else {
        System.out.Println(arr[(arr.length / 2)]);
      }
    }
  }
}