 class Sum {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};
      for (int i = 0; i < arr.length; i++) {
            int rowSum = 0;
          for (int j = 0; j < arr[i].length; j++) {
                rowSum += arr[i][j];
            }
            System.out.println("Sum of row " + (i) + ": " + rowSum);
        }
    }
}
