package parkingsystem;

public class MotorSlot extends Slot {
    Motorcycle motorcycle = null;
    private static final String[] SLOT_SIZE = {"100", "125"};
    static int noOfMotorcycles = 0;
    
    public MotorSlot(String slotID) {
        this.slotID = slotID;
    }
    
    @Override
    void park(Rideable r) {
        isOccupied = true;
        motorcycle = (Motorcycle)r;
        motorcycle.setTimeParked((new java.util.Date()).getTime());
        noOfMotorcycles++;
    }
    
    @Override
    double unpark() throws Exception {
        isOccupied = false;
        motorcycle.setTimeUnparked();
        double cost = Tariff.calculate(motorcycle);
        FileSystem.unpark(this, cost, motorcycle.getPlateNo());
        motorcycle = null;
        noOfMotorcycles--;
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
                + "\nSlot type: Motorcycles Only"
                + "\nSlot size: " + SLOT_SIZE[0] + " x " + SLOT_SIZE[1]
                + "\n";
        
        if (isOccupied) {
            info += "THIS SLOT IS CURRENTLY OCCUPIED BY\n" + motorcycle.info();
        } else {
            info += "This slot is currently not occupied.";
        }
        return info;
    }
}