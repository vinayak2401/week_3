class MovieRatings {
    public static void main(String[] args) {
        double[][] ratings = {{4, 6, 2, 5},{7, 9, 4, 8},{6, 9, 3, 7}};

        int columnNumber = 3; 
        double sum = 0.0;
        int count = 0;

        for (int i = 0; i < ratings.length; i++) {
            sum += ratings[i][columnNumber];
            count++;
        }

        double averageRating = sum / count;

        System.out.println("The average rating in column " + (columnNumber) + " is: " + averageRating);
    }
}