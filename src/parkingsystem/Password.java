package parkingsystem;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Password {

    private static Scanner input = new Scanner(System.in);
    private static String password = "";
    private static int key = 3;

    static String returnPassword() throws Exception {
        decrypt();
        return password;
    }
    
    static void changePassword(AdminFrame af) throws Exception {
        String pass = JOptionPane.showInputDialog("Enter old password");
        decrypt();
        if (pass == null) {
        } else if (pass.equals(password)) {
            String newPass = JOptionPane.showInputDialog("Enter new password");
            if (newPass == null || !validate(newPass, af)) {
                return;
            }
            String newPass2 = JOptionPane.showInputDialog("Confirm password");
            if (newPass2 == null) {
            } else if (newPass.equals(newPass2)) {
                password = newPass;
                FileSystem.writePassword(encrypt(password));
                JOptionPane.showMessageDialog(af, "Your password has been successfully changed!");
            } else {
                JOptionPane.showMessageDialog(af, "Wrong confirmation!");
            }
        } else {
            JOptionPane.showMessageDialog(af, "Incorrect password!");
        }
    }
    
    static boolean validate(String newPass, AdminFrame af) {
        boolean letter, number, symbol, whitespace;
        letter = number = symbol = whitespace = false;
        char[] pass = newPass.toCharArray();
        for (char c : pass) {
            if (Character.isWhitespace(c)) {
                whitespace = true;
                break;
            }
            else if (Character.isLetter(c)) {
                letter = true;
            } else if (Character.isDigit(c)) {
                number = true;
            } else {
                symbol = true;
            }
        }
        if ((pass.length < 6) | whitespace | (!(letter && number && symbol))) {
            JOptionPane.showMessageDialog(af, "\nPassword must be at least 6 characters long and contain a letter,"
                    + "\na number and a symbol and must not have any whitespace characters.");
            return false;
        }
        return true;
    }
    
    static String encrypt(String pass) {
        char[] myArray = pass.toCharArray();
        String[] ciphertext = new String[key];
        for (int i = 0; i < ciphertext.length; i++) {
            ciphertext[i] = "";
        }
        for (int i = 0; i < key; i++) {
            int pointer = i;
            while (pointer < pass.length()) {
                ciphertext[i] += myArray[pointer];
                pointer += key;
            }
        }
        String ciphertext2 = "";
        for (String s : ciphertext) {
            ciphertext2 += s;
        }
        return ciphertext2;
    }
    
    static void decrypt() throws Exception {
        String pass = FileSystem.readPassword();
        if (pass.equals("")) {
            password = "@abc_123";
            FileSystem.writePassword(encrypt(password));
        }
        char[] myArray = pass.toCharArray();
        int numOfColumns = pass.length() / key + 1;
        int numOfRows = key;
        int numOfBoxes = (numOfColumns * numOfRows) - pass.length();
        String[] plaintext = new String[numOfColumns];
        for (int i = 0; i < plaintext.length; i++) {
            plaintext[i] = "";
        }
        int col = 0;
        int row = 0;
        
        for (char s : myArray) {
            plaintext[col] += s;
            col += 1;
            if ((col == numOfColumns) | ((col == numOfColumns - 1) && (row >= numOfRows - numOfBoxes))) {
                col = 0;
                row += 1;
            }
        }
        String plaintext2 = "";
        for (String s : plaintext) {
            plaintext2 += s;
        }
        password = plaintext2;
    }
    
}