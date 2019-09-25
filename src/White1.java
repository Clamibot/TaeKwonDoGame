
import java.awt.Color;

/**
 *
 * @author MasterWard
 */
public class White1 extends javax.swing.JPanel {

    // private String ans[] = {"Reverse", "Left", "Kia", "Reverse", "Right", "Reverse", "Left", "Reverse", "Reverse", "Reverse", "Reverse"}; // FOr debugging can delete later
    private int answer[] = {2, 4, 1, 3, 1, 2, 1, 3, 1, 4, 2, 1, 2, 3, 4, 3, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2}; // Answers in int form
    private int selection[] = {0, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7}; //  Things for the answers
    private int index = 0; // Index of answers on
    private String options[] = {" ", "Reverse", "Left", "Right", "Kia", "", "", ""}; // The options to choose
// This also means that 0 is nothing, 1 is reverse, 2 is left, 3 is right and 4 Kia in the selection array.

    /**
     * White belt Interactive Form
     */
    public White1() {
        initComponents();
    }

    /**
     * Method that deals with the painting of JTextFields based on selection and
     * answer arrays
     */
    private void paintingNew() {
        if (selection[index] == answer[index]) { // Moving on
            index++;
            selection[index] = 0; // Setting to yellow
        }
        /**
         * The First one is the Line\Question A=1, B=2, C=3, D=4, E=5 and so on;
         * The number is for the order of questions on that line. 1 is first 2
         * second, 3 is third and so on
         */
        A1.setText(options[selection[0]]);
        A1.setBackground(getColor(0));
        A2.setText(options[selection[1]]);
        A2.setBackground(getColor(1));
        A3.setText(options[selection[2]]);
        A3.setBackground(getColor(2));
        B1.setText(options[selection[3]]);
        B1.setBackground(getColor(3));
        B2.setText(options[selection[4]]);
        B2.setBackground(getColor(4));
        C1.setText(options[selection[5]]);
        C1.setBackground(getColor(5));
        C2.setText(options[selection[6]]);
        C2.setBackground(getColor(6));
        D1.setText(options[selection[7]]);
        D1.setBackground(getColor(7));
        D2.setText(options[selection[8]]);
        D2.setBackground(getColor(8));
        E1.setText(options[selection[9]]);
        E1.setBackground(getColor(9));
        F1.setText(options[selection[10]]);
        F1.setBackground(getColor(10));
        F2.setText(options[selection[11]]);
        F2.setBackground(getColor(11));
        F3.setText(options[selection[12]]);
        F3.setBackground(getColor(12));
        G1.setText(options[selection[13]]);
        G1.setBackground(getColor(13));
        G2.setText(options[selection[14]]);
        G2.setBackground(getColor(14));
        G3.setText(options[selection[15]]);
        G3.setBackground(getColor(15));
        H1.setText(options[selection[16]]);
        H1.setBackground(getColor(16));
        H2.setText(options[selection[17]]);
        H2.setBackground(getColor(17));
        H3.setText(options[selection[18]]);
        H3.setBackground(getColor(18));
        I1.setText(options[selection[19]]);
        I1.setBackground(getColor(19));
        I2.setText(options[selection[20]]);
        I2.setBackground(getColor(20));
        I3.setText(options[selection[21]]);
        I3.setBackground(getColor(21));
        I4.setText(options[selection[22]]);
        I4.setBackground(getColor(22));
        J1.setText(options[selection[23]]);
        J1.setBackground(getColor(23));
        J2.setText(options[selection[24]]);
        J2.setBackground(getColor(24));
        J3.setText(options[selection[25]]);
        J3.setBackground(getColor(25));
        J4.setText(options[selection[26]]);
        J4.setBackground(getColor(26));
        K1.setText(options[selection[27]]);
        K1.setBackground(getColor(27));
        K2.setText(options[selection[28]]);
        K2.setBackground(getColor(28));
        /* For debugging */
        //       System.out.println(Arrays.toString(answer));
        //     System.out.println(Arrays.toString(selection));
        //       System.out.println(index);
        /* For writting the JTextField code really quick */
 /*
        for (int i = 1; i < 29; i++) { // Used to write the part above this
            System.out.println("jTextField" + i + ".setText(options[selection[" + (i - 1) + "]]);");
            System.out.println("jTextField" + i + ".setBackground(getColor(" + (i - 1) + "));");
            System.out.print("0,"); // For the array
        }
         */

//        System.out.println("FUCK YOU BROKE IT. I AM NOT THERE YET");
    }

