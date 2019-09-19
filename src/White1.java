
import java.awt.Color;
import java.util.Arrays;
import javax.swing.JPanel;

/**
 *
 * @author MasterWard
 */
public class White1 extends javax.swing.JPanel {

    private String ans[] = {"Reverse", "Left", "Kia", "Reverse", "Right", "Reverse", "Left", "Reverse", "Reverse", "Reverse", "Reverse"}; // FOr debugging can delete later
    private int answer[] = {1, 2, 3, 4, 1, 3, 1, 2, 1, 1, 1, 1, 2, 3, 4, 1, 3, 1, 2, 1, 1, 1, 2, 2, 3, 2, 1, 2}; // Answers in int form
    private int selection[] = {0, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10}; //  Things for the answers
    private int index = 0; // Index of answers on
    private String options[] = {" ", "Reverse", "Left", "Right", "Kia"}; // The options to choose

    /**
     * Creates new form test1
     */
    public White1() {
        initComponents();
    }

    /* Create a method that deals with all of this */
    private void paintingNew() {
        if (selection[index] == answer[index]) { // Moving on
            index++;
            selection[index] = 0; // Setting to yellow
        }
        jTextField1.setText(options[selection[0]]);
        jTextField1.setBackground(getColor(0));
        jTextField2.setText(options[selection[1]]);
        jTextField2.setBackground(getColor(1));
        jTextField3.setText(options[selection[2]]);
        jTextField3.setBackground(getColor(2));
        jTextField4.setText(options[selection[3]]);
        jTextField4.setBackground(getColor(3));
        jTextField5.setText(options[selection[4]]);
        jTextField5.setBackground(getColor(4));
        jTextField6.setText(options[selection[5]]);
        jTextField6.setBackground(getColor(5));
        jTextField7.setText(options[selection[6]]);
        jTextField7.setBackground(getColor(6));
        jTextField8.setText(options[selection[7]]);
        jTextField8.setBackground(getColor(7));
        jTextField9.setText(options[selection[8]]);
        jTextField9.setBackground(getColor(8));
        jTextField10.setText(options[selection[9]]);
        jTextField10.setBackground(getColor(9));
        jTextField11.setText(options[selection[10]]);
        jTextField11.setBackground(getColor(10));
        jTextField12.setText(options[selection[11]]);
        jTextField12.setBackground(getColor(11));
        jTextField13.setText(options[selection[12]]);
        jTextField13.setBackground(getColor(12));
        jTextField14.setText(options[selection[13]]);
        jTextField14.setBackground(getColor(13));
        jTextField15.setText(options[selection[14]]);
        jTextField15.setBackground(getColor(14));
        jTextField16.setText(options[selection[15]]);
        jTextField16.setBackground(getColor(15));
        jTextField17.setText(options[selection[16]]);
        jTextField17.setBackground(getColor(16));
        jTextField18.setText(options[selection[17]]);
        jTextField18.setBackground(getColor(17));
        jTextField19.setText(options[selection[18]]);
        jTextField19.setBackground(getColor(18));
        jTextField20.setText(options[selection[19]]);
        jTextField20.setBackground(getColor(19));
        jTextField21.setText(options[selection[20]]);
        jTextField21.setBackground(getColor(20));
        jTextField22.setText(options[selection[21]]);
        jTextField22.setBackground(getColor(21));
        jTextField23.setText(options[selection[22]]);
        jTextField23.setBackground(getColor(22));
        jTextField24.setText(options[selection[23]]);
        jTextField24.setBackground(getColor(23));
        jTextField25.setText(options[selection[24]]);
        jTextField25.setBackground(getColor(24));
        jTextField26.setText(options[selection[25]]);
        jTextField26.setBackground(getColor(25));
        jTextField27.setText(options[selection[26]]);
        jTextField27.setBackground(getColor(26));
        jTextField28.setText(options[selection[27]]);
        jTextField28.setBackground(getColor(27));
        jTextField29.setText(options[selection[28]]);
        jTextField29.setBackground(getColor(28));
        System.out.println(Arrays.toString(answer));
        System.out.println(Arrays.toString(selection));
        System.out.println(index);
        for (int i = 1; i < 29; i++) { // Used to write the part above this
//            System.out.println("jTextField" + i + ".setText(options[selection[" + (i - 1) + "]]);");
//            System.out.println("jTextField" + i + ".setBackground(getColor(" + (i - 1) + "));");
            System.out.print("0,");
        }

//        System.out.println("FUCK YOU BROKE IT. I AM NOT THERE YET");
    }

