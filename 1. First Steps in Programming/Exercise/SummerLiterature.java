import java.util.Scanner;

public class SummerLiterature {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pages = Integer.parseInt(scan.nextLine());
        int pagesFor1Hour = Integer.parseInt(scan.nextLine());
        int days = Integer.parseInt(scan.nextLine());

        int totalTime = (pages / pagesFor1Hour) / days;
        System.out.println(totalTime);
    }
}
