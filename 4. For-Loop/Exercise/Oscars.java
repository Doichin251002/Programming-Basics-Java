import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nameActor = scan.nextLine();
        double points = Double.parseDouble(scan.nextLine());
        int jury = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= jury; i++) {
            String nameJury = scan.nextLine();
            double pointsJury = Double.parseDouble(scan.nextLine());
            points += (nameJury.length() * pointsJury) / 2;
            if (points > 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", nameActor, points);
                break;
            }
        }
        if (points < 1250.5) System.out.printf("Sorry, %s you need %.1f more!", nameActor, 1250.5 - points);
    }
}
