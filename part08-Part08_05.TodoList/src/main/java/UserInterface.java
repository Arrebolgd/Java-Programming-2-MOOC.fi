import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private TodoList list;

    public UserInterface(TodoList list, Scanner scanner) {
        this.scanner = scanner;
        this.list = list;
    }

    public void start() {

        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();

            switch (command) {
                case "stop":
                    return;

                case "add":
                    System.out.println("To add: ");
                    String task = scanner.nextLine();
                    add(task);
                    break;

                case "list":
                    list();
                    break;

                case "remove":
                    System.out.println("Which one is removed? ");
                    int index = Integer.valueOf(scanner.nextLine());
                    remove(index);
                    break;
                    
                default:
                    break;
            }

        }
    }

    public void add(String task){
        list.add(task);
    }

    public void remove(int index){
        list.remove(index);
    }

    public void list(){
        list.print();
    }
}
