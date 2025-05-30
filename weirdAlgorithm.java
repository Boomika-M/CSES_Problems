import java.util.*;
public class weirdAlgorithm{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        System.out.print(n+" ");
        while(n!=1){
            long s=0;
            if(n%2==0){
                s=n/2;
            }
            else{
                s=(n*3)+1;
            }
            System.out.print(s+" ");
            n=s;
        }
    }
}