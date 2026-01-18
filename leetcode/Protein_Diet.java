package leetcode;

import java.util.Scanner;

public class Protein_Diet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt();
        sc.close();
        if (x >= y)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}