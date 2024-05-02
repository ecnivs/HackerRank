
// Sales by Match
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int ar[] = new int[300];
        for (int i = 0; i < n; i++) {
            ar[s.nextInt()]++;
        }
        int ans = 0;
        for (int p : ar) {
            ans += p / 2;
        }
        System.out.println(ans);
    }
}
