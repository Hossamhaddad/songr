package com.songr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlbumTest {
    @Test
    public static void testAlbumClass(){
        Album alter=new Album();
        alter.setArtist("Alter Bridge");
        alter.setTitle("Blackbird");
        alter.setLength("59:17");
        alter.setSongCount(13);
        alter.setImageUrl("https://upload.wikimedia.org/wikipedia/en/1/13/Alterbridge_blackbird.jpg");
        assertEquals("Test artist getter","Alter Bridge",alter.getArtist());
        assertEquals("Test title getter","Blackbird",alter.getTitle());
        assertEquals("Test length getter","59:17",alter.getLength());
       assertEquals(13,alter.getSongCount(),"Test song count should be 13");
        assertEquals("Test image url getter","https://upload.wikimedia.org/wikipedia/en/1/13/Alterbridge_blackbird.jpg",alter.getImageUrl());
    }

}