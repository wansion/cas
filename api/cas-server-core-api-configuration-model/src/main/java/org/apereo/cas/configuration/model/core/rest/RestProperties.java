package org.apereo.cas.configuration.model.core.rest;

import org.apereo.cas.configuration.support.RequiresModule;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * This is {@link RestProperties}.
 *
 * @author Misagh Moayyed
 * @since 5.0.0
 */
@RequiresModule(name = "cas-server-support-rest", automated = true)
@Getter
@Setter
@Accessors(chain = true)
public class RestProperties implements Serializable {

    private static final long serialVersionUID = -1833107478273171342L;

    /**
     * Authorization attribute name required by the REST endpoint in order to allow for the requested operation.
     * Attribute must be resolvable by the authenticated principal, or must have been already.
     */
    private String attributeName;

    /**
     * Matching authorization attribute value, pulled from the attribute
     * required by the REST endpoint in order to allow for the requested operation.
     * The attribute value may also be constructed as a regex pattern.
     */
    private String attributeValue;

    /**
     * Flag that enables {@link java.security.cert.X509Certificate} extraction from the request headers
     * for authentication.
     */
    private boolean headerAuth = true;
    
    /**
     * Flag that enables {@link java.security.cert.X509Certificate} extraction from the request body for authentication.
     */
    private boolean bodyAuth;

    /**
     * Flag that enables TLS client {@link java.security.cert.X509Certificate} extraction from the servlet container
     * for authentication.
     */
    private boolean tlsClientAuth;
}
