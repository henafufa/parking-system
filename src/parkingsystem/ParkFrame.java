/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package parkingsystem;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author abcd
 */
public class ParkFrame extends javax.swing.JFrame {

    /**
     * Creates new form ParkFrame
     */
    public ParkFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sexbtn = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        rideableBtnGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        firstNameLbl = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        subcityLbl = new javax.swing.JLabel();
        lastNameLbl = new javax.swing.JLabel();
        lastNameTextField = new javax.swing.JTextField();
        isVIPCheckBox = new javax.swing.JCheckBox();
        hasCouponCheckBox = new javax.swing.JCheckBox();
        bicycleRadioBtn = new javax.swing.JRadioButton();
        motorcycleRadioBtn = new javax.swing.JRadioButton();
        smallCarRadioBtn = new javax.swing.JRadioButton();
        largeCarRadioBtn = new javax.swing.JRadioButton();
        maleRadioBtn = new javax.swing.JRadioButton();
        femaleRadioBtn = new javax.swing.JRadioButton();
        sexLbl = new javax.swing.JLabel();
        parkBtn = new javax.swing.JButton();
        errorMessageLbl = new javax.swing.JLabel();
        subcityComboBox = new javax.swing.JComboBox<>();
        plateNumberTextField = new javax.swing.JTextField();
        plateNumberLbl = new javax.swing.JLabel();
        widthSlider = new javax.swing.JSlider();
        lengthSlider = new javax.swing.JSlider();
        widthLbl = new javax.swing.JLabel();
        lengthLbl = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        selectImageTextField = new javax.swing.JTextField();
        selectImageBtn = new javax.swing.JButton();
        dimensionsCmLbl = new javax.swing.JLabel();
        dimensionsLbl = new javax.swing.JLabel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        pictureLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cooper Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PARKING SYSTEM");

        firstNameLbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        firstNameLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        firstNameLbl.setText("First Name");

        firstNameTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        subcityLbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        subcityLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subcityLbl.setText("Subcity");

        lastNameLbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lastNameLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lastNameLbl.setText("Last Name");

        lastNameTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        isVIPCheckBox.setText("VIP");
        isVIPCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isVIPCheckBoxActionPerformed(evt);
            }
        });

        hasCouponCheckBox.setText("Coupon");

        rideableBtnGroup.add(bicycleRadioBtn);
        bicycleRadioBtn.setText("Bicycle");
        bicycleRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bicycleRadioBtnActionPerformed(evt);
            }
        });

        rideableBtnGroup.add(motorcycleRadioBtn);
        motorcycleRadioBtn.setText("Motorcycle");
        motorcycleRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motorcycleRadioBtnActionPerformed(evt);
            }
        });

        rideableBtnGroup.add(smallCarRadioBtn);
        smallCarRadioBtn.setText("Small Car");
        smallCarRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smallCarRadioBtnActionPerformed(evt);
            }
        });

        rideableBtnGroup.add(largeCarRadioBtn);
        largeCarRadioBtn.setText("Large Car");
        largeCarRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                largeCarRadioBtnActionPerformed(evt);
            }
        });

        sexbtn.add(maleRadioBtn);
        maleRadioBtn.setText("Male");
        maleRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRadioBtnActionPerformed(evt);
            }
        });

        sexbtn.add(femaleRadioBtn);
        femaleRadioBtn.setText("Female");
        femaleRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleRadioBtnActionPerformed(evt);
            }
        });

        sexLbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sexLbl.setText("Sex");

        parkBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        parkBtn.setForeground(new java.awt.Color(0, 204, 204));
        parkBtn.setText("PARK");
        parkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parkBtnActionPerformed(evt);
            }
        });

        errorMessageLbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        errorMessageLbl.setForeground(new java.awt.Color(255, 0, 0));
        errorMessageLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        subcityComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arada", "Addis Ketema", "Lideta", "Kirkos", "Yeka", "Bole", "Akaki-Kaliti", "Nifas Silk Lafto", "Kolfe Keraneo", "Gulele", "Other" }));

        plateNumberTextField.setEditable(false);
        plateNumberTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        plateNumberTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plateNumberTextFieldActionPerformed(evt);
            }
        });

        plateNumberLbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        plateNumberLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        plateNumberLbl.setText("Plate Number");

        widthSlider.setMajorTickSpacing(50);
        widthSlider.setMaximum(250);
        widthSlider.setMinorTickSpacing(10);
        widthSlider.setPaintTicks(true);
        widthSlider.setToolTipText("");
        widthSlider.setValue(0);
        widthSlider.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                widthSliderMouseDragged(evt);
            }
        });

        lengthSlider.setMajorTickSpacing(100);
        lengthSlider.setMaximum(500);
        lengthSlider.setMinorTickSpacing(20);
        lengthSlider.setPaintTicks(true);
        lengthSlider.setSnapToTicks(true);
        lengthSlider.setValue(0);
        lengthSlider.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lengthSliderMouseDragged(evt);
            }
        });

        widthLbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        widthLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        widthLbl.setText("Width");

        lengthLbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lengthLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lengthLbl.setText("Length");

        backBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\abcd\\All In One\\All In One\\Work\\Me\\Class shit\\2nd Year\\1st Semester\\Object-Oriented Programming\\Netbeans Projects\\Parking System\\files\\otherImages\\back.png")); // NOI18N
        backBtn.setToolTipText("Back");
        backBtn.setPreferredSize(new java.awt.Dimension(25, 25));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        selectImageTextField.setEditable(false);
        selectImageTextField.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        selectImageTextField.setForeground(new java.awt.Color(153, 153, 153));
        selectImageTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        selectImageTextField.setText("Select Image");

        selectImageBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        selectImageBtn.setText("...");
        selectImageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectImageBtnActionPerformed(evt);
            }
        });

        dimensionsCmLbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        dimensionsCmLbl.setText("Dimensions (cm)");

        dimensionsLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dimensionsLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dimensionsLbl.setText("0 x 0");

        jInternalFrame1.setVisible(true);

        pictureLbl.setIcon(new javax.swing.ImageIcon("C:\\Users\\abcd\\All In One\\All In One\\Work\\Me\\Class shit\\2nd Year\\1st Semester\\Object-Oriented Programming\\Netbeans Projects\\Parking System\\files\\otherImages\\default.jpg")); // NOI18N

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addComponent(pictureLbl)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pictureLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(firstNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164)
                .addComponent(plateNumberLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(plateNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lastNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164)
                .addComponent(selectImageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(selectImageBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(subcityLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(subcityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(widthLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lengthLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(widthSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lengthSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(sexLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4)
                                        .addComponent(maleRadioBtn)
                                        .addGap(33, 33, 33)
                                        .addComponent(femaleRadioBtn))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(64, 64, 64)
                                        .addComponent(isVIPCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(hasCouponCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bicycleRadioBtn)
                                        .addGap(2, 2, 2)
                                        .addComponent(motorcycleRadioBtn)
                                        .addGap(2, 2, 2)
                                        .addComponent(smallCarRadioBtn)
                                        .addGap(0, 0, 0)
                                        .addComponent(largeCarRadioBtn))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(errorMessageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(parkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dimensionsCmLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(dimensionsLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(firstNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(plateNumberLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(plateNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lastNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectImageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectImageBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(subcityLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(subcityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(widthLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lengthLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(widthSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(lengthSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sexLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(maleRadioBtn)
                                    .addComponent(femaleRadioBtn))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(isVIPCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hasCouponCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bicycleRadioBtn)
                            .addComponent(motorcycleRadioBtn)
                            .addComponent(smallCarRadioBtn)
                            .addComponent(largeCarRadioBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(parkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(errorMessageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dimensionsCmLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(dimensionsLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void parkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parkBtnActionPerformed
        if (verify()) {
            String name = firstNameTextField.getText() + " " + lastNameTextField.getText();
            String sex = maleRadioBtn.isSelected() ? "Male  " : "Female";
            name += sex;
            String address = (String) subcityComboBox.getSelectedItem();
            Customer owner = new Customer(name, address);
            if (isVIPCheckBox.isSelected()) {
                owner.isVIP = true;
            }
            if (hasCouponCheckBox.isSelected()) {
                owner.hasCoupon = true;
            }
            String width = String.valueOf(widthSlider.getValue());
            String length = String.valueOf(lengthSlider.getValue());
            String[] size = {width, length};
            String plateNo = plateNumberTextField.getText();
            String desc = selectImageTextField.getText().equals("Select Image") ? "" : selectImageTextField.getText();
            Rideable r = null;
            if (bicycleRadioBtn.isSelected()) {
                r = new Bicycle(owner, size);
            } else if (motorcycleRadioBtn.isSelected()) {
                r = new Motorcycle(plateNo, desc, owner, size);
            } else if (smallCarRadioBtn.isSelected()) {
                r = new SmallCar(plateNo, desc, owner, size);
            } else if (largeCarRadioBtn.isSelected()) {
                r = new LargeCar(plateNo, desc, owner, size);
            }
            try {
                ParkingSystem.park(r, this, desc);
                ParkingSystem.switchFrame(this, new ParkingSystemFrame());
            } catch (Exception ex) {
                Logger.getLogger(ParkFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_parkBtnActionPerformed

    private void isVIPCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isVIPCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isVIPCheckBoxActionPerformed

    private void maleRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleRadioBtnActionPerformed

    }//GEN-LAST:event_maleRadioBtnActionPerformed

    private void bicycleRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bicycleRadioBtnActionPerformed
        plateNumberTextField.setText("");
        plateNumberTextField.setEditable(false);
        pictureLbl.setIcon(new javax.swing.ImageIcon("files\\otherImages\\bicycle.png"));
        widthSlider.setMaximum(Integer.parseInt(BicycleSlot.getSize()[0]));
        widthSlider.setMinorTickSpacing(Integer.parseInt(BicycleSlot.getSize()[0])/25);
        widthSlider.setMajorTickSpacing(Integer.parseInt(BicycleSlot.getSize()[0])/5);
        widthSlider.setValue(0);
        lengthSlider.setValue(0);
        dimensionsLbl.setText("0 x 0");
        lengthSlider.setMaximum(Integer.parseInt(BicycleSlot.getSize()[1]));
        lengthSlider.setMinorTickSpacing(Integer.parseInt(BicycleSlot.getSize()[1])/25);
        lengthSlider.setMajorTickSpacing(Integer.parseInt(BicycleSlot.getSize()[1])/5);
        
    }//GEN-LAST:event_bicycleRadioBtnActionPerformed

    private void motorcycleRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motorcycleRadioBtnActionPerformed
        plateNumberTextField.setEditable(true);
        pictureLbl.setIcon(new javax.swing.ImageIcon("files\\otherImages\\motorcycle.png"));
        widthSlider.setMaximum(Integer.parseInt(MotorSlot.getSize()[0]));
        widthSlider.setMinorTickSpacing(Integer.parseInt(MotorSlot.getSize()[0])/25);
        widthSlider.setMajorTickSpacing(Integer.parseInt(MotorSlot.getSize()[0])/5);
        widthSlider.setValue(0);
        lengthSlider.setValue(0);
        dimensionsLbl.setText("0 x 0");
        lengthSlider.setMaximum(Integer.parseInt(MotorSlot.getSize()[1]));
        lengthSlider.setMinorTickSpacing(Integer.parseInt(MotorSlot.getSize()[1])/25);
        lengthSlider.setMajorTickSpacing(Integer.parseInt(MotorSlot.getSize()[1])/5);
    }//GEN-LAST:event_motorcycleRadioBtnActionPerformed

    private void smallCarRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smallCarRadioBtnActionPerformed
        plateNumberTextField.setEditable(true);
        pictureLbl.setIcon(new javax.swing.ImageIcon("files\\otherImages\\smallCar.png"));
        widthSlider.setMaximum(Integer.parseInt(SmallSlot.getSize()[0]));
        widthSlider.setMinorTickSpacing(Integer.parseInt(SmallSlot.getSize()[0])/25);
        widthSlider.setMajorTickSpacing(Integer.parseInt(SmallSlot.getSize()[0])/5);
        widthSlider.setValue(0);
        lengthSlider.setValue(0);
        dimensionsLbl.setText("0 x 0");
        lengthSlider.setMaximum(Integer.parseInt(SmallSlot.getSize()[1]));
        lengthSlider.setMinorTickSpacing(Integer.parseInt(SmallSlot.getSize()[1])/25);
        lengthSlider.setMajorTickSpacing(Integer.parseInt(SmallSlot.getSize()[1])/5);
    }//GEN-LAST:event_smallCarRadioBtnActionPerformed

    private void largeCarRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_largeCarRadioBtnActionPerformed
        plateNumberTextField.setEditable(true);
        pictureLbl.setIcon(new javax.swing.ImageIcon("files\\otherImages\\largeCar.png"));
        widthSlider.setMaximum(Integer.parseInt(LargeSlot.getSize()[0]));
        widthSlider.setMinorTickSpacing(Integer.parseInt(LargeSlot.getSize()[0])/25);
        widthSlider.setMajorTickSpacing(Integer.parseInt(LargeSlot.getSize()[0])/5);
        widthSlider.setValue(0);
        lengthSlider.setValue(0);
        dimensionsLbl.setText("0 x 0");
        lengthSlider.setMaximum(Integer.parseInt(LargeSlot.getSize()[1]));
        lengthSlider.setMinorTickSpacing(Integer.parseInt(LargeSlot.getSize()[1])/25);
        lengthSlider.setMajorTickSpacing(Integer.parseInt(LargeSlot.getSize()[1])/5);
    }//GEN-LAST:event_largeCarRadioBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        ParkingSystem.switchFrame(this, new ParkingSystemFrame());
    }//GEN-LAST:event_backBtnActionPerformed

    private void plateNumberTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plateNumberTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_plateNumberTextFieldActionPerformed

    private void selectImageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectImageBtnActionPerformed
        JFileChooser chooser = new JFileChooser();
        int chooserValue = chooser.showOpenDialog(this);
        if (chooserValue == JFileChooser.APPROVE_OPTION) {
            String dir = chooser.getSelectedFile().getAbsolutePath();
            selectImageTextField.setText(dir);
        }
    }//GEN-LAST:event_selectImageBtnActionPerformed

    private void femaleRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleRadioBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleRadioBtnActionPerformed

    private void widthSliderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_widthSliderMouseDragged
        String dimensions = dimensionsLbl.getText();
        int x = dimensions.indexOf("x");
        dimensionsLbl.setText(widthSlider.getValue() + dimensions.substring(x - 1));
    }//GEN-LAST:event_widthSliderMouseDragged

    private void lengthSliderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lengthSliderMouseDragged
        String dimensions = dimensionsLbl.getText();
        int x = dimensions.indexOf("x");
        dimensionsLbl.setText(dimensions.substring(0, x + 2) + lengthSlider.getValue());
    }//GEN-LAST:event_lengthSliderMouseDragged

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyReleased

    private boolean verify() {
        char[] fname = firstNameTextField.getText().toCharArray();
        char[] lname = lastNameTextField.getText().toCharArray();
        char[] plateNo = plateNumberTextField.getText().toCharArray();
        String errorMessage = "";
        String s = selectImageTextField.getText();
        if (s.equals("Select Image") || !new File(s).exists() || !s.endsWith(".jpg")) {
            errorMessage = "Must enter a valid Path Name For Image";
        }
        
        if (plateNo.length == 0 && !bicycleRadioBtn.isSelected()) {
            errorMessage = "Must enter plate number!";
        } else {
            for (char c : plateNo) {
                if (!Character.isLetterOrDigit(c)) {
                    errorMessage = "Invalid plate number";
                }
            }
        }

        if (!bicycleRadioBtn.isSelected() && !motorcycleRadioBtn.isSelected() && !smallCarRadioBtn.isSelected() && !largeCarRadioBtn.isSelected()) {
            errorMessage = "Ride category not selected!";
        }
        
        if (!maleRadioBtn.isSelected() && !femaleRadioBtn.isSelected()) {
            errorMessage = "Sex not selected!";
        }
        
        if (lname.length == 0) {
            errorMessage = "Must enter last name!";
        } else {
            for (char c : lname) {
                if (!Character.isAlphabetic(c)) {
                    errorMessage = "Invalid last name";
                }
            }
        }
        
        if (fname.length == 0) {
            errorMessage = "Must enter first name!";
        } else {
            for (char c : fname) {
                if (!Character.isAlphabetic(c)) {
                    errorMessage = "Invalid first name";
                }
            }
        }

        errorMessageLbl.setText(errorMessage);
        return errorMessage.equals("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JRadioButton bicycleRadioBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel dimensionsCmLbl;
    private javax.swing.JLabel dimensionsLbl;
    private javax.swing.JLabel errorMessageLbl;
    private javax.swing.JRadioButton femaleRadioBtn;
    private javax.swing.JLabel firstNameLbl;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JCheckBox hasCouponCheckBox;
    private javax.swing.JCheckBox isVIPCheckBox;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton largeCarRadioBtn;
    private javax.swing.JLabel lastNameLbl;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JLabel lengthLbl;
    private javax.swing.JSlider lengthSlider;
    private javax.swing.JRadioButton maleRadioBtn;
    private javax.swing.JRadioButton motorcycleRadioBtn;
    private javax.swing.JButton parkBtn;
    private javax.swing.JLabel pictureLbl;
    private javax.swing.JLabel plateNumberLbl;
    private javax.swing.JTextField plateNumberTextField;
    private javax.swing.ButtonGroup rideableBtnGroup;
    private javax.swing.JButton selectImageBtn;
    private javax.swing.JTextField selectImageTextField;
    private javax.swing.JLabel sexLbl;
    private javax.swing.ButtonGroup sexbtn;
    private javax.swing.JRadioButton smallCarRadioBtn;
    private javax.swing.JComboBox<String> subcityComboBox;
    private javax.swing.JLabel subcityLbl;
    private javax.swing.JLabel widthLbl;
    private javax.swing.JSlider widthSlider;
    // End of variables declaration//GEN-END:variables
}
