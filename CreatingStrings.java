import java.util.*;
public class CreatingStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next().trim();
        char[] arr = a.toCharArray();
        Arrays.sort(arr);  
        List<String> ans = new ArrayList<>();
        do {
            ans.add(new String(arr));
        } while (next(arr));

        System.out.println(ans.size());
        for (String t : ans) {
            System.out.println(t);
        }
    }
    public static boolean next(char[] arr) {
        int n = arr.length;
        int i = n - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }
        if (i < 0) return false;  
        int j = n - 1;
        while (arr[j] <= arr[i]) {
            j--;
        }
        char tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
        int left = i + 1, right = n - 1;
        while (left < right) {
            tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left++;
            right--;
        }
        return true;
    }
}
