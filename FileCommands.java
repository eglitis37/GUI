import greenfoot.*;
/**
 * Write a description of class FileCommands here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FileCommands implements MenuCommands 
{
    /**
     * execute prints out different sentences with the names of commands.
     * @param idx is a integer that comes from commands string and World w is a world.
     * @return Nothing is returned.
     */
    public void execute(int idx, World w)
    {
        if (idx == 0)
        {
            System.out.println("Running New Command…");
        }
        else if(idx == 1)
        {
            System.out.println("Running Open Command…");
        }
        else if(idx == 2)
        {
            System.out.println("Running Save Command…");
        }
        else if(idx == 3)
        {
            System.out.println("Running Close Command…");
        }
        else if(idx == 4)
        {
            System.out.println("Running Exit Command…");
        }
    }
    
    /**
     * Constructor for objects of class FileCommands
     */
    public FileCommands()
    {
        
    }
}
