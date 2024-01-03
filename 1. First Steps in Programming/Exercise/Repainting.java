import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nylon = Integer.parseInt(scan.nextLine());
        int paint= Integer.parseInt(scan.nextLine());
        int thinner = Integer.parseInt(scan.nextLine());
        int hours = Integer.parseInt(scan.nextLine());

        double sumMaterials = ((nylon + 2) * 1.5) + ((paint + 0.1 * paint) * 14.5) + (thinner * 5)+ 0.4;
        double sumWorkman = sumMaterials * 0.3 * hours;
        double totalsum = sumMaterials + sumWorkman;
        System.out.println(totalsum);
    }
}
