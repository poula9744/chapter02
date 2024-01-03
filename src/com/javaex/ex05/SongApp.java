package com.javaex.ex05;

public class SongApp {

	public static void main(String[] args) {
		
		//아이유
		
		Song a = new Song();
		
		a.setTitle("좋은날");
		a.setArtist("아이유");
		a.setAlbum("Real");
		a.setComposer("이민수");
		a.setYear(2010);
		a.setTrack(3);
		
		//빅뱅
		
		Song b = new Song();
		
		b.setTitle("거짓말");
		b.setArtist("BIGBANG");
		b.setAlbum("Always");
		b.setComposer("G-DRAGON");
		b.setYear(2007);
		b.setTrack(2);
		
		//버스커버스커
		
		Song c = new Song();
		
		c.setTitle("벚꽃엔딩");
		c.setArtist("버스커버스커");
		c.setAlbum("버스커버스커1집");
		c.setComposer("장범준");
		c.setYear(2012);
		c.setTrack(4);
		
		//출력
		a.showInfo();
		b.showInfo();
		c.showInfo();
		
	}

}
