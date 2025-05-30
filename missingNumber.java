import java.util.*;
public class missingNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean[] b=new boolean[n+1];
        for(int i=0;i<n-1;i++){
            int d=sc.nextInt();
            b[d]=true;
        }
        for(int i=1;i<=n;i++){
            if(!b[i]){
                System.out.print(i);
                break;
            }
        }
    }
}