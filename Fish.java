import java.awt.*;
public class Fish extends Ball
{
   private Color myColor;
   private int myX;
   private int myY;
   private double dx;
   private double dy;
   private double myDiameter;



   public Fish()
   {
      myColor = Color.BLACK;
      myX = 0;
      myY = 0;
      dx =  Math.random()*1;
      dy =  Math.random()*1;
      myDiameter=10;
   }
   public Fish(int x,int y,double d,Color c)
   {
      super(x,y,d,c);
      dx =  Math.random()* 1;
      dy = Math.random()* 1;
   }
   public void move(double rightEdge, double bottomEdge)
   {
      setX(getX()+ dx);                 
      setY(getY() +dy);
      if(getX() >= rightEdge - getRadius()) 
      {
         setX(rightEdge - getRadius());
         dx = dx * -1; 
      }
      if(getX() <= 0 + getRadius()) 
      {
         setX(0 + getRadius());
         dx = dx * -1; 
      }
      if(getY() <=0 + getRadius())  
      {
         setY( + getRadius());
         dy = dy * -1; 
      }
      if(getY() >= 800 - getRadius())  
      {
         setY(800 - getRadius());
         dy = dy * -1; 
      }
             
   }
     public void teleport(int x,int y)
      {
    setX(x);
    setY(y);
      
      }

   public void draw(Graphics myBuffer) 
   {
      myBuffer.setColor(Color.WHITE);
      myBuffer.fillOval((int)(getX() - getRadius()), (int)(getY()-getRadius()), (int)getDiameter(), (int)getDiameter());
      myBuffer.setColor(Color.RED);
      int xPoints[] = {(int)getX(),(int)getX(),(int)getX()+(int)getDiameter()};
      int yPoints[] =  {(int)getY(),(int)getY()+(int)getDiameter(),(int)getY()+(int)getRadius()};
      myBuffer.drawPolygon(xPoints,yPoints,3);
   }

   public void change()
   {
      double k=((Math.random()*10));
      if(k>9.9)
      {
         dx=((Math.random()* 4)-2);
         dy=((Math.random()* 4)-2);
      
      }
   }
   public void avoid(Net net){
     double k=((Math.random()*10));
      if(k>8)
{
   if(20<distance(net.getX()+(net.getWidth()/2),net.getY()+(net.getHeight()/2),getX()+getRadius(),getY()+getRadius())&& distance(net.getX()+(net.getWidth()/2),net.getY()+(net.getHeight()/2),getX()+getRadius(),getY()+getRadius())<50)
   {
    dx=((Math.random()* 10)-5);
         dy=((Math.random()* 10)-5);
}
   }
   
   }
private double distance(double x1, double y1, double x2, double y2)
      {
         return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
      }	

}
