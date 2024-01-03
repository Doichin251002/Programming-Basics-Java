package April2021;

import java.util.Scanner;

public class EasterContest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = Integer.parseInt(scan.nextLine());
        int maxRate = Integer.MIN_VALUE;
        String winnerBaker = "";

        for (int i = 1; i <= count; i++) {
            String baker = scan.nextLine();
            String command = scan.nextLine();
            int totalPoints = 0;
            while (!command.equals("Stop")) {
                int rate = Integer.parseInt(command);
                totalPoints += rate;
                command = scan.nextLine();
            }
            System.out.printf("%s has %d points.%n", baker, totalPoints);

            if (totalPoints > maxRate) {
                maxRate = totalPoints;
                winnerBaker = baker;
                System.out.printf("%s is the new number 1!%n", baker);
            }
        }
        System.out.printf("%s won competition with %d points!", winnerBaker, maxRate);
    }
}
