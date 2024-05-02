// Plus Minus
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        double pos = 0;
        double neg = 0;
        double zero = 0;

        for (int i = 0; i < n; i++) {
            int num = s.nextInt();
            if (num < 0)
                neg++;
            else if (num > 0)
                pos++;
            else
                zero++;
        }

        double total = n;
        double b = pos / total;
        double c = neg / total;
        double d = zero / total;

        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        s.close();
    }
}
