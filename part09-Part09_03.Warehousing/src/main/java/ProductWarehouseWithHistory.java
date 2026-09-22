public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory balanceHistory;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);

        super.addToWarehouse(initialBalance);

        balanceHistory = new ChangeHistory();
        balanceHistory.add(initialBalance);
        
    }

    public String history(){
        return balanceHistory.toString();
    }

    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        balanceHistory.add(getBalance());
    }

    public double takeFromWarehouse(double amount){
        double returnValue = super.takeFromWarehouse(amount);
        balanceHistory.add(getBalance());

        return returnValue;
    }

    public void printAnalysis(){
        System.out.println("Product: " + getName());
        System.out.println("History: " + balanceHistory);
        System.out.println("Largest amount of product: " + balanceHistory.maxValue());
        System.out.println("Smallest amount of product: " + balanceHistory.minValue());
        System.out.println("Average: " + balanceHistory.average());
    }
}
