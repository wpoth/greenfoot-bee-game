import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Frog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Frog extends Actor
{
    /**
     * Act - do whatever the Frog wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Frog()
    {
     getImage().scale(100, 100);
    }
    public void act()
    {
        // Add your action code here.
        getKeyBoard();
        isHit();
    }
    public void isHit()
    {
    if(isTouching(Bee.class)){
        removeTouching(Bee.class);
        Bee newBee=new Bee();
        MyWorld w=(MyWorld)getWorld();
        w.eatBee();
        w.addObject(newBee, Greenfoot.getRandomNumber(600)+100,Greenfoot.getRandomNumber(600)+100);
    }
    }
    public void getKeyBoard()
    {
    boolean key=Greenfoot.isKeyDown("right");
    if(key==true)
    {
    setLocation(getX()+3,getY());
    }
    key=Greenfoot.isKeyDown("left");
    if(key==true)
    {
    setLocation(getX()-3,getY());
    }    
    key=Greenfoot.isKeyDown("up");
    if(key==true)
    {
    setLocation(getX(),getY()-3);
    }  
    key=Greenfoot.isKeyDown("down");
    if(key==true)
    {
    setLocation(getX(),getY()+3);
    }  
    }
}
