
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author MasterWard
 */
public class Red2 extends javax.swing.JPanel {

    // private String ans[] = {"Reverse", "Left", "Kia", "Reverse", "Right", "Reverse", "Left", "Reverse", "Reverse", "Reverse", "Reverse"}; // FOr debugging can delete later
    private int answer[] = {2, 4, 1, 3, 1, 2, 1, 3, 1, 4, 2, 1, 2, 3, 4, 3, 1, 2, 1, 2, 1, 2, 1}; // Answers in int form
    private int selection = 0; // Variable that holds the player's response to a highlighted section of the text
    private int index = 0; // Index of answers on
    private String options[] = {" ", "Reverse", "Left", "Right", "Kia", "", "", ""}; // The options to choose
    private JTextField textFields[];
    public JFrame messages = new JFrame("JOptionPane showMessageDialog example");
    public Object messageoptions[] = {"Exit To Main Menu", "Quit Game", "Next Kata"};
// This also means that 0 is nothing, 1 is reverse, 2 is left, 3 is right and 4 Kia in the selection array.

    /**
     * White belt Interactive Form
     */
    public Red2() {
        initComponents();
        textFields = new JTextField[]{A1, A2, A3, B1, B2, C1, C2, D1, D2, E1, F1, F2, F3, G1, G2, G3, H1, H2, H3, I1, I2, I3, I4};
        initialPaint();
    }
    
    /**
     * Method that paints the first frame of the level
     */
    private void initialPaint()
    {
        // Erase the text from all text boxes
        for (int i = 0; i < answer.length; i++)
        {
            textFields[i].setText("");
        }
        
        // Paint the first text box yellow since we start there
        textFields[0].setBackground(Color.yellow);
    }

