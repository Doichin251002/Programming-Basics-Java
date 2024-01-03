package October2021;

import java.util.Scanner;

public class EasterBattle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int eggs1 = Integer.parseInt(scan.nextLine());
        int eggs2 = Integer.parseInt(scan.nextLine());
        String command = scan.nextLine();

        while (!command.equals("End")) {
            if (command.equals("one")) eggs2--;
            else if (command.equals("two")) eggs1--;

            if (eggs1 == 0 || eggs2 == 0) break;
            command = scan.nextLine();
        }

        if (command.equals("End")) System.out.printf("Player one has %d eggs left.%n" +
                "Player two has %d eggs left.", eggs1, eggs2);
        else if (eggs1 == 0) System.out.printf("Player one is out of eggs. Player two has %d eggs left.", eggs2);
        else System.out.printf("Player two is out of eggs. Player one has %d eggs left.", eggs1);
    }
}
