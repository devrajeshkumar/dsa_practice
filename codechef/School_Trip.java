package codechef;

import java.util.Scanner;

public class School_Trip {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), x = sc.nextInt(), k = sc.nextInt();
            int leftStudents = x % k;
            int result = Math.min(leftStudents, k - leftStudents);
            if (n == x)
                result = leftStudents;
            System.out.println(result);
        }
        sc.close();
    }
}