import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        if (num != 0 && num >= -100 && num <= 100) System.out.println("Yes");
        else System.out.println("No");
    }
}