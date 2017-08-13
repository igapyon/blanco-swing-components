/*
 *  blanco-swing-components.
 *  Copyright (C) 2017  Toshiki Iga
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Lesser General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
/*
 *  Copyright 2017 Toshiki Iga
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

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

	public void setTitle(final String title) {
		this.title = title;
	}

	public Dimension getMinimumSize() {
		return minimumSize;
	}

	public void setMinimumSize(final Dimension minimumSize) {
		this.minimumSize = minimumSize;
	}

	public void init() {
		getFrame().setMinimumSize(minimumSize);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// GlassPane
		getFrame().setGlassPane(new BlancoGlassPane());
		getFrame().getGlassPane().setVisible(false);

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
