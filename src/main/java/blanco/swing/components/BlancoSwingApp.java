package blanco.swing.components;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import blanco.swing.components.button.BlancoExitButton;
import blanco.swing.components.button.BlancoPerformButton;

public class BlancoSwingApp {
	protected JFrame frame = null;

	protected String title = "Swing Simple Sample";

	protected Dimension minimumSize = new Dimension(400, 200);

	public JFrame getFrame() {
		if (frame == null) {
			frame = new JFrame(getTitle());
		}

		return frame;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Dimension getMinimumSize() {
		return minimumSize;
	}

	public void setMinimumSize(Dimension minimumSize) {
		this.minimumSize = minimumSize;
	}

	public void init() {
		getFrame().setMinimumSize(minimumSize);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		internalInit();

		getFrame().pack();
		getFrame().setVisible(true);
	}

	protected void internalInit() {
		final JPanel southPanel = new JPanel();

		{
			final JButton performButton = new BlancoPerformButton();
			final JButton exitButton = new BlancoExitButton();

			southPanel.add(performButton);
			southPanel.add(exitButton);
		}

		getFrame().getContentPane().add(southPanel, BorderLayout.SOUTH);
	}
}
