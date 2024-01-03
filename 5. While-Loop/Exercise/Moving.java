import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        int freeSpace = length * width * height;
        String command = scan.nextLine();

        while (!command.equals("Done")) {
            int box = Integer.parseInt(command);
            freeSpace -= box;
            if (freeSpace < 0) break;
            command = scan.nextLine();
        }
        
        if (freeSpace < 0) System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(freeSpace));
        else System.out.printf("%d Cubic meters left.", freeSpace);
    }
}
