package parkingsystem;

public abstract class Vehicle implements Rideable {
    private final String plateNo;
    private String desc;
    private final String[] size;
    private java.util.Date time;
    private long timeParked;
    private long timeUnparked;
    Customer owner;
    
    protected Vehicle(String plateNo, String desc, Customer owner, String[] size) {
        this.plateNo = plateNo;
        this.desc = desc;
        this.owner = owner;
        this.size = size;
    }
    
    public String getPlateNo() {
        return plateNo;
    }
    
    public String getDesc() {
        return desc;
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
        this.timeUnparked = time.getTime();
    }
    
    @Override
    public String info() {
        String info = "RIDE INFORMATION"
                + "\n________________"
                + "\nCategory: Vehicle"
                + "\nPlate Number: " + plateNo
                + "\nSize: " + size[0] + " x " + size[1]
                + "\nTime parked: " + new java.util.Date(timeParked).toString()
                + "\n"
                + owner.info();
        return info;
    }
}