import javax.swing.*;

class Test4 extends JFrame {
    private JPanel jpl = new JPanel();
    private JLabel jlb = new JLabel("欢迎来到XX大学学生注册系统");
    private Icon icon = new ImageIcon("D:\\Project\\Java\\Java_class2\\src\\img.png");
    private JButton jbt = new JButton("新生注册", icon);//图像应用
    public Test4(){
        jpl.setLayout(null);
        jbt.setLocation(0,0);
        jbt.setSize(300,500);
        jpl.add(jlb);
        jpl.add(jbt);

        this.add(jpl);
        this.setSize(500,400);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main (String[] args)  {
        new Test4().setVisible(true);
    }
}