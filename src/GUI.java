
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * This class is the game's graphics engine. Each graphics instance gets its own
 * thread.
 *
 * @author Matthew Wethington
 */
public class GUI extends Thread {

    private int done;
    public JTextField output;
    public JPanel contentPane = new JPanel(null);
    public JPanel cont = new JPanel(new GridBagLayout());
    public JFrame displaywindow = new JFrame();
    public JFrame messages = new JFrame("JOptionPane showMessageDialog example");

    // Define all buttons here and load images into them if needed
    private final JButton main_menu_button = new JButton();
    private final JButton main_menu_button_menu = new JButton();
    private JButton white_belt_button = new JButton(new ImageIcon("src/resources/white_belt.jpg"));
    private JButton gold_belt_button = new JButton(new ImageIcon("src/resources/gold_belt.jpg"));
    private JButton orange_belt_button = new JButton(new ImageIcon("src/resources/orange_belt.jpg"));
    private JButton purple_belt_button = new JButton(new ImageIcon("src/resources/purple_belt.jpg"));
    private JButton green_belt_button = new JButton(new ImageIcon("src/resources/green_belt.jpg"));
    private JButton blue_belt_button = new JButton(new ImageIcon("src/resources/blue_belt.jpg"));
    private JButton red_belt_button = new JButton(new ImageIcon("src/resources/red_belt.jpg"));
    private JButton brown_belt_button = new JButton(new ImageIcon("src/resources/brown_belt.jpg"));
    private JButton black_belt_button = new JButton(new ImageIcon("src/resources/black_belt.jpg"));

    // Load the background image
    private JLabel background = new JLabel(new ImageIcon("src/resources/UMAA_LOGO.png"));

    /* Fonts Specifications */
    // The default font that it is using for the content 
    Font contentFont = new Font("sansserif", 0, 32);
    // Font that using for the titles
    Font titleFont = new Font("sansserif", 0, 14);

    // Allows for custom behavior when clicking the close button
    private WindowListener exitListener = new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
            int confirm = JOptionPane.showOptionDialog(null, "Are You Sure You Want To Exit The Game?",
                    "Exit Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
            if (confirm == 0) {
                // Kill all threads and exit
                try {
                    Main.display.kill();
                 //   JOptionPane.showMessageDialog(null, "Thanks For Playing!"); // Put this CODE BACK IN LATER
                 // DO NOT DELETE THE CODE ON TOP OF HERE
                    System.exit(0);
                } catch (Exception closeException) {
                    // Force the program to close if it's being stupid
                    JOptionPane.showMessageDialog(null,
                            "Something Went Wrong When Attempting To Kill Program Threads. Force Closing Program.");
                    System.exit(0);
                }
            }
        }
    };

    public GUI() {

    }

    public void run() {
        while (done == 0) {
            try {
                // Have the graphics thread run until the program is terminated or the thread is
                // signaled to halt execution.
                Thread.sleep(1);// Check every millisecond if this thread should terminate
            } catch (Exception e) {
                System.out.print("Graphics Thread Error: " + e + "/n");
            }
        }
    }

    public void kill() throws Exception {
        done = 1;
        this.join();
    }

    /**
     * This method initializes the graphics window.
     */
    public void init() {
        // Creates the display window
        displaywindow.setTitle("Tae Kwon Do Matchup");
        displaywindow.setSize(1600, 900);// 900p resolution
        contentPane.setPreferredSize(new Dimension(1600, 900));
        contentPane.setBackground(new Color(255, 255, 255));
        background.setBounds(0, 0, 1600, 900);

        // Add contentPanel to JFramem set window position, and set window close
        // operation
        displaywindow.add(contentPane);
        displaywindow.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        displaywindow.addWindowListener(exitListener);
        displaywindow.setLocationRelativeTo(null);
        displaywindow.pack();
        displaywindow.setVisible(true);
        displaywindow.setResizable(false);

        // Creates the text output box
        output = new JTextField();
        output.setBackground(new Color(255, 255, 255));
        output.setEnabled(true);
        output.setEditable(false);
        output.setFont(new Font("sansserif", 0, 24));

        // Specify the button positions and text for all buttons used in the program
        main_menu_button.setText("Back To Main Menu");
        main_menu_button.setBounds(520, 850, 300, 50);
        main_menu_button_menu.setText("Back To Main Menu");
        main_menu_button_menu.setBounds(5, 850, 300, 50);
        white_belt_button.setBounds(30, 40, 300, 79);
        gold_belt_button.setBounds(30, 190, 300, 79);
        orange_belt_button.setBounds(30, 340, 300, 79);
        purple_belt_button.setBounds(30, 490, 300, 79);
        green_belt_button.setBounds(30, 640, 300, 79);
        blue_belt_button.setBounds(30, 790, 300, 79);
        red_belt_button.setBounds(1270, 40, 300, 79);
        brown_belt_button.setBounds(1270, 190, 300, 79);
        black_belt_button.setBounds(1270, 340, 300, 79);

        DisplayMainMenu(true);
    }

    /**
     * This method activates the mouse listeners for all the buttons in the
     * game.
     */
    public void ActivateMouseListeners() {
        // Add MouseListeners to the buttons
        main_menu_button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int confirm = JOptionPane.showOptionDialog(null,
                        "Are You Sure You Want To Return To The Main Menu? You Will Lose All Progress.",
                        "Exit Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                if (confirm == 0) {
                    Main.display.DisplayMainMenu(false);
                }
            }
        });
        main_menu_button_menu.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Main.display.DisplayMainMenu(false);
            }
        });
        white_belt_button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                contentPane.removeAll();
                displaywindow.remove(contentPane);
                cont.add(new White1());
                displaywindow.add(cont);
                displaywindow.pack();
            }
        });
        gold_belt_button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                contentPane.removeAll();
                displaywindow.remove(contentPane);
                cont.add(new Gold1());
                displaywindow.add(cont);
                displaywindow.pack();
