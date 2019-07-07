package week2.bookstore;

import lombok.AllArgsConstructor;

@AllArgsConstructor
//clasele top level nu pot fi statice
public class ArtAlbum extends Book {
    private String Name;
    private int numberofPages, paperQuality;
}