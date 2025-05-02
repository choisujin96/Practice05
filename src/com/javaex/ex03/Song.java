package com.javaex.ex03;

public class Song {
	
	//필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private String year;
	private int track;
	
	//생성자
	
	public Song() {
		System.out.println("Song()");
	}
	
	public Song(String title, String artist, String album, String composer, String year) {
		this.title=title;
		this.artist=artist;
		this.album=album;
		this.composer=composer;
		this.year=year;
		
		System.out.println("Song(5)");
	}
	
	
	public Song(String title, String artist, String album, String composer, String year, int track) {
		this(title, artist, album, composer, year);
		this.track=track;
		
		System.out.println("Song(6)");
	}
	
	
	//메소드-gs
	
	public String getArtist() {
		return artist;
	}


	public String getTitle() {
		return title;
	}
	
	
	public String getAlbum() {
		return album;
	}	
	

	
	public String getYear() {
		return year;
	}

	
	public int getTrack() {
		return track;
	}

	
	public String getComposer() {
		return composer;
	}
	
	
	//메소드-일반
	public void showInfo() {
		System.out.println(artist + ", " + title + 
						   " (" + album + ", " + year + ", " + track + 
						   ", " + composer + ")");
	}
	
	
	
}



