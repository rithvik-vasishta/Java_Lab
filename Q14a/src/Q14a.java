import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Q14a extends Applet implements MouseMotionListener, MouseListener {
	int startx,starty,x,y,height,width;
	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		startx=arg0.getX();
		starty=arg0.getY();
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		


	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		x=startx;
		y=starty;
		height=arg0.getX()-x;
		width=arg0.getY()-y;
		if(height<0)
		{
			x=arg0.getX();
			height=Math.abs(height);
		}
		if(width<0)
		{
			y=arg0.getY();
			width=Math.abs(width);
		}
		repaint();

	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}
	public void paint(Graphics g)
	{
		g.drawRect(x, y,  height,width);
	}

}
