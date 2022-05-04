package parkingsystem;

public class Bicycle implements Rideable {
    private final String[] size;
    private java.util.Date time;
    private long timeParked;
    private long timeUnparked;
    Customer owner;
    
    public Bicycle(Customer owner, String[] size) {
        this.owner = owner;
        this.size = size;
    }
    
    @Override
    public String[] getSize() {
        return size;
    }
    
    @Override
    public Customer getOwner() {
        return owner;
    }
    
    @Override
    public long getTimeParked() {
        return timeParked;
    }
    
    @Override
    public void setTimeParked(long timeParked) {
        this.timeParked = timeParked;
    }
    
    @Override
    public long getTimeUnparked() {
        return timeUnparked;
    }
    
    @Override
    public void setTimeUnparked() {
        time = new java.util.Date();
        timeUnparked = time.getTime();
    }
    
    @Override
    public String info() {
        String info = "\nRIDE INFORMATION"
                + "\n________________"
                + "\nCategory: Bicycle"
                + "\nSize: " + size[0] + " x " + size[1]
                + "\nTime parked: " + new java.util.Date(timeParked).toString()
                + "\n"
                + owner.info();
        return info;
    }
}
