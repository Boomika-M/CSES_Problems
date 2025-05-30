import java.util.*;
public class BitStrings{
    private static final long Mod=1000000007; 
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(power(2,n));
    }
    private static long power(int base, int exp) {
        long result = 1;
        long b = base;
        while (exp > 0) {
            if ((exp & 1) == 1) result = (result * b) % Mod;
            b = (b * b) % Mod;
            exp >>= 1;
        }
        return result;
    }
}