package blanco.swing.components.button;

import java.awt.Component;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.ConstructorProperties;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.SwingUtilities;

/**
 * Button of Exit
 * 
 * @author igapyon@gmail.com
 */
public class BlancoExitButton extends JButton {
	private static final long serialVersionUID = 1L;

	/**
	 * Set default text.
	 */
	protected String text = "Exit";

	///////////////////////////////
	// Constructor

	public BlancoExitButton() {
		super();
	}

	public BlancoExitButton(Icon icon) {
		super(icon);
	}

	@ConstructorProperties({ "text" })
	public BlancoExitButton(String text) {
		super(text);
		this.text = text;
	}

	public BlancoExitButton(Action a) {
		super(a);
	}

	public BlancoExitButton(String text, Icon icon) {
		super(text, icon);
		this.text = text;
	}

	// Constructor
	///////////////////////////////

	///////////////////////////////
	// Getter / Setter

	@Override
	public String getText() {
		if (super.getText() == null || super.getText().length() == 0) {
			return text;
		}
		return super.getText();
	}

	@Override
	public void setText(String val) {
		super.setText(val);
		text = val;
	}

	// Getter / Setter
	///////////////////////////////

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
				final Component cmpnt = (Component) event.getSource();
				final Window wndw = SwingUtilities.getWindowAncestor(cmpnt);
				wndw.dispose();
			}
		});
	}
}
