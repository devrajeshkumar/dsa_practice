package codechef;

import java.util.Scanner;

public class Qualified_or_Not {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
        if (n >= 2 * x && n >= 2 * y) {
            System.out.println("YES");
        } else
            System.out.println("NO");
        sc.close();

    }
}