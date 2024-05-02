// Bill Division
import java.util.Scanner;

public class solution {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sp = s.nextInt();
        int tc = 0;
        for (int i = 0; i < n; i++) {
            int t = s.nextInt();
            if (i != sp)
                tc += t;
        }
        int p = s.nextInt();
        if (tc / 2 >= p)
            System.out.println("Bon Appetit");
        else
            System.out.println(p - tc / 2);
    }
}
