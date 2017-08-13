package blanco.swing.components;

import java.awt.Component;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class BlancoSwingUtil {
	public static JFrame getParentFrame(final JComponent argComponent) {
		for (Component look = argComponent; look != null; look = look.getParent()) {
			if (look instanceof JFrame) {
				return (JFrame) look;
			}
		}

		// not found
		return null;
	}
}
