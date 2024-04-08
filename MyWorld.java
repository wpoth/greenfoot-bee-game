import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private int score=0;
    private Label myLabel;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 800, 1); 
        prepare();
        score=0;
        
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Bee bee = new Bee();
        addObject(bee,400,400);
        Bee bee2 = new Bee();
        addObject(bee2,400,200);
        Bee bee3 = new Bee();
        addObject(bee3,400,600);
        Frog frog = new Frog();
        addObject(frog,54,385);
        myLabel=new Label ("score: 0",30);
        addObject(myLabel, 400, 100);
    }
    public void eatBee()
    {
     score++;
     myLabel.setValue("score: " + score);
    }
}
