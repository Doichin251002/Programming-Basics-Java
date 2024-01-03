package June2021;

import java.util.Scanner;

public class ChristmasTournament {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());

        int allWinGames = 0;
        int allLoseGames = 0;
        double totalMoney = 0;

        for (int i = 1; i <= days; i++) {
            String command = scan.nextLine();
            double moneyForDay = 0;
            int winGames = 0;
            int loseGames = 0;

            while (!command.equals("Finish")) {
                String res = scan.nextLine();
                if (res.equals("win")) {
                    winGames++;
                    allWinGames++;
                    moneyForDay += 20;
                } else {
                    loseGames++;
                    allLoseGames++;
                }
                command = scan.nextLine();
            }

            if (winGames > loseGames) moneyForDay += moneyForDay * 0.1;

            totalMoney += moneyForDay;
        }
        if (allWinGames > allLoseGames) {
            totalMoney += totalMoney * 0.2;
            System.out.printf("You won the tournament! Total raised money: %.2f", totalMoney);
        }
        else System.out.printf("You lost the tournament! Total raised money: %.2f", totalMoney);
    }
}
