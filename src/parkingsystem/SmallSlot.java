package parkingsystem;

public class SmallSlot extends Slot {
    SmallCar smallCar = null;
    private static final String[] SLOT_SIZE = {"175", "300"};
    static int noOfSmallCars = 0;
    
    public SmallSlot(String slotID) {
        this.slotID = slotID;
    }
    
    @Override
    void park(Rideable r) {
        isOccupied = true;
        smallCar = (SmallCar)r;
        smallCar.setTimeParked((new java.util.Date()).getTime());
        noOfSmallCars++;
    }
    
    @Override
    double unpark() throws Exception {
        isOccupied = false;
        smallCar.setTimeUnparked();
        double cost = Tariff.calculate(smallCar);
        FileSystem.unpark(this, cost, smallCar.getPlateNo());
        smallCar = null;
        noOfSmallCars--;
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
                + "\nSlot type: Small Cars Only"
                + "\nSlot size: " + SLOT_SIZE[0] + " x " + SLOT_SIZE[1]
                + "\n";
        
        if (isOccupied) {
            info += "THIS SLOT IS CURRENTLY OCCUPIED BY\n" + smallCar.info();
        } else {
            info += "This slot is currently not occupied.";
        }
        return info;
    }
}