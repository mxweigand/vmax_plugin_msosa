package com.vmax.vmax_plugin_msosa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.vmax.vmax_core.api_elements.ApiAttribute;
import com.vmax.vmax_core.api_elements.ApiClass;
import com.vmax.vmax_core.api_helper.ApiClassAndAttributeList;
import com.vmax.vmax_core.api_helper.ApiDataTypeList;

public class MsosaApiClassAndAttributeList extends ApiClassAndAttributeList {

    public MsosaApiClassAndAttributeList(String classUriPrefix, String attributeUriPrefix, String instanceUriPrefix) {
        // call super constructor
        super(classUriPrefix, attributeUriPrefix, instanceUriPrefix);
        // prepare lists
        this.classList = new ArrayList<ApiClass>();
        this.attributeList = new ArrayList<ApiAttribute>();

        // ************************************************
        // *** START OF ATOMATICALLY GENERATETD CONTENT ***
        // ************************************************

        // ******************
        // *** CLASS LIST ***
        // ******************
        
        // class com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement
        ApiClass classNamedElement = new MsosaApiClass(
            com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement.class, 
            new ArrayList<ApiClass>(), 
            this.classUriPrefix + "NamedElement",
            this.instanceUriPrefix);
        this.classList.add(classNamedElement);
    
        // class com.nomagic.uml2.ext.magicdraw.activities.mdbasicactivities.ActivityEdge
        ApiClass classActivityEdge = new MsosaApiClass(
            com.nomagic.uml2.ext.magicdraw.activities.mdbasicactivities.ActivityEdge.class, 
            Arrays.asList(classNamedElement), 
            this.classUriPrefix + "ActivityEdge",
            this.instanceUriPrefix);
        this.classList.add(classActivityEdge);
    
        // class com.nomagic.uml2.ext.magicdraw.activities.mdbasicactivities.ControlFlow
        ApiClass classControlFlow = new MsosaApiClass(
            com.nomagic.uml2.ext.magicdraw.activities.mdbasicactivities.ControlFlow.class, 
            Arrays.asList(classActivityEdge), 
            this.classUriPrefix + "ControlFlow",
            this.instanceUriPrefix);
        this.classList.add(classControlFlow);
    
        // class com.nomagic.uml2.ext.magicdraw.activities.mdbasicactivities.ObjectFlow
        ApiClass classObjectFlow = new MsosaApiClass(
            com.nomagic.uml2.ext.magicdraw.activities.mdbasicactivities.ObjectFlow.class, 
            Arrays.asList(classActivityEdge), 
            this.classUriPrefix + "ObjectFlow",
            this.instanceUriPrefix);
        this.classList.add(classObjectFlow);
    
        // class com.nomagic.uml2.ext.magicdraw.activities.mdfundamentalactivities.ActivityNode
        ApiClass classActivityNode = new MsosaApiClass(
            com.nomagic.uml2.ext.magicdraw.activities.mdfundamentalactivities.ActivityNode.class, 
            Arrays.asList(classNamedElement), 
            this.classUriPrefix + "ActivityNode",
            this.instanceUriPrefix);
        this.classList.add(classActivityNode);
    
        // class com.nomagic.uml2.ext.magicdraw.actions.mdbasicactions.CallBehaviorAction
        ApiClass classCallBehaviorAction = new MsosaApiClass(
            com.nomagic.uml2.ext.magicdraw.actions.mdbasicactions.CallBehaviorAction.class, 
            Arrays.asList(classActivityNode), 
            this.classUriPrefix + "CallBehaviorAction",
            this.instanceUriPrefix);
        this.classList.add(classCallBehaviorAction);
    
        // class com.nomagic.uml2.ext.magicdraw.activities.mdbasicactivities.ActivityFinalNode
        ApiClass classActivityFinalNode = new MsosaApiClass(
            com.nomagic.uml2.ext.magicdraw.activities.mdbasicactivities.ActivityFinalNode.class, 
            Arrays.asList(classActivityNode), 
            this.classUriPrefix + "ActivityFinalNode",
            this.instanceUriPrefix);
        this.classList.add(classActivityFinalNode);
    
        // class com.nomagic.uml2.ext.magicdraw.activities.mdbasicactivities.InitialNode
        ApiClass classInitialNode = new MsosaApiClass(
            com.nomagic.uml2.ext.magicdraw.activities.mdbasicactivities.InitialNode.class, 
            Arrays.asList(classActivityNode), 
            this.classUriPrefix + "InitialNode",
            this.instanceUriPrefix);
        this.classList.add(classInitialNode);
    
        // class com.nomagic.uml2.ext.magicdraw.activities.mdintermediateactivities.DecisionNode
        ApiClass classDecisionNode = new MsosaApiClass(
            com.nomagic.uml2.ext.magicdraw.activities.mdintermediateactivities.DecisionNode.class, 
            Arrays.asList(classActivityNode), 
            this.classUriPrefix + "DecisionNode",
            this.instanceUriPrefix);
        this.classList.add(classDecisionNode);
    
        // class com.nomagic.uml2.ext.magicdraw.activities.mdintermediateactivities.MergeNode
        ApiClass classMergeNode = new MsosaApiClass(
            com.nomagic.uml2.ext.magicdraw.activities.mdintermediateactivities.MergeNode.class, 
            Arrays.asList(classActivityNode), 
            this.classUriPrefix + "MergeNode",
            this.instanceUriPrefix);
        this.classList.add(classMergeNode);
    
        // **********************
        // *** ATTRIBUTE LIST ***
        // **********************
        
        // method getName() of class com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement
        this.attributeList.add(new MsosaApiAttribute(
            classNamedElement, 
            ApiDataTypeList.DATA_TYPE_STRING, 
            this.attributeUriPrefix + "getName") {
                @Override
                public List<Object> getTargetEntitiesForSourceInstanceSpec(Object sourceInstanceObject) {
                    return Collections.singletonList(((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement) sourceInstanceObject).getName());
                }       
            }
        );
    
        // method getTarget() of class com.nomagic.uml2.ext.magicdraw.activities.mdbasicactivities.ActivityEdge
        this.attributeList.add(new MsosaApiAttribute(
            classActivityEdge, 
            classActivityNode, 
            this.attributeUriPrefix + "getTarget") {
                @Override
                public List<Object> getTargetEntitiesForSourceInstanceSpec(Object sourceInstanceObject) {
                    return Collections.singletonList(((com.nomagic.uml2.ext.magicdraw.activities.mdbasicactivities.ActivityEdge) sourceInstanceObject).getTarget());
                }       
            }
        );
    
        // method getSource() of class com.nomagic.uml2.ext.magicdraw.activities.mdbasicactivities.ActivityEdge
        this.attributeList.add(new MsosaApiAttribute(
            classActivityEdge, 
            classActivityNode, 
            this.attributeUriPrefix + "getSource") {
                @Override
                public List<Object> getTargetEntitiesForSourceInstanceSpec(Object sourceInstanceObject) {
                    return Collections.singletonList(((com.nomagic.uml2.ext.magicdraw.activities.mdbasicactivities.ActivityEdge) sourceInstanceObject).getSource());
                }       
            }
        );
    
        // **********************************************
        // *** END OF ATOMATICALLY GENERATETD CONTENT ***
        // **********************************************

    }

}