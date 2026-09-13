
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double average = 0;
        int numOfInputs = 0;
        
        int currentNumber = 0;
        while (true) {
            currentNumber = Integer.valueOf(scanner.nextLine());
            if (currentNumber == 0) {
                break;
            }
            if (currentNumber > 0) {
                average += currentNumber;
                numOfInputs++;
            }

        }

        if (average > 0) {
            System.out.println(average / numOfInputs);
        }else {
            System.out.println("Cannot calculate the average");
        }
    }
}
