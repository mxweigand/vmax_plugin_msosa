package com.vmax.vmax_plugin_msosa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;

import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.core.Project;
import com.nomagic.magicdraw.uml.BaseElement;
import com.nomagic.magicdraw.uml.Finder;

import com.vmax.vmax_core.api_elements.ApiClass;

public class MsosaApiClass extends ApiClass {

    public MsosaApiClass(Class<?> associatedClass, List<ApiClass> explicitSuperclasses, String uri, String instanceUriPrefix) {
        super(associatedClass, explicitSuperclasses, uri, instanceUriPrefix);
    }

    @Override
    protected String determineInstanceUri(Object instanceAsObject) {
        if (!(instanceAsObject instanceof BaseElement)) { return null; }
        String elementID = ((BaseElement) instanceAsObject).sGetID();
        return this.instanceUriPrefix + elementID;
    }

    @Override
    protected List<Object> getImplementingInstancesAsObjects() {
        // create array of single class
		Class<?>[] classArray = { this.associatedClass };
        // get current project
		Project project = Application.getInstance().getProjectsManager().getActiveProject();
        // find elements
        Collection<? extends Element> resultElementCollection = Finder.byTypeRecursively()
            .find(project, classArray);  
		// return null if collection is empty
		if (resultElementCollection.isEmpty() || resultElementCollection == null) {         
            return null; }
		// convert element collection to object list and return
        List<Object> resultObjectList = new ArrayList<Object>(resultElementCollection);
		return resultObjectList;
    }

    @Override
    protected boolean indirectInstancesIncluded() {
        return false;
    }
    
}
