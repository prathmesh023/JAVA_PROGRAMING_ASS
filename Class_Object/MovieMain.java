// Create a class Movie with movieName and rating.
// Display movie details.

class Movie {

    String movieName;
    int rating;

    void display() {

        System.out.println("Movie: " + movieName +
                           " Rating: " + rating);
    }
}

public class MovieMain {
    public static void main(String[] args) {

        Movie m1 = new Movie();

        m1.movieName = "KGF";
        m1.rating = 9;

        m1.display();
    }
}

/*
Output:
Movie: KGF Rating: 9
*/