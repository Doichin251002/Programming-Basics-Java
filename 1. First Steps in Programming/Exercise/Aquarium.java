import java.util.Scanner;

public class Aquarium {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        double percent = Double.parseDouble(scan.nextLine());

        double volume = (length * width * height) * 0.001;
        double freeArea = 1 - (percent / 100);
        double liters = volume * freeArea;
        System.out.println(liters);
    }
}
