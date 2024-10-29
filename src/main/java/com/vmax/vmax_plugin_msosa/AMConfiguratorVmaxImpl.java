package com.vmax.vmax_plugin_msosa;

import com.nomagic.actions.AMConfigurator;
import com.nomagic.actions.ActionsManager;
import com.nomagic.actions.NMAction;
import com.nomagic.magicdraw.actions.MDActionsCategory;

public class AMConfiguratorVmaxImpl implements AMConfigurator {
  
    private NMAction action;

	public AMConfiguratorVmaxImpl(NMAction action) {
		this.action = action;
	}

	@Override
	public void configure(ActionsManager manager) {
		// search for tools action category
		MDActionsCategory category = (MDActionsCategory) manager.getActionFor("TOOLS");
		// add plugin to the found category
		category.addAction(action);
	}

	@Override
	public int getPriority() { 
		return AMConfigurator.MEDIUM_PRIORITY;
	}

}
