import java.util.Scanner;
public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int j=0;
        int n=sc.nextInt();
        for(int i=n-1;i>2; i--){
            int counter=0;
            for(j=2;j<i;j++) {
                if(i%j==0)
                    counter=counter+1;

            }
            if (counter<1)
                System.out.println(j+" ");


            }
        }
    }