import java.util.*;
public class PalindromeReorder {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().toUpperCase();
        int[] range=new int[26];
        for(char c:s.toCharArray()) range[c-'A']++;
        int odd=0;
        int charIndex=-1;
        for(int i=0;i<26;i++){
            if(range[i]%2!=0){
                odd++;
                charIndex=i;
            }
        }
        if(odd>1){
            System.out.println("NO SOLUTION");
            return;
        }
        StringBuilder first=new StringBuilder();
        StringBuilder second=new StringBuilder();
        for(int i=0;i<26;i++){
            int count=range[i];
            char ch=(char)('A'+i);
            if(count%2==0){
                for(int j=0;j<count/2;j++){
                    first.append(ch);
                }
            }
            else{
                for(int j=0;j<count/2;j++){
                    first.append(ch);
                }
                for(int j=0;j<count%2;j++){
                    second.append(ch);
                }
            }
        }
        StringBuilder res=new StringBuilder();
        res.append(first);
        res.append(second);
        res.append(first.reverse());
        System.out.println(res);
    }
}
