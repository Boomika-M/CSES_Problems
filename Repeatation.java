import java.util.*;
public class Repeatation{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String d=sc.nextLine();
        int cu=1;
        int max=1;
        for(int i=1;i<d.length();i++){
            if(d.charAt(i)==d.charAt(i-1)){
                cu++;
                max=Math.max(max,cu);
            }
            else{
                cu=1;
            }
        }
        System.out.println(max);
    }
}