import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());
        int magic = Integer.parseInt(scan.nextLine());
        int count = 0;
        boolean isFound = false;

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                count++;
                if (i + j == magic) {
                    isFound = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)", count, i, j, magic);
                    break;
                }
            }
            if (isFound) break;
        }

        if (!isFound)
            System.out.printf("%d combinations - neither equals %d", count, magic);
    }
}
