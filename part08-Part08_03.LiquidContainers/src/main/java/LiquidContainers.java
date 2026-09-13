
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {

        int containerOne = 0;
        int containerTwo = 0;
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("First: " + containerOne + "/100");
            System.out.println("Second: " + containerTwo + "/100");

            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] splitInput = input.split(" ");
            String command = splitInput[0];

            int quantity = Integer.valueOf(splitInput[1]);

            switch (command.toLowerCase()) {
                case "add":
                    if (quantity > 0) {
                        if (containerOne + quantity <= 100) {
                            containerOne += quantity;
                        } else if (containerOne + quantity > 100) {
                            containerOne = 100;
                        }
                    }
                    break;

                case "move":
                    if (quantity > 0 && containerOne > 0) {
                        if (containerOne - quantity > 0 && containerTwo + quantity <= 100) {
                            containerOne -= quantity;
                            containerTwo += quantity;

                        } else if (containerOne - quantity > 0 && containerTwo + quantity > 100) {
                            containerOne -= quantity;
                            containerTwo = 100;
                        } else if (containerOne - quantity <= 0 && containerTwo + containerOne <= 100) {
                            containerTwo += containerOne;
                            containerOne = 0;
                        } else if (containerOne - quantity <= 0 && containerTwo + containerOne > 100) {
                            containerTwo = 100;
                            containerOne = 0;
                        }
                    }
                    break;

                case "remove":
                    if (quantity > 0) {
                        if (containerTwo - quantity >= 0) {
                            containerTwo -= quantity;
                        } else if (containerTwo - quantity < 0) {
                            containerTwo = 0;
                        }
                    }
                    break;

                default:
                    break;
            }
        }

        scan.close();
    }
}
