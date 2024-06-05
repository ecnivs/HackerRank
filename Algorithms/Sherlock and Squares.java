
// Sherlock and Squares
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int h = 0; h < t; h++) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int count = 0;
            int sq = (int) Math.sqrt(m);
            int a = sq * sq;
            if (a < m) {
                sq++;
                a = sq * sq;
            }
            while (a >= m && a <= n) {
                count++;
                sq++;
                a = sq * sq;
            }
            System.out.println(count);
            sc.close();
        }
    }
}
