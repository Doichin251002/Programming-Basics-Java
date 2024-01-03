import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double holiday = Double.parseDouble(scan.nextLine());

        int puzzles = Integer.parseInt(scan.nextLine());
        int dolls = Integer.parseInt(scan.nextLine());
        int teddyBears = Integer.parseInt(scan.nextLine());
        int minions = Integer.parseInt(scan.nextLine());
        int trucks = Integer.parseInt(scan.nextLine());

        int totalToys = puzzles + dolls + teddyBears + minions + trucks;

        double sum = (puzzles * 2.60) + (dolls * 3) + (teddyBears * 4.1) +
                (minions * 8.2) + (trucks * 2);

        if (totalToys >= 50) sum = sum - 0.25 * sum;

        double totalSum = sum - 0.1 * sum;

        if (totalSum >= holiday) System.out.printf("Yes! %.2f lv left.", totalSum - holiday);
        else System.out.printf("Not enough money! %.2f lv needed.", holiday - totalSum);
    }
}