    /**
     * Method that deals with the painting of JTextFields based on selection and
     * answer arrays
     */
    private void paintingNew() {
        if (selection == answer[index]) // The player was correct, so let's move on
        {
            textFields[index].setText(options[answer[index]]);
            textFields[index].setBackground(Color.green); // Turn the previous highlight green
            index++;
            if (index == answer.length)
            {
                // Display a congratulatory text box here and ask the player if they want to return to the main menu or exit
                JOptionPane.showMessageDialog(null, "Congratulations, You Completed The Kata! Now Go Put These Steps Into Practce!");
                
                int choice = JOptionPane.showOptionDialog(null,
                        "Do You Want To Return To The Main Menu, Exit The Game, Or Move Onto The Next Kata?",
                        "Next Steps", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, messageoptions, null);
                switch (choice)
                {
                    case 0:
                        Main.display.DisplayMainMenu(false, true, false);
                        break;
                    case 1:
                        // Kill all threads and exit
                        try
                        {
                            Main.display.kill();
                            JOptionPane.showMessageDialog(null, "Thanks For Playing!");
                            System.exit(0);
                        }
                        catch (Exception closeException)
                        {
                            JOptionPane.showMessageDialog(null, "Something Went Wrong When Attempting To Kill Program Threads. Force Closing Program.");
                            System.exit(0);
                        }
                    case 2:
                        Main.display.kataContentPane.removeAll();
                        Main.display.kataContentPane.add(new Brown1());
                        Main.display.kataContentPane.repaint();
                        Main.display.displaywindow.pack();
                        break;
                    default:
                        break;
                }
            }
            else
                textFields[index].setBackground(Color.yellow); // Highlight the next text box yellow
        }
        else // The player was wrong
        {
            textFields[index].setBackground(Color.red); // Set the highlight color to red
            textFields[index].setText(options[selection]);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Reverse1 = new javax.swing.JButton();
        Left2 = new javax.swing.JButton();
        Right3 = new javax.swing.JButton();
        Kia4 = new javax.swing.JButton();
        MainMenuButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        A1 = new javax.swing.JTextField();
        A2 = new javax.swing.JTextField();
        A3 = new javax.swing.JTextField();
        B2 = new javax.swing.JTextField();
        C1 = new javax.swing.JTextField();
        C2 = new javax.swing.JTextField();
        D1 = new javax.swing.JTextField();
        B1 = new javax.swing.JTextField();
        D2 = new javax.swing.JTextField();
        E1 = new javax.swing.JTextField();
        F1 = new javax.swing.JTextField();
        F2 = new javax.swing.JTextField();
        F3 = new javax.swing.JTextField();
        G1 = new javax.swing.JTextField();
        G2 = new javax.swing.JTextField();
        G3 = new javax.swing.JTextField();
        H1 = new javax.swing.JTextField();
        H2 = new javax.swing.JTextField();
        H3 = new javax.swing.JTextField();
        I1 = new javax.swing.JTextField();
        I2 = new javax.swing.JTextField();
        I3 = new javax.swing.JTextField();
        I4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(204, 204, 204));
        setMaximumSize(new java.awt.Dimension(1610, 910));
        setMinimumSize(new java.awt.Dimension(1610, 910));
        setName("White Belt"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1610, 910));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Reverse1.setBackground(new java.awt.Color(0, 240, 240));
        Reverse1.setText("Reverse");
        Reverse1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Reverse1ItemStateChanged(evt);
            }
        });
        Reverse1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Reverse1MouseClicked(evt);
            }
        });
        Reverse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reverse1ActionPerformed(evt);
            }
        });
        add(Reverse1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 68, 190, 45));

        Left2.setText("Left");
        Left2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Left2MouseClicked(evt);
            }
        });
        Left2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Left2ActionPerformed(evt);
            }
        });
        add(Left2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 68, 194, 45));

        Right3.setText("Right");
        Right3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Right3MouseClicked(evt);
            }
        });
        add(Right3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 68, 202, 45));

        Kia4.setText("Kia");
        Kia4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Kia4MouseClicked(evt);
            }
        });
        add(Kia4, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 68, 145, 45));

        MainMenuButton.setText("Back To Main Menu");
        MainMenuButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MainMenuButtonMouseClicked(evt);
            }
        });
        add(MainMenuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 855, 200, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Word Bank");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 13, -1, -1));

        A1.setEditable(false);
        A1.setText("Answer1");
        A1.setMaximumSize(new java.awt.Dimension(100, 100));
        A1.setMinimumSize(new java.awt.Dimension(10, 22));
        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1ActionPerformed(evt);
            }
        });
        add(A1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 124, 56, 22));

        A2.setBackground(new java.awt.Color(240, 240, 240));
        A2.setText("Answer2");
        add(A2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 124, 60, -1));

        A3.setBackground(new java.awt.Color(240, 240, 240));
        A3.setText("Answer3");
        A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A3ActionPerformed(evt);
            }
        });
        add(A3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 124, 56, 18));

        B2.setBackground(new java.awt.Color(240, 240, 240));
        B2.setText("Answer5");
        add(B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 124, 56, 18));

        C1.setBackground(new java.awt.Color(240, 240, 240));
        C1.setText("Answer6");
        add(C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 124, 60, 18));

        C2.setBackground(new java.awt.Color(240, 240, 240));
        C2.setText("Answer7");
        add(C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 124, 56, -1));

        D1.setBackground(new java.awt.Color(240, 240, 240));
        D1.setText("Answer8");
        add(D1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 124, 56, -1));

        B1.setBackground(new java.awt.Color(240, 240, 240));
        B1.setText("Answer4");
        add(B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 124, 56, -1));

        D2.setBackground(new java.awt.Color(240, 240, 240));
        D2.setText("Answer9");
        add(D2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 124, 56, -1));

        E1.setBackground(new java.awt.Color(240, 240, 240));
        E1.setText("Answer10");
        add(E1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 124, 70, -1));

        F1.setBackground(new java.awt.Color(240, 240, 240));
        F1.setText("Answer11");
        add(F1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 124, 63, -1));

        F2.setBackground(new java.awt.Color(240, 240, 240));
        F2.setText("Answer12");
        add(F2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 124, 63, -1));

        F3.setBackground(new java.awt.Color(240, 240, 240));
        F3.setText("Answer13");
        add(F3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 124, 63, -1));

        G1.setBackground(new java.awt.Color(240, 240, 240));
        G1.setText("Answer14");
        add(G1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 124, 63, -1));

        G2.setBackground(new java.awt.Color(240, 240, 240));
        G2.setText("Answer15");
        add(G2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 124, 63, -1));

        G3.setBackground(new java.awt.Color(240, 240, 240));
        G3.setText("Answer16");
        add(G3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 124, 63, -1));

        H1.setEditable(false);
        H1.setText("Answer17");
        add(H1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 96, 63, -1));

        H2.setBackground(new java.awt.Color(240, 240, 240));
        H2.setText("Answer18");
        add(H2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 68, 63, -1));

        H3.setBackground(new java.awt.Color(240, 240, 240));
        H3.setText("Answer19");
        add(H3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 40, 63, -1));

        I1.setBackground(new java.awt.Color(240, 240, 240));
        I1.setText("Answer20");
        add(I1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 40, 63, -1));

        I2.setBackground(new java.awt.Color(240, 240, 240));
        I2.setText("Answer21");
        add(I2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 40, 63, -1));

        I3.setBackground(new java.awt.Color(240, 240, 240));
        I3.setText("Answer22");
        add(I3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 40, 63, -1));

        I4.setBackground(new java.awt.Color(240, 240, 240));
        I4.setText("Answer23");
        add(I4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 40, 63, -1));

        jTextArea1.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("1.. Go into position for the kata.\n2. Step out towards your left, do a _____ block, and say ___.\n3. Grab with the right hand and remove while sliding back into a ____ side fighting stance.\n4. Step out towards your right and do a _____ block.\n5. Grab with the left hand and remove while sliding back into a ____ side fighting stance.\n6. Step towards the front in a ____ side forebalance and point with both hands.\n7. Bring the right arm back.\n8. Do a rear leg _____ kick and set it down in fron of you.\n9. Punch twice.\n10. Turn 90 degrees to your left, slide both feet together, and bring both hands into chamber.\n11. Turn 90 degrees to your left, step out into a _____ stance, and do a double fist __________ block.\n12. Turn 180 degrees to your right, remain in a _____ stance, and do a double fist __________ block.\n13. Turn 180 degrees to your right, remain in a _____ stance, and do a double fist __________ block.\n14. Turn 180 degrees to your left, remain in a _____ stance, and do a double fist __________ block.\n15. Turn 180 degrees to your right, remain in a _____ stance, and do a double fist __________ block.\n16. Turn 18degrees to your right, remain in a _____ stance, and do a double fist __________ block.\n17. Do a low pseudo block in a ____ side fighting stance towards the front.\n18. Do a headsmash with the back knee and set that leg down in front of you.\n19. Do a ______ block towards the back in a ____ side fighting stance.\n20. Do a _____ kick and leave your leg up.\n21. Spear with the back hand, then spear with the front hand and set your leg down in a forebalance.\n22. Do a ______ block towards the back in a _____ side fighting stance.\n23. Do a _____ kick and leave your leg up.\n24. Spear with the back hand, then spear with the front hand and set your leg down in a forebalance.\n25. Grab and remove.\n26. Jump forward, step behind your right foot, and do a low _____ block.\n27. Fold for a ________ block and spin 22degrees to your left.\n28. Land in a ____ side forebalance and do a ________ block.\n29. Slide the front foot up to the back foot in a fighting stance and fold for a low ______.\n30. Step back out into a forebalance and do a low ______.\n31. Do a _____ block with the right hand.\n32. Slide your feet together up to the front and fold for a low ______ block.\n33. Turn 4degrees to your right and step into a _____ side forebalance.\n34. Do a low ______ block.\n35. Do a _____ block with the left hand.\n36. Do a _____ block with the right hand.\n37. Do a _____ block with the left hand.\n38. Point to the front with the left hand.\n39. Step forward into a _____ stance and punch.\n40. Say ___.\n41. Wait seconds, and go back to the position for the kata.\n");
        jScrollPane1.setViewportView(jTextArea1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 1510, 650));
    }// </editor-fold>//GEN-END:initComponents

    private void Reverse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reverse1ActionPerformed

    }//GEN-LAST:event_Reverse1ActionPerformed

    private void Left2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Left2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Left2ActionPerformed

    private void Reverse1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Reverse1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_Reverse1ItemStateChanged

    private void Reverse1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Reverse1MouseClicked
        //  System.out.println("Clicked reverse when the answer is " + ans[index]);
        selection = 1;
        paintingNew();
    }//GEN-LAST:event_Reverse1MouseClicked

    private void Left2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Left2MouseClicked
        //  System.out.println("Clicked Left when the answer is " + ans[index]);
        selection = 2;
        paintingNew();
    }//GEN-LAST:event_Left2MouseClicked

    private void Right3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Right3MouseClicked
        //    System.out.println("Clicked Right when the answer is " + ans[index]);
        selection = 3;
        paintingNew();
    }//GEN-LAST:event_Right3MouseClicked

    private void Kia4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kia4MouseClicked
        //  System.out.println("Clicked Kia when the answer is " + ans[index]);
        selection = 4;
        paintingNew();
    }//GEN-LAST:event_Kia4MouseClicked

    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A1ActionPerformed

    private void A3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A3ActionPerformed

    private void MainMenuButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainMenuButtonMouseClicked
        int confirm = JOptionPane.showOptionDialog(null,
            "Are You Sure You Want To Return To The Main Menu? You Will Lose All Progress.",
            "Exit Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (confirm == 0)
        {
            Main.display.DisplayMainMenu(false, true, true);
        }
    }//GEN-LAST:event_MainMenuButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField A1;
    private javax.swing.JTextField A2;
    private javax.swing.JTextField A3;
    private javax.swing.JTextField B1;
    private javax.swing.JTextField B2;
    private javax.swing.JTextField C1;
    private javax.swing.JTextField C2;
    private javax.swing.JTextField D1;
    private javax.swing.JTextField D2;
    private javax.swing.JTextField E1;
    private javax.swing.JTextField F1;
    private javax.swing.JTextField F2;
    private javax.swing.JTextField F3;
    private javax.swing.JTextField G1;
    private javax.swing.JTextField G2;
    private javax.swing.JTextField G3;
    private javax.swing.JTextField H1;
    private javax.swing.JTextField H2;
    private javax.swing.JTextField H3;
    private javax.swing.JTextField I1;
    private javax.swing.JTextField I2;
    private javax.swing.JTextField I3;
    private javax.swing.JTextField I4;
    private javax.swing.JButton Kia4;
    private javax.swing.JButton Left2;
    private javax.swing.JButton MainMenuButton;
    private javax.swing.JButton Reverse1;
    private javax.swing.JButton Right3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
