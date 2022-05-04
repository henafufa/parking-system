package parkingsystem;

public abstract class Slot {
    protected String slotID;
    boolean isOccupied = false;
    
    String getID() {
        return slotID;
    }
    
    abstract void park(Rideable r);
    
    abstract double unpark() throws Exception;
    
    abstract String info();
    
    @Override
    public boolean equals(Object o) {
        return (((Slot)o).slotID.equals(this.slotID));
    }
   
}
