package parkingsystem;

public class BicycleSlot extends Slot{
    Bicycle bicycle = null;
    private static final String[] SLOT_SIZE = {"75", "100"};
    static int noOfBicycles = 0;
    
    public BicycleSlot(String slotID) {
        this.slotID = slotID;
    }
    
    @Override
    void park(Rideable r) {        
        isOccupied = true;
        bicycle = (Bicycle)r;
        bicycle.setTimeParked((new java.util.Date()).getTime());
        noOfBicycles++;
    }
    
    @Override
    double unpark() throws Exception {
        isOccupied = false;
        bicycle.setTimeUnparked();
        double cost = Tariff.calculate(bicycle);
        FileSystem.unpark(this, cost, bicycle.owner.getName());
        bicycle = null;
        noOfBicycles--;
        return cost;
    }

    static String[] getSize() {
        return SLOT_SIZE;
    }
    
    @Override
    String info() {
        String info = "PARKING SLOT INFO"
                + "\n_________________"
                + "\nSlot ID: " + slotID
                + "\nSlot type: Bicycles Only"
                + "\nSlot size: " + SLOT_SIZE[0] + " x " + SLOT_SIZE[1]
                + "\n";
        
        if (isOccupied) {
            info += "THIS SLOT IS CURRENTLY OCCUPIED BY\n" + bicycle.info();
        } else {
            info += "This slot is currently not occupied.\n";
        }
        return info;
    }
}
