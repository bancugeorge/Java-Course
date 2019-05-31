import java.util.Scanner;
public class Palindrom {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
    int temp,r,s=0;
        int n=sc.nextInt();
        temp=n;
        while(n>0){
            r=n%10;
            s=(s*10)+r;
            n/=10;}
        if (temp==s)
        System.out.println("Numarul este palindrom");
        else
            System.out.println("Numarul nu este palindrom");

        }
    }
