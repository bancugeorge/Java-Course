import java.sql.SQLOutput;
import java.util.Scanner;

public class SmallestArray {
    public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
int a[]=new int[5];
int min=9999;

for(int i=0;i<a.length;i++) {
    System.out.println("Introduceti numarul array-ului:");
    a[i] = scanner.nextInt();
    if (min < a[i])
        min = a[i];

}
        System.out.println(min);

int b[]={5,4,9,12,7};
int min2=9999;
for(int i: b ){
    if(min2 < i)
        min2=i;
}
        System.out.println(min2);

}
    }
