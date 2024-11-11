import javax.swing.*;

class Test3 extends JFrame {
    private JPanel jpl = new JPanel();
    private JLabel jlb = new JLabel("欢迎来到疯狂肯德基V50—Tianlang系统");
    private JButton jbt = new JButton("付款");
    private JTextField jtf = new JTextField("此处输入金额",20);
    private JComboBox jcb = new JComboBox();
    private JCheckBox jcb2 = new JCheckBox("是否购买疯狂肯德基终身套餐",true);
    private JTextArea jta = new JTextArea("输入备注",5,20);
    public Test3(){
        jpl.add(jlb);
        jpl.add(jtf);
        jpl.add(jcb);	jcb.addItem("到账时间");	jcb.addItem("100RMB");	jcb.addItem("150RMB");	jcb.addItem("200RMB");
        jpl.add(jcb2);
        jpl.add(jta);
        jpl.add(jbt);
        this.add(jpl);
        this.setSize(300,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main (String[] args)  {
        new Test3().setVisible(true);
    }
}