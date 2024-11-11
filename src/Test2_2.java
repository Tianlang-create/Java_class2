import javax.swing.*;

class Test2_2{
    public Test2_2(){
        JFrame jfm = new JFrame("第一个图形用户界面");
        System.out.println("测试");
        jfm.setSize(500,400);
        jfm.setLocation(500,300);
        jfm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfm.setVisible(true);
    }
    public static void main (String[] args)  {
        new Test2_2();
    }
}
