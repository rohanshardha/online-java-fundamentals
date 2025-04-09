package labs_examples.objects_classes_methods.labs.objects;
// Please demonstrate Object association by creating at least two POJOs and a Controller class. The Controller
//myP// class will contain the main() method. In the main() create an object of each POJO you just created and associate
// the two together. (This is easier than it sounds. Refer to the Object Association documentation if you're not sure.)
public class Exercise_03 {

    public static void main(String[] args) {
        // Create component objects
        FuelCapacity fc = new FuelCapacity(5000.0);
        Manufacturer m = new Manufacturer("Boeing");
        SeatingCapacity sc = new SeatingCapacity(180);
        PlaneEngine e = new PlaneEngine(2);
        double currentFuel = 3200.0;

        // Compose an Airplane using those components
        Airplane myPlane = new Airplane(fc, m, sc, e, currentFuel);

        // Print airplane details using toString()
        System.out.println(myPlane);

        // another plane object
        FuelCapacity fc2 = new FuelCapacity(7500.0);
        Manufacturer m2 = new Manufacturer("Boeing");
        SeatingCapacity sc2 = new SeatingCapacity(400);
        PlaneEngine e2 = new PlaneEngine(4);
        double currentFuel2 = 5200.0;

        // Compose an Airplane using those components
        System.out.println("Another plane");
        Airplane myPlane2 = new Airplane(fc2, m2, sc2, e2, currentFuel2);

        // Print airplane details using toString()
        System.out.println(myPlane2);
        System.out.println("Using the toString method on plane 2");
        myPlane2.toString();



    }
}

class FuelCapacity {
    private double fuelCapacity;

    public FuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public String toString() {
        return fuelCapacity + " liters";
    }
}

class Manufacturer {
    private String manufacturer;

    public Manufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return manufacturer;
    }
}

class SeatingCapacity {
    private int seatingCapacity;

    public SeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public String toString() {
        return seatingCapacity + " seats";
    }
}

class PlaneEngine {
    private int count;

    public PlaneEngine(int count) {
        this.count = count;
    }

    public int getEngineCount() {
        return count;
    }

    public void setEngineCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return count + " engines";
    }
}

class Airplane {
    private FuelCapacity fuelCapacity;
    private Manufacturer manufacturer;
    private SeatingCapacity seatingCapacity;
    private PlaneEngine engine;
    private double fuelLevel;

    public Airplane(FuelCapacity fuelCapacity, Manufacturer manufacturer,
                    SeatingCapacity seatingCapacity, PlaneEngine engine, double fuelLevel) {
        this.fuelCapacity = fuelCapacity;
        this.manufacturer = manufacturer;
        this.seatingCapacity = seatingCapacity;
        this.engine = engine;
        this.fuelLevel = fuelLevel;
    }

    // ----------------------------
    // Getters for subcomponents
    // ----------------------------
    public FuelCapacity getFuelCapacity() {
        return fuelCapacity;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public SeatingCapacity getSeatingCapacity() {
        return seatingCapacity;
    }

    public PlaneEngine getEngine() {
        return engine;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    // ----------------------------
    // Setters for subcomponents
    // ----------------------------
    public void setFuelCapacity(FuelCapacity fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setSeatingCapacity(SeatingCapacity seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public void setEngine(PlaneEngine engine) { // ✅ Fixed type
        this.engine = engine;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    @Override
    public String toString() {
        return "Airplane Details:\n" +
                "- Manufacturer: " + manufacturer + "\n" +
                "- Fuel Capacity: " + fuelCapacity + "\n" +
                "- Current Fuel Level: " + fuelLevel + " liters\n" +
                "- Seating: " + seatingCapacity + "\n" +
                "- Engine: " + engine;
    }
}
