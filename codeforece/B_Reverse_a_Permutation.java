package codeforece;

import java.util.Scanner;

public class B_Reverse_a_Permutation {

    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int correct = n;
            int start = 0;
            for (int i = 0; i < n; i++) {
                if (correct != arr[i]) {
                    start = i;
                    break;
                } else {
                    correct--;
                }
            }
            int end = 0;
            for (int i = 0; i < n; i++) {
                if (correct == arr[i]) {
                    end = i;
                    break;
                }
            }

            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}