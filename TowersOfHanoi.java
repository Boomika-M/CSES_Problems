import java.util.*;
public class TowersOfHanoi {
    static StringBuilder sb=new StringBuilder();
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long moves=(1L<<n)-1;
        System.out.println(moves);
        solve(n,1,3,2);
        System.out.print(sb);
    }
    public static void solve(int n, int from, int to, int med){
        if(n==0) return;
        solve(n-1,from,med,to);
        sb.append(from).append(" ").append(to).append("\n");
        solve(n-1,med,to,from);
    }
}
