import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    int speed = 5;
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveAround();
        hitWalls();
    }    
   public void moveAround()
    {
        int x = getX();
        int y = getY();
        if(Greenfoot.isKeyDown("d"))
        {
            setLocation(x + speed, y);
            if(hitWalls())
            {
                setLocation(x - speed, y);
            }
        }
        if(Greenfoot.isKeyDown("a"))
        {
            setLocation(x - speed, y);
            if(hitWalls())
            {
                setLocation(x + speed, y);
            }
        }
    }
    public boolean hitWalls()
    {
        if(isTouching(Blockers.class))
        {
            return(true);
        }
        else
        {
            return(false);
        }
    }
     public void promptQ()
    {
        
         
        if (isTouching(Q1.class))
        {
          String inputValue = JOptionPane.showInputDialog("China is the most populated country in the world"); 
        }
            if (inputValue == "true") {
                System.out.println("Nice");
            }
      }            
}
