/*import java.util.*;
public class CoinPiles{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            long a=sc.nextLong();
            long b=sc.nextLong();
            if((a+b)%3!=0) System.out.println("NO");
            else if(Math.max(a,b)<=2*(Math.min(a,b))) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}*/
import java.util.Scanner;
public class CoinPiles {
    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        StringBuilder output = new StringBuilder();
        int t=sc.nextInt();
        while (t-- > 0) {
            long a=sc.nextLong();
            long b=sc.nextLong();
            long sum = a + b;
            long min = Math.min(a, b);
            long max = Math.max(a, b);
            if (sum % 3 != 0 || max > 2 * min) {
                output.append("NO\n");
            } else {
                output.append("YES\n");
            }
        }
        System.out.print(output);
    }
}
