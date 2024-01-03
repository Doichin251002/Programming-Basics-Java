import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        int fishermen = Integer.parseInt(scan.nextLine());
        double price = 0;
        double discount = 0;

        switch (season) {
            case "Spring":
                price = 3000;
                break;
            case "Summer":
            case "Autumn":
                price = 4200;
                break;
            case "Winter":
                price = 2600;
                break;
        }

        if (fishermen <= 6) discount = 0.9;
        else if (fishermen <= 11) discount = 0.85;
        else if (fishermen > 12) discount = 0.75;

        if (!season.equals("Autumn") && (fishermen % 2 == 0)) discount = discount * 0.95;

        double cost = price * discount;
        if (budget >= cost) System.out.printf("Yes! You have %.2f leva left.", budget - cost);
        else System.out.printf("Not enough money! You need %.2f leva.", cost - budget);
    }
}
