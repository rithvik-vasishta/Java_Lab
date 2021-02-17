import java.applet.Applet;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.*;

public class Q4a extends Applet implements KeyListener {
	TextField tf1=new TextField();
	//TextField tf2=new TextField();
	public void init()
	{
		add(new Label("Enter the String"));
		add (tf1);
		tf1.addKeyListener(this);
		//add(new Label("Enter p if you wanna check for pali"));
		//add(tf2);
		//tf2.addKeyListener(this);
	}
	public boolean pali(String s)
	{
		int i,j;
		for(i=0,j=s.length()-1;i<j;i++,j--)
		{
			if(s.charAt(i)!=s.charAt(j))
				return false;
		}
		return true;
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		
		// TODO Auto-generated method stub
		String value=tf1.getText();
		if(arg0.getKeyChar()=='p')
		{	if(pali(value))
				showStatus("It is Pali");
		else showStatus("It is not");
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		//showStatus("You released");
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		//showStatus("You are typing");
	}

}
