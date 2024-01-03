import java.util.Scanner;

public class Time15Minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = Integer.parseInt(scan.nextLine());
        int min = Integer.parseInt(scan.nextLine());

        int totalMin = hour * 60 + min + 15;
        hour = totalMin / 60;
        min = totalMin % 60;

        if (hour > 23) hour = 0;
        if (min < 10) System.out.printf("%d:0%d", hour, min);
        else System.out.printf("%d:%d", hour, min);
    }
}
