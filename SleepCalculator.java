
package jSleepCalculator;

//Importing moduels for GUI and file creator
import java.awt.Color;
import javax.swing. *;  
import java.io.*;  
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
 
 


/**Runs a sleep calculator GUI
 * 2021-02-04
 * Created by: Connor
 * ICS4U
 */
public class SleepCalculator extends javax.swing.JFrame {
    public SleepCalculator() {
        initComponents();
        
    }
    
    //Configuration of GUI
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        dayTwo1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        dayOne = new javax.swing.JTextField();
        yearOne = new javax.swing.JTextField();
        monthOne = new javax.swing.JTextField();
        dayTwo = new javax.swing.JTextField();
        monthTwo = new javax.swing.JTextField();
        yearTwo = new javax.swing.JTextField();
        Calculate = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        txtDisplayHours = new javax.swing.JTextField();
        txtDisplayDays = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        saveInformation = new javax.swing.JMenu();
        saveInfo = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        howToUse = new javax.swing.JMenuItem();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sleep Calculator");

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 96));
        jLabel1.setText("Sleep Calculator");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Enter your birthdate");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Day:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Month:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Year:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Today's date");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Day:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Month:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Year:");

        Calculate.setBackground(new java.awt.Color(102, 155, 102));
        Calculate.setText("Calculate");
        Calculate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateActionPerformed(evt);
            }
        });

        Exit.setBackground(new java.awt.Color(255, 102, 102));
        Exit.setText("Exit");
        Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));

        saveInformation.setBackground(new java.awt.Color(204, 153, 255));
        saveInformation.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        saveInformation.setText("File");

        saveInfo.setText("Save Information");
        saveInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveInfoActionPerformed(evt);
            }
        });
        saveInformation.add(saveInfo);

        jMenuBar1.add(saveInformation);

        jMenu2.setBackground(new java.awt.Color(255, 153, 255));
        jMenu2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu2.setText("Help");

        howToUse.setText("How to use");
        howToUse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                howToUseActionPerformed(evt);
            }
        });
        jMenu2.add(howToUse);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dayOne, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(yearOne))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(monthOne, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(monthTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dayTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yearTwo))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel1)))
                .addContainerGap(114, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Calculate)
                    .addComponent(Exit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDisplayDays, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(txtDisplayHours))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(dayOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dayTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(monthOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(yearTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(yearOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Calculate)
                    .addComponent(txtDisplayDays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Exit)
                    .addComponent(txtDisplayHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    //When the button calculate is clicked the following occurs.
    private void CalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateActionPerformed

        //Subtracting current day by day born.
        int days = Integer.parseInt(dayTwo.getText()) - Integer.parseInt(dayOne.getText());
        //Subtracting current month by month born.
        int months = Integer.parseInt(monthTwo.getText()) - Integer.parseInt(monthOne.getText());
        //Subtracting current year by year born.
        int years = Integer.parseInt(yearTwo.getText()) - Integer.parseInt(yearOne.getText())    ;
        
        //CONVERTING TO DAYS//
        //Converting years to days by multiplying the variable years by 365 (365 days in a year).
        int yearsToDays = years * 365;
        //Converting months to days by multiplying the variable months by 30 (30 days in a month).
        int monthsToDays = months * 30;
        
        //FINDING THE TOTAL//
        //Adding monthsToDays and days in order to recieve the total days of the months and days combined. If days is a negative number it will cut into months, therefore, if dayTwo < dayOne it will affect the months by subtracting the difference from the monthsToDays.
        int monthsAndDays = monthsToDays + days;
        //Adding monthsAndDays and yearsToDays to recieve the total the user has been alive for.
        int totalDays = monthsAndDays + yearsToDays;
        //Multiplying totalDays by 8 to recicve the total hours the user has slept for.
        int totalHours = totalDays * 8;
        
        
        
        //IF STATEMENTS//    
        //If text field dayOne has a value of greater than 30 the following occurs.
        if(Integer.parseInt(dayOne.getText()) > 30) {
            //Let the user know there is an error in the days displaybox.
            txtDisplayDays.setText("Error: Use a number less than or equal to 30."); 
            //Clear the hours displaybox.
            txtDisplayHours.setText("");
            //Change the background of the displaybox to red to show where the error occurs.
            dayOne.setBackground(new java.awt.Color(242, 62, 62));
        
        //If text field dayTwo has a value of greater than 30 the following occurs.
        }else if(Integer.parseInt(dayTwo.getText()) > 30){
            //Let the user know there is an error in the days display box.
            txtDisplayDays.setText("Error: Use a number less than or equal to 30."); 
            //Clear the hours display box.
            txtDisplayHours.setText("");
            //Change the background of the text box to red to show where the error occurs.
            dayTwo.setBackground(new java.awt.Color(242, 62, 62));
        
        //If text field monthOne has a value of greater than 12 the following occurs.
            }else if (Integer.parseInt(monthOne.getText()) > 12){
            //Let the user know there is an error in the days display box.
            txtDisplayDays.setText("Error: Use a number less than or equal to 12."); 
            //Clear the hours display box.
            txtDisplayHours.setText("");
            //Change the background of the text box to red to show where the error occurs.
            monthOne.setBackground(new java.awt.Color(242, 62, 62));
        
        //If text field monthTwo has a value of greater than 12 the following occurs.
        }else if (Integer.parseInt(monthTwo.getText()) > 12){
            //Let the user know there is an error in the days display box.
            txtDisplayDays.setText("Error: Use a number less than or equal to 12."); 
            //Clear the hours display box.
            txtDisplayHours.setText("");
            //Change the background of the text box to red to show where the error occurs.
            monthTwo.setBackground(new java.awt.Color(242, 62, 62));
        
        //If anything else happens and passes these if statements the following occurs.
        }else{
            //Set dayOne, dayTwo, monthOne, monthTwo to have a white background once the mistakes are corrected to indicate the correction has been made.
            dayOne.setBackground(new java.awt.Color(255, 255, 255));
            dayTwo.setBackground(new java.awt.Color(255, 255, 255));
            monthOne.setBackground(new java.awt.Color(255, 255, 255));
            monthTwo.setBackground(new java.awt.Color(255, 255, 255));
            //Display the information/calculations in the two display boxes once all errors are corrected .
            txtDisplayDays.setText("You have been alive for " + Integer.toString(totalDays) + " days.");
            txtDisplayHours.setText("You have slept " + Integer.toString(totalHours) + " hours in your life time."); 
        }
    }//GEN-LAST:event_CalculateActionPerformed

    //When exit is clicked the following occurs.
    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
       //Exits application
       System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed
    
//When Help --> How to use is clicked the following occurs.
    private void howToUseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_howToUseActionPerformed
        //Opens a message explaining how to use the GUI application.
        JOptionPane.showMessageDialog(null, "\t How To Use\n 1. Enter your birthdate on the left side\n 2. Enter today's date (or the date of your choice) on the right side\n 3. Click calculate to recive the days you have been alive for and how many hours you've slept\n4. (Optional) Click 'File' --> 'Save Information' to save the information provided. ");
    }//GEN-LAST:event_howToUseActionPerformed
    
    ////When File --> Save Information is clicked the following occurs
    private void saveInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveInfoActionPerformed
        //Redeclaring mathamtical process from CalculateActionPerformed.
        int days = Integer.parseInt(dayTwo.getText()) - Integer.parseInt(dayOne.getText());
        int months = Integer.parseInt(monthTwo.getText()) - Integer.parseInt(monthOne.getText());
        int years = Integer.parseInt(yearTwo.getText()) - Integer.parseInt(yearOne.getText());
        int yearsToDays = years * 365;
        int monthsToDays = months * 30;
        int monthsAndDays = monthsToDays + days;
        int totalDays = monthsAndDays + yearsToDays;
        int totalHours = totalDays * 8;
        
        //Creates a file Info.txt to the users computer.
        File file = new File("Info.txt");
        //Writes the information of total days the user has been alive for and the total hours the user has slept to a txt document.
        try (Writer writer = new BufferedWriter(new FileWriter(file))) {
            String contents = "You have been alive for " + Integer.toString(totalDays) + " days.\nYou have slept " + Integer.toString(totalHours) + " hours in your life time.";
            writer.write(contents);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_saveInfoActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SleepCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calculate;
    private javax.swing.JButton Exit;
    private javax.swing.JTextField dayOne;
    private javax.swing.JTextField dayTwo;
    private javax.swing.JTextField dayTwo1;
    private javax.swing.JMenuItem howToUse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField monthOne;
    private javax.swing.JTextField monthTwo;
    private javax.swing.JMenuItem saveInfo;
    private javax.swing.JMenu saveInformation;
    private javax.swing.JTextField txtDisplayDays;
    private javax.swing.JTextField txtDisplayHours;
    private javax.swing.JTextField yearOne;
    private javax.swing.JTextField yearTwo;
    // End of variables declaration//GEN-END:variables

}
