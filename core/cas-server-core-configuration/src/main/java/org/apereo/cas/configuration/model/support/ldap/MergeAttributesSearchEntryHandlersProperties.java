package org.apereo.cas.configuration.model.support.ldap;

import java.io.Serializable;

/**
 * This is {@link MergeAttributesSearchEntryHandlersProperties}.
 *
 * @author Misagh Moayyed
 * @since 5.2.0
 */
public class MergeAttributesSearchEntryHandlersProperties implements Serializable {
    private static final long serialVersionUID = -3988972992084584349L;
    private String mergeAttributeName;
    private String[] attributeNames;

    public String getMergeAttributeName() {
        return mergeAttributeName;
    }

    public void setMergeAttributeName(final String mergeAttributeName) {
        this.mergeAttributeName = mergeAttributeName;
    }

    public String[] getAttributeNames() {
        return attributeNames;
    }

    public void setAttributeNames(final String[] attributeNames) {
        this.attributeNames = attributeNames;
    }
}
