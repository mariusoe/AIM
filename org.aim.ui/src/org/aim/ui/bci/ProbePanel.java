package org.aim.ui.bci;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import org.aim.ui.components.TextBoxListPanel;
import org.aim.ui.manager.ClientManager;

public class ProbePanel extends JPanel {
	public ProbePanel() {
		setBorder(new TitledBorder(null, "Probes", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		panel = new TextBoxListPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		add(panel, gbc_panel);

		if (ClientManager.SINGLETON().isConnected()) {
			panel.setPredefinedValues(ClientManager.SINGLETON().getProbes());
		}
	}

	/**  */
	private static final long serialVersionUID = 1L;
	private TextBoxListPanel panel;

}
