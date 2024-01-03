import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double needMoney = Double.parseDouble(scan.nextLine());
        double currentMoney = Double.parseDouble(scan.nextLine());
        int countSpendDays = 0;
        int totalDays = 0;
        boolean cantSaveMoney = false;

        while (currentMoney < needMoney) {
            totalDays++;
            String command = scan.nextLine();
            double money = Double.parseDouble(scan.nextLine());
            switch (command) {
                case "save":
                    currentMoney += money;
                    countSpendDays = 0;
                    break;
                case "spend":
                    currentMoney -= money;
                    countSpendDays++;
                    if (currentMoney < 0) currentMoney = 0;
                    break;
            }
            if (countSpendDays == 5) {
                cantSaveMoney = true;
                break;
            }
        }

        if (cantSaveMoney) System.out.printf("You can't save the money.%n" +
                "%d", totalDays);
        else System.out.printf("You saved the money for %d days.", totalDays);
    }
}
