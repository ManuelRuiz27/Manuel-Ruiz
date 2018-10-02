import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class Worm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Worm extends Actor
{
    /**
     * Act - do whatever the Worm wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Worm(int cantidad)
    {  
        Worm gusano; 
        for(int i=0;i<cantidad;i++)
        {
            int n=600;
            int x,y;
            x=(int)(Math.random()*n) + 1;
            y=(int)(Math.random()*n) + 1;
            world.addObject(gusano,x,y);
        }
    }
     public void act() 
    {
        // Add your action code here.
    }    
}
