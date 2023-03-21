/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.impl;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.spi.RestConfiguration;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class RestConfigurationConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.spi.RestConfiguration target = (org.apache.camel.spi.RestConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apicomponent":
        case "ApiComponent": target.setApiComponent(property(camelContext, java.lang.String.class, value)); return true;
        case "apicontextpath":
        case "ApiContextPath": target.setApiContextPath(property(camelContext, java.lang.String.class, value)); return true;
        case "apicontextrouteid":
        case "ApiContextRouteId": target.setApiContextRouteId(property(camelContext, java.lang.String.class, value)); return true;
        case "apihost":
        case "ApiHost": target.setApiHost(property(camelContext, java.lang.String.class, value)); return true;
        case "apiproperties":
        case "ApiProperties": target.setApiProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "apivendorextension":
        case "ApiVendorExtension": target.setApiVendorExtension(property(camelContext, boolean.class, value)); return true;
        case "bindingmode":
        case "BindingMode": target.setBindingMode(property(camelContext, java.lang.String.class, value)); return true;
        case "clientrequestvalidation":
        case "ClientRequestValidation": target.setClientRequestValidation(property(camelContext, boolean.class, value)); return true;
        case "component":
        case "Component": target.setComponent(property(camelContext, java.lang.String.class, value)); return true;
        case "componentproperties":
        case "ComponentProperties": target.setComponentProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "consumerproperties":
        case "ConsumerProperties": target.setConsumerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "contextpath":
        case "ContextPath": target.setContextPath(property(camelContext, java.lang.String.class, value)); return true;
        case "corsheaders":
        case "CorsHeaders": target.setCorsHeaders(property(camelContext, java.util.Map.class, value)); return true;
        case "dataformatproperties":
        case "DataFormatProperties": target.setDataFormatProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "enablecors":
        case "EnableCORS": target.setEnableCORS(property(camelContext, boolean.class, value)); return true;
        case "endpointproperties":
        case "EndpointProperties": target.setEndpointProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "host":
        case "Host": target.setHost(property(camelContext, java.lang.String.class, value)); return true;
        case "hostnameresolver":
        case "HostNameResolver": target.setHostNameResolver(property(camelContext, java.lang.String.class, value)); return true;
        case "inlineroutes":
        case "InlineRoutes": target.setInlineRoutes(property(camelContext, boolean.class, value)); return true;
        case "jsondataformat":
        case "JsonDataFormat": target.setJsonDataFormat(property(camelContext, java.lang.String.class, value)); return true;
        case "port":
        case "Port": target.setPort(property(camelContext, int.class, value)); return true;
        case "producerapidoc":
        case "ProducerApiDoc": target.setProducerApiDoc(property(camelContext, java.lang.String.class, value)); return true;
        case "producercomponent":
        case "ProducerComponent": target.setProducerComponent(property(camelContext, java.lang.String.class, value)); return true;
        case "scheme":
        case "Scheme": target.setScheme(property(camelContext, java.lang.String.class, value)); return true;
        case "skipbindingonerrorcode":
        case "SkipBindingOnErrorCode": target.setSkipBindingOnErrorCode(property(camelContext, boolean.class, value)); return true;
        case "usexforwardheaders":
        case "UseXForwardHeaders": target.setUseXForwardHeaders(property(camelContext, boolean.class, value)); return true;
        case "xmldataformat":
        case "XmlDataFormat": target.setXmlDataFormat(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apicomponent":
        case "ApiComponent": return java.lang.String.class;
        case "apicontextpath":
        case "ApiContextPath": return java.lang.String.class;
        case "apicontextrouteid":
        case "ApiContextRouteId": return java.lang.String.class;
        case "apihost":
        case "ApiHost": return java.lang.String.class;
        case "apiproperties":
        case "ApiProperties": return java.util.Map.class;
        case "apivendorextension":
        case "ApiVendorExtension": return boolean.class;
        case "bindingmode":
        case "BindingMode": return java.lang.String.class;
        case "clientrequestvalidation":
        case "ClientRequestValidation": return boolean.class;
        case "component":
        case "Component": return java.lang.String.class;
        case "componentproperties":
        case "ComponentProperties": return java.util.Map.class;
        case "consumerproperties":
        case "ConsumerProperties": return java.util.Map.class;
        case "contextpath":
        case "ContextPath": return java.lang.String.class;
        case "corsheaders":
        case "CorsHeaders": return java.util.Map.class;
        case "dataformatproperties":
        case "DataFormatProperties": return java.util.Map.class;
        case "enablecors":
        case "EnableCORS": return boolean.class;
        case "endpointproperties":
        case "EndpointProperties": return java.util.Map.class;
        case "host":
        case "Host": return java.lang.String.class;
        case "hostnameresolver":
        case "HostNameResolver": return java.lang.String.class;
        case "inlineroutes":
        case "InlineRoutes": return boolean.class;
        case "jsondataformat":
        case "JsonDataFormat": return java.lang.String.class;
        case "port":
        case "Port": return int.class;
        case "producerapidoc":
        case "ProducerApiDoc": return java.lang.String.class;
        case "producercomponent":
        case "ProducerComponent": return java.lang.String.class;
        case "scheme":
        case "Scheme": return java.lang.String.class;
        case "skipbindingonerrorcode":
        case "SkipBindingOnErrorCode": return boolean.class;
        case "usexforwardheaders":
        case "UseXForwardHeaders": return boolean.class;
        case "xmldataformat":
        case "XmlDataFormat": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.spi.RestConfiguration target = (org.apache.camel.spi.RestConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apicomponent":
        case "ApiComponent": return target.getApiComponent();
        case "apicontextpath":
        case "ApiContextPath": return target.getApiContextPath();
        case "apicontextrouteid":
        case "ApiContextRouteId": return target.getApiContextRouteId();
        case "apihost":
        case "ApiHost": return target.getApiHost();
        case "apiproperties":
        case "ApiProperties": return target.getApiProperties();
        case "apivendorextension":
        case "ApiVendorExtension": return target.isApiVendorExtension();
        case "bindingmode":
        case "BindingMode": return target.getBindingMode();
        case "clientrequestvalidation":
        case "ClientRequestValidation": return target.isClientRequestValidation();
        case "component":
        case "Component": return target.getComponent();
        case "componentproperties":
        case "ComponentProperties": return target.getComponentProperties();
        case "consumerproperties":
        case "ConsumerProperties": return target.getConsumerProperties();
        case "contextpath":
        case "ContextPath": return target.getContextPath();
        case "corsheaders":
        case "CorsHeaders": return target.getCorsHeaders();
        case "dataformatproperties":
        case "DataFormatProperties": return target.getDataFormatProperties();
        case "enablecors":
        case "EnableCORS": return target.isEnableCORS();
        case "endpointproperties":
        case "EndpointProperties": return target.getEndpointProperties();
        case "host":
        case "Host": return target.getHost();
        case "hostnameresolver":
        case "HostNameResolver": return target.getHostNameResolver();
        case "inlineroutes":
        case "InlineRoutes": return target.isInlineRoutes();
        case "jsondataformat":
        case "JsonDataFormat": return target.getJsonDataFormat();
        case "port":
        case "Port": return target.getPort();
        case "producerapidoc":
        case "ProducerApiDoc": return target.getProducerApiDoc();
        case "producercomponent":
        case "ProducerComponent": return target.getProducerComponent();
        case "scheme":
        case "Scheme": return target.getScheme();
        case "skipbindingonerrorcode":
        case "SkipBindingOnErrorCode": return target.isSkipBindingOnErrorCode();
        case "usexforwardheaders":
        case "UseXForwardHeaders": return target.isUseXForwardHeaders();
        case "xmldataformat":
        case "XmlDataFormat": return target.getXmlDataFormat();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiproperties":
        case "ApiProperties": return java.lang.Object.class;
        case "componentproperties":
        case "ComponentProperties": return java.lang.Object.class;
        case "consumerproperties":
        case "ConsumerProperties": return java.lang.Object.class;
        case "corsheaders":
        case "CorsHeaders": return java.lang.String.class;
        case "dataformatproperties":
        case "DataFormatProperties": return java.lang.Object.class;
        case "endpointproperties":
        case "EndpointProperties": return java.lang.Object.class;
        default: return null;
        }
    }
}

