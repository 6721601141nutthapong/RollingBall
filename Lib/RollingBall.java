package Lib;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;

import javax.swing.*;
import javax.swing.JPanel;

public class RollingBall extends JPanel implements ActionListener{
    int x = 100;
    int y = 90;
    int star_angel = 0;

    public RollingBall(){
        Timer t = new Timer(100,this);
        t.start();
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawOval(x,y,80,80);
        //g.setColor(Color.BLACK);
        g.fillArc(x,y,80,80,star_angel,180);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        x = x - 2 ;
        star_angel = star_angel + 2 ;
        if(x==-80)x = getWidth();
        if(star_angel == 360)star_angel = 0;
        repaint();

    }
}
