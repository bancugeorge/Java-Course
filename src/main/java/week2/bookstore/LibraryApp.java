package week2.bookstore;

import java.util.List;

//numele claselor incep cu litera mare
public class LibraryApp {
    static Librarian librarian = new Librarian();

    public static void main(String[] args) {
        //camelCase addartAlbum --> addArtAlbum
        librarian.addartAlbum(new ArtAlbum("Masini misto", 10, 2));
        librarian.addartAlbum(new ArtAlbum("Masini Naspa", 2, 3));
        librarian.addNovel(new Novel("Enigma Otiliei", "Mystery", 3));
        librarian.addartAlbum(new Novel("Enigma Otiliei", "Horror", 5));

        librarian.listNovelsFromService();
        List<Book> books = librarian.getBooks();

        librarian.removeNovel(new ArtAlbum("Masini misto", 10, 2));
    }

}
