package June2021;

import java.util.Scanner;

public class Safari {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        double litersFuel = Double.parseDouble(scan.nextLine());
        String day = scan.nextLine();

        double cost = (litersFuel * 2.1) + 100.0;
        if (day.equals("Saturday")) cost -= cost * 0.1;
        else if (day.equals("Sunday")) cost -= cost * 0.2;

        if (cost <= budget) System.out.printf("Safari time! Money left: %.2f lv.", Math.abs(cost - budget));
        else System.out.printf("Not enough money! Money needed: %.2f lv.", Math.abs(cost - budget));
    }
}
