import javax.swing.*;

class Test2_1 extends JFrame {
    Test2_1(){
        super("第一个图形用户界面");
        this.setSize(500,400);
        this.setLocation(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main (String[] args)  {
        new Test2_1();
    }
}