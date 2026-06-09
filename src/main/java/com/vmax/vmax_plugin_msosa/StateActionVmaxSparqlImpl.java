package com.vmax.vmax_plugin_msosa;

import com.nomagic.magicdraw.actions.MDStateAction;
import com.nomagic.magicdraw.ui.dialogs.MDDialogParentProvider;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

public class StateActionVmaxSparqlImpl extends MDStateAction {
	
    private boolean activated;
	private SparqlServerForMsosa sparqlServer;

	public StateActionVmaxSparqlImpl(MsosaApiHelper apiHelper, boolean autoRun) {
		super("start-vmax-sparql", "Start vmax SPARQL Server", null, null);
		this.sparqlServer = new SparqlServerForMsosa(apiHelper);
		if (autoRun) {
			activated = true;
			setState(activated);
			try {
				sparqlServer.activate();
			} catch (Exception e) {
				sparqlServer.deactivate();
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
				"vmax SPARQL Server activated");
			try {
				sparqlServer.activate();
			} catch (Exception e1) {
				sparqlServer.deactivate();
				activated = !activated;
				e1.printStackTrace();
		}} else {
			JOptionPane.showMessageDialog(
				MDDialogParentProvider.getProvider().getDialogOwner(), 
				"vmax SPARQL Server deactivated");
			sparqlServer.deactivate();
	}}

	@Override
	public void updateState() {
		setState(activated);
	}

}