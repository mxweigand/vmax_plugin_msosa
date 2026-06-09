package com.vmax.vmax_plugin_msosa;

import com.nomagic.actions.AMConfigurator;
import com.nomagic.magicdraw.actions.ActionsConfiguratorsManager;
import com.nomagic.magicdraw.actions.MDStateAction;
import com.nomagic.magicdraw.plugins.Plugin;

public class PluginVmaxImpl extends Plugin {
	
    @Override
    public void init() {
        // add option in menu bar/tools to start plugin 
        ActionsConfiguratorsManager actionsConfiguratorsManager = ActionsConfiguratorsManager.getInstance();
        MsosaApiHelper apiHelper = new MsosaApiHelper();
        MDStateAction stateActionTriplePatternServer = new StateActionVmaxTriplePatternImpl(apiHelper, false);
        MDStateAction stateActionSparqlServer = new StateActionVmaxSparqlImpl(apiHelper, true);
        AMConfigurator amConfigurator = new AMConfiguratorVmaxImpl(stateActionTriplePatternServer, stateActionSparqlServer);
        actionsConfiguratorsManager.addMainMenuConfigurator(amConfigurator);
    }

    @Override
    public boolean close() {
        return true;   
    }
    
    @Override
    public boolean isSupported() {	
        return true; 
    }

}
