import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fruit = scan.nextLine();
        String day = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());
        double price = 0;

        boolean isWorkingDay = day.equals("Monday") ||
                day.equals("Tuesday") ||
                day.equals("Wednesday") ||
                day.equals("Thursday") ||
                day.equals("Friday");

        boolean isWeekend = day.equals("Saturday") ||
                day.equals("Sunday");

        boolean isValid = true;
        if (isWorkingDay) {

            if (fruit.equals("banana")) {
                price = 2.5;
            } else if (fruit.equals("apple")) {
                price = 1.2;
            } else if (fruit.equals("orange")) {
                price = 0.85;
            } else if (fruit.equals("grapefruit")) {
                price = 1.45;
            } else if (fruit.equals("kiwi")) {
                price = 2.7;
            } else if (fruit.equals("pineapple")) {
                price = 5.5;
            } else if (fruit.equals("grapes")) {
                price = 3.85;
            } else isValid = false;
        } else if (isWeekend) {
            if (fruit.equals("banana")) {
                price = 2.7;
            } else if (fruit.equals("apple")) {
                price = 1.25;
            } else if (fruit.equals("orange")) {
                price = 0.90;
            } else if (fruit.equals("grapefruit")) {
                price = 1.60;
            } else if (fruit.equals("kiwi")) {
                price = 3.0;
            } else if (fruit.equals("pineapple")) {
                price = 5.6;
            } else if (fruit.equals("grapes")) {
                price = 4.2;
            } else isValid = false;

        }
        else isValid = false;

        double cost = price * quantity;
        if (isValid) System.out.printf("%.2f", cost);
        else System.out.println("error");
    }
}
