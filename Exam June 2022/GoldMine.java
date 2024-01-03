import java.util.Scanner;

public class GoldMine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int locations = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= locations; i++) {
            double avProduction = Double.parseDouble(scan.nextLine());
            int days = Integer.parseInt(scan.nextLine());
            double totalProduction = 0;

            for (int j = 1; j <= days; j++) {
                double dayProduction = Double.parseDouble(scan.nextLine());
                totalProduction += dayProduction;
            }
            totalProduction /= days;

            if (totalProduction >= avProduction) {
                System.out.printf("Good job! Average gold per day: %.2f.%n", totalProduction);
            }
            else System.out.printf("You need %.2f gold.%n", avProduction - totalProduction);
        }
    }
}
