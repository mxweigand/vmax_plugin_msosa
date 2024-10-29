package com.vmax.vmax_plugin_msosa;

import com.vmax.vmax_core.api_helper.ApiHelper;

import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.core.Project;

public class MsosaApiHelper extends ApiHelper {

    private final static String toolUriPrefix = "http://www.example.org/msosa/" ;
    private final static String classUriPrefix = toolUriPrefix + "classes#";
    private final static String attributeUriPrefix = toolUriPrefix + "attributes#";
    private final static String instanceUriPrefix = toolUriPrefix + "instances#";

    public MsosaApiHelper() {
        super(toolUriPrefix, 
            new MsosaApiClassAndAttributeList(
                classUriPrefix, 
                attributeUriPrefix, 
                instanceUriPrefix
        ));
    }

    @Override
    protected Object findApiInstanceAsObjectByUri(String uri) {
        // get current project
		Project project = Application.getInstance().getProjectsManager().getActiveProject();
		// abort if incorrect uri was given
		if (!(instanceUriPrefix.equals(uri.substring(0, instanceUriPrefix.length())))) { return null; }
		// extract elementID, which is everything following instanceUriPrefix
		String elementID = uri.substring(instanceUriPrefix.length());
		// find element - getElementByID returns null if not found
		return project.getElementByID(elementID);
    }

}