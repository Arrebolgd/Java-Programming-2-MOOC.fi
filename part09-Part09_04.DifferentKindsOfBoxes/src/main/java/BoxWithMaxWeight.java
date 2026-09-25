import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {

    private ArrayList<Item> itemList;
    private int capacity;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        itemList = new ArrayList<>();
    }

    public void add(Item item) {
        if (item == null)
            return;

        int currentCapacity = 0;
        for (Item containedItem : itemList) {
            currentCapacity += containedItem.getWeight();
        }

        if ((capacity - currentCapacity) >= item.getWeight()) itemList.add(item);
        
    }

    public boolean isInBox(Item item){
        if(item == null) return false;
        return itemList.contains(item);
    }
}
