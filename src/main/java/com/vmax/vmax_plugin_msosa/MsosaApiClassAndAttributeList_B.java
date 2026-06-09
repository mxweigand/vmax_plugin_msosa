package com.vmax.vmax_plugin_msosa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.vmax.vmax_core.api_elements.ApiAttribute;
import com.vmax.vmax_core.api_elements.ApiClass;
import com.vmax.vmax_core.api_helper.ApiClassAndAttributeList;
import com.vmax.vmax_core.api_helper.ApiDataTypeList;

/**
 * version with ports, parts, classes, connectors, and stereotypes
 * this is used for the industrial use case
*/
public class MsosaApiClassAndAttributeList_B extends ApiClassAndAttributeList {

    public MsosaApiClassAndAttributeList_B(String classUriPrefix, String attributeUriPrefix, String instanceUriPrefix) {
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
        
        // class com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element
        ApiClass classElement = new MsosaApiClass(
            com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element.class, 
            new ArrayList<ApiClass>(), 
            this.classUriPrefix + "Element",
            this.instanceUriPrefix);
        this.classList.add(classElement);
    
        // class com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement
        ApiClass classNamedElement = new MsosaApiClass(
            com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement.class, 
            Arrays.asList(classElement), 
            this.classUriPrefix + "NamedElement",
            this.instanceUriPrefix);
        this.classList.add(classNamedElement);
    
        // class com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type
        ApiClass classType = new MsosaApiClass(
            com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type.class, 
            Arrays.asList(classNamedElement), 
            this.classUriPrefix + "Type",
            this.instanceUriPrefix);
        this.classList.add(classType);
    
        // class com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class
        ApiClass classClass = new MsosaApiClass(
            com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class.class, 
            Arrays.asList(classType), 
            this.classUriPrefix + "Class",
            this.instanceUriPrefix);
        this.classList.add(classClass);
    
        // class com.nomagic.uml2.ext.magicdraw.classes.mdkernel.TypedElement
        ApiClass classTypedElement = new MsosaApiClass(
            com.nomagic.uml2.ext.magicdraw.classes.mdkernel.TypedElement.class, 
            Arrays.asList(classNamedElement), 
            this.classUriPrefix + "TypedElement",
            this.instanceUriPrefix);
        this.classList.add(classTypedElement);
    
        // class com.nomagic.uml2.ext.magicdraw.compositestructures.mdinternalstructures.ConnectableElement
        ApiClass classConnectableElement = new MsosaApiClass(
            com.nomagic.uml2.ext.magicdraw.compositestructures.mdinternalstructures.ConnectableElement.class, 
            Arrays.asList(classTypedElement), 
            this.classUriPrefix + "ConnectableElement",
            this.instanceUriPrefix);
        this.classList.add(classConnectableElement);
    
        // class com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property
        ApiClass classProperty = new MsosaApiClass(
            com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property.class, 
            Arrays.asList(classConnectableElement), 
            this.classUriPrefix + "Property",
            this.instanceUriPrefix);
        this.classList.add(classProperty);
    
        // class com.nomagic.uml2.ext.magicdraw.compositestructures.mdinternalstructures.Connector
        ApiClass classConnector = new MsosaApiClass(
            com.nomagic.uml2.ext.magicdraw.compositestructures.mdinternalstructures.Connector.class, 
            Arrays.asList(classNamedElement), 
            this.classUriPrefix + "Connector",
            this.instanceUriPrefix);
        this.classList.add(classConnector);
    
        // class com.nomagic.uml2.ext.magicdraw.compositestructures.mdinternalstructures.ConnectorEnd
        ApiClass classConnectorEnd = new MsosaApiClass(
            com.nomagic.uml2.ext.magicdraw.compositestructures.mdinternalstructures.ConnectorEnd.class, 
            Arrays.asList(classElement), 
            this.classUriPrefix + "ConnectorEnd",
            this.instanceUriPrefix);
        this.classList.add(classConnectorEnd);
    
        // class com.nomagic.uml2.ext.magicdraw.compositestructures.mdports.Port
        ApiClass classPort = new MsosaApiClass(
            com.nomagic.uml2.ext.magicdraw.compositestructures.mdports.Port.class, 
            Arrays.asList(classProperty), 
            this.classUriPrefix + "Port",
            this.instanceUriPrefix);
        this.classList.add(classPort);
    
        // class com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype
        ApiClass classStereotype = new MsosaApiClass(
            com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype.class, 
            Arrays.asList(classClass), 
            this.classUriPrefix + "Stereotype",
            this.instanceUriPrefix);
        this.classList.add(classStereotype);
    
        // **********************
        // *** ATTRIBUTE LIST ***
        // **********************
        
        // method getAppliedStereotype() of class com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element
        this.attributeList.add(new MsosaApiAttribute(
            classElement, 
            classStereotype, 
            this.attributeUriPrefix + "getAppliedStereotype") {
                @Override
                public List<Object> getTargetEntitiesForSourceInstanceSpec(Object sourceInstanceObject) {
                    return new ArrayList<>(((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element) sourceInstanceObject).getAppliedStereotype());
                }       
            }
        );
    
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

        // method getQualifiedName() of class com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement
        this.attributeList.add(new MsosaApiAttribute(
            classNamedElement, 
            ApiDataTypeList.DATA_TYPE_STRING, 
            this.attributeUriPrefix + "getQualifiedName") {
                @Override
                public List<Object> getTargetEntitiesForSourceInstanceSpec(Object sourceInstanceObject) {
                    return Collections.singletonList(((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement) sourceInstanceObject).getQualifiedName());
                }       
            }
        );
    
        // method getOwnedAttribute() of class com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class
        this.attributeList.add(new MsosaApiAttribute(
            classClass, 
            classProperty, 
            this.attributeUriPrefix + "getOwnedAttribute") {
                @Override
                public List<Object> getTargetEntitiesForSourceInstanceSpec(Object sourceInstanceObject) {
                    return new ArrayList<>(((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) sourceInstanceObject).getOwnedAttribute());
                }       
            }
        );
    
        // method getType() of class com.nomagic.uml2.ext.magicdraw.classes.mdkernel.TypedElement
        this.attributeList.add(new MsosaApiAttribute(
            classTypedElement, 
            classType, 
            this.attributeUriPrefix + "getType") {
                @Override
                public List<Object> getTargetEntitiesForSourceInstanceSpec(Object sourceInstanceObject) {
                    return Collections.singletonList(((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.TypedElement) sourceInstanceObject).getType());
                }       
            }
        );
    
        // method getEnd() of class com.nomagic.uml2.ext.magicdraw.compositestructures.mdinternalstructures.Connector
        this.attributeList.add(new MsosaApiAttribute(
            classConnector, 
            classConnectorEnd, 
            this.attributeUriPrefix + "getEnd") {
                @Override
                public List<Object> getTargetEntitiesForSourceInstanceSpec(Object sourceInstanceObject) {
                    return new ArrayList<>(((com.nomagic.uml2.ext.magicdraw.compositestructures.mdinternalstructures.Connector) sourceInstanceObject).getEnd());
                }       
            }
        );
    
        // method getPartWithPort() of class com.nomagic.uml2.ext.magicdraw.compositestructures.mdinternalstructures.ConnectorEnd
        this.attributeList.add(new MsosaApiAttribute(
            classConnectorEnd, 
            classProperty, 
            this.attributeUriPrefix + "getPartWithPort") {
                @Override
                public List<Object> getTargetEntitiesForSourceInstanceSpec(Object sourceInstanceObject) {
                    return Collections.singletonList(((com.nomagic.uml2.ext.magicdraw.compositestructures.mdinternalstructures.ConnectorEnd) sourceInstanceObject).getPartWithPort());
                }       
            }
        );
    
        // method getRole() of class com.nomagic.uml2.ext.magicdraw.compositestructures.mdinternalstructures.ConnectorEnd
        this.attributeList.add(new MsosaApiAttribute(
            classConnectorEnd, 
            classConnectableElement, 
            this.attributeUriPrefix + "getRole") {
                @Override
                public List<Object> getTargetEntitiesForSourceInstanceSpec(Object sourceInstanceObject) {
                    return Collections.singletonList(((com.nomagic.uml2.ext.magicdraw.compositestructures.mdinternalstructures.ConnectorEnd) sourceInstanceObject).getRole());
                }       
            }
        );
    
        // **********************************************
        // *** END OF ATOMATICALLY GENERATETD CONTENT ***
        // **********************************************

    }

}