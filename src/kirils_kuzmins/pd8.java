package kirils_kuzmins;
import java.util.ArrayList;
import java.util.Scanner;
import PD.Movie;
import PD.Genre;
public class pd8 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		ArrayList<Movie> movieList = new ArrayList<>();

    
        movieList.add(new Movie("Matrix", 136.0, Genre.SciFi, true));
        movieList.add(new Movie("Frozen", 102.0, Genre.Animation, false));
        movieList.add(new Movie("It", 120.0, Genre.Horror, true));
        movieList.add(new Movie("The Incredibles", 115.0, Genre.Superhero, false));
        movieList.add(new Movie("Titanic", 195.0, Genre.Romance, false));
        movieList.add(new Movie("Scary Movie", 88.0, Genre.Comedy, true));

   //---------------------------------------------------------------------//     
        
        System.out.println("\n--- All Movies ---");
        for (Movie movie : movieList) {
              movie.aboutMovie();
            System.out.println();
        }

     
        System.out.println("\n--- Horror Movies ---");
         for (Movie movie : movieList) {
            if (movie.getMovieGenre() == Genre.Horror) {
                System.out.println(movie.getName());
            }
        }

       
       
        System.out.print("\nEnter your age: ");
        int age = scanner.nextInt();

        int watchableCount = 0;
         System.out.println("\n--- Movies you can watch ---");
         for (Movie movie : movieList) {
             if ((movie.getIsForAdults() && age >= 18) || (!movie.getIsForAdults() && age >= 6)) {
                System.out.println(movie.getName());
                  watchableCount++;
            }
        }
        System.out.println("Total movies you can watch: " + watchableCount);

       System.out.println("\n--- Movies longer than 106 minutes ---");
        for (Movie movie : movieList) {
            if (movie.getMovieLength() > 106) {
                System.out.println(movie.getName());
            }
        }

     
        int nonAdultMovies = 0;
          for (Movie movie : movieList) {
            if (!movie.getIsForAdults()) {
                nonAdultMovies++;
            }
        }
          System.out.println("\nMovies for all audiences: " + nonAdultMovies);

        scanner.close();

	}

}
