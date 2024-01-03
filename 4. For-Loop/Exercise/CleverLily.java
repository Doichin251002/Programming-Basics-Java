import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = Integer.parseInt(scan.nextLine());
        double washMachinePrice = Double.parseDouble(scan.nextLine());
        double toyPrice = Double.parseDouble(scan.nextLine());
        double savingsMoney = 0;
        double savingsToys = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) savingsMoney = savingsMoney + (i * 5 - 1);
            else savingsToys += toyPrice;
        }

        double totalSavings = savingsMoney + savingsToys;
        if (totalSavings >= washMachinePrice) System.out.printf("Yes! %.2f", totalSavings - washMachinePrice);
        else System.out.printf("No! %.2f", washMachinePrice - totalSavings);
    }
}
