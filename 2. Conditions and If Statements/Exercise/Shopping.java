import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        int videoCards = Integer.parseInt(scan.nextLine());
        int processors = Integer.parseInt(scan.nextLine());
        int ram = Integer.parseInt(scan.nextLine());

        double sumVideoCards = videoCards * 250;
        double sumProcessors = sumVideoCards * 0.35 * processors;
        double sumRam = sumVideoCards * 0.1 * ram;

        double sum = sumVideoCards + sumProcessors + sumRam;

        if (videoCards > processors) sum = sum - 0.15 * sum;

        if (budget >= sum) System.out.printf("You have %.2f leva left!", budget - sum);
        else System.out.printf("Not enough money! You need %.2f leva more!", sum - budget);
    }
}
