import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String destination = scan.nextLine();
        boolean isSaved = false;

        while (!destination.equals("End")) {
            double minBudget = Double.parseDouble(scan.nextLine());
            double totalMoney = 0;
            while (totalMoney < minBudget) {
                double currentMoney = Double.parseDouble(scan.nextLine());
                totalMoney += currentMoney;
                if (totalMoney >= minBudget) isSaved = true;
            }

            if (isSaved) System.out.printf("Going to %s!%n", destination);
            destination = scan.nextLine();
        }
    }
}