    /**
     * To decide what color each JTextField is going to be painted
     *
     * @param a
     * @return
     */
    private Color getColor(int a) {
        if (selection[a] == 0) { // Is the next one
            return Color.YELLOW;
        } else if (selection[a] == 7) {// Clear ones
            return (new Color(204, 204, 204));
        } else if (selection[a] == answer[a]) { // Right
            return Color.GREEN;
        } else { // Wrong
            return Color.RED;
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
        J1 = new javax.swing.JTextField();
        J2 = new javax.swing.JTextField();
        J3 = new javax.swing.JTextField();
        J4 = new javax.swing.JTextField();
        K1 = new javax.swing.JTextField();
        K2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(204, 204, 204));
        setMaximumSize(new java.awt.Dimension(2400, 1000));
        setMinimumSize(new java.awt.Dimension(1600, 900));
        setName("White Belt"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1600, 900));
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
        add(Reverse1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 196, 47));

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
        add(Left2, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 59, 196, 47));

        Right3.setText("Right");
        Right3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Right3MouseClicked(evt);
            }
        });
        add(Right3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 206, 47));

        Kia4.setText("Kia");
        Kia4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Kia4MouseClicked(evt);
            }
        });
        add(Kia4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 60, 147, 47));

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
        add(A1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, -1));

        A2.setBackground(new java.awt.Color(240, 240, 240));
        A2.setText("Answer2");
        add(A2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 60, -1));

        A3.setBackground(new java.awt.Color(240, 240, 240));
        A3.setText("Answer3");
        A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A3ActionPerformed(evt);
            }
        });
        add(A3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 140, -1, 20));

        B2.setBackground(new java.awt.Color(240, 240, 240));
        B2.setText("Answer5");
        add(B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, -1, 20));

        C1.setBackground(new java.awt.Color(240, 240, 240));
        C1.setText("Answer6");
        add(C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 70, 20));

        C2.setBackground(new java.awt.Color(240, 240, 240));
        C2.setText("Answer7");
        add(C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 220, -1, -1));

        D1.setBackground(new java.awt.Color(240, 240, 240));
        D1.setText("Answer8");
        add(D1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, -1, -1));

        B1.setBackground(new java.awt.Color(240, 240, 240));
        B1.setText("Answer4");
        add(B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));

        D2.setBackground(new java.awt.Color(240, 240, 240));
        D2.setText("Answer9");
        add(D2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 270, -1, -1));

        E1.setBackground(new java.awt.Color(240, 240, 240));
        E1.setText("Answer10");
        add(E1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 318, 80, -1));

        F1.setBackground(new java.awt.Color(240, 240, 240));
        F1.setText("Answer11");
        add(F1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, -1, -1));

        F2.setBackground(new java.awt.Color(240, 240, 240));
        F2.setText("Answer12");
        add(F2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, -1, -1));

        F3.setBackground(new java.awt.Color(240, 240, 240));
        F3.setText("Answer13");
        add(F3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 360, -1, -1));

        G1.setBackground(new java.awt.Color(240, 240, 240));
        G1.setText("Answer14");
        add(G1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, -1, -1));

        G2.setBackground(new java.awt.Color(240, 240, 240));
        G2.setText("Answer15");
        add(G2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 400, -1, -1));

        G3.setBackground(new java.awt.Color(240, 240, 240));
        G3.setText("Answer16");
        add(G3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 400, -1, -1));

        H1.setEditable(false);
        H1.setText("Answer17");
        add(H1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, -1, -1));

        H2.setBackground(new java.awt.Color(240, 240, 240));
        H2.setText("Answer18");
        add(H2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 440, -1, -1));

        H3.setBackground(new java.awt.Color(240, 240, 240));
        H3.setText("Answer19");
        add(H3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 440, -1, -1));

        I1.setBackground(new java.awt.Color(240, 240, 240));
        I1.setText("Answer20");
        add(I1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, -1, -1));

        I2.setBackground(new java.awt.Color(240, 240, 240));
        I2.setText("Answer21");
        add(I2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 490, -1, -1));

        I3.setBackground(new java.awt.Color(240, 240, 240));
        I3.setText("Answer22");
        add(I3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 490, -1, -1));

        I4.setBackground(new java.awt.Color(240, 240, 240));
        I4.setText("Answer23");
        add(I4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 490, -1, -1));

        J1.setBackground(new java.awt.Color(240, 240, 240));
        J1.setText("Answer24");
        add(J1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 530, -1, -1));

        J2.setBackground(new java.awt.Color(240, 240, 240));
        J2.setText("Answer25");
        J2.setToolTipText("");
        add(J2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 530, -1, -1));

        J3.setBackground(new java.awt.Color(240, 240, 240));
        J3.setText("Answer26");
        add(J3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 530, -1, -1));

        J4.setBackground(new java.awt.Color(240, 240, 240));
        J4.setText("Answer27");
        add(J4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 530, -1, -1));

        K1.setBackground(new java.awt.Color(240, 240, 240));
        K1.setText("Answer28");
        add(K1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 580, -1, -1));

        K2.setBackground(new java.awt.Color(240, 240, 240));
        K2.setText("Answer29");
        add(K2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 580, -1, -1));

        jTextArea1.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("1. Step into a              Side Fighting stance facing your left, Say             And Do A             Punch\n\n2. Step into a              Side Fighting Stance Facing Your Right And Do A                Punch.\n\n3. Step Into A              Side Fighting Stance Facing The Front And Do A               Punch.\n\n4. Step Into A              Side Fighting Stance Facing The Back And Do a              Punch.\n\n5. Say                After the Reverse Punch\n\n6. Step Into a               Side Fighting Stance Facing Your Left, do a                Kick, then a               Punch.\n\n7. Step Into a               Side Fighting Stance Facing Your Right, do a               Kick, Then A              Punch.\n\n8. Step Into a               Side Fighting Stance Facing The Back, Do A             Kick, Then A              Punch.\n\n9. Step Into a               Side Fighting Stance Facing The Front, Do A                          Kick, Then A     Punch.\n\n10. Step Into a               Side Fighting Stance Facing The Back, Do A           Kick, Then A                  Punch.\n\n11. Step Into a               Side Fighting Stance Facing The Front And Say              .");
        jScrollPane1.setViewportView(jTextArea1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 134, 920, 510));
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
        selection[index] = 1;
        paintingNew();
    }//GEN-LAST:event_Reverse1MouseClicked

    private void Left2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Left2MouseClicked
        //  System.out.println("Clicked Left when the answer is " + ans[index]);
        selection[index] = 2;
        paintingNew();
    }//GEN-LAST:event_Left2MouseClicked

    private void Right3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Right3MouseClicked
        //    System.out.println("Clicked Right when the answer is " + ans[index]);
        selection[index] = 3;
        paintingNew();
    }//GEN-LAST:event_Right3MouseClicked

    private void Kia4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kia4MouseClicked
        //  System.out.println("Clicked Kia when the answer is " + ans[index]);
        selection[index] = 4;
        paintingNew();
    }//GEN-LAST:event_Kia4MouseClicked

    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A1ActionPerformed

    private void A3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A3ActionPerformed


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
    private javax.swing.JTextField J1;
    private javax.swing.JTextField J2;
    private javax.swing.JTextField J3;
    private javax.swing.JTextField J4;
    private javax.swing.JTextField K1;
    private javax.swing.JTextField K2;
    private javax.swing.JButton Kia4;
    private javax.swing.JButton Left2;
    private javax.swing.JButton Reverse1;
    private javax.swing.JButton Right3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
