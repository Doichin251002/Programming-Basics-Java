import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countProcessors = Integer.parseInt(scan.nextLine());
        int countWorkers = Integer.parseInt(scan.nextLine());
        int workDays = Integer.parseInt(scan.nextLine());

        int totalHours = countWorkers * workDays * 8;
        int madeProcessors = totalHours / 3;
        boolean isProfit = false;

        if (madeProcessors >= countProcessors) {
            isProfit = true;
        }

        if (isProfit) {
            System.out.printf("Profit: -> %.2f BGN", Math.abs(madeProcessors - countProcessors) * 110.10);
        }
        else System.out.printf("Losses: -> %.2f BGN", Math.abs(madeProcessors - countProcessors) * 110.10);
    }
}
