import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String project = scan.nextLine();
        int rolls = Integer.parseInt(scan.nextLine());
        int cols = Integer.parseInt(scan.nextLine());
        double price = 0;

        if (project.equals("Premiere")) price = 12;
        else if (project.equals("Normal")) price = 7.5;
        else if (project.equals("Discount")) price = 5;

        double cost = price * rolls * cols;
        System.out.printf("%.2f leva", cost);
    }
}
