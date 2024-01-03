import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        String destination = "";
        String vacation = "";

        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                vacation = "Camp";
                budget = budget * 0.3;
            }
            else if (season.equals("winter")) {
                vacation = "Hotel";
                budget = budget * 0.7;
            }
        }
        else if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                vacation = "Camp";
                budget = budget * 0.4;
            }
            else if (season.equals("winter")) {
                vacation = "Hotel";
                budget = budget * 0.8;
            }
        }
        else if (budget > 1000) {
            destination = "Europe";
            vacation = "Hotel";
            budget = budget * 0.9;
        }
        System.out.printf("Somewhere in %s %n", destination);
        System.out.printf("%s - %.2f", vacation, budget);
    }
}
