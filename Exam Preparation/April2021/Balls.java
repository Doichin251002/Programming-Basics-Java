package April2021;

import java.util.Scanner;

public class Balls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = Integer.parseInt(scan.nextLine());
        String color = "";
        int points = 0;
        int redBalls = 0;
        int orangeBalls = 0;
        int yellowBalls = 0;
        int whiteBalls = 0;
        int blackBalls = 0;
        int otherBalls = 0;

        for (int i = count; i > 0; i--) {
            color = scan.nextLine();
            switch (color) {
                case "red":
                    redBalls++;
                    points += 5;
                    break;
                case "orange":
                    orangeBalls++;
                    points += 10;
                    break;
                case "yellow":
                    yellowBalls++;
                    points += 15;
                    break;
                case "white":
                    whiteBalls++;
                    points += 20;
                    break;
                case "black":
                    blackBalls++;
                    points /= 2;
                    break;
                default:
                    otherBalls++;
                    break;
            }
        }
        System.out.printf("Total points: %d%n", points);
        System.out.printf("Red balls: %d%n", redBalls);
        System.out.printf("Orange balls: %d%n", orangeBalls);
        System.out.printf("Yellow balls: %d%n", yellowBalls);
        System.out.printf("White balls: %d%n", whiteBalls);
        System.out.printf("Other colors picked: %d%n", otherBalls);
        System.out.printf("Divides from black balls: %d", blackBalls);
    }
}
