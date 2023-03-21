/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.hashicorp.vault;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class HashicorpVaultEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        HashicorpVaultEndpoint target = (HashicorpVaultEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "host": target.getConfiguration().setHost(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "operation": target.getConfiguration().setOperation(property(camelContext, org.apache.camel.component.hashicorp.vault.HashicorpVaultOperation.class, value)); return true;
        case "port": target.getConfiguration().setPort(property(camelContext, java.lang.String.class, value)); return true;
        case "scheme": target.getConfiguration().setScheme(property(camelContext, java.lang.String.class, value)); return true;
        case "secretpath":
        case "secretPath": target.getConfiguration().setSecretPath(property(camelContext, java.lang.String.class, value)); return true;
        case "token": target.getConfiguration().setToken(property(camelContext, java.lang.String.class, value)); return true;
        case "vaulttemplate":
        case "vaultTemplate": target.getConfiguration().setVaultTemplate(property(camelContext, org.springframework.vault.core.VaultTemplate.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public String[] getAutowiredNames() {
        return new String[]{"vaultTemplate"};
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "host": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "operation": return org.apache.camel.component.hashicorp.vault.HashicorpVaultOperation.class;
        case "port": return java.lang.String.class;
        case "scheme": return java.lang.String.class;
        case "secretpath":
        case "secretPath": return java.lang.String.class;
        case "token": return java.lang.String.class;
        case "vaulttemplate":
        case "vaultTemplate": return org.springframework.vault.core.VaultTemplate.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        HashicorpVaultEndpoint target = (HashicorpVaultEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "host": return target.getConfiguration().getHost();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "operation": return target.getConfiguration().getOperation();
        case "port": return target.getConfiguration().getPort();
        case "scheme": return target.getConfiguration().getScheme();
        case "secretpath":
        case "secretPath": return target.getConfiguration().getSecretPath();
        case "token": return target.getConfiguration().getToken();
        case "vaulttemplate":
        case "vaultTemplate": return target.getConfiguration().getVaultTemplate();
        default: return null;
        }
    }
}

