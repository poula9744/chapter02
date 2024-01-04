package com.javaex.ex05;

public class Ssong {

	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;

	
	//Alt + shift + s -> generate getters and setters
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}

	//alt + shift + s -> generate toString()
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer
				+ ", year=" + year + ", track=" + track + ", getTitle()=" + getTitle() + ", getArtist()=" + getArtist()
				+ ", getAlbum()=" + getAlbum() + ", getComposer()=" + getComposer() + ", getYear()=" + getYear()
				+ ", getTrack()=" + getTrack() + "]";
	}
	

	

}
