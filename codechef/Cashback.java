package codechef;

import java.util.Scanner;

public class Cashback {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 200)
            System.out.println(n - 50);
        else
            System.out.println(n);
        sc.close();
    }
}