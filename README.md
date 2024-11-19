## JavaGUI入门

## 引言

Java 提供了强大的图形用户界面（GUI）工具包，其中最常用的是 Swing 和 JavaFX。本笔记将重点介绍如何使用 Swing 创建简单的 GUI 应用程序，并提供实例代码。

## Swing 简介

Swing 是 Java Foundation Classes (JFC) 的一部分，是一个用于构建跨平台 GUI 应用程序的工具包。Swing 提供了丰富的组件库，包括按钮、文本框、标签等。

## 环境设置

1. 确保已安装 JDK（Java Development Kit）。
2. 使用 IDE（如 IntelliJ IDEA、Eclipse）或文本编辑器（如 VS Code）编写代码。

## 创建一个简单的 Swing 应用程序

### 1. 导入必要的包

```java
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
```

### 2. 创建主类并继承 JFrame

```java
public class SimpleGUI extends JFrame {
    public SimpleGUI() {
        // 设置窗口标题
        setTitle("Simple Swing GUI");
 
        // 设置默认关闭操作
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        // 设置窗口大小
        setSize(400, 300);
 
        // 创建一个面板
        JPanel panel = new JPanel();
 
        // 创建一个按钮并添加到面板
        JButton button = new JButton("Click Me!");
        panel.add(button);
 
        // 添加面板到窗口
        add(panel);
 
        // 设置窗口可见
        setVisible(true);
 
        // 添加按钮点击事件监听器
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
            }
        });
    }
 
    public static void main(String[] args) {
        // 创建并显示 GUI
        new SimpleGUI();
    }
}
```

### 3. 运行程序

将上述代码保存为一个 Java 文件（例如 `SimpleGUI.java`），然后在命令行或 IDE 中编译并运行它。你将看到一个包含按钮的窗口，点击按钮后会在控制台输出 "Button clicked!"。

## 实例代码解析

1. **导入包**：

   ```java
   import javax.swing.JFrame;
   import javax.swing.JButton;
   import javax.swing.JPanel;
   import java.awt.event.ActionEvent;
   import java.awt.event.ActionListener;
   ```

   这些包提供了创建 GUI 应用程序所需的所有类。

2. **创建主类**：

   ```java
   public class SimpleGUI extends JFrame {
       public SimpleGUI() {
           // ...
       }
       // main 方法
       public static void main(String[] args) {
           new SimpleGUI();
       }
   }
   ```

   `SimpleGUI` 类继承自 `JFrame`，表示一个窗口。

3. **设置窗口属性**：

   ```java
   setTitle("Simple Swing GUI");
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   setSize(400, 300);
   ```

   设置窗口的标题、关闭操作和大小。

4. **创建面板和按钮**：

   ```java
   JPanel panel = new JPanel();
   JButton button = new JButton("Click Me!");
   panel.add(button);
   add(panel);
   ```

   创建一个面板，并在面板上添加一个按钮。然后将面板添加到窗口中。

5. **添加事件监听器**：

   ```java
   button.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
           System.out.println("Button clicked!");
       }
   });
   ```

   为按钮添加一个点击事件监听器，当按钮被点击时，在控制台输出 "Button clicked!"。

6. **设置窗口可见**：

   ```java
   java复制代码
   
   setVisible(true);
   ```

   调用 `setVisible(true)` 方法使窗口可见。

## 总结

通过本笔记，我们学习了如何使用 Swing 创建一个简单的 GUI 应用程序。Swing 提供了丰富的组件和布局管理器，可以创建复杂的用户界面。在实际开发中，可以结合使用这些组件和布局管理器来构建功能强大的 GUI 应用程序。

希望这篇学习笔记对你有帮助！如果有任何问题，欢迎留言讨论。