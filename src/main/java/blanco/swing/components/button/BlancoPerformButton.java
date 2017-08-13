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

	/**
	 * Set default text.
	 */
	protected String defaultText = "Perform";

	/**
	 * Must not be null.
	 */
	@Override
	public String getText() {
		if (super.getText() == null || super.getText().length() == 0) {
			return defaultText;
		}
		return super.getText();
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
		addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent event) {
				JOptionPane.showMessageDialog(null, "Do something.", "Perform",
						JOptionPane.OK_OPTION | JOptionPane.INFORMATION_MESSAGE);
			}
		});
	}
}
