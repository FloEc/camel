
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.fhir;

import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link org.apache.camel.component.fhir.api.FhirValidate}.
 */
@ApiParams(apiName = "validate", 
           description = "API for validating resources",
           apiMethods = {@ApiMethod(methodName = "resource", description="Validates the resource", signatures={"ca.uhn.fhir.rest.api.MethodOutcome resource(org.hl7.fhir.instance.model.api.IBaseResource resource, java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters, Object> extraParameters)", "ca.uhn.fhir.rest.api.MethodOutcome resource(String resourceAsString, java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters, Object> extraParameters)"}), }, aliases = {})
@UriParams
@Configurer(extended = true)
public final class FhirValidateEndpointConfiguration extends FhirConfiguration {
    @UriParam
    @ApiParam(optional = true, apiMethods = {@ApiMethod(methodName = "resource", description="See ExtraParameters for a full list of parameters that can be passed, may be NULL"), @ApiMethod(methodName = "resource", description="See ExtraParameters for a full list of parameters that can be passed, may be NULL")})
    private java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters, Object> extraParameters;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "resource", description="The IBaseResource to validate")})
    private org.hl7.fhir.instance.model.api.IBaseResource resource;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "resource", description="Raw resource to validate")})
    private String resourceAsString;

    public java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters, Object> getExtraParameters() {
        return extraParameters;
    }

    public void setExtraParameters(java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters, Object> extraParameters) {
        this.extraParameters = extraParameters;
    }

    public org.hl7.fhir.instance.model.api.IBaseResource getResource() {
        return resource;
    }

    public void setResource(org.hl7.fhir.instance.model.api.IBaseResource resource) {
        this.resource = resource;
    }

    public String getResourceAsString() {
        return resourceAsString;
    }

    public void setResourceAsString(String resourceAsString) {
        this.resourceAsString = resourceAsString;
    }
}
