package parkingsystem;

public class Customer {
    private final String name;
    private final String address;
    boolean isVIP = false;
    boolean hasCoupon = false;
    
    Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }
    
    String getName() {
        return name;
    }
    
    String getAddress() {
        return address;
    }
    
    String info() {
        String info = "\nCUSTOMER INFORMATION"
                + "\n____________________"
                + "\nName: " + name.substring(0, name.length() - 6)
                + "\nSex: " + name.substring(name.length() - 6)
                + "\nAddress: " + address;
        return info;
    }
}