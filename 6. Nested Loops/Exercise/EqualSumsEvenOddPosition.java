import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int startNum = Integer.parseInt(scan.nextLine());
        int finalNum = Integer.parseInt(scan.nextLine());

        for (int i = startNum; i <= finalNum; i++) {
            int n = i;
            int evenSum = 0;
            int oddSum = 0;

            for (int j = 1; j <= 6; j++) {
                if (j % 2 == 0) evenSum += n % 10;
                else oddSum += n % 10;
                n = n / 10;
            }
            if (evenSum == oddSum) System.out.print(i + " ");
        }
    }
}
