package blanco.swing.components;

import javax.swing.SwingUtilities;

public class BlancoSwingLauncher {
	private static void createAndShowGUI() {
		new BlancoSwingApp().init();
	}

	public void launchSwingApp() {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
}
