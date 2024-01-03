import java.util.Scanner;

public class ProgrammingBook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double price1Page = Double.parseDouble(scan.nextLine());
        double price1Cover = Double.parseDouble(scan.nextLine());
        int discountPercent = Integer.parseInt(scan.nextLine());
        double priceDesign = Double.parseDouble(scan.nextLine());
        int teamPercent = Integer.parseInt(scan.nextLine());

        double bookPrice = (price1Page * 899) + (price1Cover * 2);
        bookPrice -= bookPrice * (discountPercent * 1.0/ 100);
        double totalCost = bookPrice + priceDesign;
        totalCost -= totalCost * (teamPercent * 1.0/ 100);

        System.out.printf("Avtonom should pay %.2f BGN.", totalCost);
    }
}
