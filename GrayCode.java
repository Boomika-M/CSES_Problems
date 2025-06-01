import java.util.*;
public class GrayCode{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=1<<n;
        for(int i=0;i<t;i++){
            int g=i^(i>>1);
            String bin=Integer.toBinaryString(g);
            while(bin.length()<n){
                bin="0"+bin;
            }
            System.out.println(bin);
        }
    }
}