import java.util.Scanner;

public class CatLife {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String breed = scan.nextLine();
        char gender = scan.next().charAt(0);

        int years = 0;
        boolean isBreed = true;

        if (gender == 'm') {
            switch (breed) {
                case "British Shorthair":
                    years = 13;
                    break;
                case "Siamese":
                    years = 15;
                    break;
                case "Persian":
                    years = 14;
                    break;
                case "Ragdoll":
                    years = 16;
                    break;
                case "American Shorthair":
                    years = 12;
                    break;
                case "Siberian":
                    years = 11;
                    break;
                default:
                    isBreed = false;
                    System.out.printf("%s is invalid cat!", breed);
                    break;
            }
        } else {
                switch (breed) {
                    case "British Shorthair":
                        years = 14;
                        break;
                    case "Siamese":
                        years = 16;
                        break;
                    case "Persian":
                        years = 15;
                        break;
                    case "Ragdoll":
                        years = 17;
                        break;
                    case "American Shorthair":
                        years = 13;
                        break;
                    case "Siberian":
                        years = 12;
                        break;
                    default:
                        isBreed = false;
                        System.out.printf("%s is invalid cat!", breed);
                        break;
                }
            }
        int humanYears = years * 12;
        int catYears = humanYears / 6;

        if (isBreed) System.out.printf("%d cat months", catYears);
        }
    }
