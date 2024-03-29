import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scan.nextLine());
            if (num > maxNum) maxNum = num;
            if (num < minNum) minNum = num;
        }
        System.out.printf("Max number: %d%nMin number: %d", maxNum, minNum);
    }
}
