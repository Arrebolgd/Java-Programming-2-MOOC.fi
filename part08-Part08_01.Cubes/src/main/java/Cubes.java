
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String userInput = scanner.nextLine();

            if(userInput.equalsIgnoreCase("end")){
                break;
            }
            if(isInt(userInput)){
                int number = Integer.valueOf(userInput);

                System.out.println(number * number * number);
            } else {
                System.out.println("NaN");
            }


        }

        scanner.close();
    }

    public static boolean isInt(String userInput){
        try {
            Integer.valueOf(userInput);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
