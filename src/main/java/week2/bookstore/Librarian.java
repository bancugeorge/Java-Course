package week2.bookstore;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Librarian {
    List<Book> books = new ArrayList<>();

    public void addNovel(Book novel) {
        books.add(novel);
        System.out.println("Novel has been added!");
    }

    public void removeNovel(Book novel) {
        books.remove(novel);
        System.out.println("Novel has been removed!");
    }

    public void addartAlbum(Book artAlbum) {
        books.add(artAlbum);
        System.out.println("Art album has been added!");
    }

    public void removeArtAlbum(Book artAlbum) {
        books.remove(artAlbum);
        System.out.println("Art album has been removed!");
    }

    public void listNovelsFromService() {
        books.forEach(novel -> {
            System.out.println(novel);

        });
    }

    //listartAlbumsFromService --> listArtAlbumsFromService
    public void listartAlbumsFromService() {
        books.forEach(book -> {
            //probabil ca asta voiai sa faci aici
            System.out.println(book);

        });
    }
}
