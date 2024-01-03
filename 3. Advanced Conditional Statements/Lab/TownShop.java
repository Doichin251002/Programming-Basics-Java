import java.util.Scanner;

public class TownShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String product = scan.nextLine();
        String town = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());
        double price = 0;
        if ("coffee".equals(product)) {
            if ("Sofia".equals(town)) price = 0.5 * quantity;
            else if ("Plovdiv".equals(town)) price = 0.4 * quantity;
            else if ("Varna".equals(town)) price = 0.45 * quantity;
        }
        else if ("water".equals(product)) {
            if ("Sofia".equals(town)) price = 0.8 * quantity;
            else if ("Plovdiv".equals(town) || "Varna".equals(town)) price = 0.7 * quantity;
        }
        else if ("beer".equals(product)) {
            if ("Sofia".equals(town)) price = 1.2 * quantity;
            else if ("Plovdiv".equals(town)) price = 1.15 * quantity;
            else if ("Varna".equals(town)) price = 1.1 * quantity;
        }
        else if ("sweets".equals(product))
        {
            if ("Sofia".equals(town)) price = 1.45 * quantity;
            else if ("Plovdiv".equals(town)) price = 1.3 * quantity;
            else if ("Varna".equals(town)) price = 1.35 * quantity;
        }
        else if ("peanuts".equals(product))
        {
            if ("Sofia".equals(town)) price = 1.6 * quantity;
            else if ("Plovdiv".equals(town)) price = 1.5 * quantity;
            else if ("Varna".equals(town)) price = 1.55 * quantity;
        }
        System.out.println(price);
    }
}
