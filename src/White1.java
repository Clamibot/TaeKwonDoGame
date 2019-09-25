
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
        if (selection[a] == 7) {// Clear ones
            return (new Color(204, 204, 204));
        } else if (selection[a] == 0) { // Is the next one
            return Color.YELLOW;
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
        java.awt.GridBagConstraints gridBagConstraints;

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
        setMaximumSize(new java.awt.Dimension(1620, 920));
        setMinimumSize(new java.awt.Dimension(1620, 920));
        setName("White Belt"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1610, 910));
        setLayout(new java.awt.GridBagLayout());

        Reverse1.setBackground(new java.awt.Color(0, 240, 240));
        Reverse1.setText("Reverse");
        Reverse1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Reverse1MouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 71;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 195, 0, 0);
        add(Reverse1, gridBagConstraints);

        Left2.setText("Left");
        Left2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Left2MouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 98;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 89, 0, 0);
        add(Left2, gridBagConstraints);

        Right3.setText("Right");
        Right3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Right3MouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 26;
        gridBagConstraints.ipadx = 88;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 6, 0, 0);
        add(Right3, gridBagConstraints);

        Kia4.setText("Kia");
        Kia4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Kia4MouseClicked(evt);
            }
        });
        Kia4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Kia4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 52;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 102;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 33, 0, 0);
        add(Kia4, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Word Bank");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 3, 0, 0);
        add(jLabel2, gridBagConstraints);

        A1.setEditable(false);
        A1.setText("Answer1");
        A1.setMaximumSize(new java.awt.Dimension(100, 100));
        A1.setMinimumSize(new java.awt.Dimension(10, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 46;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 230, 0, 0);
        add(A1, gridBagConstraints);

        A2.setBackground(new java.awt.Color(240, 240, 240));
        A2.setText("Answer2");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 54;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 45, 0, 0);
        add(A2, gridBagConstraints);

        A3.setBackground(new java.awt.Color(240, 240, 240));
        A3.setText("Answer3");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 23;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 28;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = -2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 34, 0, 0);
        add(A3, gridBagConstraints);

        B2.setBackground(new java.awt.Color(240, 240, 240));
        B2.setText("Answer5");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = -2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 0, 0, 0);
        add(B2, gridBagConstraints);

        C1.setBackground(new java.awt.Color(240, 240, 240));
        C1.setText("Answer6");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 54;
        gridBagConstraints.ipady = -2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 228, 0, 0);
        add(C1, gridBagConstraints);

        C2.setBackground(new java.awt.Color(240, 240, 240));
        C2.setText("Answer7");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 0, 0, 0);
        add(C2, gridBagConstraints);

        D1.setBackground(new java.awt.Color(240, 240, 240));
        D1.setText("Answer8");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 228, 0, 0);
        add(D1, gridBagConstraints);

        B1.setBackground(new java.awt.Color(240, 240, 240));
        B1.setText("Answer4");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 230, 0, 0);
        add(B1, gridBagConstraints);

        D2.setBackground(new java.awt.Color(240, 240, 240));
        D2.setText("Answer9");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 5, 0, 0);
        add(D2, gridBagConstraints);

        E1.setBackground(new java.awt.Color(240, 240, 240));
        E1.setText("Answer10");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.ipadx = 74;
        gridBagConstraints.insets = new java.awt.Insets(18, 165, 0, 0);
        add(E1, gridBagConstraints);

        F1.setBackground(new java.awt.Color(240, 240, 240));
        F1.setText("Answer11");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 57;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 220, 0, 0);
        add(F1, gridBagConstraints);

        F2.setBackground(new java.awt.Color(240, 240, 240));
        F2.setText("Answer12");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 57;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 65, 0, 0);
        add(F2, gridBagConstraints);

        F3.setBackground(new java.awt.Color(240, 240, 240));
        F3.setText("Answer13");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 51;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.ipadx = 57;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 4, 0, 0);
        add(F3, gridBagConstraints);

        G1.setBackground(new java.awt.Color(240, 240, 240));
        G1.setText("Answer14");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 57;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 220, 0, 0);
        add(G1, gridBagConstraints);

        G2.setBackground(new java.awt.Color(240, 240, 240));
        G2.setText("Answer15");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 57;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 75, 0, 0);
        add(G2, gridBagConstraints);

        G3.setBackground(new java.awt.Color(240, 240, 240));
        G3.setText("Answer16");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 51;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.ipadx = 57;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 4, 0, 0);
        add(G3, gridBagConstraints);

        H1.setEditable(false);
        H1.setText("Answer17");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 57;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 220, 0, 0);
        add(H1, gridBagConstraints);

        H2.setBackground(new java.awt.Color(240, 240, 240));
        H2.setText("Answer18");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 57;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 75, 0, 0);
        add(H2, gridBagConstraints);

        H3.setBackground(new java.awt.Color(240, 240, 240));
        H3.setText("Answer19");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 51;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.ipadx = 57;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 4, 0, 0);
        add(H3, gridBagConstraints);

        I1.setBackground(new java.awt.Color(240, 240, 240));
        I1.setText("Answer20");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 57;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 220, 0, 0);
        add(I1, gridBagConstraints);

        I2.setBackground(new java.awt.Color(240, 240, 240));
        I2.setText("Answer21");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 57;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 75, 0, 0);
        add(I2, gridBagConstraints);

        I3.setBackground(new java.awt.Color(240, 240, 240));
        I3.setText("Answer22");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 12;
        gridBagConstraints.ipadx = 57;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 7, 0, 0);
        add(I3, gridBagConstraints);

        I4.setBackground(new java.awt.Color(240, 240, 240));
        I4.setText("Answer23");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 52;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 57;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 17, 0, 0);
        add(I4, gridBagConstraints);

        J1.setBackground(new java.awt.Color(240, 240, 240));
        J1.setText("Answer24");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 54;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 230, 0, 0);
        add(J1, gridBagConstraints);

        J2.setBackground(new java.awt.Color(240, 240, 240));
        J2.setText("Answer25");
        J2.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 57;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 75, 0, 0);
        add(J2, gridBagConstraints);

        J3.setBackground(new java.awt.Color(240, 240, 240));
        J3.setText("Answer26");
        J3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 51;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.ipadx = 57;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 4, 0, 0);
        add(J3, gridBagConstraints);

        J4.setBackground(new java.awt.Color(240, 240, 240));
        J4.setText("Answer27");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 52;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.ipadx = 57;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 7, 0, 0);
        add(J4, gridBagConstraints);

        K1.setBackground(new java.awt.Color(240, 240, 240));
        K1.setText("Answer28");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 54;
        gridBagConstraints.insets = new java.awt.Insets(23, 232, 5, 3);
        add(K1, gridBagConstraints);

        K2.setBackground(new java.awt.Color(240, 240, 240));
        K2.setText("Answer29");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 57;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 5, 0, 0);
        add(K2, gridBagConstraints);

        jTextArea1.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("1. Step into A              Side Fighting stance facing your left, Say             And Do A             Punch\n\n2. Step into A              Side Fighting Stance Facing Your Right And Do A             Punch.\n\n3. Step Into A              Side Fighting Stance Facing The Front And Do A            Punch.\n\n4. Step Into A              Side Fighting Stance Facing The Back And Do a             Punch.\n\n5. Say                  After the Reverse Punch\n\n6. Step Into a              Side Fighting Stance Facing Your Left, do a                Kick, then a             Punch.\n\n7. Step Into a              Side Fighting Stance Facing Your Right, do a              Kick, Then A             Punch.\n\n8. Step Into a              Side Fighting Stance Facing The Back, Do A               Kick, Then A             Punch.\n\n9. Step Into a              Side Fighting Stance Facing The Front, Do A                           Kick, Then A              Punch.\n\n10. Step Into a             Side Fighting Stance Facing The Back, Do A              Kick, Then A                         Punch.\n\n11. Step Into a             Side Fighting Stance Facing The Front And Say              .");
        jTextArea1.setMinimumSize(new java.awt.Dimension(1400, 466));
        jTextArea1.setPreferredSize(new java.awt.Dimension(1400, 466));
        jScrollPane1.setViewportView(jTextArea1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 56;
        gridBagConstraints.gridheight = 18;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 1065;
        gridBagConstraints.ipady = 490;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 100, 273, 428);
        add(jScrollPane1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void Reverse1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Reverse1MouseClicked
        selection[index] = 1;
        paintingNew();
    }//GEN-LAST:event_Reverse1MouseClicked

    private void Left2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Left2MouseClicked
        selection[index] = 2;
        paintingNew();
    }//GEN-LAST:event_Left2MouseClicked

    private void Right3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Right3MouseClicked
        selection[index] = 3;
        paintingNew();
    }//GEN-LAST:event_Right3MouseClicked

    private void Kia4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kia4MouseClicked
        selection[index] = 4;
        paintingNew();
    }//GEN-LAST:event_Kia4MouseClicked

    private void Kia4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Kia4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Kia4ActionPerformed

    private void J3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_J3ActionPerformed


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
