import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.awt.event.KeyListener.*;
public class FishGamePanel extends JPanel
{ 
   private static final int FRAME = 800;
   private static final Color BACKGROUND = Color.WHITE;
   private Fish a;
   private Fish b;
   private Fish c;
   private Fish d;
   private Fish f;
   private Fish g;
   private Fish h;
   private Fish i;
   private Fish j;
   private Fish k;
   private Fish l;
   private Fish m;
   private Fish n;
   private Fish o;
   private Fish p;
   private Fish q;
   private Fish r;
   private Fish s;
   private Fish t;
   private BufferedImage myImage;
   private Graphics myBuffer;
   private Net net;
   private int coins;
   private Timer timer;    
   public FishGamePanel()
   {
      myImage =  new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
      myBuffer = myImage.getGraphics();
      Color randColor = Color.BLACK;
      net = new Net(200,200,50,50,Color.BLACK); 
      a = new Fish(((int)(Math.random()*FRAME)),((int)(Math.random()*FRAME)),30,randColor);
      b= new Fish(((int)(Math.random()*FRAME)),((int)(Math.random()*FRAME)),30,randColor);
      c= new Fish(((int)(Math.random()*FRAME)),((int)(Math.random()*FRAME)),30,randColor);
      d= new Fish(((int)(Math.random()*FRAME)),((int)(Math.random()*FRAME)),30,randColor);
      f= new Fish(((int)(Math.random()*FRAME)),((int)(Math.random()*FRAME)),30,randColor);
      g= new Fish(((int)(Math.random()*FRAME)),((int)(Math.random()*FRAME)),30,randColor);
      h= new Fish(((int)(Math.random()*FRAME)),((int)(Math.random()*FRAME)),30,randColor);
      i= new Fish(((int)(Math.random()*FRAME)),((int)(Math.random()*FRAME)),30,randColor);
      j= new Fish(((int)(Math.random()*FRAME)),((int)(Math.random()*FRAME)),30,randColor);
      k= new Fish(((int)(Math.random()*FRAME)),((int)(Math.random()*FRAME)),30,randColor);
      l= new Fish(((int)(Math.random()*FRAME)),((int)(Math.random()*FRAME)),30,randColor);
      m= new Fish(((int)(Math.random()*FRAME)),((int)(Math.random()*FRAME)),30,randColor);
      n= new Fish(((int)(Math.random()*FRAME)),((int)(Math.random()*FRAME)),30,randColor);
      o= new Fish(((int)(Math.random()*FRAME)),((int)(Math.random()*FRAME)),30,randColor);
      p= new Fish(((int)(Math.random()*FRAME)),((int)(Math.random()*FRAME)),30,randColor);
      q= new Fish(((int)(Math.random()*FRAME)),((int)(Math.random()*FRAME)),30,randColor);
      r= new Fish(((int)(Math.random()*FRAME)),((int)(Math.random()*FRAME)),30,randColor);
      s= new Fish(((int)(Math.random()*FRAME)),((int)(Math.random()*FRAME)),30,randColor);
      t= new Fish(((int)(Math.random()*FRAME)),((int)(Math.random()*FRAME)),30,randColor);
      addKeyListener(new Key());
      setFocusable(true);   
      coins = 5;
      timer = new Timer(5, new Listener());
      timer.start();
   }  
   public void paintComponent(Graphics g)
   {
      g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
   }             
   private class Listener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         myBuffer.setColor(BACKGROUND);
         myBuffer.fillRect(0, 0,FRAME,FRAME); 
         a.change();
         b.change();
         c.change();
         d.change();
         f.change();
         g.change();
         h.change();
         i.change();
         j.change();
         k.change();
         l.change();
         m.change();
         n.change();
         o.change();
         p.change();
         q.change();
         r.change();
         s.change();
         t.change();
         a.move(FRAME, FRAME);
         b.move(FRAME, FRAME);  
         c.move(FRAME, FRAME);
         d.move(FRAME, FRAME);
         f.move(FRAME, FRAME);
         g.move(FRAME, FRAME);
         h.move(FRAME, FRAME);
         i.move(FRAME, FRAME);
         j.move(FRAME, FRAME);
         k.move(FRAME, FRAME);
         l.move(FRAME, FRAME);
         m.move(FRAME, FRAME);
         n.move(FRAME, FRAME);
         o.move(FRAME, FRAME);
         p.move(FRAME, FRAME);
         q.move(FRAME, FRAME);
         r.move(FRAME, FRAME);
         s.move(FRAME, FRAME);
         t.move(FRAME, FRAME);
         a.avoid(net);
         b.avoid(net);
         c.avoid(net);
         d.avoid(net);
         f.avoid(net);
         g.avoid(net);
         h.avoid(net);
         i.avoid(net);
         j.avoid(net);
         k.avoid(net);
         l.avoid(net);
         m.avoid(net);
         n.avoid(net);
         o.avoid(net);
         p.avoid(net);
         q.avoid(net);
         r.avoid(net);
         s.avoid(net);
         t.avoid(net);   
         a.draw(myBuffer);
         b.draw(myBuffer);
         c.draw(myBuffer);
         d.draw(myBuffer);
         f.draw(myBuffer);
         g.draw(myBuffer);
         h.draw(myBuffer);
         i.draw(myBuffer);
         j.draw(myBuffer);
         k.draw(myBuffer);
         l.draw(myBuffer);
         m.draw(myBuffer);
         n.draw(myBuffer);
         o.draw(myBuffer);
         p.draw(myBuffer);
         q.draw(myBuffer);
         r.draw(myBuffer);
         s.draw(myBuffer);
         t.draw(myBuffer);
         net.draw(myBuffer);
         myBuffer.setColor(Color.BLACK);
         myBuffer.setFont(new Font("Monospaced", Font.BOLD, 24));
         if(/*inside*/true){
            myBuffer.drawString("Coins: " + coins, FRAME - 150, 25);
         }
         else
         {
            coins=coins-1;
            myBuffer.drawString("Coins: " + coins, FRAME - 150, 25);
         }
         repaint();
      }
   } 
   private class Key extends KeyAdapter
   {
      public void keyPressed( KeyEvent e )
      {
         if(e.getKeyCode() == KeyEvent.VK_UP && net.getY()>10)
         {
            net.setY(net.getY()-10);
         }
         if(e.getKeyCode() == KeyEvent.VK_DOWN && net.getY()<FRAME-10)
         {
            net.setY(net.getY()+10);
         }
         if(e.getKeyCode() == KeyEvent.VK_LEFT && net.getX()>10)
         {
            net.setX(net.getX()-10);
         }
         if(e.getKeyCode() == KeyEvent.VK_RIGHT && net.getX()<FRAME-10)
         {
            net.setX(net.getX()+10);
         }
         if(e.getKeyCode() == KeyEvent.VK_M)
         {
            if(net.inNet(a)){
               a.teleport(400,400);
               coins=coins+2;
            }
            else if(net.inNet(b)){
               b.teleport(400,400);
               coins=coins+2;
            }
            else if(net.inNet(c))
            {
               c.teleport(400,400);
               coins=coins+2;    
            }
            else if(net.inNet(d))
            {
               d.teleport(400,400);
               coins=coins+2;
            }
            
            else if(e.getKeyCode() == KeyEvent.VK_M && net.inNet(f))
            {
               f.teleport(400,400);
               coins=coins+2;    
            }
            else if(net.inNet(g))
            {
               g.teleport(400,400);
               coins=coins+2;    
            }
            else if(net.inNet(h))
            {
               h.teleport(400,400);
               coins=coins+2;    
            }
            else if(net.inNet(i))
            {
               i.teleport(400,400);
               coins=coins+2;    
            }
            else if(net.inNet(j))
            {
               j.teleport(400,400);
               coins=coins+2;    
            }
            else if(net.inNet(k))
            {
               k.teleport(400,400);
               coins=coins+2;    
            }
            else if(net.inNet(l))
            {
               l.teleport(400,400);
               coins=coins+2;    
            }
            else if(net.inNet(m))
            {
               m.teleport(400,400);
               coins=coins+2;    
            }
            else if(net.inNet(n))
            {
               n.teleport(400,400);
               coins=coins+2;    
            }
            else if(net.inNet(o))
            {
               o.teleport(400,400);
               coins=coins+2;    
            }
            else if(net.inNet(p))
            {
               p.teleport(400,400);
               coins=coins+2;    
            }
            else if(net.inNet(q))
            {
               q.teleport(400,400);
               coins=coins+2;    
            }
            else if(net.inNet(r))
            {
               r.teleport(400,400);
               coins=coins+2;    
            }
            else if(net.inNet(s))
            {
               s.teleport(400,400);
               coins=coins+2;    
            }
            else if(net.inNet(t))
            {
               t.teleport(400,400);
               coins=coins+2;    
            }
            else
               coins--;    
         
         }
      }
   }  
}
