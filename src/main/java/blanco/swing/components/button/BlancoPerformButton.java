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

package blanco.swing.components.button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import blanco.swing.components.BlancoSwingUtil;
import blanco.swing.components.MessageBox;

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
		final JButton btn = this;
		addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent event) {

				final Thread t = new Thread(new Runnable() {
					public void run() {
						final JFrame frame = BlancoSwingUtil.getParentFrame(btn);
						if (frame == null) {
							return;
						}
						frame.getGlassPane().setVisible(true);
						try {

							Thread.sleep(5000);

							MessageBox.show(btn, "処理終了");
						} catch (InterruptedException e) {
							e.printStackTrace();
						} finally {
							frame.getGlassPane().setVisible(false);
						}
					}
				});

				t.start();

				// MessageBox.show(btn, "Do something.", "Perform");
			}
		});
	}
}
