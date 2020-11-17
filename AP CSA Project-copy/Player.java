import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveAround();
    }    
    public void moveAround()
    {
        if(Greenfoot.isKeyDown("d"))
        {
            setRotation(0);
            move(4);
        }
        if(Greenfoot.isKeyDown("a"))
        {
            setRotation(180);
            move(4);
        }
    }
}
