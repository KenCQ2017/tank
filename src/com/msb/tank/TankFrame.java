package com.msb.tank;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankFrame extends Frame {
    int x = 200, y = 200;
    public TankFrame() {
        setSize(800,600);
        setResizable(false);
        setTitle("Tank War");
        setVisible(true);

        //添加一个window监听器，传入一个适配器，重写window适配器的closing方法，实现窗口小叉的关闭
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        g.fillRect(x,y,50,50);
        x += 10;
        y += 10;
        System.out.println(x + " / " + y);
    }
}
