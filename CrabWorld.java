import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends greenfoot.World
{
    private int vidas;
    private GreenfootSound musica;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public CrabWorld()
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        musica=new GreenfootSound("Ufo-t-balt.mp3");
        super(560,560, 1);
    }
    
    protected void addedToWorld(World world)
    {
        //world.addObject(vidas,500,20);
    }
    public void started()
    {
        musica.playLoop();
    }
    public void stopped()
    {
        musica.pause();
    }
}
