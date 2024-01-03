import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double record = Double.parseDouble(scan.nextLine());
        double distance = Double.parseDouble(scan.nextLine());
        double time1meter = Double.parseDouble(scan.nextLine());

        double time = distance * time1meter;

        double slowDown = Math.floor(distance / 15) * 12.5;

        double totalTime = time + slowDown;

        if (totalTime < record) System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        else System.out.printf("No, he failed! He was %.2f seconds slower.", totalTime - record);
    }
}
