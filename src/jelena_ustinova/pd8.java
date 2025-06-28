package jelena_ustinova;
import java_enum.Console;


import java.util.ArrayList;
import java.util.Scanner;

//08.06.2025
//Jeļena Ustinova

public class pd8 {

	public static void main(String[] args) {
	//6. izveido filmu objektus
		
		Movie movie1=new Movie("John Wick: Charter 4", 169, Genre.Action, true);
		Movie movie2=new Movie("Spider-Man:Into the Spider-Verse",117, Genre.Animation, false);
		Movie movie3=new Movie("The Conjuring",112, Genre.Horror, true);
		Movie movie4=new Movie("Paddington", 103, Genre.Comedy, false);
		Movie movie5=new Movie("The Notebook",123, Genre.Romance, false);
		Movie movie6=new Movie("Avengers:Endgame",181, Genre.Superhero, false);
		Movie movie7=new Movie("Interstellar",169, Genre.Sci_Fi,false);
		Movie movie8=new Movie("The Hangover",100, Genre.Comedy, false);
		
	//7. izveido masīvu 
		
		ArrayList<Movie> movieList=new ArrayList<Movie>();
		movieList.add(movie1);
		movieList.add(movie2);
		movieList.add(movie3);
		movieList.add(movie4);
		movieList.add(movie5);
		movieList.add(movie6);
		movieList.add(movie7);
		movieList.add(movie8);
		
	//izvadi visas filmas no masīva
		
		for(Movie oneMovie:movieList) {
			oneMovie.aboutMovie();
		}
		
	//9.atrodi filmas Horror
		
		System.out.print("The horror movie is ");
		for( Movie oneMovie:movieList) {
			if(oneMovie.movieGenre==Genre.Horror) {
				System.out.print(oneMovie.name+" ");
			}
		}
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
		
		//10. Pārbaudi pēc vecuma, cik filmu ir iespējāms skatīties
		
		
		Scanner sk1= new Scanner(System.in);
		System.out.println("\nHow old are you > ");
		int userAge=sk1.nextInt();
		
		System.out.println("You can watch these movies: ");
		int b=0;
		
		if(userAge>=18) {
		for(Movie onMovie: movieList) {
		b++;
		System.out.println(onMovie.name);
						
		}
		}else {
			for(Movie oneMovie: movieList) {
				if(oneMovie.isForAdults==false){
				b++;
				System.out.println(oneMovie.name);
				}
			}
		}
			System.out.println("There are "+b+" movies in total!");
		
			

			
								
		// 11. filmas garums ir lielāks par 106 min
		System.out.println("\n-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
		System.out.println("Movies that are longer than 106 minutes ");
		int a=0;
		for(Movie oneMovie:movieList) {
			if(oneMovie.movieLenght>=106) {
				a++;
				System.out.println(a+". "+oneMovie.name);
			}
		}
		//12. Saskaiti cik ir filmas visiem
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
		System.out.print("Everyone can watch ");
		int k=0;
		for(Movie oneMovie:movieList) {
			if(oneMovie.isForAdults==false) {
				k++;
							}
		}
		System.out.print(k+" movies ");
			}	
	}