    private Color getColor(int a) {
        if (selection[a] == 0) {
            return Color.YELLOW;
        } else if (selection[a] == 10) {// Clear ones
            return (new Color(204, 204, 204));
        } else if (selection[a] == answer[a]) {
            return Color.GREEN;
        } else {
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
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(204, 204, 204));
        setMaximumSize(new java.awt.Dimension(2400, 1000));
        setMinimumSize(new java.awt.Dimension(1600, 900));
        setName("White Belt"); // NOI18N
        setLayout(new java.awt.GridBagLayout());

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
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 117;
        gridBagConstraints.ipady = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 60, 0, 0);
        add(Reverse1, gridBagConstraints);

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
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 143;
        gridBagConstraints.ipady = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 17, 0, 0);
        add(Left2, gridBagConstraints);

        Right3.setText("Right");
        Right3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Right3MouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 16;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 145;
        gridBagConstraints.ipady = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 61, 0, 0);
        add(Right3, gridBagConstraints);

        Kia4.setText("Kia");
        Kia4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Kia4MouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 37;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 70;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 98;
        gridBagConstraints.ipady = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 24, 0, 0);
        add(Kia4, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Word Bank");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 14, 0, 0);
        add(jLabel2, gridBagConstraints);

        jTextField1.setEditable(false);
        jTextField1.setText("Answer1");
        jTextField1.setMaximumSize(new java.awt.Dimension(100, 100));
        jTextField1.setMinimumSize(new java.awt.Dimension(10, 22));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 46;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(43, 220, 0, 0);
        add(jTextField1, gridBagConstraints);

        jTextField2.setText("jTextField2");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 54;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(43, 0, 0, 0);
        add(jTextField2, gridBagConstraints);

        jTextField3.setText("jTextField3");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 16;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 22;
        gridBagConstraints.ipadx = 63;
        gridBagConstraints.ipady = -2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(43, 1, 0, 0);
        add(jTextField3, gridBagConstraints);

        jTextField5.setText("jTextField5");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 63;
        gridBagConstraints.ipady = -2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 20, 0, 0);
        add(jTextField5, gridBagConstraints);

        jTextField6.setText("jTextField6");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 63;
        gridBagConstraints.ipady = -2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 210, 0, 0);
        add(jTextField6, gridBagConstraints);

        jTextField7.setText("jTextField7");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 63;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 10, 0, 0);
        add(jTextField7, gridBagConstraints);

        jTextField8.setText("jTextField8");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 63;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 210, 0, 0);
        add(jTextField8, gridBagConstraints);

        jTextField4.setText("jTextField4");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 63;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 210, 0, 0);
        add(jTextField4, gridBagConstraints);

        jTextField9.setText("jTextField9");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 63;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        add(jTextField9, gridBagConstraints);

        jTextField10.setText("jTextField10");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 150, 0, 0);
        add(jTextField10, gridBagConstraints);

        jTextField11.setText("jTextField11");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 210, 0, 0);
        add(jTextField11, gridBagConstraints);

        jTextField12.setText("jTextField12");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 10, 0, 0);
        add(jTextField12, gridBagConstraints);

        jTextField13.setText("jTextField13");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 37;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 23;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 14, 0, 0);
        add(jTextField13, gridBagConstraints);

        jTextField14.setText("jTextField14");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 200, 0, 0);
        add(jTextField14, gridBagConstraints);

        jTextField15.setText("jTextField15");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 20, 0, 0);
        add(jTextField15, gridBagConstraints);

        jTextField16.setText("jTextField16");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 37;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 45;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 24, 0, 0);
        add(jTextField16, gridBagConstraints);

        jTextField17.setText("jTextField17");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 210, 0, 0);
        add(jTextField17, gridBagConstraints);

        jTextField18.setText("jTextField18");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 20, 0, 0);
        add(jTextField18, gridBagConstraints);

        jTextField19.setText("jTextField19");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 37;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 23;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 14, 0, 0);
        add(jTextField19, gridBagConstraints);

        jTextField20.setText("jTextField20");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 210, 0, 0);
        add(jTextField20, gridBagConstraints);

        jTextField21.setText("jTextField21");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 20, 0, 0);
        add(jTextField21, gridBagConstraints);

        jTextField22.setText("jTextField22");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 20, 0, 0);
        add(jTextField22, gridBagConstraints);

        jTextField23.setText("jTextField23");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 59;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 46;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 31, 0, 0);
        add(jTextField23, gridBagConstraints);

        jTextField24.setText("jTextField24");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 210, 0, 0);
        add(jTextField24, gridBagConstraints);

        jTextField25.setText("jTextField25");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 20, 0, 0);
        add(jTextField25, gridBagConstraints);

        jTextField26.setText("jTextField26");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 11;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridwidth = 21;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 4, 0, 0);
        add(jTextField26, gridBagConstraints);

        jTextField27.setText("jTextField27");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 59;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridwidth = 47;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 41, 0, 0);
        add(jTextField27, gridBagConstraints);

        jTextField28.setText("jTextField28");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 220, 0, 0);
        add(jTextField28, gridBagConstraints);

        jTextField29.setText("jTextField29");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 50, 0, 0);
        add(jTextField29, gridBagConstraints);

        jTextArea1.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("1. Step into a              side fighting stance facing your left, Say             and do a               Punch\n\n2. Step Into A              Side Fighting Stance Facing Your Right And Do A                Punch.\n\n3. Step Into A              Side Fighting Stance Facing The Front And Do A               Punch.\n\n4. Step Into A              Side Fighting Stance Facing The Back And Do A ______ Punch.\n\n5. Say          After the Reverse Punch\n\n6. Step Into A ______ Side Fighting Stance Facing Your Left, Do A ______ Kick, Then A ______ Punch.\n\n7. Step Into A ______ Side Fighting Stance Facing Your Right, Do A ______ Kick, Then A ______ Punch.\n\n8. Step Into A ______ Side Fighting Stance Facing The Back, Do A ______ Kick, Then A ______ Punch.\n\n9. Step Into A ______ Side Fighting Stance Facing The Front, Do A ______ ______ Kick, Then A ______ Punch.\n\n10. Step Into A ______ Side Fighting Stance Facing The Back, Do A ______ ______ Kick, Then A ______ Punch.\n\n11. Step Into A ______ Side Fighting Stance Facing The Front And Say ______.");
        jScrollPane1.setViewportView(jTextArea1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 109;
        gridBagConstraints.gridheight = 16;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 883;
        gridBagConstraints.ipady = 453;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(33, 90, 0, 254);
        add(jScrollPane1, gridBagConstraints);
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
        System.out.println("Clicked reverse when the answer is " + ans[index]);
        selection[index] = 1;
        paintingNew();
    }//GEN-LAST:event_Reverse1MouseClicked

    private void Left2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Left2MouseClicked
        System.out.println("Clicked Left when the answer is " + ans[index]);
        selection[index] = 2;
        paintingNew();
    }//GEN-LAST:event_Left2MouseClicked

    private void Right3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Right3MouseClicked
        System.out.println("Clicked Right when the answer is " + ans[index]);
        selection[index] = 3;
        paintingNew();
    }//GEN-LAST:event_Right3MouseClicked

    private void Kia4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kia4MouseClicked
        System.out.println("Clicked Kia when the answer is " + ans[index]);
        selection[index] = 4;
        paintingNew();
    }//GEN-LAST:event_Kia4MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Kia4;
    private javax.swing.JButton Left2;
    private javax.swing.JButton Reverse1;
    private javax.swing.JButton Right3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
