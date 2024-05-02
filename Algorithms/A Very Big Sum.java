// A Very Big Sum
import java.util.Scanner;

public class Solution{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int num = s.nextInt();
        long sum = 0;
        long[] arr = new long[num];
        for(int i = 0; i < num; i++){
            arr[i] = s.nextLong();
        }
        for(int i = 0; i < num; i++){
            sum += arr[i]; 
        }
        System.out.println(sum);
        s.close();
    }
}
