import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
        
        Player mainPlayer = new Player();
        addObject(mainPlayer, 50, 550);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Blocks blocks = new Blocks();
        addObject(blocks,23,574);
        Blocks blocks2 = new Blocks();
        addObject(blocks2,73,574);
        Blocks blocks3 = new Blocks();
        addObject(blocks3,121,573);
        Blocks blocks4 = new Blocks();
        addObject(blocks4,168,572);
        Blocks blocks5 = new Blocks();
        addObject(blocks5,219,573);
        Blocks blocks6 = new Blocks();
        addObject(blocks6,270,573);
        Blocks blocks7 = new Blocks();
        addObject(blocks7,317,574);
        Blocks blocks8 = new Blocks();
        addObject(blocks8,373,574);
        Blocks blocks9 = new Blocks();
        addObject(blocks9,421,576);
        Blocks blocks10 = new Blocks();
        addObject(blocks10,476,574);
        Blocks blocks11 = new Blocks();
        addObject(blocks11,524,573);
        Blocks blocks12 = new Blocks();
        addObject(blocks12,573,569);
        Q1 q1 = new Q1();
        addObject(q1,207,408);
        q1.setLocation(150,498);
        Q2 q2 = new Q2();
        addObject(q2,371,360);
        q2.setLocation(271,496);
        Q3 q3 = new Q3();
        addObject(q3,457,347);
        q3.setLocation(548,485);
        Q4 q4 = new Q4();
        addObject(q4,388,246);
        q4.setLocation(421,492);
        q1.setLocation(155,521);
        q2.setLocation(289,512);
        q4.setLocation(438,519);
        q3.setLocation(547,520);
        q2.setLocation(267,518);
        q4.setLocation(388,516);
        q3.setLocation(466,524);
        q3.setLocation(518,526);
        q3.setLocation(503,519);
        Goal goal = new Goal();
        addObject(goal,579,520);
        goal.setLocation(576,547);
    }
}
