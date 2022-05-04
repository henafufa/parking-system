package parkingsystem;

import java.io.*;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import jxl.*;
import jxl.write.*;

public class FileSystem {

    static void park(String path, String plateNo) throws Exception {
        rewriteParked();
        File source = new File(path);
        File target = new File("files\\parkedRideImages\\" + plateNo + ".jpg");
        BufferedInputStream input = new BufferedInputStream(new FileInputStream(source));
        BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(target));
        int r = 0, numberOfBytesCopied = 0;
        while ((r = input.read()) != -1) {
            output.write((byte)r);
            numberOfBytesCopied++;
        }
    }

    static void unpark(Slot s, double cost, String plateNo) throws Exception {
        rewriteParked();
        append(s, cost);
        File source = new File("files\\parkedRideImages\\" + plateNo + ".jpg");
        File target = new File("files\\unparkedRideImages\\" + plateNo + ".jpg");
        BufferedInputStream input = new BufferedInputStream(new FileInputStream(source));
        BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(target));
        int r = 0, numberOfBytesCopied = 0;
        while ((r = input.read()) != -1) {
            output.write((byte)r);
            numberOfBytesCopied++;
        }
    }

    static void addCell(WritableSheet mySheet, Label[] labels) throws Exception {
        for (Label l : labels) {
            mySheet.addCell(l);
        }
    }

    static void rewriteParked() throws Exception {
        File f = new File("files\\myFile.xls");
        WritableWorkbook myExcel = Workbook.createWorkbook(f);
        WritableSheet mySheet = myExcel.createSheet("mySheet", 0);
        Label l0, l1, l2, l3, l4, l5, l6, l7, l8;
        int row = 0;

        for (Slot bslot : ParkingSystem.mySlots[0]) {
            BicycleSlot slot = (BicycleSlot) bslot;
            if (slot.isOccupied) {
                l0 = new Label(0, row, slot.getID());
                l3 = new Label(3, row, slot.bicycle.getSize()[0] + " x " + slot.bicycle.getSize()[1]);
                l4 = new Label(4, row, String.valueOf(slot.bicycle.getTimeParked()));
                l5 = new Label(5, row, slot.bicycle.owner.getName());
                l6 = new Label(6, row, slot.bicycle.owner.getAddress());
                l7 = new Label(7, row, String.valueOf(slot.bicycle.owner.isVIP));
                l8 = new Label(8, row, String.valueOf(slot.bicycle.owner.hasCoupon));
                Label[] labels = {l0, l3, l4, l5, l6, l7, l8};
                addCell(mySheet, labels);
                row++;
            }
        }
        for (Slot mslot : ParkingSystem.mySlots[1]) {
            MotorSlot slot = (MotorSlot) mslot;
            if (slot.isOccupied) {
                l0 = new Label(0, row, slot.getID());
                l1 = new Label(1, row, slot.motorcycle.getPlateNo());
                l2 = new Label(2, row, slot.motorcycle.getDesc());
                l3 = new Label(3, row, slot.motorcycle.getSize()[0] + " x " + slot.motorcycle.getSize()[1]);
                l5 = new Label(5, row, slot.motorcycle.owner.getName());
                l4 = new Label(4, row, String.valueOf(slot.motorcycle.getTimeParked()));
                l6 = new Label(6, row, slot.motorcycle.owner.getAddress());
                l7 = new Label(7, row, String.valueOf(slot.motorcycle.owner.isVIP));
                l8 = new Label(8, row, String.valueOf(slot.motorcycle.owner.hasCoupon));
                Label[] labels = {l0, l1, l2, l3, l4, l5, l6, l7, l8};
                addCell(mySheet, labels);
                row++;
            }
        }
        for (Slot sslot : ParkingSystem.mySlots[2]) {
            SmallSlot slot = (SmallSlot) sslot;
            if (slot.isOccupied) {
                l0 = new Label(0, row, slot.getID());
                l1 = new Label(1, row, slot.smallCar.getPlateNo());
                l2 = new Label(2, row, slot.smallCar.getDesc());
                l3 = new Label(3, row, slot.smallCar.getSize()[0] + " x " + slot.smallCar.getSize()[1]);
                l5 = new Label(5, row, slot.smallCar.owner.getName());
                l4 = new Label(4, row, String.valueOf(slot.smallCar.getTimeParked()));
                l6 = new Label(6, row, slot.smallCar.owner.getAddress());
                l7 = new Label(7, row, String.valueOf(slot.smallCar.owner.isVIP));
                l8 = new Label(8, row, String.valueOf(slot.smallCar.owner.hasCoupon));
                Label[] labels = {l0, l1, l2, l3, l4, l5, l6, l7, l8};
                addCell(mySheet, labels);
                row++;
            }
        }
        for (Slot lslot : ParkingSystem.mySlots[3]) {
            LargeSlot slot = (LargeSlot) lslot;
            if (slot.isOccupied) {
                l0 = new Label(0, row, slot.getID());
                l1 = new Label(1, row, slot.largeCar.getPlateNo());
                l2 = new Label(2, row, slot.largeCar.getDesc());
                l3 = new Label(3, row, slot.largeCar.getSize()[0] + " x " + slot.largeCar.getSize()[1]);
                l5 = new Label(5, row, slot.largeCar.owner.getName());
                l4 = new Label(4, row, String.valueOf(slot.largeCar.getTimeParked()));
                l6 = new Label(6, row, slot.largeCar.owner.getAddress());
                l7 = new Label(7, row, String.valueOf(slot.largeCar.owner.isVIP));
                l8 = new Label(8, row, String.valueOf(slot.largeCar.owner.hasCoupon));
                Label[] labels = {l0, l1, l2, l3, l4, l5, l6, l7, l8};
                addCell(mySheet, labels);
                row++;
            }
        }
        myExcel.write();
        myExcel.close();
    }

    static void append(Slot s, double cost) throws Exception {
        File f = new File("files\\myFile2.xls");
        
        Workbook wb = Workbook.getWorkbook(f);
        WritableWorkbook copyWb = Workbook.createWorkbook(f, wb);
        WritableSheet mySheet = copyWb.getSheet(0);
        Label l0, l1, l2, l3, l4, l5, l6, l7, l8, l9 , l10;
        int numOfRows;
        try {
            numOfRows = mySheet.getRows();
        }
        catch (NullPointerException e) {
            numOfRows = 0;
        }
        if (s instanceof BicycleSlot) {
            
            BicycleSlot slot = (BicycleSlot)s;
            l0 = new Label(0, numOfRows, slot.getID());
            l3 = new Label(3, numOfRows, slot.bicycle.getSize()[0] + " x " + slot.bicycle.getSize()[1]);
            l4 = new Label(4, numOfRows, String.valueOf(slot.bicycle.getTimeParked()));
            l5 = new Label(5, numOfRows, slot.bicycle.owner.getName());
            l6 = new Label(6, numOfRows, slot.bicycle.owner.getAddress());
            l7 = new Label(7, numOfRows, String.valueOf(slot.bicycle.owner.isVIP));
            l8 = new Label(8, numOfRows, String.valueOf(slot.bicycle.owner.hasCoupon));
            l9 = new Label(9, numOfRows, String.valueOf(slot.bicycle.getTimeUnparked()));
            l10 = new Label(10, numOfRows, String.valueOf(cost));
            Label[] labels = {l0, l3, l4, l5, l6, l7, l8, l9, l10};
            addCell(mySheet, labels);
            
        } else if (s instanceof MotorSlot) {
            MotorSlot slot  = (MotorSlot)s;
            l0 = new Label(0, numOfRows, slot.getID());
            l1 = new Label(1, numOfRows, slot.motorcycle.getPlateNo());
            l2 = new Label(2, numOfRows, slot.motorcycle.getDesc());
            l3 = new Label(3, numOfRows, slot.motorcycle.getSize()[0] + " x " + slot.motorcycle.getSize()[1]);
            l5 = new Label(5, numOfRows, slot.motorcycle.owner.getName());
            l4 = new Label(4, numOfRows, String.valueOf(slot.motorcycle.getTimeParked()));
            l6 = new Label(6, numOfRows, slot.motorcycle.owner.getAddress());
            l7 = new Label(7, numOfRows, String.valueOf(slot.motorcycle.owner.isVIP));
            l8 = new Label(8, numOfRows, String.valueOf(slot.motorcycle.owner.hasCoupon));
            l9 = new Label(9, numOfRows, String.valueOf(slot.motorcycle.getTimeUnparked()));
            l10 = new Label(10, numOfRows, String.valueOf(cost));
            Label[] labels = {l0, l1, l2, l3, l4, l5, l6, l7, l8, l9, l10};
            addCell(mySheet, labels);
                
            
        } else if (s instanceof SmallSlot) {
            
            SmallSlot slot = (SmallSlot)s;
            l0 = new Label(0, numOfRows, slot.getID());
            l1 = new Label(1, numOfRows, slot.smallCar.getPlateNo());
            l2 = new Label(2, numOfRows, slot.smallCar.getDesc());
            l3 = new Label(3, numOfRows, slot.smallCar.getSize()[0] + " x " + slot.smallCar.getSize()[1]);
            l5 = new Label(5, numOfRows, slot.smallCar.owner.getName());
            l4 = new Label(4, numOfRows, String.valueOf(slot.smallCar.getTimeParked()));
            l6 = new Label(6, numOfRows, slot.smallCar.owner.getAddress());
            l7 = new Label(7, numOfRows, String.valueOf(slot.smallCar.owner.isVIP));
            l8 = new Label(8, numOfRows, String.valueOf(slot.smallCar.owner.hasCoupon));
            l9 = new Label(9, numOfRows, String.valueOf(slot.smallCar.getTimeUnparked()));
            l10 = new Label(10, numOfRows, String.valueOf(cost));
            Label[] labels = {l0, l1, l2, l3, l4, l5, l6, l7, l8, l9, l10};
            addCell(mySheet, labels);    
            
        } else if (s instanceof LargeSlot) {
            
            LargeSlot slot = (LargeSlot)s;
            l0 = new Label(0, numOfRows, slot.getID());
            l1 = new Label(1, numOfRows, slot.largeCar.getPlateNo());
            l2 = new Label(2, numOfRows, slot.largeCar.getDesc());
            l3 = new Label(3, numOfRows, slot.largeCar.getSize()[0] + " x " + slot.largeCar.getSize()[1]);
            l5 = new Label(5, numOfRows, slot.largeCar.owner.getName());
            l4 = new Label(4, numOfRows, String.valueOf(slot.largeCar.getTimeParked()));
            l6 = new Label(6, numOfRows, slot.largeCar.owner.getAddress());
            l7 = new Label(7, numOfRows, String.valueOf(slot.largeCar.owner.isVIP));
            l9 = new Label(9, numOfRows, String.valueOf(slot.largeCar.getTimeUnparked()));
            l8 = new Label(8, numOfRows, String.valueOf(slot.largeCar.owner.hasCoupon));
            l10 = new Label(10, numOfRows, String.valueOf(cost));
            Label[] labels = {l0, l1, l2, l3, l4, l5, l6, l7, l8, l9, l10};
            addCell(mySheet, labels);
        }
        copyWb.write();
        copyWb.close();
    }
    
    static void read() throws Exception {
        FileInputStream file = new FileInputStream("files\\myFile.xls");
        Workbook myExcel = Workbook.getWorkbook(file);
        Sheet parked = myExcel.getSheet("mySheet");
        int numOfRows;
        try {
            numOfRows = parked.getRows();
        }
        catch (NullPointerException e) {
            numOfRows = 0;
        }
        for (int i = 0; i < numOfRows; i++) {
            Cell[] row = parked.getRow(i);

            String slotID = row[0].getContents();
            String plateNo = row[1].getContents();
            String desc = row[2].getContents();
            String size = row[3].getContents();
            String timeParked = row[4].getContents();
            Customer owner = new Customer(row[5].getContents(), row[6].getContents());
            owner.isVIP = (row[7].getContents().equals("true"));
            owner.hasCoupon = (row[8].getContents().equals("true"));

            int index = Integer.parseInt(slotID.substring(0, 1)) - 1;
            int ID = Integer.parseInt(slotID.substring(2, 4)) - 1;
            String[] size2 = size.split(" x ");
            long timeParked2 = Long.parseLong(timeParked);
            ParkingSystem.mySlots[index][ID].isOccupied = true;

            switch (index) {
                case 0:
                    ((BicycleSlot) ParkingSystem.mySlots[index][ID]).bicycle = new Bicycle(owner, size2);
                    ((BicycleSlot) ParkingSystem.mySlots[index][ID]).bicycle.setTimeParked(timeParked2);
                    BicycleSlot.noOfBicycles++;
                    break;
                case 1:
                    ((MotorSlot) ParkingSystem.mySlots[index][ID]).motorcycle = new Motorcycle(plateNo, desc, owner, size2);
                    ((MotorSlot) ParkingSystem.mySlots[index][ID]).motorcycle.setTimeParked(timeParked2);
                    MotorSlot.noOfMotorcycles++;
                    break;
                case 2:
                    ((SmallSlot) ParkingSystem.mySlots[index][ID]).smallCar = new SmallCar(plateNo, desc, owner, size2);
                    ((SmallSlot) ParkingSystem.mySlots[index][ID]).smallCar.setTimeParked(timeParked2);
                    SmallSlot.noOfSmallCars++;
                    break;
                case 3:
                    ((LargeSlot) ParkingSystem.mySlots[index][ID]).largeCar = new LargeCar(plateNo, desc, owner, size2);
                    ((LargeSlot) ParkingSystem.mySlots[index][ID]).largeCar.setTimeParked(timeParked2);
                    LargeSlot.noOfLargeCars++;
                    break;
                default:
                    break;
            }
        }
        myExcel.close();
    }

    static double read2(long check, InfoFrame infoFrame, JTable table) throws Exception {
        FileInputStream file = new FileInputStream("files\\myFile2.xls");
        Workbook myExcel = Workbook.getWorkbook(file);
        Sheet unparked = myExcel.getSheet("mySheet");
        int numOfRows;
        try {
            numOfRows = unparked.getRows();
        } catch (NullPointerException e) {
            numOfRows = 0;
        }
        if (numOfRows == 0) {
            JOptionPane.showMessageDialog(infoFrame, "The parking log has recently been cleared.\nNo ride has been unparked since then.");
        }
        double totalCost = 0;
        for (int i = 0; i < numOfRows; i++) {
            Cell[] row = unparked.getRow(i);
            if (Long.parseLong(row[9].getContents()) > check) {
                String slotID = row[0].getContents();
                String name2 = row[5].getContents();
                String name = name2.substring(0, name2.length() - 6);
                String sex = name2.substring(name2.length() - 6);
                String timeParked = (new java.util.Date(Long.parseLong(row[4].getContents()))).toString();
                String timeUnparked = (new java.util.Date(Long.parseLong(row[9].getContents()))).toString();
                String cost = row[10].getContents();
                String[] info = {slotID, row[1].getContents(), row[3].getContents(), name, sex, row[6].getContents(),
                    row[7].getContents(), row[8].getContents(), timeParked, timeUnparked, cost};
                if (slotID.charAt(0) == '1') {
                    info[1] = "---";
                }
                totalCost += Double.parseDouble(cost);
                
                int column = 0;
                for (String j : info) {
                    table.setValueAt(j, i, column);
                    column++;
                }
            }
        }
        myExcel.close();
        return totalCost;
    }

    static void clearParked() throws Exception {
        File f = new File("files\\myFile.xls");
        WritableWorkbook myExcel = Workbook.createWorkbook(f);
        WritableSheet mySheet = myExcel.createSheet("mySheet", 0);
        myExcel.write();
        myExcel.close();
        ParkingSystem.createSlots();
        File[] files = new File("files\\parkedRideImages").listFiles();
        for (File file : files) {
            file.delete();
        }
    }

    static void clearAllLogs() throws Exception {
        File f = new File("files\\myFile.xls");
        File f2 = new File("files\\myFile2.xls");
        WritableWorkbook myExcel = Workbook.createWorkbook(f);
        WritableWorkbook myExcel2 = Workbook.createWorkbook(f2);
        WritableSheet mySheet = myExcel.createSheet("mySheet", 0);
        WritableSheet mySheet2 = myExcel2.createSheet("mySheet", 0);
        myExcel.write();
        myExcel.close();
        myExcel2.write();
        myExcel2.close();
        ParkingSystem.createSlots();
        File[] files = new File("files\\parkedRideImages").listFiles();
        for (File file : files) {
            file.delete();
        }
        File[] files2 = new File("files\\unparkedRideImages").listFiles();
        for (File file : files2) {
            file.delete();
        }
    }

    static String readPassword() throws Exception {
        File f = new File("files\\password.txt");
        String password;
        try (Scanner input = new Scanner(f)) {
            password = "";
            if (input.hasNext()) {
                password = input.next();
            }
        }
        return password;
    }

    static void writePassword(String password) throws Exception {
        File f = new File("files\\password.txt");
        try (PrintWriter output = new PrintWriter(f)) {
            output.print(password);
        }
    }
}
