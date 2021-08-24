package com.msb.tank;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankFrame extends Frame {
    public TankFrame() {
        Frame j = new Frame();
        j.setSize(800,600);
        j.setResizable(false);
        j.setTitle("Tank War");
        j.setVisible(true);

        //添加一个window监听器，传入一个适配器，重写window适配器的closing方法，实现窗口小叉的关闭
        j.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        g.fillRect(200,200,50,50);
    }
}
