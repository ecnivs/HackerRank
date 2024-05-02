// Breaking the Records
import java.util.Scanner;

public class breakingrecords {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int low = 0;
        int high = 0;
        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = s.nextInt();
        }
        high = ar[0];
        low = ar[0];
        int high_count = 0;
        int low_count = 0;
        s.close();
        for (int j = 0; j < n; j++) {
            int val = ar[j];
            if (val > high) {
                high = val;
                high_count += 1;
            }
            if (val < low) {
                low = val;
                low_count += 1;
            }
        }
        System.out.print(high_count + " " + low_count);

    }
}
