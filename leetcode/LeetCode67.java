package leetcode;

public class LeetCode67 {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1;
        int carry = 0;
        while (i >= 0 && j >= 0) {
            int sum = a.charAt(i) - '0' + b.charAt(j) - '0' + carry;
            sb.append((char) ('0' + sum % 2));
            carry = sum / 2;
            i--;
            j--;
        }
        while (i >= 0) {
            int sum = a.charAt(i) - '0' + carry;
            sb.append((char) ('0' + sum % 2));
            carry = sum / 2;
            i--;
        }
        while (j >= 0) {
            int sum = b.charAt(j) - '0' + carry;
            sb.append((char) ('0' + sum % 2));
            carry = sum / 2;
            j--;
        }
        if (carry > 0) {
            sb.append('1');
        }
        sb.reverse();

        return sb.toString();
    }
}
