package com.vmax.vmax_plugin_msosa;

import com.vmax.vmax_core.api_elements.ApiAttribute;
import com.vmax.vmax_core.api_elements.ApiClass;
import com.vmax.vmax_core.api_elements.ApiType;

/**
 * for attributes, there is currnetly nothing that has to be overridden in general <p>
 * so this class is just a placeholder for possible future extensions
 */
public abstract class MsosaApiAttribute extends ApiAttribute {

    public MsosaApiAttribute(ApiClass sourceClass, ApiType targetType, String uri) {
        super(sourceClass, targetType, uri);
    }

}
