import greenfoot.*;

public class Tiempo  extends Actor
{
    private SimpleTimer timer;
    private Counter contador;
    public Tiempo()
    {
        timer=new SimpleTimer();
        contador= new Counter("Tiempo");
        contador.setValue(60);
    }
     //Se ejecuta al momento de agregar el objeto al munod 
    protected void addedToWorld(World world)
    {
        world.addObject(contador,60,20);
    }
    public void act()
    {
        if(timer.millisElapsed()>1000){
           contador.setValue(contador.getValue()-1);
           if(contador.getValue()==0){
               Greenfoot.stop();
            }
           timer.mark();
        }
    }
}
