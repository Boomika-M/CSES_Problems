import java.util.*;
public class TrailingZeros{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long c=0;
        for(long i=5;i<=n;i*=5){
            c+=n/i;
        }
        System.out.println(c);
    }
}