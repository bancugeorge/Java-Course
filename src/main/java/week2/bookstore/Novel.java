package week2.bookstore;
//ca sa folosesti lombok ai nevoie de el pe classpath (vezi build.gradel)
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
//clasele top level nu pot fi statice
public class Novel extends Book {
    private String Name, Type;
    private int numberofPages;
}
