package util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import dto.MovieDTO;

public class MovieUtil {

	public static void main(String[] args) {

		MovieDTO dto1 = new MovieDTO("Chichhore", 5, 3, "Drama");

		MovieDTO dto2 = new MovieDTO("3 idiots", 5, 3, "Emotion");

		MovieDTO dto3 = new MovieDTO("Dia", 4.5, 2.45, "Patho");

		MovieDTO dto4 = new MovieDTO("Horror Story", 5, 3, "Horror");

		MovieDTO dto5 = new MovieDTO("Rama Shama Bhama", 5, 3, "Comedy");

		MovieDTO dto6=new MovieDTO();
		dto6.setGenre("Action");
		
		Collection<MovieDTO> movieDTOs = new ArrayList();
		movieDTOs.add(dto1);
		movieDTOs.add(dto2);
		movieDTOs.add(dto3);
		movieDTOs.add(dto4);
		movieDTOs.add(dto5);
 
		Iterator<MovieDTO> iterator = movieDTOs.iterator();

		while (iterator.hasNext())
		{
			MovieDTO movie = iterator.next();
			System.out.println(movie);
			if (movie.getGenre().equals("Comedy")) {
				iterator.remove();
				movie.setGenre(null);
				movieDTOs.remove(movie);
			}
		}
		System.out.println("movies after removing comedy " + movieDTOs.size());

		for(MovieDTO dto:movieDTOs)
		{
			System.out.println(dto);
		}
		
	}

}


