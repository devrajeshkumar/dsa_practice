import java.util.List;
import java.util.Scanner;

public class Function_Declaration {

    static int tournamentProfit(int Y) {
        // write your code here
        int collection = Y * 200;
        int profit = collection - 5000;
        if (collection < 0) {
            return -1;
        }
        return profit;

    }

    static int removeDuplicate(int nums[]) {
        int last = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[last - 1]) {
                nums[last] = nums[i];
                last++;

            }
        }
        return last;
    }

    public void findPath(int n, int[][] grid, int i, int j, List<String> result, String temp) {
        if (i == n - 1 && j == n - 1) {
            result.add(temp);
        }
        // left
        if (i < n - 1 && grid[i + 1][j] != 0) {
            temp += "L";
            findPath(n, grid, i + 1, j, result, temp);
        } else if (i > 0 && grid[i - 1][j] != 0) {
            temp += "R";
            findPath(n, grid, i - 1, j, result, temp);
        } else if (j < n - 1 && grid[i][j + 1] != 0) {
            temp += "D";
            findPath(n, grid, i, j + 1, result, temp);
        } else if (j > 0 && grid[i][j - 1] != 0) {
            temp += "U";
            findPath(n, grid, i, j - 1, result, temp);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        System.out.println(removeDuplicate(arr));

    }

}