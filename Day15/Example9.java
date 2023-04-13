 class MovieRating {
    public static void main(String[] args) {
        
        double movieRatings[][] = {{4, 6, 2, 5},{7, 9, 4, 8},{6, 9, 3, 7}};

        
        int GreaterThan4 = 0;
        for (int i = 0; i < movieRatings.length; i++) {
            for (int j = 0; j < movieRatings[i].length; j++) {
                if (movieRatings[i][j] > 4.0) {
                    
                    GreaterThan4++;
                }
            }
        }
        System.out.println("Number of movie ratings greater than 4: " + GreaterThan4);
    }
}
