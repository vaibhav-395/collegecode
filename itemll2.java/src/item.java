import java.applet.Applet;
import java.awt.event.*;
import java.applet.*;
import java.awt.*;
public class item extends Applet implements ItemListener
{
    Choice c1;
    Label l1;
    public void init()
    {
        c1 = new Choice();
        l1 = new Label();

        c1.add("c");
        c1.add("PYTHON");
        c1.add("JAVA");
        c1.add("PHP");
        c1.add("c++");
        c1.addItemListener(this);
        add(c1);
        add(l1);
    }
        public void itemStateChanged(ItemEvent ie)
        {
            l1.setText("selected item :"+c1.getSelectedItem());
        }

}
