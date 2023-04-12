package the_real_stuff;

/*
 * Karim M.
 * Mar 03, 2023
 * Song object for the arraylist of music
 */

public class Song {
	
	String title;
	String artist;
	int year;
	
	Song(){}
	
	Song(String title, String artist, int year){	
		this.title = title;
		this.artist = artist;
		this.year = year;
	}
	
	@Override
	public String toString() {
		return String.format("Title: %s | Artist: %s | Year Released: %d", title, artist, year);
	}
	
}
