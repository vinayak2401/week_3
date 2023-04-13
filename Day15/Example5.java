class SquareMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5,}, {7, 8, 9}};
        int Square = 1;
      for(int i=0;i<arr.length;i++){
        if (arr.length != arr[i].length) {
            Square = 0;
        }
      }
        if (Square==1) {
            System.out.println("The array is a square matrix");
        } else {
            System.out.println("The array is not a square matrix");
        }
    }
}