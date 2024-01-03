import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String serial = scan.nextLine();
        int serialTime = Integer.parseInt(scan.nextLine());
        int breakTime = Integer.parseInt(scan.nextLine());

        double lunchTime = breakTime / 8.0;
        double relaxTime = breakTime / 4.0;

        double freeTime = breakTime - lunchTime - relaxTime;

        double difference = Math.abs(freeTime - serialTime);

        if (freeTime >= serialTime)
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",
                    serial, Math.ceil(difference));
        else System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",
                serial, Math.ceil(difference));
    }
}
