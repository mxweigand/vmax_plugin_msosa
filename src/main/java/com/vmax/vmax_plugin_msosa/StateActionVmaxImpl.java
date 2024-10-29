package com.vmax.vmax_plugin_msosa;

import com.nomagic.magicdraw.actions.MDStateAction;
import com.nomagic.magicdraw.ui.dialogs.MDDialogParentProvider;
import com.vmax.vmax_core.server.VmaxServer;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

public class StateActionVmaxImpl extends MDStateAction {
	
    private boolean activated;
	// change this to TriplePatternServerForMsosa if you want to use the TriplePatternServer
	private VmaxServer vmax = new SparqlServerForMsosa(new MsosaApiHelper());

	public StateActionVmaxImpl() {
		super("start-vmax", "Start vmax", null, null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// change state
		activated = !activated;
		// show changes
		if (activated) {
			JOptionPane.showMessageDialog(
				MDDialogParentProvider.getProvider().getDialogOwner(), 
				"vmax activated");
			try {
				vmax.activate();
			} catch (Exception e1) {
				vmax.deactivate();
				activated = !activated;
				e1.printStackTrace();
		}} else {
			JOptionPane.showMessageDialog(
				MDDialogParentProvider.getProvider().getDialogOwner(), 
				"vmax deactivated");
			vmax.deactivate();
	}}

	@Override
	public void updateState() {
		setState(activated);
	}

}