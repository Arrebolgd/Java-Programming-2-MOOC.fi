import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> unitList;

    public StorageFacility() {
        unitList = new HashMap<>();
    }

    public void add(String unit, String item) {

        unitList.putIfAbsent(unit, new ArrayList<>());

        unitList.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        if (unitList.get(storageUnit) != null) return unitList.get(storageUnit);
        return new ArrayList<>();
    }

    public void remove(String storageUnit, String item) {

        if (unitList.get(storageUnit) != null && unitList.get(storageUnit).contains(item)) {

            unitList.get(storageUnit).remove(item);
        }
    }

    public ArrayList<String> storageUnits(){
        ArrayList<String> keys = new ArrayList<>();

        for (String key : unitList.keySet()) {
            if(!unitList.get(key).isEmpty()) keys.add(key);
        }

        return keys;
    }
}
