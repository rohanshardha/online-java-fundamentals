package labs_examples.objects_classes_methods.labs.objects;

// For each POJO you created to complete the previous Airplane exercise, please change all the instance variables in each
// class to "private". Then, create getter and setter methods (for each instance variable) in each class you created for
// the airplane exercise. Also, create a toString() method in each POJO. Once complete, demonstrate getting and setting
// those variables from the class in which you composed the Airplane object, as well as invoking their toString() methods.


public class Exercise_02 {

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

        // Get number of engines
        int engineCount = myPlane.getEngine().getEngineCount();
        System.out.println("Engine Count (via getter): " + engineCount);

        // Get manufacturer name
        String maker = myPlane.getManufacturer().getManufacturer();
        System.out.println("Manufacturer: " + maker);

        // Get fuel capacity
        double cap = myPlane.getFuelCapacity().getFuelCapacity();
        System.out.println("Fuel Capacity: " + cap + " liters");
        
        // Upgrade seating capacity
        myPlane.getSeatingCapacity().setSeatingCapacity(220);
        System.out.println("Updated Seating: " + myPlane.getSeatingCapacity().getSeatingCapacity());

        // Change engine count
        myPlane.getEngine().setEngineCount(4);
        System.out.println("Updated Engine Count: " + myPlane.getEngine().getEngineCount());

        // Change manufacturer name
        myPlane.getManufacturer().setManufacturer("Airbus");
        System.out.println("Updated Manufacturer: " + myPlane.getManufacturer().getManufacturer());

        System.out.println("Looking at the final myPlane object");
        System.out.println(myPlane);
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
