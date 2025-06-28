package jelena_ustinova;


public class Movie {

	public String name;
	public int movieLenght;
	public Genre movieGenre;
	public boolean isForAdults;
	
	//konstruktors
	
		public Movie(String name, int lenght, Genre movieGenre, boolean isForAdults) {
			this.name=name;
			this.movieLenght=lenght;
			this.movieGenre=movieGenre;
			this.isForAdults=isForAdults;
			System.out.println("Movie "+this.name+" is created!");
			}
		
	//funkcija izvada info par filmu
		
		public void aboutMovie() {
			System.out.println("Movie "+this.name+", movie lenght "+this.movieLenght+
					" min., Ganre: "+this.movieGenre+", is for Adults -"+this.isForAdults);
			System.out.println("--------------------------------");
		}
		
		
		
		
	// funkcija  párbauda vai dríkst skatīties filmu
		
		
		
				
		
		
		
		}
		
		
		
		
		
		
		


