import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tax = Integer.parseInt(scan.nextLine());

        double shoes = tax * 0.6;
        double kit = shoes * 0.8;
        double ball = kit / 4;
        double accessories = ball / 5;

        double totalsum = tax + shoes + kit + ball + accessories;
        System.out.println(totalsum);
    }
}
