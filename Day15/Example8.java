class MovieRatings {
    public static void main(String[] args) {
       
        double movieRatings[][] = {{4, 6, 2, 5},{7, 9, 4, 8},{6, 9, 3, 7}};

        
        double highestRating = movieRatings[0][0];
        for (int i = 0; i < movieRatings.length; i++) {
            for (int j = 0; j < movieRatings[i].length; j++) {
                if (movieRatings[i][j] > highestRating) {
                    highestRating = movieRatings[i][j];
                }
            }
        }
        System.out.println("The highest rating is: " + highestRating);
      

        
        double lowestRating = movieRatings[0][0];
        for (int i = 0; i < movieRatings.length; i++) {
            for (int j = 0; j < movieRatings[i].length; j++) {
                if (movieRatings[i][j] < lowestRating) {
                    lowestRating = movieRatings[i][j];
                }
            }
        }
        System.out.println("The lowest rating is: " + lowestRating);
    }
}



