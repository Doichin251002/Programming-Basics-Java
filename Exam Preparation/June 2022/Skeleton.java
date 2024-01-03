package June2022;

import java.util.Scanner;

public class Skeleton {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = Integer.parseInt(scan.nextLine());
        int sec = Integer.parseInt(scan.nextLine());
        double length = Double.parseDouble(scan.nextLine());
        int sec100Meters = Integer.parseInt(scan.nextLine());

        double totalSeconds = min * 60 + sec;
        double reducingTime = (length / 120) * 2.5;
        double participantTime = (length / 100) * sec100Meters - reducingTime;

        if (participantTime <= totalSeconds) {
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.", participantTime);
        }
        else System.out.printf("No, Marin failed! He was %.3f second slower.", participantTime - totalSeconds);
    }
}
