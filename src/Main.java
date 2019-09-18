
/**
 * Project Description:
 * My sensei, Mr. Henry, asked me to make a video game for our students to play to keep them engaged.
 * This game is a matching game where players have to click on buttons to fill in holes in a kata's steps. If the correct move is selected, the
 * highlight color on the blank line the player is currently being asked to fill in will turn green, and the next blank line will be highlighted.
 * If the player selects the wrong move, the highlight color will turn red, and the player will be asked to try again until they are correct.
 * If too many wrong moves are inputted, the player loses.
 *
 * This game is multithreaded.
 * Date: 5/24/2019
 */

/**
 * This class is the master class that controls everything.
 *
 * @author Matthew Wethington
 */
public class Main {

    //Declare and initiailze all the objects and variables needed to run the game.
    public static GUI display = new GUI();//Create the graphics thread
    public static White1 dis = new White1();

    /**
     * This is the main game thread.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
         
        //Start threads
        display.start();//Start graphics thread
        
        //Initialize the graphics, display the title screen, and print the introductory text.
        display.init();
    }
}
