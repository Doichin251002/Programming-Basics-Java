import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = Integer.parseInt(scan.nextLine());
        int totalClimbers = 0;
        int musala = 0;
        int monblanc = 0;
        int kilimanjaro = 0;
        int k2 = 0;
        int everest = 0;

        for (int i = 1; i <= count; i++) {
            int group = Integer.parseInt(scan.nextLine());
            if (group <= 5) musala += group;
            else if (group <= 12) monblanc += group;
            else if (group <= 25) kilimanjaro += group;
            else if (group <= 40) k2 += group;
            else everest += group;

            totalClimbers += group;
        }

        System.out.printf("%.2f%%%n", musala * 1.0 / totalClimbers * 100);
        System.out.printf("%.2f%%%n", monblanc * 1.0 / totalClimbers * 100);
        System.out.printf("%.2f%%%n", kilimanjaro * 1.0 / totalClimbers * 100);
        System.out.printf("%.2f%%%n", k2 * 1.0 / totalClimbers * 100);
        System.out.printf("%.2f%%", everest * 1.0 / totalClimbers * 100);
    }
}
