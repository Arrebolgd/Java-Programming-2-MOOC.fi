import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        history = new ArrayList<>();
    }

    public void add(double status) {
        history.add(status);
    }

    public void clear() {
        history.clear();
    }

    public double minValue() {
        if (!history.isEmpty()) {
            double minValue = history.get(0);

            for (int i = 1; i < history.size(); i++) {
                if (minValue > history.get(i))
                    minValue = history.get(i);
            }

            return minValue;
        }

        return 0;
    }

    public double maxValue() {
        if (!history.isEmpty()) {
            double maxValue = history.get(0);

            for (int i = 1; i < history.size(); i++) {
                if (maxValue < history.get(i))
                    maxValue = history.get(i);
            }

            return maxValue;
        }

        return 0;
    }

    public double average() {
        if (!history.isEmpty()) {
            double average = 0;
            for (Double value : history) {
                average += value;
            }

            return average / history.size();
        }

        return 0;
    }

    @Override
    public String toString() {
        return "" + history;
    }

}
