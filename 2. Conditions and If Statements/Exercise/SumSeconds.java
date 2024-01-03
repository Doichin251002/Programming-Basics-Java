import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstTime = Integer.parseInt(scan.nextLine());
        int secondTime = Integer.parseInt(scan.nextLine());
        int thirdTime = Integer.parseInt(scan.nextLine());

        int totalTime = firstTime + secondTime + thirdTime;

        int min = totalTime / 60;
        int sec = totalTime % 60;

        System.out.printf("%d", min);
        if (sec < 10) System.out.printf(":0%d", sec);
        else System.out.printf(":%d", sec);
    }
}
