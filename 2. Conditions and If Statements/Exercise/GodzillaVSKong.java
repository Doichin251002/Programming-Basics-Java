import java.util.Scanner;

public class GodzillaVSKong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        int statists = Integer.parseInt(scan.nextLine());
        double priceClothes = Double.parseDouble(scan.nextLine());

        double sumClothes = priceClothes * statists;
        double decor = budget * 0.1;

        if (statists > 150) sumClothes = sumClothes - 0.1 * sumClothes;

        double totalSum = decor + sumClothes;

        if (budget >= totalSum)
            System.out.printf("Action! %n Wingard starts filming with %.2f leva left.", budget - totalSum);
        else
            System.out.printf("Not enough money! %n Wingard needs %.2f leva more.", totalSum - budget);
    }
}
