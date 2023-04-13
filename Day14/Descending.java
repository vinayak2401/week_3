 class DescendingOrder {
    public static void main(String[] args) {
        int[] arr = {4, 2, 6, 1, 8, 3};
        int n = arr.length;
        
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        System.out.print("Array in descending order: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
