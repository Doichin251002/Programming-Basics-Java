import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int chicken = Integer.parseInt(scan.nextLine());
        int fish = Integer.parseInt(scan.nextLine());
        int vege = Integer.parseInt(scan.nextLine());

        double menu = (chicken * 10.35) + (fish * 12.40) + (vege * 8.15);
        double dessert = menu * 0.2;
        double totalSum = menu + dessert + 2.5;
        System.out.println(totalSum);
    }
}
