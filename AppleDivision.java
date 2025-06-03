import java.util.*;
public class AppleDivision{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] a=new long[n];
        long sum=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextLong();
            sum+=a[i];
        }
        long min=Long.MAX_VALUE;
        for(int m=0;m<(1<<n);m++){
            long subsetsum=0;
            for(int i=0;i<n;i++){
                if((m&(1<<i))!=0){
                    subsetsum+=a[i];
                }
            }
            long othersum=sum-subsetsum;
            long diff=Math.abs(subsetsum-othersum);
            min=Math.min(min,diff);
        }
        System.out.println(min);
    }
}