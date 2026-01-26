package codeforece;

import java.util.Scanner;

public class C_Replace_and_Sum {

    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), q = sc.nextInt();
            int a[] = new int[n];
            int b[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                a[i] = Math.max(a[i], b[i]);
            }
            int max = Integer.MIN_VALUE;
            for (int i = n - 1; i > 0; i--) {
                max = Math.max(max, a[i]);
                a[i] = max;
            }
            int prefixSum[] = new int[n + 1];
            prefixSum[1] = a[0];
            for (int i = 1; i < n; i++) {
                prefixSum[i + 1] = prefixSum[i] + a[i];
            }
            while (q-- > 0) {
                int l = sc.nextInt(), r = sc.nextInt();
                System.out.print(prefixSum[r] - prefixSum[l - 1] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}