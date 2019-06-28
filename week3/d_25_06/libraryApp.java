import java.awt.print.Book;
import java.util.List;

public class libraryApp {
    static Librarian librarian= new Librarian();

    public static void main(String[] args) {
        librarian.addartAlbum(new artAlbum("Masini misto",10,2));
        librarian.addartAlbum(new artAlbum("Masini Naspa",2,3));
        librarian.addNovel(new Novel("Enigma Otiliei","Mystery",3));
        librarian.addartAlbum(new Novel("Enigma Otiliei","Horror",5);

            librarian.listNovelsFromService();
            List<Book> books= librarian.getBooks();

            librarian.removeNovel(0);
    }

}
