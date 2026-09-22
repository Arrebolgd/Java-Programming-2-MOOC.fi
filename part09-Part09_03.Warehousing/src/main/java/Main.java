

public class Main {

    public static void main(String[] args) {
        // here you can write code to test your classes
        ProductWarehouseWithHistory prueba = new ProductWarehouseWithHistory("Frost", 10, 6000);
        System.out.println(prueba);

        prueba.addToWarehouse(10);
        System.out.println(prueba);
    }

}
