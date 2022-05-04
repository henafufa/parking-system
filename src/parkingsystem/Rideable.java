package parkingsystem;

public interface Rideable {
    Customer getOwner();
    
    String[] getSize();
    
    long getTimeParked();
    
    void setTimeParked(long time);
    
    long getTimeUnparked();
    
    void setTimeUnparked();
   
    String info();
}
