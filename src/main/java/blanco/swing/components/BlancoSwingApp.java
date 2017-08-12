package blanco.swing.components;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

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
			final JButton performButton = new JButton();
			final JButton exitButton = new JButton();

			{
				performButton.setText("Perform");
				southPanel.add(performButton);
				performButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						JOptionPane.showMessageDialog(null, "Do something.", "Perform",
								JOptionPane.OK_OPTION | JOptionPane.INFORMATION_MESSAGE);
					}
				});
			}

			{
				exitButton.setText("Exit");
				southPanel.add(exitButton);
				exitButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						final Component cmpnt = (Component) event.getSource();
						final Window wndw = SwingUtilities.getWindowAncestor(cmpnt);
						wndw.dispose();
					}
				});
			}
		}

		getFrame().getContentPane().add(southPanel, BorderLayout.SOUTH);
	}
}
