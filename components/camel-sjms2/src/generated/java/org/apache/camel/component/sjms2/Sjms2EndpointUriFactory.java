/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.sjms2;

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
public class Sjms2EndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":destinationType:destinationName";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    private static final Set<String> MULTI_VALUE_PREFIXES;
    static {
        Set<String> props = new HashSet<>(49);
        props.add("acknowledgementMode");
        props.add("allowNullBody");
        props.add("asyncConsumer");
        props.add("asyncStartListener");
        props.add("asyncStopListener");
        props.add("autoStartup");
        props.add("bridgeErrorHandler");
        props.add("clientId");
        props.add("concurrentConsumers");
        props.add("connectionFactory");
        props.add("deliveryMode");
        props.add("deliveryPersistent");
        props.add("destinationCreationStrategy");
        props.add("destinationName");
        props.add("destinationType");
        props.add("disableReplyTo");
        props.add("disableTimeToLive");
        props.add("durable");
        props.add("durableSubscriptionName");
        props.add("eagerLoadingOfProperties");
        props.add("eagerPoisonBody");
        props.add("exceptionHandler");
        props.add("exceptionListener");
        props.add("exchangePattern");
        props.add("explicitQosEnabled");
        props.add("headerFilterStrategy");
        props.add("includeAllJMSXProperties");
        props.add("jmsKeyFormatStrategy");
        props.add("lazyStartProducer");
        props.add("mapJmsMessage");
        props.add("messageCreatedStrategy");
        props.add("messageSelector");
        props.add("preserveMessageQos");
        props.add("priority");
        props.add("recoveryInterval");
        props.add("replyTo");
        props.add("replyToConcurrentConsumers");
        props.add("replyToDeliveryPersistent");
        props.add("replyToOverride");
        props.add("replyToSameDestinationAllowed");
        props.add("replyToType");
        props.add("requestTimeout");
        props.add("shared");
        props.add("subscriptionId");
        props.add("synchronous");
        props.add("testConnectionOnStartup");
        props.add("timeToLive");
        props.add("transacted");
        props.add("transferException");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        SECRET_PROPERTY_NAMES = Collections.emptySet();
        MULTI_VALUE_PREFIXES = Collections.emptySet();
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "sjms2".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "destinationType", "queue", false, copy);
        uri = buildPathParameter(syntax, uri, "destinationName", null, true, copy);
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

