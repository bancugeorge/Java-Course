import lombok.Getter;
import lombok.Setter;i
import lombok.AllArgsConstructor;

import lombok.ToString;
import java.util.ArrayList;
@AllArgsConstructor
@Getter
@Setter
public static class Novel extends Book{
    private String Name,Type;
    private int numberofPages;
}
