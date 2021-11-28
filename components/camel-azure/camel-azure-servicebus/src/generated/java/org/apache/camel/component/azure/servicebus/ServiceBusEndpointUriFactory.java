/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.azure.servicebus;

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
public class ServiceBusEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":queueNameOrTopicName";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    static {
        Set<String> props = new HashSet<>(24);
        props.add("clientOptions");
        props.add("serviceBusType");
        props.add("connectionString");
        props.add("prefetchCount");
        props.add("receiverAsyncClient");
        props.add("serviceBusTransactionContext");
        props.add("scheduledEnqueueTime");
        props.add("exchangePattern");
        props.add("producerOperation");
        props.add("amqpTransportType");
        props.add("consumerOperation");
        props.add("serviceBusReceiveMode");
        props.add("senderAsyncClient");
        props.add("lazyStartProducer");
        props.add("bridgeErrorHandler");
        props.add("peekNumMaxMessages");
        props.add("subQueue");
        props.add("topicOrQueueName");
        props.add("subscriptionName");
        props.add("amqpRetryOptions");
        props.add("proxyOptions");
        props.add("disableAutoComplete");
        props.add("exceptionHandler");
        props.add("maxAutoLockRenewDuration");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        Set<String> secretProps = new HashSet<>(1);
        secretProps.add("connectionString");
        SECRET_PROPERTY_NAMES = Collections.unmodifiableSet(secretProps);
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "azure-servicebus".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "topicOrQueueName", null, false, copy);
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
    public boolean isLenientProperties() {
        return false;
    }
}

