import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JFrame;

public class MovingFrame extends JFrame{
	public MovingFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("³ªÀâ¾ÆºÁ¶ó!");
		setSize(250,250);
		setLocationRelativeTo(null);
		
		addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				Random r = new Random();
				setLocation(r.nextInt(800), r.nextInt(800));
			}
		});
		
		setVisible(true);
	}
}
