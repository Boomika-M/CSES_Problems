import java.util.*;
public class ChessboardAndQueens{
    static char[][] board=new char[8][8];
    static boolean[] col=new boolean[8];
    static boolean[] diag1=new boolean[15];
    static boolean[] diag2=new boolean[15];
    static int ways=0;
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<8;i++){
            String s=sc.nextLine();
            for(int j=0;j<8;j++){
                board[i][j]=s.charAt(j);
            }
        }
        solve(0);
        System.out.println(ways);
    }
    public static void solve(int row){
        if(row==8){
            ways+=1;
            return;
        }
        for(int i=0;i<8;i++){
            if(board[row][i]=='*') continue;
            if(col[i]||diag1[row+i]||diag2[row-i+7]) continue;
            col[i]=diag1[row+i]=diag2[row-i+7]=true;
            solve(row+1);
            col[i]=diag1[row+i]=diag2[row-i+7]=false;
        }
    }
}