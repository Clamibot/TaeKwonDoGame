
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author MasterWard
 */
public class Orange1 extends javax.swing.JPanel {
    private int answer[] = {4, 1, 1, 3, 4, 2, 2, 5, 1, 3, 6, 6, 2, 6, 1, 5, 1, 7, 7, 7, 7, 8, 2, 8, 1, 3}; // Answers in int form. These reflect the indices of the options array.
    private int selection = 0; // Variable that holds the player's response to a highlighted section of the text
    private int index = 0; // Index of answers on
    private String options[] = {" ", "Left", "Right", "Kia", "Pseudo", "Low", "Box", "High", "Horse"}; // The options to choose
    private JTextField textFields[];
    public JFrame messages = new JFrame("JOptionPane showMessageDialog example");
    public Object messageoptions[] = {"Exit To Main Menu", "Quit Game"};

    /**
     * White belt Interactive Form
     */
    public Orange1() {
        initComponents();
        textFields = new JTextField[]{A1, A2, A3, B1, B2, C1, C2, D1, D2, E1, F1, F2, F3, G1, G2, G3, H1, H2, H3, I1, I2, I3, I4, I5, I6, I7};
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
                JOptionPane.showMessageDialog(null, "Congratulations! You Completed The Kata!");
                
                int choice = JOptionPane.showOptionDialog(null,
                        "Do You Want To Return To The Main Menu Or Exit The Game?",
                        "Next Steps", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, messageoptions, null);
                if (choice == 0)
                {
                    Main.display.DisplayMainMenu(false, true, false);
                }
                else
                {
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

        Left1 = new javax.swing.JButton();
        Right2 = new javax.swing.JButton();
        Kia3 = new javax.swing.JButton();
        Pseudo4 = new javax.swing.JButton();
        Low5 = new javax.swing.JButton();
        Box6 = new javax.swing.JButton();
        High7 = new javax.swing.JButton();
        Horse8 = new javax.swing.JButton();
        MainMenuButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
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
        I5 = new javax.swing.JTextField();
        I6 = new javax.swing.JTextField();
        I7 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(204, 204, 204));
        setMaximumSize(new java.awt.Dimension(1610, 910));
        setMinimumSize(new java.awt.Dimension(1610, 910));
        setName("White Belt"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1610, 910));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Left1.setText("Left");
        Left1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Left1MouseClicked(evt);
            }
        });
        add(Left1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 140, 60));

        Right2.setText("Right");
        Right2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Right2MouseClicked(evt);
            }
        });
        add(Right2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 140, 60));

        Kia3.setText("Kia");
        Kia3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Kia3MouseClicked(evt);
            }
        });
        add(Kia3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 140, 60));

        Pseudo4.setText("Pseudo");
        Pseudo4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pseudo4MouseClicked(evt);
            }
        });
        add(Pseudo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, 140, 60));

        Low5.setText("Low");
        Low5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Low5MouseClicked(evt);
            }
        });
        add(Low5, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 70, 140, 60));

        Box6.setText("Box");
        Box6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Box6MouseClicked(evt);
            }
        });
        add(Box6, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 70, 140, 60));

        High7.setText("High");
        High7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                High7MouseClicked(evt);
            }
        });
        add(High7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 70, 140, 60));

        Horse8.setText("Horse");
        Horse8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Horse8MouseClicked(evt);
            }
        });
        add(Horse8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 70, 140, 60));

        MainMenuButton.setText("Back To Main Menu");
        MainMenuButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MainMenuButtonMouseClicked(evt);
            }
        });
        add(MainMenuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 855, 200, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Word Bank");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 90, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Steps For Kata Tangoon:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(665, 160, 280, 40));

        A1.setEditable(false);
        A1.setBackground(new java.awt.Color(204, 204, 204));
        A1.setText("Answer1");
        A1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), null));
        A1.setMaximumSize(new java.awt.Dimension(100, 100));
        A1.setMinimumSize(new java.awt.Dimension(10, 22));
        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1ActionPerformed(evt);
            }
        });
        add(A1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 204, 63, -1));

        A2.setEditable(false);
        A2.setBackground(new java.awt.Color(204, 204, 204));
        A2.setText("Answer2");
        A2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), null));
        add(A2, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 204, 63, -1));

        A3.setEditable(false);
        A3.setBackground(new java.awt.Color(204, 204, 204));
        A3.setText("Answer3");
        A3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), null));
        A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A3ActionPerformed(evt);
            }
        });
        add(A3, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 204, 63, -1));

        B2.setEditable(false);
        B2.setBackground(new java.awt.Color(204, 204, 204));
        B2.setText("Answer5");
        B2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), null));
        add(B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 249, 63, -1));

        C1.setEditable(false);
        C1.setBackground(new java.awt.Color(204, 204, 204));
        C1.setText("Answer6");
        C1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), null));
        add(C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 248, 63, -1));

        C2.setEditable(false);
        C2.setBackground(new java.awt.Color(204, 204, 204));
        C2.setText("Answer7");
        C2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), null));
        add(C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 248, 63, -1));

        D1.setEditable(false);
        D1.setBackground(new java.awt.Color(204, 204, 204));
        D1.setText("Answer8");
        D1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), null));
        D1.setVerifyInputWhenFocusTarget(false);
        add(D1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 292, 63, -1));

        B1.setEditable(false);
        B1.setBackground(new java.awt.Color(204, 204, 204));
        B1.setText("Answer4");
        B1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), null));
        add(B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 204, 63, -1));

        D2.setEditable(false);
        D2.setBackground(new java.awt.Color(204, 204, 204));
        D2.setText("Answer9");
        D2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), null));
        add(D2, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 292, 63, -1));

        E1.setEditable(false);
        E1.setBackground(new java.awt.Color(204, 204, 204));
        E1.setText("Answer10");
        E1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), null));
        add(E1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1048, 315, 63, -1));

        F1.setEditable(false);
        F1.setBackground(new java.awt.Color(204, 204, 204));
        F1.setText("Answer11");
        F1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), null));
        add(F1, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 336, 63, -1));

        F2.setEditable(false);
        F2.setBackground(new java.awt.Color(204, 204, 204));
        F2.setText("Answer12");
        F2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), null));
        add(F2, new org.netbeans.lib.awtextra.AbsoluteConstraints(607, 336, 63, -1));

        F3.setEditable(false);
        F3.setBackground(new java.awt.Color(204, 204, 204));
        F3.setText("Answer13");
        F3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), null));
        add(F3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 358, 63, -1));

        G1.setEditable(false);
        G1.setBackground(new java.awt.Color(204, 204, 204));
        G1.setText("Answer14");
        G1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), null));
        add(G1, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 380, 63, -1));

        G2.setEditable(false);
        G2.setBackground(new java.awt.Color(204, 204, 204));
        G2.setText("Answer15");
        G2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), null));
        add(G2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 380, 63, -1));

        G3.setEditable(false);
        G3.setBackground(new java.awt.Color(204, 204, 204));
        G3.setText("Answer16");
        G3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), null));
        add(G3, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 402, 63, -1));

        H1.setEditable(false);
        H1.setBackground(new java.awt.Color(204, 204, 204));
        H1.setText("Answer17");
        H1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), null));
        add(H1, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 402, 63, -1));

        H2.setEditable(false);
        H2.setBackground(new java.awt.Color(204, 204, 204));
        H2.setText("Answer18");
        H2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), null));
        add(H2, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 424, 63, -1));

        H3.setEditable(false);
        H3.setBackground(new java.awt.Color(204, 204, 204));
        H3.setText("Answer19");
        H3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), null));
        add(H3, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 446, 63, -1));

        I1.setEditable(false);
        I1.setBackground(new java.awt.Color(204, 204, 204));
        I1.setText("Answer20");
        I1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), null));
        add(I1, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 468, 63, -1));

        I2.setEditable(false);
        I2.setBackground(new java.awt.Color(204, 204, 204));
        I2.setText("Answer21");
        I2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), null));
        add(I2, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 491, 63, -1));

        I3.setEditable(false);
        I3.setBackground(new java.awt.Color(204, 204, 204));
        I3.setText("Answer22");
        I3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), null));
        add(I3, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 512, 63, -1));

        I4.setEditable(false);
        I4.setBackground(new java.awt.Color(204, 204, 204));
        I4.setText("Answer23");
        I4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), null));
        add(I4, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 535, 63, -1));

        I5.setEditable(false);
        I5.setBackground(new java.awt.Color(204, 204, 204));
        I5.setText("Answer24");
        I5.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), null));
        add(I5, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 557, 63, -1));

        I6.setEditable(false);
        I6.setBackground(new java.awt.Color(204, 204, 204));
        I6.setText("Answer25");
        I6.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), null));
        I6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I6ActionPerformed(evt);
            }
        });
        add(I6, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 580, 63, -1));

        I7.setEditable(false);
        I7.setBackground(new java.awt.Color(204, 204, 204));
        I7.setText("Answer26");
        I7.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), null));
        I7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I7ActionPerformed(evt);
            }
        });
        add(I7, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 602, 63, -1));

        jTextArea1.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("1.           Block Into A           Side Fighting Stance Facing Your           And Say           .\n2. Point Forward, Step Forward Into A Forebalance, And Punch.\n3.           Block Into A           Side Fighting Stance Facing Your           .\n4. Point Forward, Step Forward Into A Forebalance, And Punch.\n5.           Block Into A           Side Forebalance Facing The Front.\n6. Point Forward, Step Forward And Punch, Step Forward And Punch Again, Step Forward And Punch A Third Time, Then Say           .\n7. Fold For A           Block, Spin 270 Degrees To Your Left, And Do A           Block.\n8. Point And Chamber, Step Forward Into A           Side Forebalance, And Punch.\n9. Do A           Block To The Other Side, Point And Chamber, Step Forward Into A           Side Forebalance, And Punch. \n10. Do A           Block To The Back In A           Side Forebalance.\n11. With The Same Hand You Did A Low Block With, Do A           Block.\n12. Step Forward And Do A Second           Block.\n13. Step Forward And Do A Third           Block.\n14. Step Forward And Do A Fourth           Block.\n15. Fold For A Chop, Spin 180 Degrees To Your Left, And Chop In A           Stance.\n16. Close Your Hand Into A Fist, Then Step Forward And Punch In A           Side Forebalance.\n17. Fold For A Chop, Spin 90 Degrees To Your Right, And Chop In A           Stance.\n18. Close Your Hand Into A Fist, Then Step Forward And Punch In A           Side Forebalance.\n19. Say           .\n");
        jScrollPane1.setViewportView(jTextArea1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 1510, 650));
    }// </editor-fold>//GEN-END:initComponents

    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A1ActionPerformed

    private void A3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A3ActionPerformed

    private void I6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_I6ActionPerformed

    private void I7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_I7ActionPerformed

    private void MainMenuButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainMenuButtonMouseClicked
        int confirm = JOptionPane.showOptionDialog(null,
            "Are You Sure You Want To Return To The Main Menu? You Will Lose All Progress.",
            "Exit Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (confirm == 0)
        {
            Main.display.DisplayMainMenu(false, true, false);
        }
    }//GEN-LAST:event_MainMenuButtonMouseClicked

    private void Left1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Left1MouseClicked
        selection = 1;
        paintingNew();
    }//GEN-LAST:event_Left1MouseClicked

    private void Right2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Right2MouseClicked
        selection = 2;
        paintingNew();
    }//GEN-LAST:event_Right2MouseClicked

    private void Kia3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kia3MouseClicked
        selection = 3;
        paintingNew();
    }//GEN-LAST:event_Kia3MouseClicked

    private void Pseudo4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pseudo4MouseClicked
        selection = 4;
        paintingNew();
    }//GEN-LAST:event_Pseudo4MouseClicked

    private void Low5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Low5MouseClicked
        selection = 5;
        paintingNew();
    }//GEN-LAST:event_Low5MouseClicked

    private void Box6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Box6MouseClicked
        selection = 6;
        paintingNew();
    }//GEN-LAST:event_Box6MouseClicked

    private void High7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_High7MouseClicked
        selection = 7;
        paintingNew();
    }//GEN-LAST:event_High7MouseClicked

    private void Horse8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Horse8MouseClicked
        selection = 8;
        paintingNew();
    }//GEN-LAST:event_Horse8MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField A1;
    private javax.swing.JTextField A2;
    private javax.swing.JTextField A3;
    private javax.swing.JTextField B1;
    private javax.swing.JTextField B2;
    private javax.swing.JButton Box6;
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
    private javax.swing.JButton High7;
    private javax.swing.JButton Horse8;
    private javax.swing.JTextField I1;
    private javax.swing.JTextField I2;
    private javax.swing.JTextField I3;
    private javax.swing.JTextField I4;
    private javax.swing.JTextField I5;
    private javax.swing.JTextField I6;
    private javax.swing.JTextField I7;
    private javax.swing.JButton Kia3;
    private javax.swing.JButton Left1;
    private javax.swing.JButton Low5;
    private javax.swing.JButton MainMenuButton;
    private javax.swing.JButton Pseudo4;
    private javax.swing.JButton Right2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
