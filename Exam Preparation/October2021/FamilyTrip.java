package October2021;

import java.util.Scanner;

public class FamilyTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        int nights = Integer.parseInt(scan.nextLine());
        double priceNight = Double.parseDouble(scan.nextLine());
        int expensePercent = Integer.parseInt(scan.nextLine());

        double costBooking = priceNight * nights;

        if (nights > 7) costBooking -= (costBooking * 0.05);

        double expense = budget * (expensePercent / 100.0);
        double totalCost = costBooking + expense;

        if (totalCost <= budget) System.out.printf("Ivanovi will be left with %.2f leva after vacation.", Math.abs(budget - totalCost));
        else System.out.printf("%.2f leva needed.", Math.abs(budget - totalCost));
    }
}
