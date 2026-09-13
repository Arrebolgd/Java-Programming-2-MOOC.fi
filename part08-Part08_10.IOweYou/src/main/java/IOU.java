import java.util.HashMap;

public class IOU {

    private HashMap<String, Double> ownedMoney;

    public IOU() {
        ownedMoney = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        ownedMoney.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {

        if (ownedMoney.get(toWhom) != null) {
            return ownedMoney.get(toWhom).doubleValue();
        }
        return 0;
    }
}
