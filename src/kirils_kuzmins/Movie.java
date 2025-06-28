package kirils_kuzmins;
public class Movie {
	private String name;
    private double movieLength;
    private Genre movieGenre;
    private boolean isForAdults;

    public Movie(String name, double movieLength, Genre movieGenre, boolean isForAdults) {
        this.name = name;
        this.movieLength = movieLength;
        this.movieGenre = movieGenre;
        this.isForAdults = isForAdults;
        System.out.println("New movie object created: "+name);
    }

    
    
    public void aboutMovie() {
        System.out.println("Movie: " + name);
        System.out.println("Length: "+ movieLength + " minutes");
        System.out.println("Genre: " + movieGenre);
         System.out.println("For adults: " +isForAdults);
        
    }

    
    
    public void canWatch(int age) {
        if (isForAdults) {
            if (age >= 18) {
                System.out.println(name + " can be watched");
            } else {
                System.out.println(name +" is for adults only");
            }
        } else {
            if (age >= 6) {
                System.out.println(name+ " can be watched");
            } else {
                System.out.println(name +" is not recommended for kids under 6");
            }
        }
    	}

    
     public Genre getMovieGenre(){
        return movieGenre;
    }
    public double getMovieLength(){
         return movieLength;
        
    }

    public boolean getIsForAdults(){
       
    	return  isForAdults;}
    
     public String getName(){
        return name;
    }
}
