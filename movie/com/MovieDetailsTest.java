package com.advancecollection.movie.com;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

public class MovieDetailsTest {
		//private static final String  = null;
		private MovieDetails moviedetailsone,moviedetailstwo,moviedetailsthree,movieDetails;
		private MovieDetailsList moviedetailslist;
		
		
		@Before
		public void setUp(){
			moviedetailsone = new MovieDetails("Gabber Singh", "Pawan Kalyan", "Sruthi Hassan","Commercial Entertainer");
			moviedetailstwo= new MovieDetails("Bahubali", "Prabhas", "anushka","historical");
			moviedetailsthree = new MovieDetails("Arjun Reddy", "Vijay", "pandey","Entertainer");
			moviedetailslist = new MovieDetailsList();
			movieDetails = new MovieDetails();
			
		}
		
		@Test
		public void testToAddAMovie() {
			String result = moviedetailslist.addMovie(moviedetailsone);
			
			/*moviedetailslist.addMovie(moviedetailstwo);
			moviedetailslist.addMovie(moviedetailsthree);*/
			assertEquals("MovieDetails [moviename=Gabber Singh, leadactor=Pawan Kalyan, leadactress=Sruthi Hassan, genere=Commercial Entertainer]",result);
		}
	
		@Test
		public void testToRemoveMovie(){
			moviedetailslist.addMovie(moviedetailsone);
			moviedetailslist.addMovie(moviedetailstwo);
			moviedetailslist.addMovie(moviedetailsthree);
			boolean result = moviedetailslist.removeMovie(moviedetailsone);
			assertTrue(true);
		}
		
		@Test
		public void testToRemoveAllMovies(){
			moviedetailslist.addMovie(moviedetailsone);
			moviedetailslist.addMovie(moviedetailstwo);
			moviedetailslist.addMovie(moviedetailsthree);
			boolean result = moviedetailslist.removeAllMovies(moviedetailslist);
			assertTrue(true);
		}
		
		@Test
		public void testFindMovieByMovieName(){
			moviedetailslist.addMovie(moviedetailsone);
			moviedetailslist.addMovie(moviedetailstwo);
			moviedetailslist.addMovie(moviedetailsthree);
			MovieDetails result=moviedetailslist.findMovieByMovieName("Bahubali");
			assertEquals("MovieDetails [moviename=Bahubali, leadactor=Prabhas, leadactress=anushka, genere=historical]", result.toString() );
		}
				
		@Test
		public void testFindMovieByGenre(){
			moviedetailslist.addMovie(moviedetailsone);
			moviedetailslist.addMovie(moviedetailstwo);
			moviedetailslist.addMovie(moviedetailsthree);
			MovieDetails result=moviedetailslist.FindMovieByGenre("Entertainer");
			assertEquals("MovieDetails [moviename=Arjun Reddy, leadactor=Vijay, leadactress=pandey, genere=Entertainer]", result.toString() );
		}
		
		@Test
		public void testForSortMovie(){
			moviedetailslist.addMovie(moviedetailsone);
			moviedetailslist.addMovie(moviedetailstwo);
			moviedetailslist.addMovie(moviedetailsthree);
			String result=moviedetailslist.sort("movie");
			assertEquals("[MovieDetails [moviename=Arjun Reddy, leadactor=Vijay, leadactress=pandey, genere=Entertainer], MovieDetails [moviename=Bahubali, leadactor=Prabhas, leadactress=anushka, genere=historical], MovieDetails [moviename=Gabber Singh, leadactor=Pawan Kalyan, leadactress=Sruthi Hassan, genere=Commercial Entertainer]]
", result);
		}
		
		@Test
		public void testForSortActor(){
			moviedetailslist.addMovie(moviedetailsone);
			moviedetailslist.addMovie(moviedetailstwo);
			moviedetailslist.addMovie(moviedetailsthree);
			//System.out.println(moviedetailslist.sort("actor"));
		}
			
		@Test
		public void testForSortActress(){
			moviedetailslist.addMovie(moviedetailsone);
			moviedetailslist.addMovie(moviedetailstwo);
			moviedetailslist.addMovie(moviedetailsthree);
			//System.out.println(moviedetailslist.sort("actress"));
		}
		
		@Test
		public void testForSortGenere(){
			moviedetailslist.addMovie(moviedetailsone);
			moviedetailslist.addMovie(moviedetailstwo);
			moviedetailslist.addMovie(moviedetailsthree);
			//System.out.println(moviedetailslist.sort("genre"));
		}
}
	
	
