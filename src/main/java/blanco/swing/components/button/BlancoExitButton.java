package blanco.swing.components.button;

import java.awt.Component;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.SwingUtilities;

public class BlancoExitButton extends JButton {
	private static final long serialVersionUID = 1L;

	public BlancoExitButton() {
		init();
	}

	public void init() {
		setText("Exit");
		addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				final Component cmpnt = (Component) event.getSource();
				final Window wndw = SwingUtilities.getWindowAncestor(cmpnt);
				wndw.dispose();
			}
		});
	}
}
