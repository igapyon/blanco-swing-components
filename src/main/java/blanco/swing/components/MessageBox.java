package blanco.swing.components;

import java.awt.Component;

import javax.swing.JOptionPane;

public class MessageBox {
	public static void show(final Component parentComponent, final String text) {
		JOptionPane.showMessageDialog(parentComponent, text, "Message",
				JOptionPane.OK_OPTION | JOptionPane.INFORMATION_MESSAGE);
	}

	public static void show(final Component parentComponent, final String text, final String title) {
		JOptionPane.showMessageDialog(null, text, title, JOptionPane.OK_OPTION | JOptionPane.INFORMATION_MESSAGE);
	}
}
