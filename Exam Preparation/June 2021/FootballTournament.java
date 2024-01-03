package June2021;

import java.util.Scanner;

public class FootballTournament {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String teamName = scan.nextLine();
        int games = Integer.parseInt(scan.nextLine());

        String res;
        int points = 0;
        int winsCount = 0;
        int deucesCount = 0;
        int losesCount = 0;

        for (int i = 1; i <= games; i++) {
            res = scan.nextLine();
            if (res.equals("W")) {
                winsCount++;
                points += 3;
            }
            else if (res.equals("D")) {
                deucesCount++;
                points += 1;
            }
            else losesCount++;
        }
        double ratePercent = (winsCount * 1.0 / games) * 100;

        if (games == 0) System.out.printf("%s hasn't played any games during this season.", teamName);
        else {
            System.out.printf("%s has won %d points during this season.%n", teamName, points);
            System.out.printf("Total stats:%n## W: %d%n## D: %d%n## L: %d%n", winsCount, deucesCount, losesCount);
            System.out.printf("Win rate: %.2f%%", ratePercent);
        }
    }
}
