package TreeSet;
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet t = new TreeSet(new cName().thenComparing(new cAge()));
        t.add(new Person("Alexandra",25));
        t.add(new Person("Mihai",23));
        t.add(new Person("Gabi",24));
        t.add(new Person("Edi",26));
        for ( Object p : t ){
            System.out.println(p);
        }
    }

}

class cAge implements Comparator<Person> {
    public int compare(Person p1, Person p2) {
        return p1.getAge().compareTo(p2.getAge());
    }
}

class cName implements Comparator<Person> {
    public int compare(Person p1, Person p2) {
        return p1.getName().compareTo(p2.getName());
    }

}
