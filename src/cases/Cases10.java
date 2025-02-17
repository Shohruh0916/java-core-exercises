package cases;

import java.util.Scanner;

public class Cases10 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                char direction = scanner.next().charAt(0);
                int K = scanner.nextInt();
                char[] directions = {'s', 'q', 'j', 'g'};
                int index = new String(directions).indexOf(direction);
                while (K-- > 0) {
                    int cmd = scanner.nextInt();
                    switch (cmd) {
                        case 1:
                            index = (index + 3) % 4;
                            break;
                        case 2:
                            index = (index + 1) % 4;
                            break;
                    }
                }

                System.out.println(directions[index]);
            }
        }


