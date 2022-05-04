package parkingsystem;

import java.awt.Point;
import java.util.Scanner;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class ParkingSystem {

    public static final int NUM_OF_BICYCLE_SLOTS = 50;
    public static final int NUM_OF_MOTORCYCLE_SLOTS = 50;
    public static final int NUM_OF_SMALLCAR_SLOTS = 50;
    public static final int NUM_OF_LARGECAR_SLOTS = 50;

    private static final int START_ID_OF_BICYCLE_SLOTS = 1001;
    private static final int START_ID_OF_MOTORCYCLE_SLOTS = 2001;
    private static final int START_ID_OF_SMALLCAR_SLOTS = 3001;
    private static final int START_ID_OF_LARGECAR_SLOTS = 4001;

    static final Slot[][] mySlots = new Slot[4][];

    public static void createSlots() throws Exception {
        BicycleSlot bslot[] = new BicycleSlot[NUM_OF_BICYCLE_SLOTS];
        for (int i = 0; i < bslot.length; i++) {
            bslot[i] = new BicycleSlot(String.valueOf(START_ID_OF_BICYCLE_SLOTS + i));
        }
        mySlots[0] = bslot;

        MotorSlot mslot[] = new MotorSlot[NUM_OF_MOTORCYCLE_SLOTS];
        for (int i = 0; i < mslot.length; i++) {
            mslot[i] = new MotorSlot(String.valueOf(START_ID_OF_MOTORCYCLE_SLOTS + i));
        }
        mySlots[1] = mslot;

        SmallSlot sslot[] = new SmallSlot[NUM_OF_SMALLCAR_SLOTS];
        for (int i = 0; i < sslot.length; i++) {
            sslot[i] = new SmallSlot(String.valueOf(START_ID_OF_SMALLCAR_SLOTS + i));
        }
        mySlots[2] = sslot;

        LargeSlot lslot[] = new LargeSlot[NUM_OF_LARGECAR_SLOTS];
        for (int i = 0; i < lslot.length; i++) {
            lslot[i] = new LargeSlot(String.valueOf(START_ID_OF_LARGECAR_SLOTS + i));
        }
        mySlots[3] = lslot;

        FileSystem.read();
    }

    private static Slot findSlot(Rideable r) {
        Slot slot = null;
        int width = Integer.parseInt(r.getSize()[0]);
        int length = Integer.parseInt(r.getSize()[1]);
        if ((r instanceof Bicycle)
                && (width <= Integer.parseInt(BicycleSlot.getSize()[0]))
                && (length <= Integer.parseInt(BicycleSlot.getSize()[1]))) {
            for (Slot bicycleSlot : mySlots[0]) {
                if (!bicycleSlot.isOccupied) {
                    slot = (BicycleSlot) bicycleSlot;
                    break;
                }
            }
        } else if ((r instanceof Motorcycle)
                && (width <= Integer.parseInt(MotorSlot.getSize()[0]))
                && (length <= Integer.parseInt(MotorSlot.getSize()[1]))) {
            for (Slot motorCycleSlot : mySlots[1]) {
                if (!motorCycleSlot.isOccupied) {
                    slot = (MotorSlot) motorCycleSlot;
                    break;
                }
            }
        } else if ((r instanceof SmallCar)
                && (width <= Integer.parseInt(SmallSlot.getSize()[0]))
                && (length <= Integer.parseInt(SmallSlot.getSize()[1]))) {
            for (Slot smallSlot : mySlots[2]) {
                if (!smallSlot.isOccupied) {
                    slot = (SmallSlot) smallSlot;
                    break;
                }
            }
        } else if ((r instanceof LargeCar)
                && (width <= Integer.parseInt(LargeSlot.getSize()[0]))
                && (length <= Integer.parseInt(LargeSlot.getSize()[1]))) {
            for (Slot largeSlot : mySlots[3]) {
                if (!largeSlot.isOccupied) {
                    slot = (LargeSlot) largeSlot;
                    break;
                }
            }
        }
        return slot;
    }

    public static void park(Rideable r, ParkFrame pf, String desc) throws Exception {
        Slot availSlot = findSlot(r);
        if (!(availSlot == null)) {
            if (availSlot instanceof BicycleSlot) {
                Bicycle bicycle = (Bicycle) r;
                availSlot.park(bicycle);
                FileSystem.park(desc, bicycle.getOwner().getName());
                JOptionPane.showMessageDialog(pf, "Bicycle is sucessfully parked on Slot " + availSlot.getID());
            } else if (availSlot instanceof MotorSlot) {
                Motorcycle motorcycle = (Motorcycle) r;
                availSlot.park(motorcycle);
                FileSystem.park(desc, motorcycle.getPlateNo());
                JOptionPane.showMessageDialog(pf, "Motorcycle with plate number " + motorcycle.getPlateNo() + " is sucessfully parked on Slot " + availSlot.getID());
            } else if (availSlot instanceof SmallSlot) {
                SmallCar smallCar = (SmallCar) r;
                availSlot.park(smallCar);
                FileSystem.park(desc, smallCar.getPlateNo());
                JOptionPane.showMessageDialog(pf, "Small car with plate number " + smallCar.getPlateNo() + " is sucessfully parked on Slot " + availSlot.getID());
            } else if (availSlot instanceof LargeSlot) {
                LargeCar largeCar = (LargeCar) r;
                availSlot.park(largeCar);
                FileSystem.park(desc, largeCar.getPlateNo());
                JOptionPane.showMessageDialog(pf, "Large car with plate number " + largeCar.getPlateNo() + " is sucessfully parked on Slot " + availSlot.getID());
            }
        } else {
            JOptionPane.showMessageDialog(pf, "There is no avialble space for this ride!");
        }
    }

    public static double unpark(String plateNo, String category, UnparkFrame uf) throws Exception {
        // to unpark bicycles use the customer name for the plateNo parameter
        double cost = 0.0;
        boolean found = false;
        switch (category.toLowerCase()) {
            case "bicycle":
                for (Slot s : mySlots[0]) {
                    BicycleSlot bslot = (BicycleSlot) s;
                    if (bslot.bicycle != null && bslot.bicycle.owner.getName().equals(plateNo)) {
                        found = true;
                        cost = bslot.unpark();
                        break;
                    }
                }
                break;
            case "motorcycle":
                for (Slot s : mySlots[1]) {
                    MotorSlot mslot = (MotorSlot) s;
                    if (mslot.motorcycle != null && mslot.motorcycle.getPlateNo().equals(plateNo)) {
                        found = true;
                        cost = mslot.unpark();
                        break;
                    }
                }
                break;
            case "smallcar":
                for (Slot s : mySlots[2]) {
                    SmallSlot sslot = (SmallSlot) s;
                    if (sslot.smallCar != null && sslot.smallCar.getPlateNo().equals(plateNo)) {
                        found = true;
                        cost = sslot.unpark();
                        break;
                    }
                }
                break;
            case "largecar":
                for (Slot s : mySlots[3]) {
                    LargeSlot lslot = (LargeSlot) s;
                    if (lslot.largeCar != null && lslot.largeCar.getPlateNo().equals(plateNo)) {
                        found = true;
                        cost = lslot.unpark();
                        break;
                    }
                }
                break;
            default:
                found = true;
                break;
        }
        if (!found) {
            JOptionPane.showMessageDialog(uf, "Ride Not Found!");
        }
        return cost;
    }

    static int[][] getNoOfSlots() {
        int[][] myArray = new int[4][2];
        myArray[0][0] = BicycleSlot.noOfBicycles;
        myArray[0][1] = NUM_OF_BICYCLE_SLOTS - BicycleSlot.noOfBicycles;
        myArray[1][0] = MotorSlot.noOfMotorcycles;
        myArray[1][1] = NUM_OF_MOTORCYCLE_SLOTS - MotorSlot.noOfMotorcycles;
        myArray[2][0] = SmallSlot.noOfSmallCars;
        myArray[2][1] = NUM_OF_SMALLCAR_SLOTS - SmallSlot.noOfSmallCars;
        myArray[3][0] = LargeSlot.noOfLargeCars;
        myArray[3][1] = NUM_OF_LARGECAR_SLOTS - LargeSlot.noOfLargeCars;
        return myArray;
    }

    static void showParkedCars(JTable table, InfoFrame infoFrame) {
        int row = 0;
        for (Slot s : mySlots[0]) {
            BicycleSlot slot = (BicycleSlot) s;
            if (slot.isOccupied) {
                String name2 = slot.bicycle.getOwner().getName();
                String name = name2.substring(0, name2.length() - 6);
                String sex = name2.substring(name2.length() - 6);
                String timeParked = (new java.util.Date(slot.bicycle.getTimeParked())).toString();
                String[] info = {slot.getID(), "---", slot.bicycle.getSize()[0] + " x " + slot.bicycle.getSize()[1],
                    name, sex, slot.bicycle.getOwner().getAddress(), String.valueOf(slot.bicycle.getOwner().isVIP),
                    String.valueOf(slot.bicycle.getOwner().hasCoupon), timeParked, "---", "0.0"};
                int column = 0;
                for (String i : info) {
                    table.setValueAt(i, row, column);
                    column++;
                }
                row++;
            }
        }
        for (Slot s : mySlots[1]) {
            MotorSlot slot = (MotorSlot) s;
            if (slot.isOccupied) {
                String name2 = slot.motorcycle.getOwner().getName();
                String name = name2.substring(0, name2.length() - 6);
                String sex = name2.substring(name2.length() - 6);
                String timeParked = (new java.util.Date(slot.motorcycle.getTimeParked())).toString();
                String[] info = {slot.getID(), slot.motorcycle.getPlateNo(), slot.motorcycle.getSize()[0] + " x " + slot.motorcycle.getSize()[1],
                    name, sex, slot.motorcycle.getOwner().getAddress(), String.valueOf(slot.motorcycle.getOwner().isVIP),
                    String.valueOf(slot.motorcycle.getOwner().hasCoupon), timeParked, "---", "0.0"};
                int column = 0;
                for (String i : info) {
                    table.setValueAt(i, row, column);
                    column++;
                }
                row++;
            }
        }
        for (Slot s : mySlots[2]) {
            SmallSlot slot = (SmallSlot) s;
            if (slot.isOccupied) {
                String name2 = slot.smallCar.getOwner().getName();
                String name = name2.substring(0, name2.length() - 6);
                String sex = name2.substring(name2.length() - 6);
                String timeParked = (new java.util.Date(slot.smallCar.getTimeParked())).toString();
                String[] info = {slot.getID(), slot.smallCar.getPlateNo(), slot.smallCar.getSize()[0] + " x " + slot.smallCar.getSize()[1],
                    name, sex, slot.smallCar.getOwner().getAddress(), String.valueOf(slot.smallCar.getOwner().isVIP),
                    String.valueOf(slot.smallCar.getOwner().hasCoupon), timeParked, "---", "0.0"};
                int column = 0;
                for (String i : info) {
                    table.setValueAt(i, row, column);
                    column++;
                }
                row++;
            }
        }
        for (Slot s : mySlots[3]) {
            LargeSlot slot = (LargeSlot) s;
            if (slot.isOccupied) {
                String name2 = slot.largeCar.getOwner().getName();
                String name = name2.substring(0, name2.length() - 6);
                String sex = name2.substring(name2.length() - 6);
                String timeParked = (new java.util.Date(slot.largeCar.getTimeParked())).toString();
                String[] info = {slot.getID(), slot.largeCar.getPlateNo(), slot.largeCar.getSize()[0] + " x " + slot.largeCar.getSize()[1],
                    name, sex, slot.largeCar.getOwner().getAddress(), String.valueOf(slot.largeCar.getOwner().isVIP),
                    String.valueOf(slot.largeCar.getOwner().hasCoupon), timeParked, "---", "0.0"};
                int column = 0;
                for (String i : info) {
                    table.setValueAt(i, row, column);
                    column++;
                }
                row++;
            }
        }
        if (BicycleSlot.noOfBicycles + MotorSlot.noOfMotorcycles + SmallSlot.noOfSmallCars + LargeSlot.noOfLargeCars == 0) {
            JOptionPane.showMessageDialog(infoFrame, "There are no rides in the parking area at the moment");

        }
    }

    static double printUnparkedCars(int timeChoice, InfoFrame infoFrame, JTable table) throws Exception {
        long currentTime = (new java.util.Date()).getTime();
        long dayMilliseconds = 3600000 * 24;
        long weekMilliseconds = dayMilliseconds * 7;
        long monthMilliseconds = dayMilliseconds * 30;
        long check = 0;
        switch (timeChoice) {
            case 1:
                check = currentTime - dayMilliseconds;
                break;
            case 2:
                check = currentTime - weekMilliseconds;
                break;
            case 3:
                check = currentTime - monthMilliseconds;
                break;
            default:
                break;
        }
        double totalCost = FileSystem.read2(check, infoFrame, table);
        return totalCost;
    }

    static void switchFrame(javax.swing.JFrame frame1, javax.swing.JFrame frame2) {
        Point p = frame1.getLocationOnScreen();
        frame1.setVisible(false);
        frame2.setVisible(true);
        frame2.setLocation(p);
    }

    static Rideable search(String plateNo) {
        for (Slot[] slots : mySlots) {
            if (slots instanceof BicycleSlot[]) {
                for (Slot s : slots) {
                    BicycleSlot bslot = (BicycleSlot) s;
                    if (bslot.isOccupied && bslot.bicycle.getOwner().getName().equals(plateNo)) {
                        return bslot.bicycle;
                    }
                }
            } else if (slots instanceof MotorSlot[]) {
                for (Slot s : slots) {
                    MotorSlot mslot = (MotorSlot) s;
                    if (mslot.isOccupied && mslot.motorcycle.getPlateNo().equals(plateNo)) {
                        return mslot.motorcycle;
                    }
                }
            } else if (slots instanceof SmallSlot[]) {
                for (Slot s : slots) {
                    SmallSlot sslot = (SmallSlot) s;
                    if (sslot.isOccupied && sslot.smallCar.getPlateNo().equals(plateNo)) {
                        return sslot.smallCar;
                    }
                }
            } else if (slots instanceof LargeSlot[]) {
                for (Slot s : slots) {
                    LargeSlot lslot = (LargeSlot) s;
                    if (lslot.isOccupied && lslot.largeCar.getPlateNo().equals(plateNo)) {
                        return lslot.largeCar;
                    }
                }
            }
        }
        return null;
    }

    static String notification() {
        int[][] myArray = ParkingSystem.getNoOfSlots();
        String info = "";
        if (myArray[0][1] < ParkingSystem.NUM_OF_BICYCLE_SLOTS / 2) {
            info += "\nMore Than Half Of The Bicycle Slots Are Occupied";
        } else if (myArray[0][1] < 5) {
            info += "\nLess Than 5 Bicycle Slots Remaining";
        }
        if (myArray[1][1] < ParkingSystem.NUM_OF_MOTORCYCLE_SLOTS / 2) {
            info += "\nMore Than Half Of The Motorcycle Slots Are Occupied";
        } else if (myArray[1][1] < 5) {
            info += "\nLess Than 5 Motorcycles Slots Remaining";
        }
        if (myArray[2][1] < ParkingSystem.NUM_OF_SMALLCAR_SLOTS / 2) {
            info += "\nMore Than Half Of The Small Slots Are Occupied";
        } else if (myArray[2][1] < 5) {
            info += "\nLess Than 5 Small Slots Remaining";
        }
        if (myArray[3][1] < ParkingSystem.NUM_OF_LARGECAR_SLOTS / 2) {
            info += "\nMore Than Half Of The Large Slots Are Occupied";
        } else if (myArray[3][1] < 5) {
            info += "\nLess Than 5 Large Slots Remaining";
        }
        return info;
    }
}
