package parkingsystem;

public class Tariff {
    public static final double TARIFF = 2.0;
    public static final double BICYCLE = 1.0;
    public static final double MOTORCYCLE = 1.5;
    public static final double SMALLCAR = 2.0;
    public static final double LARGECAR = 2.5;
    public static final double IS_VIP = 2.0;
    public static final double HAS_COUPON = 0.8;
    private static long duration;
     
    public static double calculate(Rideable r) {
        duration = r.getTimeUnparked() - r.getTimeParked();
        double cost = TARIFF * (duration/10800000 + 1);
        if (r instanceof Bicycle) {
            cost = cost * BICYCLE;
        } else if (r instanceof Motorcycle) {
            cost = cost * MOTORCYCLE;
        } else if (r instanceof SmallCar) {
            cost = cost * SMALLCAR;
        } else if (r instanceof LargeCar) {
            cost = cost * LARGECAR;
        }
        if (r.getOwner().isVIP) {
            cost = cost * IS_VIP;
        }
        if (r.getOwner().hasCoupon) {
            cost = cost * HAS_COUPON;
        }
        return cost;
    }
}