import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String figure = scan.nextLine();
        double area = 0;
        switch (figure) {
            case "square" -> {
                double length = Double.parseDouble(scan.nextLine());
                area = Math.pow(length, 2);
            }
            case "rectangle" -> {
                double lengthA = Double.parseDouble(scan.nextLine());
                double lengthB = Double.parseDouble(scan.nextLine());
                area = lengthA * lengthB;
            }
            case "circle" -> {
                double rad = Double.parseDouble(scan.nextLine());
                area = Math.PI * rad * rad;
            }
            case "triangle" -> {
                double length = Double.parseDouble(scan.nextLine());
                double high = Double.parseDouble(scan.nextLine());
                area = (length * high) / 2;
            }
        }
        System.out.printf("%.3f", area);
    }
}
