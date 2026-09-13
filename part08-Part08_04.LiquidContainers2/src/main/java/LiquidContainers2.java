
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container conOne = new Container();
        Container conTwo = new Container();

        while (true) {
            System.out.println("First: " + conOne);
            System.out.println("Second: " + conTwo);
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] splitInput = input.split(" ");
            String command = splitInput[0];
            int quantity = Integer.valueOf(splitInput[1]);

            switch (command) {
                case "add":
                    conOne.add(quantity);
                    break;

                case "remove":
                    conTwo.remove(quantity);
                    break;

                case "move":
                    if(conOne.contains() - quantity >= 0){
                        conTwo.add(quantity);
                        conOne.remove(quantity);

                    }else if(conOne.contains() - quantity < 0){
                        conTwo.add(conOne.contains());
                        conOne.remove(quantity);
                    }
                    break;

                default:
                    break;
            }

        }
    }

}
