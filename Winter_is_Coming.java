import java.util.Scanner;

public class Winter_is_Coming {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
            int count = 0;
            while (n-- > 0) {
                int num = sc.nextInt();
                if (num < a)
                    count++;
            }
            System.out.println(count);
        }
        sc.close();
    }
}