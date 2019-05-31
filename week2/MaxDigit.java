import java.util.Scanner;
public class MaxDigit {
    public static void main(String[] args) {

     Scanner scanner=new Scanner(System.in);

     int n=scanner.nextInt();
int r,d=0;
while(n>0){
    r=n%10;
    if(d<r)
        d=r;
    n/=10;
}
        System.out.println(d);
    }

}
