// Mini-Max Sum
import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long min = 0, max = 0;
        long a[] = new long[5];
        for (int i = 0; i < 5; i++) {
            a[i] = s.nextInt();
        }
        s.close();
        Arrays.sort(a);
        for (int i = 0; i < 4; i++) {
            min += a[i];
        }
        for (int i = 1; i < 5; i++) {
            max += a[i];
        }
        System.out.println(min + " " + max);
    }
}
