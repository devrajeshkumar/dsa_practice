package codechef;

import java.util.Scanner;

public class Adding_123_to_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
            int result = Math.min(x, z) + y / 2;
            System.out.println(result);
        }
        sc.close();
    }
}