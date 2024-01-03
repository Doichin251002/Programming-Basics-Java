package June2022;

import java.util.Scanner;

public class SeriesCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String serial = scan.nextLine();
        int seasons = Integer.parseInt(scan.nextLine());
        int episodes = Integer.parseInt(scan.nextLine());
        double time = Double.parseDouble(scan.nextLine());

        double publicityTime = time * 0.2;
        double serialTime = publicityTime + time;
        int specialEpisodesTime = seasons * 10;

        double totalTime = seasons * serialTime * episodes + specialEpisodesTime;
        System.out.printf("Total time needed to watch the %s series is %.0f minutes.", serial, Math.floor(totalTime));
    }
}