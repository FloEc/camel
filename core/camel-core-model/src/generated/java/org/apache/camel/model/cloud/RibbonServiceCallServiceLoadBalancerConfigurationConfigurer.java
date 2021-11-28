/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.model.cloud;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.model.cloud.RibbonServiceCallServiceLoadBalancerConfiguration;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class RibbonServiceCallServiceLoadBalancerConfigurationConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, ExtendedPropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("ClientName", java.lang.String.class);
        map.put("Id", java.lang.String.class);
        map.put("Namespace", java.lang.String.class);
        map.put("Password", java.lang.String.class);
        map.put("Properties", java.util.List.class);
        map.put("Username", java.lang.String.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.model.cloud.RibbonServiceCallServiceLoadBalancerConfiguration target = (org.apache.camel.model.cloud.RibbonServiceCallServiceLoadBalancerConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "clientname":
        case "ClientName": target.setClientName(property(camelContext, java.lang.String.class, value)); return true;
        case "id":
        case "Id": target.setId(property(camelContext, java.lang.String.class, value)); return true;
        case "namespace":
        case "Namespace": target.setNamespace(property(camelContext, java.lang.String.class, value)); return true;
        case "password":
        case "Password": target.setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "properties":
        case "Properties": target.setProperties(property(camelContext, java.util.List.class, value)); return true;
        case "username":
        case "Username": target.setUsername(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "clientname":
        case "ClientName": return java.lang.String.class;
        case "id":
        case "Id": return java.lang.String.class;
        case "namespace":
        case "Namespace": return java.lang.String.class;
        case "password":
        case "Password": return java.lang.String.class;
        case "properties":
        case "Properties": return java.util.List.class;
        case "username":
        case "Username": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.model.cloud.RibbonServiceCallServiceLoadBalancerConfiguration target = (org.apache.camel.model.cloud.RibbonServiceCallServiceLoadBalancerConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "clientname":
        case "ClientName": return target.getClientName();
        case "id":
        case "Id": return target.getId();
        case "namespace":
        case "Namespace": return target.getNamespace();
        case "password":
        case "Password": return target.getPassword();
        case "properties":
        case "Properties": return target.getProperties();
        case "username":
        case "Username": return target.getUsername();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "properties":
        case "Properties": return org.apache.camel.model.PropertyDefinition.class;
        default: return null;
        }
    }
}

