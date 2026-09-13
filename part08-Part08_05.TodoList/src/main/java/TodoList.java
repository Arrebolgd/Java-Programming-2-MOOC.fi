import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> todoListItems;

    public TodoList(){
        todoListItems = new ArrayList<>();
    }

    public void add(String task){
        todoListItems.add(task);
    }

    public void print(){
        for (int i = 0; i < todoListItems.size(); i++) {
            System.out.println((i+1) + ": " + todoListItems.get(i));
        }
    }

    public void remove(int number){
        todoListItems.remove(number-1);
    }
}
