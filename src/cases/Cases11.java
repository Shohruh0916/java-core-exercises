package cases;

import java.util.Scanner;

public class Cases11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lokatrning boshlang'ich yo'nalishini kiriting (0-shimol, 1-sharq, 2-janub, 3-g'arb): ");
        int startDirection = scanner.nextInt();
        System.out.print("Buyruqlarni kiriting (0-o'ngga, 1-chapga, 2-180 burilish): ");
        int commands = scanner.nextInt();
        int currentDirection = startDirection;
        while (commands > 0) {
            int command = commands % 10;
            commands /= 10;
            switch (command) {
                case 0:
                    currentDirection = (currentDirection + 1) % 4;
                    break;
                case 1:
                    currentDirection = (currentDirection + 3) % 4;
                    break;
                case 2:
                    currentDirection = (currentDirection + 2) % 4;
                    break;
            }
        }
        System.out.println("Lokatrning yakuniy yo'nalishi: " + currentDirection);
    }
}


