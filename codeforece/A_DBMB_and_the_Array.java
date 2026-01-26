package codeforece;

import java.util.Scanner;

public class A_DBMB_and_the_Array {

    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), s = sc.nextInt(), x = sc.nextInt();
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += sc.nextInt();
            }
            int remaing = s - sum;
            if (remaing < 0)
                System.out.println("NO");
            else if (remaing % x == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}