import java.util.*;
public class MissingNumber2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n-1];
        for(int i=0;i<n-1;i++){
            arr[i]=sc.nextInt();
        }
        int d=0;
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++){
            if(arr[i]!=i+1){
                System.out.println(i+1);
                d+=1;
                break;
            }
        }  
        if(d==0) System.out.println(n);
    }
}