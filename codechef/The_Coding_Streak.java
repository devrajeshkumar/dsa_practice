package codechef;

import java.util.Scanner;

public class The_Coding_Streak {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int max = 0;
            int curr = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] != 0) {
                    curr++;
                } else {
                    max = Math.max(curr, max);
                    curr = 0;
                }
            }
            max = Math.max(curr, max);
            System.out.println(max);
        }
        sc.close();

    }
}