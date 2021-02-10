package dto;

public class MovieDTO {

	private String name;
	private double duration;
	private double rating;
	private String genre;
	
	public MovieDTO(){
		
	}
	
	public MovieDTO(String name, double duration, double rating, String genre) {
		super();
		this.name = name;
		this.duration = duration;
		this.rating = rating;
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "MovieDTO [name=" + name + ", duration=" + duration + ", rating=" + rating + ", genre=" + genre + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
}
