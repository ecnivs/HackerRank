
// Grading Students
import java.util.*;

public class Solution {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            int g = s.nextInt();
            if (g >= 38)
                if (g % 5 >= 3) {
                    g = g / 5 * 5 + 5;
                }
            System.out.println(g);
        }
    }
}
