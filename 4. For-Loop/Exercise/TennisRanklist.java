import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tourneys = Integer.parseInt(scan.nextLine());
        int totalpoints = Integer.parseInt(scan.nextLine());
        int pointsW = 0;
        int pointsF = 0;
        int pointsSF = 0;
        int winTourneys = 0;

        for (int i = 1; i <= tourneys; i++) {
            String place = scan.nextLine();
            switch (place) {
                case "W":
                    pointsW += 2000;
                    winTourneys++;
                    break;
                case "F":
                    pointsF += 1200;
                    break;
                case "SF":
                    pointsSF += 720;
                    break;
            }
        }
        
        System.out.printf("Final points: %d%n", totalpoints + pointsW + pointsF + pointsSF);
        System.out.printf("Average points: %d%n", (pointsW + pointsF + pointsSF) / tourneys);
        System.out.printf("%.2f%%", winTourneys * 1.0 / tourneys * 100);
    }
}
