class DiagonalElements {
    public static void main(String[] args) {
        int[][] arr = {{2, 3, 4}, {5, 6, 7}, {8, 9, 10}};

        // Iterate over each row of the array
        for (int i = 0; i < arr.length; i++) {
            // Iterate over each column of the array
            for (int j = 0; j < arr[i].length; j++) {
                
                if (i == j) {
                    System.out.println(arr[i][j]);
                }
            }
        }
    }
}