//                Main.display.DisplayKata2();
            }
        });
        orange_belt_button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Main.display.DisplayKata3();
            }
        });
        purple_belt_button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Main.display.DisplayKata4();
            }
        });
        green_belt_button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Main.display.DisplayKata5();
            }
        });
        blue_belt_button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Main.display.DisplayBlueBeltMenu();
            }
        });
        red_belt_button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Main.display.DisplayRedBeltMenu();
            }
        });
        brown_belt_button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Main.display.DisplayBrownBeltMenu();
            }
        });
        black_belt_button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Main.display.DisplayKata13();
            }
        });
    }

    /**
     * This method displays the game's main menu
     *
     * @param displayIntroText Whether the intro text should be displayed or
     * not.
     */
    public void DisplayMainMenu(boolean displayIntroText) {
        // Clear the previous scene and prep for the new one
        contentPane.removeAll();

        // Move the text output box
        output.setBounds(490, 520, 645, 50);

        // Add components to the contentPane panel
        contentPane.add(output);
        contentPane.add(background);
        contentPane.add(white_belt_button);
        contentPane.add(gold_belt_button);
        contentPane.add(orange_belt_button);
        contentPane.add(purple_belt_button);
        contentPane.add(green_belt_button);
        contentPane.add(blue_belt_button);
        contentPane.add(red_belt_button);
        contentPane.add(brown_belt_button);
        contentPane.add(black_belt_button);
        contentPane.repaint();

        if (displayIntroText) {
            try {
                output.setText("Welcome To Tae Kwon Do Matchup!");
                Thread.sleep(2000);// Set the delay between text box updates as 1 second
                output.setText("Please Select Your Experience Level By Clicking On A Belt.");
                // This fixes a bug with the text output box in the event players click on a
                // button before all the intro text is displayed.
                ActivateMouseListeners();
            } catch (Exception e) {
                System.out.print("Graphics Thread Error: " + e + "/n");
            }
        } else {
            output.setText("Please Select Your Experience Level By Clicking On A Belt.");
        }
    }

    public void PrepForKataFrame(String kataTitle) {
        // Clear the previous scene and prep for the new one
        contentPane.removeAll();
        contentPane.setBackground(new Color(240, 240, 240));
        output.setBounds(5, 850, 500, 50);

        // Set up the move bank
        JLabel movebank = new JLabel("Move Bank:");
        movebank.setFont(new Font("sansserif", 1, 32));
        movebank.setBounds(280, 5, 500, 40);

        // Title for the kata
        JLabel title = new JLabel(kataTitle);
        title.setFont(new Font("sansserif", 1, 32));
        title.setBounds(900, 5, 500, 40);

        // Update the screen
        contentPane.add(output);
        contentPane.add(main_menu_button);
        contentPane.add(title);
    }

    /**
     * This method displays the selection menu for blue belt katas
     */
    public void DisplayBlueBeltMenu() {
        // Clear the previous scene and prep for the new one
        contentPane.removeAll();
        JLabel kataText = new JLabel("Yo-Guk");
        kataText.setFont(titleFont);
        kataText.setBounds(140, 120, 300, 25);
        JLabel kataText2 = new JLabel("Jun-Guin");
        kataText2.setFont(titleFont);
        kataText2.setBounds(135, 270, 300, 25);
        output.setBounds(490, 520, 645, 50);

        // Load all necessary images into buttons
        JButton blue_belt_button = new JButton(new ImageIcon("src/resources/blue_belt.jpg"));
        blue_belt_button.setBounds(30, 40, 300, 79);
        JButton blue_belt_button2 = new JButton(new ImageIcon("src/resources/blue_belt.jpg"));
        blue_belt_button2.setBounds(30, 190, 300, 79);

        // Add components to the contentPane panel
        contentPane.add(background);
        contentPane.add(output);
        contentPane.add(kataText);
        contentPane.add(kataText2);
        contentPane.add(main_menu_button_menu);
        contentPane.add(blue_belt_button);
        contentPane.add(blue_belt_button2);

        // Activate mouse listeners for buttons
        blue_belt_button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Main.display.DisplayKata6();
            }
        });
        blue_belt_button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Main.display.DisplayKata7();
            }
        });

        contentPane.repaint();
        output.setText("Choose A Kata.");
    }

    /**
     * This method displays the selection menu for red belt katas
     */
    public void DisplayRedBeltMenu() {
        // Clear the previous scene and prep for the new one
        contentPane.removeAll();
        JLabel kataText = new JLabel("Tai-Gei");
        kataText.setFont(titleFont);
        kataText.setBounds(140, 120, 300, 25);
        JLabel kataText2 = new JLabel("Wa-Wrang");
        kataText2.setFont(titleFont);
        kataText2.setBounds(127, 270, 300, 25);
        output.setBounds(490, 520, 645, 50);

        // Load all necessary images into buttons
        JButton red_belt_button = new JButton(new ImageIcon("src/resources/red_belt.jpg"));
        red_belt_button.setBounds(30, 40, 300, 79);
        JButton red_belt_button2 = new JButton(new ImageIcon("src/resources/red_belt.jpg"));
        red_belt_button2.setBounds(30, 190, 300, 79);

        // Add components to the contentPane panel
        contentPane.add(background);
        contentPane.add(output);
        contentPane.add(kataText);
        contentPane.add(kataText2);
        contentPane.add(main_menu_button_menu);
        contentPane.add(red_belt_button);
        contentPane.add(red_belt_button2);

        // Activate mouse listeners for buttons
        red_belt_button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Main.display.DisplayKata8();
            }
        });
        red_belt_button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Main.display.DisplayKata9();
            }
        });

        contentPane.repaint();
        output.setText("Choose A Kata.");
    }

    /**
     * This method displays the selection menu for brown belt katas
     */
    public void DisplayBrownBeltMenu() {
        // Clear the previous scene and prep for the new one
        contentPane.removeAll();
        JLabel kataText = new JLabel("Chung-Mu");
        kataText.setFont(titleFont);
        kataText.setBounds(135, 120, 300, 25);
        JLabel kataText2 = new JLabel("Bo Form 1");
        kataText2.setFont(titleFont);
        kataText2.setBounds(135, 270, 300, 25);
        JLabel kataText3 = new JLabel("Bo Form 2");
        kataText3.setFont(titleFont);
        kataText3.setBounds(135, 420, 300, 25);
        output.setBounds(490, 520, 645, 50);

        // Load all necessary images into buttons
        JButton brown_belt_button = new JButton(new ImageIcon("src/resources/brown_belt.jpg"));
        brown_belt_button.setBounds(30, 40, 300, 79);
        JButton brown_belt_button2 = new JButton(new ImageIcon("src/resources/brown_belt.jpg"));
        brown_belt_button2.setBounds(30, 190, 300, 79);
        JButton brown_belt_button3 = new JButton(new ImageIcon("src/resources/brown_belt.jpg"));
        brown_belt_button3.setBounds(30, 340, 300, 79);

        // Add components to the contentPane panel
        contentPane.add(background);
        contentPane.add(output);
        contentPane.add(kataText);
        contentPane.add(kataText2);
        contentPane.add(kataText3);
        contentPane.add(main_menu_button_menu);
        contentPane.add(brown_belt_button);
        contentPane.add(brown_belt_button2);
        contentPane.add(brown_belt_button3);

        // Activate mouse listeners for buttons
        brown_belt_button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Main.display.DisplayKata10();
            }
        });
        brown_belt_button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Main.display.DisplayKata11();
            }
        });
        brown_belt_button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Main.display.DisplayKata12();
            }
        });

        contentPane.repaint();
        output.setText("Choose A Kata.");
    }

    /**
     * This method displays the graphics for completing kata kee-cho
     */
    public void DisplayKata1() {
        contentPane.removeAll();
        contentPane.add(new White1());
        contentPane.repaint();

        // List the steps with some parts missing
        JLabel step1 = new JLabel(
                "1. Step Into A ____ Side Fighting Stance Facing Your Left, Say ____, And Do A _______ Punch.");//Answers: left, kia, reverse
        step1.setFont(contentFont);
        step1.setBounds(15, 150, 1000, 250);
        JLabel step2 = new JLabel("2. Step Into A ____ Side Fighting Stance Facing Your Right And Do A _______ Punch.");///Answers: right, reverse
        step2.setFont(contentFont);
        step2.setBounds(760, 75, 640, 20);
        JLabel step3 = new JLabel("3. Step Into A ____ Side Fighting Stance Facing The Front And Do A _______ Punch.");//Answers: left, reverse
        step3.setFont(contentFont);
        step3.setBounds(760, 100, 640, 20);
        JLabel step4 = new JLabel("4. Step Into A ____ Side Fighting Stance Facing The Back And Do A _______ Punch.");//Answers: right, reverse
        step4.setFont(contentFont);
        step4.setBounds(760, 125, 640, 20);
        JLabel step5 = new JLabel("5. Say ___ After The Reverse Punch.");//Answer: kia
        step5.setFont(contentFont);
        step5.setBounds(760, 150, 640, 20);
        JLabel step6 = new JLabel(
                "6. Step Into A ____ Side Fighting Stance Facing Your Left, Do A _____ Kick, Then A _______ Punch.");//Answers: left, front, reverse
        step6.setFont(contentFont);
        step6.setBounds(760, 175, 640, 20);
        JLabel step7 = new JLabel(
                "7. Step Into A ____ Side Fighting Stance Facing Your Right, Do A _____ Kick, Then A _______ Punch.");//Answers: right, front, reverse
        step7.setFont(contentFont);
        step7.setBounds(760, 200, 740, 20);
        JLabel step8 = new JLabel(
                "8. Step Into A ____ Side Fighting Stance Facing The Back, Do A _____ Kick, Then A _______ Punch.");//Answers: left, front, reverse
        step8.setFont(contentFont);
        step8.setBounds(760, 225, 660, 20);
        JLabel step9 = new JLabel(
                "9. Step Into A ____ Side Fighting Stance Facing The Front, Do A ________ _____ Kick, Then A _______ Punch.");//Answers: right, slide-up front, reverse
        step9.setFont(contentFont);
        step9.setBounds(760, 250, 740, 20);
        JLabel step10 = new JLabel(
                "10. Step Into A ____ Side Fighting Stance Facing The Back, Do A ________ _____ Kick, Then A _______ Punch.");//Answers: left, slide-up front, reverse
        step10.setFont(contentFont);
        step10.setBounds(760, 275, 740, 20);
        JLabel step11 = new JLabel("11. Step Into A ____ Side Fighting Stance Facing The Front And Say ___.");//Answers: right, kia
        step11.setFont(contentFont);
        step11.setBounds(760, 300, 640, 20);
    }

    /**
     * This method displays the graphics for completing kata chun-g
     */
    public void DisplayKata2() {
        // Clear the previous scene and prep for the new one
        PrepForKataFrame("Steps For Kata Chun-G:");
        contentPane.add(new Gold1());
        // List the steps with some parts missing
        JLabel step1 = new JLabel(
                "1. Fold For A ___ Block, Step Into A ____ Side Forebalance Facing Your Left, Do A ___ Block, And Say ___.");//Answers: low, left, low, kia
        step1.setFont(contentFont);
        step1.setBounds(780, 50, 720, 20);
        JLabel step2 = new JLabel(
                "2. Point Forward With The Same Arm you Blocked With, Step Forward With The Back Foot, And Punch.");
        step2.setFont(contentFont);
        step2.setBounds(780, 75, 720, 20);
        JLabel step3 = new JLabel(
                "3. Fold For A ___ Block, Step Into A ____ Side Forebalance Facing Your Right, And Do A ___ Block.");//Answers: low, right, low
        step3.setFont(contentFont);
        step3.setBounds(780, 100, 720, 20);
        JLabel step4 = new JLabel(
                "4. Point Forward With The Same Arm you Blocked With, Step Forward With The Back Foot, And Punch.");
        step4.setFont(contentFont);
        step4.setBounds(780, 125, 720, 20);
        JLabel step5 = new JLabel(
                "5. Fold For A ___ Block, Step Into A ____ Side Forebalance Facing The Front, And Do A ___ Block.");
        step5.setFont(contentFont);
        step5.setBounds(780, 150, 720, 20);
        JLabel step6 = new JLabel(
                "6. Point Forward With The Same Arm you Blocked With, Step Forward With The Back Foot, And Punch.");
        step6.setFont(contentFont);
        step6.setBounds(780, 175, 660, 20);
        JLabel step7 = new JLabel(
                "7. Fold For A ___ Block, Step Into A ____ Side Forebalance Facing The Back, And Do A ___ Block.");
        step7.setFont(contentFont);
        step7.setBounds(780, 200, 660, 20);
        JLabel step8 = new JLabel(
                "8. Point Forward With The Same Arm you Blocked With, Step Forward With The Back Foot, Punch, Then Say ___.");
        step8.setFont(contentFont);
        step8.setBounds(780, 225, 760, 20);
        JLabel step9 = new JLabel(
                "9. Do A _____ Block Into A ____ Side Fighting Stance Facing Your Left, Point Forward, Step Forward Into A Forebalance, And Punch.");
        step9.setFont(contentFont);
        step9.setBounds(780, 250, 760, 20);
        JLabel step10 = new JLabel(
                "10. Do A _____ Block Into A ____ Side Fighting Stance Facing Your Right, Point Forward, Step Forward Into A Forebalance, And Punch.");
        step10.setFont(contentFont);
        step10.setBounds(780, 275, 760, 20);
        JLabel step11 = new JLabel(
                "11. Do A _____ Block Into A ____ Side Fighting Stance Facing The Back, Point Forward, Step Forward Into A Forebalance, And Punch.");
        step11.setFont(contentFont);
        step11.setBounds(780, 300, 760, 20);
        JLabel step12 = new JLabel(
                "12. Do A _____ Block Into A ____ Side Fighting Stance Facing The Front, Point Forward, Step Forward Into A Forebalance, And Punch.");
        step12.setFont(contentFont);
        step12.setBounds(780, 325, 760, 20);
        JLabel step13 = new JLabel("13. Step Forward And Punch Again.");
        step13.setFont(contentFont);
        step13.setBounds(780, 350, 660, 20);
        JLabel step14 = new JLabel("14. Step Backward And Punch.");
        step14.setFont(contentFont);
        step14.setBounds(780, 375, 660, 20);
        JLabel step15 = new JLabel("15. Step Backward And Punch Again, Then Say ___.");
        step15.setFont(contentFont);
        step15.setBounds(780, 400, 660, 20);

        // Add the components to the panel
        contentPane.add(step1);
        contentPane.add(step2);
        contentPane.add(step3);
        contentPane.add(step4);
        contentPane.add(step5);
        contentPane.add(step6);
        contentPane.add(step7);
        contentPane.add(step8);
        contentPane.add(step9);
        contentPane.add(step10);
        contentPane.add(step11);
        contentPane.add(step12);
        contentPane.add(step13);
        contentPane.add(step14);
        contentPane.add(step15);
        contentPane.repaint();
    }

    /**
     * This method displays the graphics for completing kata tangoon
     */
    public void DisplayKata3() {
        // Clear the previous scene and prep for the new one
        PrepForKataFrame("Steps For Kata Tangoon:");
        // List the steps with some parts missing
        JLabel step1 = new JLabel("1. ______ Block Into A ____ Side Fighting Stance Facing Your ____ And Say ___.");
        step1.setFont(contentFont);
        step1.setBounds(780, 50, 620, 20);
        JLabel step2 = new JLabel("2. Point Forward, Step Forward Into A Forebalance, And Punch.");
        step2.setFont(contentFont);
        step2.setBounds(780, 75, 620, 20);
        JLabel step3 = new JLabel("3. ______ Block Into A ____ Side Fighting Stance Facing Your ____.");
        step3.setFont(contentFont);
        step3.setBounds(780, 100, 620, 20);
        JLabel step4 = new JLabel("4. Point Forward, Step Forward Into A Forebalance, And Punch.");
        step4.setFont(contentFont);
        step4.setBounds(780, 125, 620, 20);
        JLabel step5 = new JLabel("5. ______ Block Into A ____ Side Forebalance Facing The Front.");
        step5.setFont(contentFont);
        step5.setBounds(780, 150, 620, 20);
        JLabel step6 = new JLabel(
                "6. Point Forward, Step Forward And Punch, Step Forward And Punch Again, Step Forward And Punch A Third Time, Then Say ___.");
        step6.setFont(contentFont);
        step6.setBounds(780, 175, 760, 20);
        JLabel step7 = new JLabel("7. Fold For A ___ Block, Spin 270 Degrees To Your Left, And Do A ___ Block.");
        step7.setFont(contentFont);
        step7.setBounds(780, 200, 660, 20);
        JLabel step8 = new JLabel("8. Point And Chamber, Step Forward Into A _____ Side Forebalance, And Punch.");
        step8.setFont(contentFont);
        step8.setBounds(780, 225, 760, 20);
        JLabel step9 = new JLabel(
                "9. Do A ___ Block To The Other Side, Point And Chamber, Step Forward Into A _____ Side Forebalance, And Punch.");
        step9.setFont(contentFont);
        step9.setBounds(780, 250, 760, 20);
        JLabel step10 = new JLabel("10. Do A ___ Block To The Back In A ____ Side Forebalance.");
        step10.setFont(contentFont);
        step10.setBounds(780, 275, 760, 20);
        JLabel step11 = new JLabel("11. With The Same Hand You Did A Low Block With, Do A ____ Block.");
        step11.setFont(contentFont);
        step11.setBounds(780, 300, 760, 20);
        JLabel step12 = new JLabel("12. Step Forward And Do A Second ____ Block.");
        step12.setFont(contentFont);
        step12.setBounds(780, 325, 760, 20);
        JLabel step13 = new JLabel("13. Step Forward And Do A Third ____ Block.");
        step13.setFont(contentFont);
        step13.setBounds(780, 350, 660, 20);
        JLabel step14 = new JLabel("14. Step Forward And Do A Fourth ____ Block.");
        step14.setFont(contentFont);
        step14.setBounds(780, 375, 660, 20);
        JLabel step15 = new JLabel("15. Fold For A Chop, Spin 180 Degrees To Your Left, And Chop In A _____ Stance.");
        step15.setFont(contentFont);
        step15.setBounds(780, 400, 660, 20);
        JLabel step16 = new JLabel(
                "16. Close Your Hand Into A Fist, Then Step Forward And Punch In A _____ Side Forebalance.");
        step16.setFont(contentFont);
        step16.setBounds(780, 425, 660, 20);
        JLabel step17 = new JLabel("17. Fold For A Chop, Spin 90 Degrees To Your Right, And Chop In A _____ Stance.");
        step17.setFont(contentFont);
        step17.setBounds(780, 450, 660, 20);
        JLabel step18 = new JLabel(
                "18. Close Your Hand Into A Fist, Then Step Forward And Punch In A ____ Side Forebalance.");
        step18.setFont(contentFont);
        step18.setBounds(780, 475, 660, 20);
        JLabel step19 = new JLabel("18. Say ___.");
        step19.setFont(contentFont);
        step19.setBounds(780, 500, 660, 20);

        // Add the components to the panel
        contentPane.add(step1);
        contentPane.add(step2);
        contentPane.add(step3);
        contentPane.add(step4);
        contentPane.add(step5);
        contentPane.add(step6);
        contentPane.add(step7);
        contentPane.add(step8);
        contentPane.add(step9);
        contentPane.add(step10);
        contentPane.add(step11);
        contentPane.add(step12);
        contentPane.add(step13);
        contentPane.add(step14);
        contentPane.add(step15);
        contentPane.repaint();
    }

    /**
     * This method displays the graphics for completing kata to-san
     */
    public void DisplayKata4() {
        // Clear the previous scene and prep for the new one
        PrepForKataFrame("Steps For Kata To-San:");

        // List the steps with some parts missing
        JLabel step1 = new JLabel(
                "1. Step Into A ____ Side Forebalance Facing Your Left, Do A ______ Block, And Say ___.");
        step1.setFont(contentFont);
        step1.setBounds(780, 50, 620, 20);
        JLabel step2 = new JLabel("2. Punch In Place.");
        step2.setFont(contentFont);
        step2.setBounds(780, 75, 620, 20);
        JLabel step3 = new JLabel(
                "3. Rotate To The Other Side By Taking 2 Steps Over And Do A ______ Block In A _____ Side Forebalance.");
        step3.setFont(contentFont);
        step3.setBounds(780, 100, 620, 20);
        JLabel step4 = new JLabel("4. Punch In Place.");
        step4.setFont(contentFont);
        step4.setBounds(780, 125, 620, 20);
        JLabel step5 = new JLabel("5. Do A ______ Block Towards The Front In A ____ Side Fighting Stance.");
        step5.setFont(contentFont);
        step5.setBounds(780, 150, 620, 20);
        JLabel step6 = new JLabel("6. Step Forward And Spear In A _____ Side Forebalance.");
        step6.setFont(contentFont);
        step6.setBounds(780, 175, 620, 20);
        JLabel step7 = new JLabel("7. Spin Around 360 Degrees And End Up In A ____ Side Forebalance.");
        step7.setFont(contentFont);
        step7.setBounds(780, 200, 620, 20);
        JLabel step8 = new JLabel(
                "8. Backfist With The Left Hand, Step Forward, Backfist With The Right Hand, And Say ___.");
        step8.setFont(contentFont);
        step8.setBounds(780, 225, 620, 20);
        JLabel step9 = new JLabel("9. Spin 270 Degrees To Your Left And Do A ______ Block In A ____ Side Forebalance.");
        step9.setFont(contentFont);
        step9.setBounds(780, 250, 620, 20);
        JLabel step10 = new JLabel("10. Punch In Place.");
        step10.setFont(contentFont);
        step10.setBounds(780, 275, 620, 20);
        JLabel step11 = new JLabel(
                "11. Rotate To The Other Side By Taking 2 Steps Over And Do A ______ Block In A _____ Side Forebalance.");
        step11.setFont(contentFont);
        step11.setBounds(780, 300, 620, 20);
        JLabel step12 = new JLabel("12. Punch In Place.");
        step12.setFont(contentFont);
        step12.setBounds(780, 325, 620, 20);
        JLabel step13 = new JLabel(
                "13. Step Into A ____ Side Forebalance At A 45 Degree Angle Offset To The Left Relative To The Back And Do A _____ Block.");
        step13.setFont(contentFont);
        step13.setBounds(780, 350, 620, 20);
        JLabel step14 = new JLabel(
                "14. Bring The Right Hand Back, Do A Rear Leg Front Kick, And Set It Down In Front Of You.");
        step14.setFont(contentFont);
        step14.setBounds(780, 375, 620, 20);
        JLabel step15 = new JLabel("15. Punch Twice In the Air.");
        step15.setFont(contentFont);
        step15.setBounds(780, 400, 620, 20);
        JLabel step16 = new JLabel(
                "16. Step Into A ____ Side Forebalance At A 45 Degree Angle Offset To The Right Relative To The Back And Do A _____ Block.");
        step16.setFont(contentFont);
        step16.setBounds(780, 425, 620, 20);
        JLabel step17 = new JLabel(
                "17. Bring The Left Hand Back, Do A Rear Leg Front Kick, And Set It Down In Front Of You.");
        step17.setFont(contentFont);
        step17.setBounds(780, 450, 620, 20);
        JLabel step18 = new JLabel("18. Punch Twice In the Air.");
        step18.setFont(contentFont);
        step18.setBounds(780, 475, 620, 20);
        JLabel step19 = new JLabel("19. Do A ___ Block To The Back, Then Do A ____ Block With The Same Arm.");
        step19.setFont(contentFont);
        step19.setBounds(780, 500, 620, 20);
        JLabel step20 = new JLabel("20. Step Forward And Do A ____ Block.");
        step20.setFont(contentFont);
        step20.setBounds(780, 525, 620, 20);
        JLabel step21 = new JLabel("21. Fold For A Chop, Spin 180 Degrees Towards Your Left, And Chop.");
        step21.setFont(contentFont);
        step21.setBounds(780, 550, 620, 20);
        JLabel step22 = new JLabel(
                "22. Fold For Another Chop, Slide Your Feet Together, Slide To The Right, Chop, And Say ___.");
        step22.setFont(contentFont);
        step22.setBounds(780, 575, 620, 20);

        // Add the components to the panel
        contentPane.add(step1);
        contentPane.add(step2);
        contentPane.add(step3);
        contentPane.add(step4);
        contentPane.add(step5);
        contentPane.add(step6);
        contentPane.add(step7);
        contentPane.add(step8);
        contentPane.add(step9);
        contentPane.add(step10);
        contentPane.add(step11);
        contentPane.add(step12);
        contentPane.add(step13);
        contentPane.add(step14);
        contentPane.add(step15);
        contentPane.add(step16);
        contentPane.add(step17);
        contentPane.add(step18);
        contentPane.add(step19);
        contentPane.add(step20);
        contentPane.add(step21);
        contentPane.add(step22);
        contentPane.repaint();
    }

    /**
     * This method displays the graphics for completing kata wan-yo
     */
    public void DisplayKata5() {
        // Clear the previous the new one scene and prep for the new one
        PrepForKataFrame("Steps For Kata Wan-Yo:");

        // List the steps with some parts missing
        JLabel step1 = new JLabel("1. Go into position for the kata.");
        step1.setFont(contentFont);
        step1.setBounds(780, 50, 620, 20);
        JLabel step2 = new JLabel(
                "2. Step into a ____ side fighting stance facing your left, do a ___ block, and say ___.");
        step2.setFont(contentFont);
        step2.setBounds(780, 75, 620, 20);
        JLabel step3 = new JLabel("3. Chop with the top hand, and protect with the front hand simultaneously.");
        step3.setFont(contentFont);
        step3.setBounds(780, 100, 620, 20);
        JLabel step4 = new JLabel("4. Chamber on the front hip and punch with the front hand.");
        step4.setFont(contentFont);
        step4.setBounds(780, 125, 620, 20);
        JLabel step5 = new JLabel("5. Step into a _____ side fighting stance facing your right and do a ___ block.");
        step5.setFont(contentFont);
        step5.setBounds(780, 150, 620, 20);
        JLabel step6 = new JLabel("6. Chop with the top hand, and protect with the front hand simultaneously.");
        step6.setFont(contentFont);
        step6.setBounds(780, 175, 620, 20);
        JLabel step7 = new JLabel("7. Chamber on the front hip and punch with the front hand.");
        step7.setFont(contentFont);
        step7.setBounds(780, 200, 620, 20);
        JLabel step8 = new JLabel("8. Do a comearound ____ kick to the front and land in a ______ block.");
        step8.setFont(contentFont);
        step8.setBounds(780, 225, 620, 20);
        JLabel step9 = new JLabel("9. Step forward and do another ______ block.");
        step9.setFont(contentFont);
        step9.setBounds(780, 250, 620, 20);
        JLabel step10 = new JLabel("10. Step forward once more and do a ______ block.");
        step10.setFont(contentFont);
        step10.setBounds(780, 275, 620, 20);
        JLabel step11 = new JLabel("11. Step forward into a forebalance and spear, then say ___.");
        step11.setFont(contentFont);
        step11.setBounds(780, 300, 620, 20);
        JLabel step12 = new JLabel(
                "12. Fold for a ___ block, spin 270 degrees towards your left, and thrust the block up.");
        step12.setFont(contentFont);
        step12.setBounds(780, 325, 620, 20);
        JLabel step13 = new JLabel("13. Chop with the top hand, and protect with the front hand simultaneously.");
        step13.setFont(contentFont);
        step13.setBounds(780, 350, 620, 20);
        JLabel step14 = new JLabel("14. Chamber on the front hip and punch with the front hand.");
        step14.setFont(contentFont);
        step14.setBounds(780, 375, 620, 20);
        JLabel step15 = new JLabel("15. Step into a _____ side fighting stance facing your right and do a ___ block.");
        step15.setFont(contentFont);
        step15.setBounds(780, 400, 620, 20);
        JLabel step16 = new JLabel("16. Chop with the top hand, and protect with the front hand simultaneously.");
        step16.setFont(contentFont);
        step16.setBounds(780, 425, 620, 20);
        JLabel step17 = new JLabel("17. Chamber on the front hip and punch with the front hand.");
        step17.setFont(contentFont);
        step17.setBounds(780, 450, 620, 20);
        JLabel step18 = new JLabel(
                "18. Step into a ____ side forebalance facing the back and do a windmill _____ block.");
        step18.setFont(contentFont);
        step18.setBounds(780, 475, 620, 20);
        JLabel step19 = new JLabel("19. Do a rear leg front kick and set it down in front of you.");
        step19.setFont(contentFont);
        step19.setBounds(780, 500, 620, 20);
        JLabel step20 = new JLabel("20. Punch with the left arm, then do a _____ block with it.");
        step20.setFont(contentFont);
        step20.setBounds(780, 525, 620, 20);
        JLabel step21 = new JLabel("21. Do another rear leg front kick and set it down in front of you.");
        step21.setFont(contentFont);
        step21.setBounds(780, 550, 620, 20);
        JLabel step22 = new JLabel("22. Punch with the right arm.");
        step22.setFont(contentFont);
        step22.setBounds(780, 575, 620, 20);
        JLabel step23 = new JLabel("23. Do a comearound ____ kick to the back.");
        step23.setFont(contentFont);
        step23.setBounds(780, 600, 620, 20);
        JLabel step24 = new JLabel(
                "24. Spin 90 degrees towards your left and land in a ____ side fighting stance facing your left.");
        step24.setFont(contentFont);
        step24.setBounds(780, 625, 620, 20);
        JLabel step25 = new JLabel("25. Switch to a _____ side fighting stance facing your right and say ___.");
        step25.setFont(contentFont);
        step25.setBounds(780, 650, 620, 20);
        JLabel step26 = new JLabel("26. Go back to position after waiting 3 seconds.");
        step26.setFont(contentFont);
        step26.setBounds(780, 675, 620, 20);

        // Add the components to the panel
        contentPane.add(step1);
        contentPane.add(step2);
        contentPane.add(step3);
        contentPane.add(step4);
        contentPane.add(step5);
        contentPane.add(step6);
        contentPane.add(step7);
        contentPane.add(step8);
        contentPane.add(step9);
        contentPane.add(step10);
        contentPane.add(step11);
        contentPane.add(step12);
        contentPane.add(step13);
        contentPane.add(step14);
        contentPane.add(step15);
        contentPane.add(step16);
        contentPane.add(step17);
        contentPane.add(step18);
        contentPane.add(step19);
        contentPane.add(step20);
        contentPane.add(step21);
        contentPane.add(step22);
        contentPane.add(step23);
        contentPane.add(step24);
        contentPane.add(step25);
        contentPane.add(step26);
        contentPane.repaint();
    }

    /**
     * This method displays the graphics for completing kata yo-guk
     */
    public void DisplayKata6() {
        // Clear the previous the new one scene and prep for the new one
        PrepForKataFrame("Steps For Kata Yo-Guk:");

        // List the steps with some parts missing
        JLabel step1 = new JLabel("1. Point with the _____ hand, step into a horse stance, punch ____, and say ___.");
        step1.setFont(contentFont);
        step1.setBounds(780, 50, 620, 20);
        JLabel step2 = new JLabel("2. Slowly press with the left arm while the right arm goes back into chamber.");
        step2.setFont(contentFont);
        step2.setBounds(780, 75, 620, 20);
        JLabel step3 = new JLabel("3. Punch twice, then slide to the right.");
        step3.setFont(contentFont);
        step3.setBounds(780, 100, 620, 20);
        JLabel step4 = new JLabel("4. Slowly press with the right arm while the left arm goes back into chamber.");
        step4.setFont(contentFont);
        step4.setBounds(780, 125, 620, 20);
        JLabel step5 = new JLabel("5. Punch twice.");
        step5.setFont(contentFont);
        step5.setBounds(780, 150, 620, 20);
        JLabel step6 = new JLabel("6. Turn 45 degrees to the right and do a _____ block with the right hand.");
        step6.setFont(contentFont);
        step6.setBounds(780, 175, 620, 20);
        JLabel step7 = new JLabel("7. Do a rear leg front kick, set it down in a forebalance, and punch twice.");
        step7.setFont(contentFont);
        step7.setBounds(780, 200, 620, 20);
        JLabel step8 = new JLabel("8. Turn 90 degrees to the left and do a _____ block with the right hand.");
        step8.setFont(contentFont);
        step8.setBounds(780, 225, 620, 20);
        JLabel step9 = new JLabel("9. Do a rear leg front kick, set it down in a forebalance, and punch twice.");
        step9.setFont(contentFont);
        step9.setBounds(780, 250, 620, 20);
        JLabel step10 = new JLabel(
                "10. Turn 45 degrees to the right with the front foot and face the front in a forebalance.");
        step10.setFont(contentFont);
        step10.setBounds(780, 275, 620, 20);
        JLabel step11 = new JLabel("11. Press over both arms, slighly hovering your hand over your uniform.");
        step11.setFont(contentFont);
        step11.setBounds(780, 300, 620, 20);
        JLabel step12 = new JLabel("12. Point with the right hand, punch with the left, then step forward.");
        step12.setFont(contentFont);
        step12.setBounds(780, 325, 620, 20);
        JLabel step13 = new JLabel("13. Press over both arms, slighly hovering your hand over your uniform.");
        step13.setFont(contentFont);
        step13.setBounds(780, 350, 620, 20);
        JLabel step14 = new JLabel("14. Point with the left hand, punch with the right, then step forward.");
        step14.setFont(contentFont);
        step14.setBounds(780, 375, 620, 20);
        JLabel step15 = new JLabel("15. Punch again in place with the left hand and say ___.");
        step15.setFont(contentFont);
        step15.setBounds(780, 400, 620, 20);
        JLabel step16 = new JLabel("16. Do a comearound ____ kick, and then do a headsmash.");
        step16.setFont(contentFont);
        step16.setBounds(780, 425, 620, 20);
        JLabel step17 = new JLabel("17. Pseudo to the back, do a ____ kick, and then do a headsmash.");
        step17.setFont(contentFont);
        step17.setBounds(780, 450, 620, 20);
        JLabel step18 = new JLabel(
                "18. Do a _________ box block to the left in a fighting stance, then step forward and spear in a ___________.");
        step18.setFont(contentFont);
        step18.setBounds(780, 475, 620, 20);
        JLabel step19 = new JLabel(
                "19. Do a _________ box block to the right in a fighting stance, then step forward and spear in a ___________.");
        step19.setFont(contentFont);
        step19.setBounds(780, 500, 620, 20);
        JLabel step20 = new JLabel("20. Do a ______ block to the back in a forebalance, then punch in place.");
        step20.setFont(contentFont);
        step20.setBounds(780, 525, 620, 20);
        JLabel step21 = new JLabel("21. Step forward, do another ______ block, and punch in place.");
        step21.setFont(contentFont);
        step21.setBounds(780, 550, 620, 20);
        JLabel step22 = new JLabel("22. Rear up for a jump backfist in a ____ side crane stance.");
        step22.setFont(contentFont);
        step22.setBounds(780, 575, 620, 20);
        JLabel step23 = new JLabel("23. Jump forward and backfist with the left hand.");
        step23.setFont(contentFont);
        step23.setBounds(780, 600, 620, 20);
        JLabel step24 = new JLabel("24. Turn to the front and fold for a ________ block.");
        step24.setFont(contentFont);
        step24.setBounds(780, 625, 620, 20);
        JLabel step25 = new JLabel("25. Turn 135 degrees to the right and do a ________ block.");
        step25.setFont(contentFont);
        step25.setBounds(780, 650, 620, 20);
        JLabel step26 = new JLabel("26. Turn to the front and fold for a ________ block.");
        step26.setFont(contentFont);
        step26.setBounds(780, 675, 620, 20);
        JLabel step27 = new JLabel("27. Turn 135 degrees to the left and do a ________ block.");
        step27.setFont(contentFont);
        step27.setBounds(780, 700, 620, 20);
        JLabel step28 = new JLabel("28. Say ___.");
        step28.setFont(contentFont);
        step28.setBounds(780, 725, 620, 20);

        // Add the components to the panel
        contentPane.add(step1);
        contentPane.add(step2);
        contentPane.add(step3);
        contentPane.add(step4);
        contentPane.add(step5);
        contentPane.add(step6);
        contentPane.add(step7);
        contentPane.add(step8);
        contentPane.add(step9);
        contentPane.add(step10);
        contentPane.add(step11);
        contentPane.add(step12);
        contentPane.add(step13);
        contentPane.add(step14);
        contentPane.add(step15);
        contentPane.add(step16);
        contentPane.add(step17);
        contentPane.add(step18);
        contentPane.add(step19);
        contentPane.add(step20);
        contentPane.add(step21);
        contentPane.add(step22);
        contentPane.add(step23);
        contentPane.add(step24);
        contentPane.add(step25);
        contentPane.add(step26);
        contentPane.add(step27);
        contentPane.add(step28);
        contentPane.repaint();
    }

    /**
     * This method displays the graphics for completing kata jun-guin
     */
    public void DisplayKata7() {
        // Clear the previous the new one scene and prep for the new one
        PrepForKataFrame("Steps For Kata Jun-Guin:");

        // List the steps with some parts missing
        JLabel step1 = new JLabel("1. Go into position for the kata.");
        step1.setFont(contentFont);
        step1.setBounds(780, 50, 620, 20);
        JLabel step2 = new JLabel(
                "2. Do a palm strike to your left with the left hand in a left side ___ stance and say ___.");
        step2.setFont(contentFont);
        step2.setBounds(780, 70, 620, 20);
        JLabel step3 = new JLabel("3. Do a _____ kick, step forward, and do another palm strike with the right hand.");
        step3.setFont(contentFont);
        step3.setBounds(780, 90, 620, 20);
        JLabel step4 = new JLabel("4. With the same hand, turn 180 degrees to the right and do a palm strike.");
        step4.setFont(contentFont);
        step4.setBounds(780, 110, 620, 20);
        JLabel step5 = new JLabel("5. Do a _____ kick, step forward, and do another palm strike with the left hand.");
        step5.setFont(contentFont);
        step5.setBounds(780, 130, 620, 20);
        JLabel step6 = new JLabel("6. ______ block into a left side fighting stance facing the front.");
        step6.setFont(contentFont);
        step6.setBounds(780, 150, 620, 20);
        JLabel step7 = new JLabel("7. Reach with the front hand and step over into a left side forebalance.");
        step7.setFont(contentFont);
        step7.setBounds(780, 170, 620, 20);
        JLabel step8 = new JLabel("8. Do a ______ elbow.");
        step8.setFont(contentFont);
        step8.setBounds(780, 190, 620, 20);
        JLabel step9 = new JLabel("9. Step forward into a ______ block in a right side fighting stance.");
        step9.setFont(contentFont);
        step9.setBounds(780, 210, 620, 20);
        JLabel step10 = new JLabel("10. Reach with the front hand and step over into a right side forebalance.");
        step10.setFont(contentFont);
        step10.setBounds(780, 230, 620, 20);
        JLabel step11 = new JLabel("11. Do a ______ elbow.");
        step11.setFont(contentFont);
        step11.setBounds(780, 250, 620, 20);
        JLabel step12 = new JLabel(
                "12. Step forward and do a double punch, then step forward and do a double palm strike.");
        step12.setFont(contentFont);
        step12.setBounds(780, 270, 620, 20);
        JLabel step13 = new JLabel("13. Say ___.");
        step13.setFont(contentFont);
        step13.setBounds(780, 290, 620, 20);
        JLabel step14 = new JLabel("14. Fold for a cross block and turn 270 degrees towards your left.");
        step14.setFont(contentFont);
        step14.setBounds(780, 310, 620, 20);
        JLabel step15 = new JLabel("15. Do a cross block in a ____ side forebalance.");
        step15.setFont(contentFont);
        step15.setBounds(780, 330, 620, 20);
        JLabel step16 = new JLabel("16. Shrink it to a ____ side fighting stance, then do a backfist.");
        step16.setFont(contentFont);
        step16.setBounds(780, 350, 620, 20);
        JLabel step17 = new JLabel(
                "17. Step out into a ____ side forebalance, wrap with the front arm, then do a _______ punch.");
        step17.setFont(contentFont);
        step17.setBounds(780, 370, 620, 20);
        JLabel step18 = new JLabel("18. Do a backfist in a _____ side fighting stance facing the right.");
        step18.setFont(contentFont);
        step18.setBounds(780, 390, 620, 20);
        JLabel step19 = new JLabel(
                "19. Step out into a ____ side forebalance, wrap with the front arm, then do a _______ punch.");
        step19.setFont(contentFont);
        step19.setBounds(780, 410, 620, 20);
        JLabel step20 = new JLabel("20. Fold for a Tsong-Su block.");
        step20.setFont(contentFont);
        step20.setBounds(780, 430, 620, 20);
        JLabel step21 = new JLabel(
                "21. Slide your feet together, step out into a ____ side forebalance, then do a ________ block.");
        step21.setFont(contentFont);
        step21.setBounds(780, 450, 620, 20);
        JLabel step22 = new JLabel("22. Step up into a Yokh-Jeen block, then step into a horse stance and punch.");
        step22.setFont(contentFont);
        step22.setBounds(780, 470, 620, 20);
        JLabel step23 = new JLabel("23. Do a comearound ____ kick, land in a Tsong-Su block.");
        step23.setFont(contentFont);
        step23.setBounds(780, 490, 620, 20);
        JLabel step24 = new JLabel("24. Step up into a Yokh-Jeen block, then step into a horse stance and punch.");
        step24.setFont(contentFont);
        step24.setBounds(780, 510, 620, 20);
        JLabel step25 = new JLabel("25. Do another comearound side kick and land in a ______ block.");
        step25.setFont(contentFont);
        step25.setBounds(780, 530, 620, 20);
        JLabel step26 = new JLabel("26. Step out into a ____ side forebalance and press.");
        step26.setFont(contentFont);
        step26.setBounds(780, 550, 620, 20);
        JLabel step27 = new JLabel("27. Step forward into a ______ block.");
        step27.setFont(contentFont);
        step27.setBounds(780, 570, 620, 20);
        JLabel step28 = new JLabel("28. Step out into a ____ side forebalance and press.");
        step28.setFont(contentFont);
        step28.setBounds(780, 590, 620, 20);
        JLabel step29 = new JLabel("29. Slide your feet together and turn 90 degrees to your left.");
        step29.setFont(contentFont);
        step29.setBounds(780, 610, 620, 20);
        JLabel step30 = new JLabel("30. Fold for a press with the left hand on bottom and the right hand on top.");
        step30.setFont(contentFont);
        step30.setBounds(780, 630, 620, 20);
        JLabel step31 = new JLabel("31. Step out into a _____ side deep fighting stance and press towards the right.");
        step31.setFont(contentFont);
        step31.setBounds(780, 650, 620, 20);
        JLabel step32 = new JLabel("32. Slide your feet together.");
        step32.setFont(contentFont);
        step32.setBounds(780, 670, 620, 20);
        JLabel step33 = new JLabel("33. Fold for a press with the right hand on bottom and the left hand on top.");
        step33.setFont(contentFont);
        step33.setBounds(780, 690, 620, 20);
        JLabel step34 = new JLabel("34. Step out into a ____ side deep fighting stance and press towards the left.");
        step34.setFont(contentFont);
        step34.setBounds(780, 710, 620, 20);
        JLabel step35 = new JLabel("35. Say ___.");
        step35.setFont(contentFont);
        step35.setBounds(780, 730, 620, 20);
        JLabel step36 = new JLabel("36. Wait 3 seconds, and go back to the position for the kata.");
        step36.setFont(contentFont);
        step36.setBounds(780, 750, 620, 20);

        // Add the components to the panel
        contentPane.add(step1);
        contentPane.add(step2);
        contentPane.add(step3);
        contentPane.add(step4);
        contentPane.add(step5);
        contentPane.add(step6);
        contentPane.add(step7);
        contentPane.add(step8);
        contentPane.add(step9);
        contentPane.add(step10);
        contentPane.add(step11);
        contentPane.add(step12);
        contentPane.add(step13);
        contentPane.add(step14);
        contentPane.add(step15);
        contentPane.add(step16);
        contentPane.add(step17);
        contentPane.add(step18);
        contentPane.add(step19);
        contentPane.add(step20);
        contentPane.add(step21);
        contentPane.add(step22);
        contentPane.add(step23);
        contentPane.add(step24);
        contentPane.add(step25);
        contentPane.add(step26);
        contentPane.add(step27);
        contentPane.add(step28);
        contentPane.add(step29);
        contentPane.add(step30);
        contentPane.add(step31);
        contentPane.add(step32);
        contentPane.add(step33);
        contentPane.add(step34);
        contentPane.add(step35);
        contentPane.add(step36);
        contentPane.repaint();
    }

    /**
     * This method displays the graphics for completing kata tai-gei
     */
    public void DisplayKata8() {
        // Clear the previous the new one scene and prep for the new one
        PrepForKataFrame("Steps For Kata Tai-Gei:");

        // List the steps with some parts missing
	JLabel step1 = new JLabel("1. Go into position for the kata.");
	step1.setFont(contentFont);
	step1.setBounds(780, 50, 620, 20);
	JLabel step2 = new JLabel("2. Step out towards your left, do a _____ block, and say ___.");
	step2.setFont(contentFont);
	step2.setBounds(780, 70, 620, 20);
	JLabel step3 = new JLabel("3. Grab with the right hand and remove while sliding back into a ____ side fighting stance.");
	step3.setFont(contentFont);
	step3.setBounds(780, 90, 620, 20);
	JLabel step4 = new JLabel("4. Step out towards your right and do a _____ block.");
	step4.setFont(contentFont);
	step4.setBounds(780, 110, 620, 20);
	JLabel step5 = new JLabel("5. Grab with the left hand and remove while sliding back into a ____ side fighting stance.");
	step5.setFont(contentFont);
	step5.setBounds(780, 130, 620, 20);
	JLabel step6 = new JLabel("6. Step towards the front in a ____ side forebalance and point with both hands.");
	step6.setFont(contentFont);
	step6.setBounds(780, 150, 620, 20);
	JLabel step7 = new JLabel("7. Bring the right arm back.");
	step7.setFont(contentFont);
	step7.setBounds(780, 170, 620, 20);
	JLabel step8 = new JLabel("8. Do a rear leg _____ kick and set it down in fron of you.");
	step8.setFont(contentFont);
	step8.setBounds(780, 190, 620, 20);
	JLabel step9 = new JLabel("9. Punch twice.");
	step9.setFont(contentFont);
	step9.setBounds(780, 210, 620, 20);
	JLabel step10 = new JLabel("10. Turn 90 degrees to your left, slide both feet together, and bring both hands into chamber.");
	step10.setFont(contentFont);
	step10.setBounds(780, 230, 620, 20);
	JLabel step11 = new JLabel("11. Turn 90 degrees to your left, step out into a _____ stance, and do a double fist __________ block.");
	step11.setFont(contentFont);
	step11.setBounds(780, 250, 620, 20);
	JLabel step12 = new JLabel("12. Turn 180 degrees to your right, remain in a _____ stance, and do a double fist __________ block.");
	step12.setFont(contentFont);
	step12.setBounds(780, 270, 620, 20);
	JLabel step13 = new JLabel("13. Turn 180 degrees to your right, remain in a _____ stance, and do a double fist __________ block.");
	step13.setFont(contentFont);
	step13.setBounds(780, 290, 620, 20);
	JLabel step14 = new JLabel("14. Turn 180 degrees to your left, remain in a _____ stance, and do a double fist __________ block.");
	step14.setFont(contentFont);
	step14.setBounds(780, 310, 620, 20);
	JLabel step15 = new JLabel("15. Turn 180 degrees to your right, remain in a _____ stance, and do a double fist __________ block.");
	step15.setFont(contentFont);
	step15.setBounds(780, 330, 620, 20);
	JLabel step16 = new JLabel("16. Turn 180 degrees to your right, remain in a _____ stance, and do a double fist __________ block.");
	step16.setFont(contentFont);
	step16.setBounds(780, 350, 620, 20);
	JLabel step17 = new JLabel("17. Do a low pseudo block in a ____ side fighting stance towards the front.");
	step17.setFont(contentFont);
	step17.setBounds(780, 370, 620, 20);
	JLabel step18 = new JLabel("18. Do a headsmash with the back knee and set that leg down in front of you.");
	step18.setFont(contentFont);
	step18.setBounds(780, 390, 620, 20);
	JLabel step19 = new JLabel("19. Do a ______ block towards the back in a ____ side fighting stance.");
	step19.setFont(contentFont);
	step19.setBounds(780, 410, 620, 20);
	JLabel step20 = new JLabel("20. Do a _____ kick and leave your leg up.");
	step20.setFont(contentFont);
	step20.setBounds(780, 430, 620, 20);
	JLabel step21 = new JLabel("21. Spear with the back hand, then spear with the front hand and set your leg down in a forebalance.");
	step21.setFont(contentFont);
	step21.setBounds(780, 450, 620, 20);
	JLabel step22 = new JLabel("22. Do a ______ block towards the back in a _____ side fighting stance.");
	step22.setFont(contentFont);
	step22.setBounds(780, 470, 620, 20);
	JLabel step23 = new JLabel("23. Do a _____ kick and leave your leg up.");
	step23.setFont(contentFont);
	step23.setBounds(780, 490, 620, 20);
	JLabel step24 = new JLabel("24. Spear with the back hand, then spear with the front hand and set your leg down in a forebalance.");
	step24.setFont(contentFont);
	step24.setBounds(780, 510, 620, 20);
	JLabel step25 = new JLabel("25. Grab and remove.");
	step25.setFont(contentFont);
	step25.setBounds(780, 530, 620, 20);
	JLabel step26 = new JLabel("26. Jump forward, step behind your right foot, and do a low _____ block.");
	step26.setFont(contentFont);
	step26.setBounds(780, 550, 620, 20);
	JLabel step27 = new JLabel("27. Fold for a ________ block and spin 225 degrees to your left.");
	step27.setFont(contentFont);
	step27.setBounds(780, 570, 620, 20);
	JLabel step28 = new JLabel("28. Land in a ____ side forebalance and do a ________ block.");
	step28.setFont(contentFont);
	step28.setBounds(780, 590, 620, 20);
	JLabel step29 = new JLabel("29. Slide the front foot up to the back foot in a fighting stance and fold for a low ______.");
	step29.setFont(contentFont);
	step29.setBounds(780, 610, 620, 20);
	JLabel step30 = new JLabel("30. Step back out into a forebalance and do a low ______.");
	step30.setFont(contentFont);
	step30.setBounds(780, 630, 620, 20);
	JLabel step31 = new JLabel("31. Do a _____ block with the right hand.");
	step31.setFont(contentFont);
	step31.setBounds(780, 650, 620, 20);
	JLabel step32 = new JLabel("32. Slide your feet together up to the front and fold for a low ______ block.");
	step32.setFont(contentFont);
	step32.setBounds(780, 670, 620, 20);
	JLabel step33 = new JLabel("33. Turn 45 degrees to your right and step into a _____ side forebalance.");
	step33.setFont(contentFont);
	step33.setBounds(780, 690, 620, 20);
	JLabel step34 = new JLabel("34. Do a low ______ block.");
	step34.setFont(contentFont);
	step34.setBounds(780, 710, 620, 20);
	JLabel step35 = new JLabel("35. Do a _____ block with the left hand.");
	step35.setFont(contentFont);
	step35.setBounds(780, 730, 620, 20);
	JLabel step36 = new JLabel("36. Do a _____ block with the right hand.");
	step36.setFont(contentFont);
	step36.setBounds(780, 750, 620, 20);
        JLabel step37 = new JLabel("37. Do a _____ block with the left hand.");
	step37.setFont(contentFont);
	step37.setBounds(780, 770, 620, 20);
        JLabel step38 = new JLabel("38. Point to the front with the left hand.");
	step38.setFont(contentFont);
	step38.setBounds(780, 790, 620, 20);
        JLabel step39 = new JLabel("39. Step forward into a _____ stance and punch.");
	step39.setFont(contentFont);
	step39.setBounds(780, 810, 620, 20);
        JLabel step40 = new JLabel("40. Say ___.");
	step40.setFont(contentFont);
	step40.setBounds(780, 830, 620, 20);
        JLabel step41 = new JLabel("41. Wait 3 seconds, and go back to the position for the kata.");
	step41.setFont(contentFont);
	step41.setBounds(780, 850, 620, 20);

	// Add the components to the panel
	contentPane.add(step1);
	contentPane.add(step2);
	contentPane.add(step3);
	contentPane.add(step4);
	contentPane.add(step5);
	contentPane.add(step6);
	contentPane.add(step7);
	contentPane.add(step8);
	contentPane.add(step9);
	contentPane.add(step10);
	contentPane.add(step11);
	contentPane.add(step12);
	contentPane.add(step13);
	contentPane.add(step14);
	contentPane.add(step15);
	contentPane.add(step16);
	contentPane.add(step17);
	contentPane.add(step18);
	contentPane.add(step19);
	contentPane.add(step20);
	contentPane.add(step21);
	contentPane.add(step22);
	contentPane.add(step23);
	contentPane.add(step24);
	contentPane.add(step25);
	contentPane.add(step26);
	contentPane.add(step27);
	contentPane.add(step28);
	contentPane.add(step29);
	contentPane.add(step30);
	contentPane.add(step31);
	contentPane.add(step32);
	contentPane.add(step33);
	contentPane.add(step34);
	contentPane.add(step35);
	contentPane.add(step36);
        contentPane.add(step37);
        contentPane.add(step38);
        contentPane.add(step39);
        contentPane.add(step40);
        contentPane.add(step41);
	contentPane.repaint();
    }

    /**
     * This method displays the graphics for completing kata wa-wrang
     */
    public void DisplayKata9() {
        // Clear the previous the new one scene and prep for the new one
        PrepForKataFrame("Steps For Kata Wa-Wrang:");
        
        // List the steps with some parts missing
        JLabel step1 = new JLabel("1. Go into position for the kata.");
        step1.setFont(contentFont);
        step1.setBounds(780, 50, 620, 20);
        JLabel step2 = new JLabel("2. Step into a _____ stance, say ___, and press.");
        step2.setFont(contentFont);
        step2.setBounds(780, 70, 620, 20);
        JLabel step3 = new JLabel("3. Punch twice.");
        step3.setFont(contentFont);
        step3.setBounds(780, 90, 620, 20);
        JLabel step4 = new JLabel("4. Fold for a ___ block and do a ___ block to your right in a fighting stance.");
        step4.setFont(contentFont);
        step4.setBounds(780, 110, 620, 20);
        JLabel step5 = new JLabel("5. Chop and protect.");
        step5.setFont(contentFont);
        step5.setBounds(780, 130, 620, 20);
        JLabel step6 = new JLabel("6. Chamber on the front hip and punch.");
        step6.setFont(contentFont);
        step6.setBounds(780, 150, 620, 20);
        JLabel step7 = new JLabel("7. Chop your knee.");
        step7.setFont(contentFont);
        step7.setBounds(780, 170, 620, 20);
        JLabel step8 = new JLabel("8. Point forward, step forward, and punch in a ____ side forebalance.");
        step8.setFont(contentFont);
        step8.setBounds(780, 190, 620, 20);
        JLabel step9 = new JLabel("9. Fold for a ___ block and do a ___ block towards the front in a ____ side forebalance.");
        step9.setFont(contentFont);
        step9.setBounds(780, 210, 620, 20);
        JLabel step10 = new JLabel("10. Point forward, step forward, and punch.");
        step10.setFont(contentFont);
        step10.setBounds(780, 230, 620, 20);
        JLabel step11 = new JLabel("11. Slide your feet together and do a ____ kick to the front.");
        step11.setFont(contentFont);
        step11.setBounds(780, 250, 620, 20);
        JLabel step12 = new JLabel("12. Land in a ______.");
        step12.setFont(contentFont);
        step12.setBounds(780, 270, 620, 20);
        JLabel step13 = new JLabel("13. Point forward, step forward, and punch.");
        step13.setFont(contentFont);
        step13.setBounds(780, 290, 620, 20);
        JLabel step14 = new JLabel("14. Step forward and punch.");
        step14.setFont(contentFont);
        step14.setBounds(780, 310, 620, 20);
        JLabel step15 = new JLabel("15. Do a cross block in a ____ side forebalance.");
        step15.setFont(contentFont);
        step15.setBounds(780, 330, 620, 20);
        JLabel step16 = new JLabel("16. Shrink it to a ____ side fighting stance, then do a backfist.");
        step16.setFont(contentFont);
        step16.setBounds(780, 350, 620, 20);
        JLabel step17 = new JLabel(
                "17. Step out into a ____ side forebalance, wrap with the front arm, then do a _______ punch.");
        step17.setFont(contentFont);
        step17.setBounds(780, 370, 620, 20);
        JLabel step18 = new JLabel("18. Do a backfist in a _____ side fighting stance facing the right.");
        step18.setFont(contentFont);
        step18.setBounds(780, 390, 620, 20);
        JLabel step19 = new JLabel(
                "19. Step out into a ____ side forebalance, wrap with the front arm, then do a _______ punch.");
        step19.setFont(contentFont);
        step19.setBounds(780, 410, 620, 20);
        JLabel step20 = new JLabel("20. Fold for a Tsong-Su block.");
        step20.setFont(contentFont);
        step20.setBounds(780, 430, 620, 20);
        JLabel step21 = new JLabel(
                "21. Slide your feet together, step out into a ____ side forebalance, then do a ________ block.");
        step21.setFont(contentFont);
        step21.setBounds(780, 450, 620, 20);
        JLabel step22 = new JLabel("22. Step up into a Yokh-Jeen block, then step into a horse stance and punch.");
        step22.setFont(contentFont);
        step22.setBounds(780, 470, 620, 20);
        JLabel step23 = new JLabel("23. Do a comearound ____ kick, land in a Tsong-Su block.");
        step23.setFont(contentFont);
        step23.setBounds(780, 490, 620, 20);
        JLabel step24 = new JLabel("24. Step up into a Yokh-Jeen block, then step into a horse stance and punch.");
        step24.setFont(contentFont);
        step24.setBounds(780, 510, 620, 20);
        JLabel step25 = new JLabel("25. Do another comearound side kick and land in a ______ block.");
        step25.setFont(contentFont);
        step25.setBounds(780, 530, 620, 20);
        JLabel step26 = new JLabel("26. Step out into a ____ side forebalance and press.");
        step26.setFont(contentFont);
        step26.setBounds(780, 550, 620, 20);
        JLabel step27 = new JLabel("27. Step forward into a ______ block.");
        step27.setFont(contentFont);
        step27.setBounds(780, 570, 620, 20);
        JLabel step28 = new JLabel("28. Step out into a ____ side forebalance and press.");
        step28.setFont(contentFont);
        step28.setBounds(780, 590, 620, 20);
        JLabel step29 = new JLabel("29. Slide your feet together and turn 90 degrees to your left.");
        step29.setFont(contentFont);
        step29.setBounds(780, 610, 620, 20);
        JLabel step30 = new JLabel("30. Fold for a press with the left hand on bottom and the right hand on top.");
        step30.setFont(contentFont);
        step30.setBounds(780, 630, 620, 20);
        JLabel step31 = new JLabel("31. Step out into a _____ side deep fighting stance and press towards the right.");
        step31.setFont(contentFont);
        step31.setBounds(780, 650, 620, 20);
        JLabel step32 = new JLabel("32. Slide your feet together.");
        step32.setFont(contentFont);
        step32.setBounds(780, 670, 620, 20);
        JLabel step33 = new JLabel("33. Fold for a press with the right hand on bottom and the left hand on top.");
        step33.setFont(contentFont);
        step33.setBounds(780, 690, 620, 20);
        JLabel step34 = new JLabel("34. Step out into a ____ side deep fighting stance and press towards the left.");
        step34.setFont(contentFont);
        step34.setBounds(780, 710, 620, 20);
        JLabel step35 = new JLabel("35. Say ___.");
        step35.setFont(contentFont);
        step35.setBounds(780, 730, 620, 20);
        JLabel step36 = new JLabel("36. Wait 3 seconds, and go back to the position for the kata.");
        step36.setFont(contentFont);
        step36.setBounds(780, 750, 620, 20);

        // Add the components to the panel
        contentPane.add(step1);
        contentPane.add(step2);
        contentPane.add(step3);
        contentPane.add(step4);
        contentPane.add(step5);
        contentPane.add(step6);
        contentPane.add(step7);
        contentPane.add(step8);
        contentPane.add(step9);
        contentPane.add(step10);
        contentPane.add(step11);
        contentPane.add(step12);
        contentPane.add(step13);
        contentPane.add(step14);
        contentPane.add(step15);
        contentPane.add(step16);
        contentPane.add(step17);
        contentPane.add(step18);
        contentPane.add(step19);
        contentPane.add(step20);
        contentPane.add(step21);
        contentPane.add(step22);
        contentPane.add(step23);
        contentPane.add(step24);
        contentPane.add(step25);
        contentPane.add(step26);
        contentPane.add(step27);
        contentPane.add(step28);
        contentPane.add(step29);
        contentPane.add(step30);
        contentPane.add(step31);
        contentPane.add(step32);
        contentPane.add(step33);
        contentPane.add(step34);
        contentPane.add(step35);
        contentPane.add(step36);
        contentPane.repaint();
    }

    /**
     * This method displays the graphics for completing kata chung-mu
     */
    public void DisplayKata10() {
        // Clear the previous the new one scene and prep for the new one
        PrepForKataFrame("Steps For Kata Chung-Mu:");
    }

    /**
     * This method displays the graphics for completing bo form 1
     */
    public void DisplayKata11() {
        // Clear the previous the new one scene and prep for the new one
        PrepForKataFrame("Steps For Bo Form 1:");
    }

    /**
     * This method displays the graphics for completing bo form 2
     */
    public void DisplayKata12() {
        // Clear the previous the new one scene and prep for the new one
        PrepForKataFrame("Steps For Bo Form 2:");
    }

    /**
     * This method displays the graphics for completing kata bassai
     */
    public void DisplayKata13() {
        // Clear the previous the new one scene and prep for the new one
        PrepForKataFrame("Steps For Kata Bassai:");
    }
}
