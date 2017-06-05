import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class MyWorld here.
 * 
 * @author Klavs Eglitis 
 * @version 23.05.2017
 */
public class UIMainWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public UIMainWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        testActors();
    }
    
    /**
     * testActors adds all the object with right colors into to the world.
     * @param There are no parameters.
     * @return Nothing is returned.
     */
    private void testActors()
    {
        addObject( new Button(25, "button-blue.png", "button-green.png", "Press" ), 200, 200);
        addObject( new Label("Windows XP", 25), 300, 200);
        addObject( new Textbox("Useless Button", 25, true, Color.GREEN, Color.RED), 450, 200);
        addObject( new Menu("File", "New\nOpen\nSave\nClose\nExit", 25, Color.BLACK, Color.ORANGE, Color.BLUE, Color.YELLOW, new FileCommands()), 300, 100);
    }
}
