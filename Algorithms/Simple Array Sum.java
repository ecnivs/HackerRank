// Simple Array Sum
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum += scanner.nextInt();
        }
        System.out.println(sum);
        scanner.close();
    }
}
