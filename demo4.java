import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/**
 * ActionListener demo
 */
public class demo4 extends Applet implements ActionListener,Runnable
{
	TextField t1,t2;
	Button b1,b2;
	Thread a,b;
	public void init()
	{
		t1=new TextField(10);
		t2=new TextField(10);
		b1=new Button("Start");
		b2=new Button("Stop");
		a=new Thread(this,"First");
		b=new Thread(this,"Second");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		add(t1);
		add(t2);
		add(b1);
		add(b2);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			a.start();
			b.start();
		}
		if(ae.getSource()==b2)
		{
			a.stop();
			b.stop();
		}
	}
	public void run()
	{
		try
		{
			int i;
			for(i=1;i<=100;i++)
			{
				t1.setText(""+i);
				a.sleep(1000);
				t2.setText(""+i);
				b.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
/*<APPLET code="demo4.class" width=500 height=500></APPLET>*/