/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;

/**
 *
 * @author apple
 */

import javax.swing.GroupLayout;
//import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class MyDemo extends javax.swing.JFrame {
    
    JLabel label1;
    JLabel label2;
    JLabel label3;
    
    public MyDemo() {
        this.setVisible(true);
        this.setSize(500, 500);
        this.setVisible(true);
        this.setLocation(400, 200);
        
        //label1 = new JLabel("111");
        label2 = new JLabel("222");
        label3 = new JLabel("333");

        // 为指定的 Container 创建 GroupLayout
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        //创建GroupLayout的水平连续组，越先加入的ParallelGroup，优先级级别越高
        GroupLayout.SequentialGroup hGroup = layout.createSequentialGroup();
        hGroup.addGap(20); //添加间隔
        hGroup.addGroup(layout.createParallelGroup().addComponent(label2).addComponent(label3));
        hGroup.addGap(20);
        //hGroup.addGroup(layout.createParallelGroup().addComponent(label1));
        //hGroup.addGap(5);
        layout.setHorizontalGroup(hGroup);
        //创建GroupLayout的垂直连续组，越先加入的ParallelGroup，优先级级别越高。
        GroupLayout.SequentialGroup vGroup = layout.createSequentialGroup();
        //vGroup.addGap(20);
        //vGroup.addGroup(layout.createParallelGroup().addComponent(label1));
        vGroup.addGap(50);
        vGroup.addGroup(layout.createParallelGroup().addComponent(label2));
        vGroup.addGap(50);
        vGroup.addGroup(layout.createParallelGroup().addComponent(label3));
        //设置垂直组
        layout.setVerticalGroup(vGroup);
    }
    
    public static void main(String[] args) {
        MyDemo d = new MyDemo();
    }

}