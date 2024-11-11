import javax.swing.*;
import java.awt.*;
class Test5 extends JFrame implements Runnable{
    private JPanel jpl = new JPanel();
    private Icon icon = new ImageIcon("img.png");
    private JButton jbt = new JButton(icon);
    private int Y = 0;
    private int DIR = 1;
    public void run(){
        while(true){
            if(DIR==1) {
                Y++;
                if(Y>=this.getHeight()-2*icon.getIconHeight())  DIR = -1;
            }else if(DIR==-1) {
                Y--;
                if(Y<=0)  DIR = 1;
            }
            jbt.setLocation(0,Y);
            try{	Thread.sleep(10);	} catch(Exception ex){}
        }
    }
    public Test5(){
        jpl.setLayout(null);
        jbt.setSize(icon.getIconWidth(),icon.getIconHeight());
        jpl.add(jbt);
        this.add(jpl);
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        new Thread(this).start();
    }
    public static void main (String[] args)  {
        new Test5().setVisible(true);
    }
}