package the_real_stuff;

/*
 * Karim M.
 * Mar 03, 2023
 * Program that takes an arraylist of song databases with the name, artist, and year released
 * and filters based off certain criteria
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class ArrayListStuff {

	static ArrayList <Song> music = new ArrayList<Song>();

	public static void main(String[] args) {

		music.add(new Song("4 seasons", "Vivaldi", 0));
		music.add(new Song("El Sonodito", "David", 1995));
		music.add(new Song("Happy Birthday", "David", 2074));
		music.add(new Song("10 cm without zaza", "Hans Zimmer", 2012));
		music.add(new Song("The Paris One", "Kanye West", 2015));
		music.add(new Song("Surfin' Bird", "Peter Griffin", 1977));
		music.add(new Song("Get Schwifty", "Abraham Lincoln", 1722));
		music.add(new Song("240 Hz Asus Monitor", "Sensei Wu", 2012));
		music.add(new Song("Un Buen Perdedor", "David", 2007));

		for (Song s : music) {
			System.out.println(s);
		}

		System.out.println("=====================================================");
		
		
		//method 1 of accomplishing task
		Iterator <Song> it = music.iterator();
		
		while (it.hasNext()) {
			Song s = it.next();
			if (s.artist == "David") it.remove();
		}
		
		//method 2 of accomplishing task
		for (int i = 0; i < music.size(); i++) {	
			Song song = music.get(i);
			if (song.artist == "David") {
				music.remove(i);
				i--;
			}
		}
		
		for (Song s : music) {
			System.out.println(s);
		}
	}

}
