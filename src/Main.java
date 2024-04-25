import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int max = 100;
        startApp(scanner, random, max);
    }

    public static int getRandomNumber(Random random, int max) {
        return random.nextInt(max) + 1;
    }

    public static void startApp(Scanner scanner, Random random, int max) {
        int randomNumber = getRandomNumber(random, max);

        while (true) {
            System.out.println("Bir reqem texmin edin (1-100 arasi):");
            int userGuess = scanner.nextInt();
            boolean isRightGuess = printAnswer(userGuess, randomNumber);
            if (isRightGuess) break;
        }
    }

    public static boolean printAnswer(int userGuess, int randomNumber) {
        if (userGuess == randomNumber) {
            System.out.println("Tebrikler! Dogru texmin etdiniz.");
        } else if (userGuess < randomNumber) {
            System.out.println("Biraz daha boyuk bir reqem daxil edin.");
        } else {
            System.out.println("Biraz daha kichik bir reqem daxil edin.");
        }

        return  userGuess == randomNumber;
    }
}
