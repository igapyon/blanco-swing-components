package blanco.swing.components.button;

import java.awt.Component;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.SwingUtilities;

/**
 * Button of Exit
 * 
 * @author igapyon@gmail.com
 */
public class BlancoExitButton extends JButton {

	private static final long serialVersionUID = 1L;

	protected String text = "Exit";

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	/**
	 * Hook init()
	 */
	public void updateUI() {
		super.updateUI();
		init();
	}

	public void init() {
		setText(getText());
		addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				final Component cmpnt = (Component) event.getSource();
				final Window wndw = SwingUtilities.getWindowAncestor(cmpnt);
				wndw.dispose();
			}
		});
	}
}
