public class MOvie2 {

public static void main(String[] args) {
Movie movie = new Movie("Jurrasic World", 4);
Movie movie1 = new Movie("Glass", 5);
Movie movie2 = new Movie("Spiderman", 4);
Movie movie3 = new Movie("Creed", 5);
Movie movie4 = new Movie("Jimmy Neutron", 1);
/*System.out.println(movie.getTitle()+ ". "+movie.getTicketPrice());
System.out.println(movie1.getTitle()+ ". "+movie1.getTicketPrice());
System.out.println(movie2.getTitle()+ ". "+movie2.getTicketPrice());
System.out.println(movie3.getTitle()+ ". "+movie3.getTicketPrice());
System.out.println(movie4.getTitle()+ ". "+movie4.getTicketPrice());
*/
NetflixQueue netflix = new NetflixQueue();
netflix.addMovie(movie);
netflix.addMovie(movie1);
netflix.addMovie(movie2);
netflix.addMovie(movie3);
netflix.addMovie(movie4);
netflix.printMovies();
System.out.println(netflix.getBestMovie());
}

}

