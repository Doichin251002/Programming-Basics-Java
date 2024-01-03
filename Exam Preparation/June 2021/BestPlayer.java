package June2021;

import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();

        String bestPlayer = "";
        int maxPoints = Integer.MIN_VALUE;
        boolean isHatTrick = false;

        while (!command.equals("END")) {
            String player = command;
            int points = Integer.parseInt(scan.nextLine());
            if (points > maxPoints) {
                bestPlayer = player;
                maxPoints = points;
            }
            if (points >= 3) isHatTrick = true;
            if (points >= 10) break;
            command = scan.nextLine();
        }
        System.out.printf("%s is the best player!%n", bestPlayer);
        if (isHatTrick)
            System.out.printf("He has scored %d goals and made a hat-trick !!!", maxPoints);
        else System.out.printf("He has scored %d goals.", maxPoints);
    }
}
