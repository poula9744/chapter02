package com.javaex.ex09;

public class SongApp {

	public static void main(String[] args) {

		// s1
		Song s1 = new Song();

		s1.setTitle("좋은날");
		s1.setArtist("아이유");
		s1.setAlbum("Real");
		s1.setComposer("이민수");
		s1.setYear(2010);
		s1.setTrack(3);
		
		System.out.println(s1.toString());
		
		
		// s2
		Song s2 = new Song ("거짓말", "BIGBANG", "Always", "이민수", 2007, 2);
		
		System.out.println(s2.toString());
		
		// s3
		Song s3 = new Song("벚꽃엔딩", "버스커버스커", "버스커버스커1집", "장범준", 2012, 4);

		System.out.println(s3.toString());
	}
	
	

}
