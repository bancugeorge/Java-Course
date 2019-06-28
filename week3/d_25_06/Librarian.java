import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class Librarian {
    List<Book> books = new List<Book>();

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

    public void removeartAlbum(Book artAlbum) {
        books.remove(artAlbum);
        System.out.println("Art album has been removed!");
    }

    public void listNovelsFromService() {
        books.forEach(novel -> {
            System.out.println(books.toString());

        });
    }

    public void listartAlbumsFromService() {
        books.forEach(artAlbum -> {
            System.out.println(books.toString());

        });
    }
}
