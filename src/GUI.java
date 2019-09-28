
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
    public JPanel kataContentPane = new JPanel(new GridBagLayout());
    public JFrame displaywindow = new JFrame();
    public JFrame messages = new JFrame("JOptionPane showMessageDialog example");

    // Define all buttons here and load images into them if needed
    private final JButton main_menu_button = new JButton();
    private final JButton white_belt_button = new JButton(new ImageIcon("src/resources/white_belt.jpg"));
    private final JButton gold_belt_button = new JButton(new ImageIcon("src/resources/gold_belt.jpg"));
    private final JButton orange_belt_button = new JButton(new ImageIcon("src/resources/orange_belt.jpg"));
    private final JButton purple_belt_button = new JButton(new ImageIcon("src/resources/purple_belt.jpg"));
    private final JButton green_belt_button = new JButton(new ImageIcon("src/resources/green_belt.jpg"));
    private final JButton blue_belt_button = new JButton(new ImageIcon("src/resources/blue_belt.jpg"));
    private final JButton red_belt_button = new JButton(new ImageIcon("src/resources/red_belt.jpg"));
    private final JButton brown_belt_button = new JButton(new ImageIcon("src/resources/brown_belt.jpg"));
    private final JButton black_belt_button = new JButton(new ImageIcon("src/resources/black_belt.jpg"));

    // Load the background image
    private final JLabel background = new JLabel(new ImageIcon("src/resources/UMAA_LOGO.png"));

    /* Fonts Specifications */
    // The default font that it is using for the content 
    Font contentFont = new Font("sansserif", 0, 32);
    // Font that using for the titles
    Font titleFont = new Font("sansserif", 0, 14);

    // Allows for custom behavior when clicking the close button
    private final WindowListener exitListener = new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
            int confirm = JOptionPane.showOptionDialog(null, "Are You Sure You Want To Exit The Game?",
                    "Exit Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
            if (confirm == 0) {
                // Kill all threads and exit
                try {
                    Main.display.kill();
                    JOptionPane.showMessageDialog(null, "Thanks For Playing!");
                    System.exit(0);
                } catch (Exception closeException) {
                    // Force the program to close if it's being stupid
                    JOptionPane.showMessageDialog(null, "Something Went Wrong When Attempting To Kill Program Threads. Force Closing Program.");
                    System.exit(0);
                }
            }
        }
    };

    public GUI() {

    }

    @Override
    public void run() {
        while (done == 0) {
            try {
                // Have the graphics thread run until the program is terminated or the thread is
                // signaled to halt execution.
                Thread.sleep(1);// Check every millisecond if this thread should terminate
            } catch (InterruptedException e) {
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

        // Add contentPanel to JFramem set window position, and set window close operation
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
        main_menu_button.setBounds(5, 850, 300, 50);
        white_belt_button.setBounds(30, 40, 300, 79);
        gold_belt_button.setBounds(30, 190, 300, 79);
        orange_belt_button.setBounds(30, 340, 300, 79);
        purple_belt_button.setBounds(30, 490, 300, 79);
        green_belt_button.setBounds(30, 640, 300, 79);
        blue_belt_button.setBounds(30, 790, 300, 79);
        red_belt_button.setBounds(1270, 40, 300, 79);
        brown_belt_button.setBounds(1270, 190, 300, 79);
        black_belt_button.setBounds(1270, 340, 300, 79);

        DisplayMainMenu(true, false);
    }

    /**
     * This method activates the mouse listeners for all the buttons in the game.
     */
    public void ActivateMouseListeners() {
        // Add MouseListeners to the buttons
        main_menu_button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Main.display.DisplayMainMenu(false, false);
            }
        });
        white_belt_button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                displaywindow.remove(contentPane);
                kataContentPane.removeAll();
                kataContentPane.add(new White1());
                displaywindow.add(kataContentPane);
                displaywindow.pack();
            }
        });
        gold_belt_button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                displaywindow.remove(contentPane);
                kataContentPane.removeAll();
                kataContentPane.add(new Gold1());
                displaywindow.add(kataContentPane);
                displaywindow.pack();
            }
        });
        orange_belt_button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //Main.display.DisplayKata3();
            }
        });
        purple_belt_button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //Main.display.DisplayKata4();
            }
        });
        green_belt_button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //Main.display.DisplayKata5();
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
                //Main.display.DisplayKata13();
            }
        });
    }

    /**
     * This method displays the game's main menu
     *
     * @param displayIntroText Whether the intro text should be displayed or not.
     * @param comingFromKataFrame Whether we're exiting to the main menu from a kata frame or not.
     */
    public void DisplayMainMenu(boolean displayIntroText, boolean comingFromKataFrame) {
        // Clear the previous scene and prep for the new one
        if (comingFromKataFrame) // Just reproject the main menu since we didn't modify its panel
        {
            displaywindow.remove(kataContentPane);
            displaywindow.add(contentPane);
            contentPane.repaint();
        }
        else // Redraw the panel since we modified it
        {
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
            
            if (displayIntroText)
            {
                try
                {
                    output.setText("Welcome To Tae Kwon Do Matchup!");
                    Thread.sleep(2000);// Set the delay between text box updates as 1 second
                    output.setText("Please Select Your Experience Level By Clicking On A Belt.");
                    // This fixes a bug with the text output box in the event players click on a
                    // button before all the intro text is displayed.
                    ActivateMouseListeners();
                }
                catch (Exception e)
                {
                    System.out.print("Graphics Thread Error: " + e + "/n");
                }
            }
            else
            {
                output.setText("Please Select Your Experience Level By Clicking On A Belt.");
            }
        }
    }

    // This method is depreciated. We'll get rid of this when we're done reworking the kata frames.
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
        contentPane.add(output);
        contentPane.add(background);
        contentPane.add(kataText);
        contentPane.add(kataText2);
        contentPane.add(main_menu_button);
        contentPane.add(blue_belt_button);
        contentPane.add(blue_belt_button2);

        // Activate mouse listeners for buttons
        blue_belt_button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //Main.display.DisplayKata6();
            }
        });
        blue_belt_button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //Main.display.DisplayKata7();
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
        contentPane.add(output);
        contentPane.add(background);
        contentPane.add(kataText);
        contentPane.add(kataText2);
        contentPane.add(main_menu_button);
        contentPane.add(red_belt_button);
        contentPane.add(red_belt_button2);

        // Activate mouse listeners for buttons
        red_belt_button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //Main.display.DisplayKata8();
            }
        });
        red_belt_button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //Main.display.DisplayKata9();
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
        contentPane.add(output);
        contentPane.add(background);
        contentPane.add(kataText);
        contentPane.add(kataText2);
        contentPane.add(kataText3);
        contentPane.add(main_menu_button);
        contentPane.add(brown_belt_button);
        contentPane.add(brown_belt_button2);
        contentPane.add(brown_belt_button3);

        // Activate mouse listeners for buttons
        brown_belt_button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //Main.display.DisplayKata10();
            }
        });
        brown_belt_button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //Main.display.DisplayKata11();
            }
        });
        brown_belt_button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //Main.display.DisplayKata12();
            }
        });

        contentPane.repaint();
        output.setText("Choose A Kata.");
    }

}
