import java.util.Scanner;

public class EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pow = Integer.parseInt(scan.nextLine());
        for (int i = 0; i <= pow; i++) {
            if (i % 2 == 0) {
                int num = (int) Math.pow(2, i);
                System.out.println(num);
            }
        }
    }
}
