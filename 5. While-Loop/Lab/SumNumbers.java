import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int endNum = Integer.parseInt(scan.nextLine());
        int sum = 0;

        while (sum < endNum) {
            int num = Integer.parseInt(scan.nextLine());
            sum += num;
        }
        System.out.println(sum);
    }
}
