import java.awt.*;

public class Net extends Bumper
{


/*public Net()
{
super(x,y,w,h,c);
}
*/
public Net(int x, int y, int h,int w,Color c)
{
super(x,y,w,h,c);
}

 public boolean inNet(Fish f)
      {
        
        if(getX()+5<f.getX()&& getY()+5<f.getY()&& getX()-5+getHeight()>f.getX()+f.getRadius() && getY()-5+getWidth()>f.getY()+f.getRadius())
        return true;
        return false;
        // for(int x = getX(); x <= getX() + getWidth(); x++)   //starts at upper left corner(x,y)
          //  for(int y = getY(); y <= getY() + getHeight(); y++)
            //   for(distance(x, y, f.getX(), f.getY()) <= f.getRadius() ) //checks every point on the bumper
              //    return true;            
         //return false;
      }  


 public void draw(Graphics myBuffer) 
      {
         myBuffer.setColor(Color.BLACK);
         myBuffer.drawRect(getX(), getY(), getWidth(), getHeight());
      }
 private double distance(double x1, double y1, double x2, double y2)
      {
         return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
      }	

}