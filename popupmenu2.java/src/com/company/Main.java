// for popup menu ??
package com.company;
import java.awt.*;
import java.awt.event.*;
public class Main implements MouseListener
{
    Frame f;
    PopupMenu pm;
    MenuItem i1,i2,i3,i4,i5,i6,i7;
    Menu m1;
    Main() {
        f = new Frame();
        pm = new PopupMenu();
        m1 = new Menu("sort by");
        i1 = new MenuItem("new");
        i2 = new MenuItem("open");
        i3 = new MenuItem("save");
        i4 = new MenuItem("refresh");
        i5 = new MenuItem("name");
        i6 = new MenuItem("size");
        i7 = new MenuItem("date modified");

        f.addMouseListener(this);
        f.add(pm);
        pm.add(i1);
        pm.add(i2);
        pm.add(i3);
        pm.add(i4);
        pm.add(m1);
        m1.add(i5);
        m1.add(i6);
        m1.add(i7);

        f.setVisible(true);
        f.setLayout(new FlowLayout());
        f.setSize(500,500);
        f.setTitle("popup menu example");

    }
    public void mouseClicked(MouseEvent me)
    {
        pm.show(f,me.getX(),me.getY());
    }
    public void mousePressed(MouseEvent me)
    {

    }
    public void mouseReleased(MouseEvent me)
    {

    }
    public void mouseEntered(MouseEvent me)
    {

    }
    public void mouseExited(MouseEvent me)
    {

    }
    public static void main(String[] args) {
	// write your code here
        Main m = new Main();
    }
}
