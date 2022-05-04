package parkingsystem;

public class LargeSlot extends Slot {
    LargeCar largeCar = null;
    private static final String[] SLOT_SIZE = {"250", "500"};
    static int noOfLargeCars = 0;
    
    public LargeSlot(String slotID) {
        this.slotID = slotID;
    }
    
    @Override
    void park(Rideable r) {
        isOccupied = true;
        largeCar = (LargeCar)r;
        largeCar.setTimeParked((new java.util.Date()).getTime());
        noOfLargeCars++;
    }
    
    @Override
    double unpark() throws Exception {
        isOccupied = false;
        largeCar.setTimeUnparked();
        double cost = Tariff.calculate(largeCar);
        FileSystem.unpark(this, cost, largeCar.getPlateNo());
        largeCar = null;
        noOfLargeCars--;
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
                + "\nSlot type: Large Cars Only"
                + "\nSlot size: " + SLOT_SIZE[0] + " x " + SLOT_SIZE[1]
                + "\n";
        
        if (isOccupied) {
            info += "THIS SLOT IS CURRENTLY OCCUPIED BY\n" + largeCar.info();
        } else {
            info += "This slot is currently not occupied.";
        }
        return info;
    }
}