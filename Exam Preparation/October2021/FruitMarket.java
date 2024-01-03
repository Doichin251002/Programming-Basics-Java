package October2021;

import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double strawberryPrice = Double.parseDouble(scan.nextLine());
        double countBanana = Double.parseDouble(scan.nextLine());
        double countOrange = Double.parseDouble(scan.nextLine());
        double countRaspberry = Double.parseDouble(scan.nextLine());
        double countStrawberry = Double.parseDouble(scan.nextLine());

        double raspberryPrice = strawberryPrice / 2;
        double orangePrice = raspberryPrice - (raspberryPrice * 0.4);
        double bananaPrice = raspberryPrice - (raspberryPrice * 0.8);

        double totalCost = (strawberryPrice * countStrawberry) + (raspberryPrice * countRaspberry) + (orangePrice * countOrange) +
                           (bananaPrice * countBanana);
        System.out.printf("%.2f", totalCost);
    }
}
