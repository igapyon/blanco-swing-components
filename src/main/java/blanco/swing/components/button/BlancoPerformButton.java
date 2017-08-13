package blanco.swing.components.button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 * Button of Perform
 * 
 * @author igapyon@gmail.com
 */
public class BlancoPerformButton extends JButton {

	private static final long serialVersionUID = 1L;

	protected String text = "Perform";

	@Override
	public String getText() {
		return text;
	}

	@Override
	public void setText(String text) {
		super.setText(text);
		this.text = text;
	}

	/**
	 * Hook init()
	 */
	@Override
	public void updateUI() {
		super.updateUI();
		init();
	}

	public void init() {
		setText(text);
		addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent event) {
				JOptionPane.showMessageDialog(null, "Do something.", "Perform",
						JOptionPane.OK_OPTION | JOptionPane.INFORMATION_MESSAGE);
			}
		});
	}
}
