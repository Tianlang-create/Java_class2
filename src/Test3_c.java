import javax.swing.*;
import java.awt.*;

public class Test3_c extends JFrame {
    private JPanel jpl=new JPanel();
    private JLabel jbl=new JLabel("欢迎来到XX信息门户");
    private JButton jbn=new JButton("按钮一");
    private JTextArea jtr=new JTextArea("输入一",5,20);
    private JTextField jtf =new JTextField("输入二",20);
    private JComboBox jcb=new JComboBox();
    private JCheckBox jcb2 = new JCheckBox("是否购买疯狂肯德基终身套餐",true);
    //构造器的使用
    public Test3_c(){
        jpl.add(jbl);
        jpl.add(jbn);
        jpl.add(jtr);
        jpl.add(jtf);
        jpl.add(jcb);
        jcb.addItem("选项一");
        //重写
        this.add(jpl);
        this.setSize(500,300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Test3_c().setVisible(true);
    }
}
