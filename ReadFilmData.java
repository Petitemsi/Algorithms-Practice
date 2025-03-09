import java.io.File;
import java.util.*;

public class ReadFilmData {

	public static void main(String[] args) throws Exception{
		//parsing and reading the CSV file data into the film (object) array
		// provide the path here...
        File directory = new File("./");
  		String name = directory.getAbsolutePath() + "//Film.csv";
		Scanner sc = new Scanner(new File(name));
		Film[] films = new Film[10000];

		// this will just print the header in CSV file
		sc.nextLine();

		int i = 0; String st = "";
		
		while (sc.hasNextLine())  //returns a boolean value
		{
			st = sc.nextLine();
			String[] data = st.split(",");
			films[i++] = new Film(Integer.parseInt(data[0]), data[1], data[2], data[3], Float.parseFloat(data[4]), Float.parseFloat(data[5]));
		}
		sc.close();  //closes the scanner

		// We can print film details due to overridden toString method in film class
		System.out.println(films[0]);
		System.out.println(films[1]);

		// we can compare films based on their ID due to overridden CompareTo method in film class
		System.out.println(films[0]==films[0]);
		System.out.println(films[0]==films[1]);
	}

}


class Film implements Comparable<Object>{

	private int filmID;
	private String title;
	private String genre;
	private String directorName;
	private float length;
	private float rating;


	// constructor
	public Film(int filmID, String genre, String directorName, String title, float length, float rating) {
		super();
		this.filmID = filmID;
		this.title = title;
		this.genre = genre;
		this.directorName = directorName;
		this.length = length;
		this.rating = rating;
	}

	// setters and getters
	public int getFilmID() {
		return filmID;
	}

	public void setFilmID(int filmID) {
		this.filmID = filmID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}


	// so the film objects can be compared when sorting/searching
	// NOTE: this will only allow comparisons based on the title of the film
	@Override
	public int compareTo(Object obj) {

		/*
		Edit this section so it compares the appropriate
		column you wish to sort by
		*/
		

		Film flm = (Film)obj;
		return filmID - (flm.getFilmID());
	}

	@Override
	public String toString() {
		return "Film [filmID=" + filmID + ", title=" + title + ", genre=" + genre+ ", director name="
				+ directorName +  ", length=" + length + ", rating="
				+ rating  + "]";
	}



}