import java.util.HashMap;
import java.util.HashSet;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> licenseAndOwners;

    public VehicleRegistry() {
        licenseAndOwners = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {

        if (this.licenseAndOwners.containsKey(licensePlate)) {
            return false;
        }

        this.licenseAndOwners.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        return this.licenseAndOwners.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (this.licenseAndOwners.remove(licensePlate) != null)
            return true;
        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate plate : this.licenseAndOwners.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners(){
        HashSet<String> uniqueOwnsers = new HashSet<>(this.licenseAndOwners.values());

        for (String owner : uniqueOwnsers) {
            System.out.println(owner);
        }
    }
}
