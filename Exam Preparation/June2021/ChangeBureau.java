package June2021;

import java.util.Scanner;

public class ChangeBureau {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countBitcoin = Integer.parseInt(scan.nextLine());
        double yuan = Double.parseDouble(scan.nextLine());
        double commission = Double.parseDouble(scan.nextLine());

        double Bit_BGN = countBitcoin * 1168;
        double CNY_USD = yuan * 0.15;
        double USD_BGN = CNY_USD * 1.76;
        double BGN_EUR = (Bit_BGN + USD_BGN) / 1.95;

        double moneyCommission = BGN_EUR * (commission / 100);
        double totalMoney = BGN_EUR - moneyCommission;
        System.out.printf("%.2f", totalMoney);
    }
}
