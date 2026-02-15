import java.util.Scanner;

public class A_Friendly_Numbers {

    public static void main(String[] args) {
        solve();
    }

    public static int countFriendly(long x) {
        if (x % 9 != 0)
            return 0;

        int count = 0;

        for (int s = 1; s <= 100; s++) {
            long y = x + s;
            if (digitSum(y) == s) {
                count++;
            }
        }

        return count;
    }

    public static int digitSum(long n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(countFriendly(n));
        }
        sc.close();
    }
}