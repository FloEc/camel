/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.kubernetes.persistent_volumes;

import java.net.URISyntaxException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class KubernetesPersistentVolumesEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":masterUrl";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    private static final Set<String> MULTI_VALUE_PREFIXES;
    static {
        Set<String> props = new HashSet<>(21);
        props.add("apiVersion");
        props.add("caCertData");
        props.add("caCertFile");
        props.add("clientCertData");
        props.add("clientCertFile");
        props.add("clientKeyAlgo");
        props.add("clientKeyData");
        props.add("clientKeyFile");
        props.add("clientKeyPassphrase");
        props.add("connectionTimeout");
        props.add("dnsDomain");
        props.add("kubernetesClient");
        props.add("lazyStartProducer");
        props.add("masterUrl");
        props.add("oauthToken");
        props.add("operation");
        props.add("password");
        props.add("portName");
        props.add("portProtocol");
        props.add("trustCerts");
        props.add("username");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        Set<String> secretProps = new HashSet<>(12);
        secretProps.add("caCertData");
        secretProps.add("caCertFile");
        secretProps.add("clientCertData");
        secretProps.add("clientCertFile");
        secretProps.add("clientKeyAlgo");
        secretProps.add("clientKeyData");
        secretProps.add("clientKeyFile");
        secretProps.add("clientKeyPassphrase");
        secretProps.add("oauthToken");
        secretProps.add("password");
        secretProps.add("trustCerts");
        secretProps.add("username");
        SECRET_PROPERTY_NAMES = Collections.unmodifiableSet(secretProps);
        MULTI_VALUE_PREFIXES = Collections.emptySet();
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "kubernetes-persistent-volumes".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "masterUrl", null, true, copy);
        uri = buildQueryParameters(uri, copy, encode);
        return uri;
    }

    @Override
    public Set<String> propertyNames() {
        return PROPERTY_NAMES;
    }

    @Override
    public Set<String> secretPropertyNames() {
        return SECRET_PROPERTY_NAMES;
    }

    @Override
    public Set<String> multiValuePrefixes() {
        return MULTI_VALUE_PREFIXES;
    }

    @Override
    public boolean isLenientProperties() {
        return false;
    }
}

