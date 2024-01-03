import java.util.Scanner;

public class Deposit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double deposit = Double.parseDouble(scan.nextLine());
        int date = Integer.parseInt(scan.nextLine());
        double percent = Double.parseDouble(scan.nextLine());
        double sum = deposit + date * ((deposit * (percent/100)) / 12);
        System.out.println(sum);
    }
}
