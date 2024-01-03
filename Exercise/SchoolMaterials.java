import java.util.Scanner;

public class SchoolMaterials {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int chemical = Integer.parseInt(scan.nextLine());
        int marker = Integer.parseInt(scan.nextLine());
        int literPreparation = Integer.parseInt(scan.nextLine());
        double discount = Double.parseDouble(scan.nextLine());

        double sum = (chemical * 5.8) + (marker * 7.2) + (literPreparation * 1.2);
        double totalSum = sum - (sum * (discount / 100));
        System.out.println(totalSum);
    }
}
