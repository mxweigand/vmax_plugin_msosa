package com.vmax.vmax_plugin_msosa;

import com.nomagic.magicdraw.actions.MDStateAction;
import com.nomagic.magicdraw.ui.dialogs.MDDialogParentProvider;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

public class StateActionVmaxTriplePatternImpl extends MDStateAction {
	
    private boolean activated;
	private TriplePatternServerForMsosa triplePatternServer;

	public StateActionVmaxTriplePatternImpl(MsosaApiHelper apiHelper,  boolean autoRun) {
		super("start-vmax", "Start vmax Triple Pattern Server", null, null);
		this.triplePatternServer = new TriplePatternServerForMsosa(apiHelper);
		if (autoRun) {
			activated = true;
			setState(activated);
			try {
				triplePatternServer.activate();
			} catch (Exception e) {
				triplePatternServer.deactivate();
				activated = !activated;
				e.printStackTrace();
			}
		} else {
			activated = false;
			setState(activated);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// change state
		activated = !activated;
		// show changes
		if (activated) {
			JOptionPane.showMessageDialog(
				MDDialogParentProvider.getProvider().getDialogOwner(), 
				"vmax Triple Pattern Server activated");
			try {
				triplePatternServer.activate();
			} catch (Exception e1) {
				triplePatternServer.deactivate();
				activated = !activated;
				e1.printStackTrace();
		}} else {
			JOptionPane.showMessageDialog(
				MDDialogParentProvider.getProvider().getDialogOwner(), 
				"vmax Triple Pattern Server deactivated");
			triplePatternServer.deactivate();
	}}

	@Override
	public void updateState() {
		setState(activated);
	}

}