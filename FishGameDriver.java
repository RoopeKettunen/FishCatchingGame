import javax.swing.JFrame;

public class FishGameDriver
{
public static void main(String []args)
{
JFrame frame = new JFrame("Fish Game");
frame.setLocation(0,0);
frame.setSize(800,800);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setContentPane(new FishGamePanel());  
frame.setVisible(true);
}
}