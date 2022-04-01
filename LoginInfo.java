import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
public class LoginInfo implements Runnable {
	private JFrame frame;
	public LoginInfo() {
		
	}
	
	@Override
	public void run() {
		
		frame = new JFrame("Login");
		frame.setPreferredSize(new Dimension(200,100));
		
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		createComponents(frame.getContentPane());
		
		frame.pack();
		frame.setVisible(true);
	}

	private void createComponents(Container container) {
		JButton button = new JButton("Login!");
		container.add(button);
		JLabel text = new JLabel("Text");
	}
	public JFrame getFrame() {
		return frame;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginInfo li = new LoginInfo();
		SwingUtilities.invokeLater(li);

	}

}
