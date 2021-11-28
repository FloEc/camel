/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;
import org.apache.camel.spi.HeaderFilterStrategy;

/**
 * Send messages to an AWS Simple Notification Topic using AWS SDK version 2.x.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface Sns2EndpointBuilderFactory {


    /**
     * Builder for endpoint for the AWS Simple Notification System (SNS)
     * component.
     */
    public interface Sns2EndpointBuilder extends EndpointProducerBuilder {
        /**
         * To use the AmazonSNS as the client.
         * 
         * The option is a:
         * &lt;code&gt;software.amazon.awssdk.services.sns.SnsClient&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param amazonSNSClient the value to set
         * @return the dsl builder
         */
        default Sns2EndpointBuilder amazonSNSClient(Object amazonSNSClient) {
            doSetProperty("amazonSNSClient", amazonSNSClient);
            return this;
        }
        /**
         * To use the AmazonSNS as the client.
         * 
         * The option will be converted to a
         * &lt;code&gt;software.amazon.awssdk.services.sns.SnsClient&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param amazonSNSClient the value to set
         * @return the dsl builder
         */
        default Sns2EndpointBuilder amazonSNSClient(String amazonSNSClient) {
            doSetProperty("amazonSNSClient", amazonSNSClient);
            return this;
        }
        /**
         * Setting the autocreation of the topic.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param autoCreateTopic the value to set
         * @return the dsl builder
         */
        default Sns2EndpointBuilder autoCreateTopic(boolean autoCreateTopic) {
            doSetProperty("autoCreateTopic", autoCreateTopic);
            return this;
        }
        /**
         * Setting the autocreation of the topic.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param autoCreateTopic the value to set
         * @return the dsl builder
         */
        default Sns2EndpointBuilder autoCreateTopic(String autoCreateTopic) {
            doSetProperty("autoCreateTopic", autoCreateTopic);
            return this;
        }
        /**
         * To use a custom HeaderFilterStrategy to map headers to/from Camel.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.spi.HeaderFilterStrategy&lt;/code&gt;
         * type.
         * 
         * Group: producer
         * 
         * @param headerFilterStrategy the value to set
         * @return the dsl builder
         */
        default Sns2EndpointBuilder headerFilterStrategy(
                HeaderFilterStrategy headerFilterStrategy) {
            doSetProperty("headerFilterStrategy", headerFilterStrategy);
            return this;
        }
        /**
         * To use a custom HeaderFilterStrategy to map headers to/from Camel.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.spi.HeaderFilterStrategy&lt;/code&gt;
         * type.
         * 
         * Group: producer
         * 
         * @param headerFilterStrategy the value to set
         * @return the dsl builder
         */
        default Sns2EndpointBuilder headerFilterStrategy(
                String headerFilterStrategy) {
            doSetProperty("headerFilterStrategy", headerFilterStrategy);
            return this;
        }
        /**
         * The ID of an AWS-managed customer master key (CMK) for Amazon SNS or
         * a custom CMK.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param kmsMasterKeyId the value to set
         * @return the dsl builder
         */
        default Sns2EndpointBuilder kmsMasterKeyId(String kmsMasterKeyId) {
            doSetProperty("kmsMasterKeyId", kmsMasterKeyId);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default Sns2EndpointBuilder lazyStartProducer(boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default Sns2EndpointBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Only for FIFO Topic. Strategy for setting the messageDeduplicationId
         * on the message. Can be one of the following options: useExchangeId,
         * useContentBasedDeduplication. For the useContentBasedDeduplication
         * option, no messageDeduplicationId will be set on the message.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.aws2.sns.MessageDeduplicationIdStrategy&lt;/code&gt; type.
         * 
         * Default: useExchangeId
         * Group: producer
         * 
         * @param messageDeduplicationIdStrategy the value to set
         * @return the dsl builder
         */
        default Sns2EndpointBuilder messageDeduplicationIdStrategy(
                Object messageDeduplicationIdStrategy) {
            doSetProperty("messageDeduplicationIdStrategy", messageDeduplicationIdStrategy);
            return this;
        }
        /**
         * Only for FIFO Topic. Strategy for setting the messageDeduplicationId
         * on the message. Can be one of the following options: useExchangeId,
         * useContentBasedDeduplication. For the useContentBasedDeduplication
         * option, no messageDeduplicationId will be set on the message.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.aws2.sns.MessageDeduplicationIdStrategy&lt;/code&gt; type.
         * 
         * Default: useExchangeId
         * Group: producer
         * 
         * @param messageDeduplicationIdStrategy the value to set
         * @return the dsl builder
         */
        default Sns2EndpointBuilder messageDeduplicationIdStrategy(
                String messageDeduplicationIdStrategy) {
            doSetProperty("messageDeduplicationIdStrategy", messageDeduplicationIdStrategy);
            return this;
        }
        /**
         * Only for FIFO Topic. Strategy for setting the messageGroupId on the
         * message. Can be one of the following options: useConstant,
         * useExchangeId, usePropertyValue. For the usePropertyValue option, the
         * value of property CamelAwsMessageGroupId will be used.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.aws2.sns.MessageGroupIdStrategy&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param messageGroupIdStrategy the value to set
         * @return the dsl builder
         */
        default Sns2EndpointBuilder messageGroupIdStrategy(
                Object messageGroupIdStrategy) {
            doSetProperty("messageGroupIdStrategy", messageGroupIdStrategy);
            return this;
        }
        /**
         * Only for FIFO Topic. Strategy for setting the messageGroupId on the
         * message. Can be one of the following options: useConstant,
         * useExchangeId, usePropertyValue. For the usePropertyValue option, the
         * value of property CamelAwsMessageGroupId will be used.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.aws2.sns.MessageGroupIdStrategy&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param messageGroupIdStrategy the value to set
         * @return the dsl builder
         */
        default Sns2EndpointBuilder messageGroupIdStrategy(
                String messageGroupIdStrategy) {
            doSetProperty("messageGroupIdStrategy", messageGroupIdStrategy);
            return this;
        }
        /**
         * The message structure to use such as json.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param messageStructure the value to set
         * @return the dsl builder
         */
        default Sns2EndpointBuilder messageStructure(String messageStructure) {
            doSetProperty("messageStructure", messageStructure);
            return this;
        }
        /**
         * Set the need for overidding the endpoint. This option needs to be
         * used in combination with uriEndpointOverride option.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param overrideEndpoint the value to set
         * @return the dsl builder
         */
        default Sns2EndpointBuilder overrideEndpoint(boolean overrideEndpoint) {
            doSetProperty("overrideEndpoint", overrideEndpoint);
            return this;
        }
        /**
         * Set the need for overidding the endpoint. This option needs to be
         * used in combination with uriEndpointOverride option.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param overrideEndpoint the value to set
         * @return the dsl builder
         */
        default Sns2EndpointBuilder overrideEndpoint(String overrideEndpoint) {
            doSetProperty("overrideEndpoint", overrideEndpoint);
            return this;
        }
        /**
         * The policy for this topic. Is loaded by default from classpath, but
         * you can prefix with classpath:, file:, or http: to load the resource
         * from different systems.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param policy the value to set
         * @return the dsl builder
         */
        default Sns2EndpointBuilder policy(String policy) {
            doSetProperty("policy", policy);
            return this;
        }
        /**
         * To define a proxy host when instantiating the SNS client.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param proxyHost the value to set
         * @return the dsl builder
         */
        default Sns2EndpointBuilder proxyHost(String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * To define a proxy port when instantiating the SNS client.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param proxyPort the value to set
         * @return the dsl builder
         */
        default Sns2EndpointBuilder proxyPort(Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy port when instantiating the SNS client.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param proxyPort the value to set
         * @return the dsl builder
         */
        default Sns2EndpointBuilder proxyPort(String proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the SNS client.
         * 
         * The option is a:
         * &lt;code&gt;software.amazon.awssdk.core.Protocol&lt;/code&gt; type.
         * 
         * Default: HTTPS
         * Group: producer
         * 
         * @param proxyProtocol the value to set
         * @return the dsl builder
         */
        default Sns2EndpointBuilder proxyProtocol(Protocol proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the SNS client.
         * 
         * The option will be converted to a
         * &lt;code&gt;software.amazon.awssdk.core.Protocol&lt;/code&gt; type.
         * 
         * Default: HTTPS
         * Group: producer
         * 
         * @param proxyProtocol the value to set
         * @return the dsl builder
         */
        default Sns2EndpointBuilder proxyProtocol(String proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * The queueUrl to subscribe to.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param queueUrl the value to set
         * @return the dsl builder
         */
        default Sns2EndpointBuilder queueUrl(String queueUrl) {
            doSetProperty("queueUrl", queueUrl);
            return this;
        }
        /**
         * The region in which SNS client needs to work. When using this
         * parameter, the configuration will expect the lowercase name of the
         * region (for example ap-east-1) You'll need to use the name
         * Region.EU_WEST_1.id().
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param region the value to set
         * @return the dsl builder
         */
        default Sns2EndpointBuilder region(String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * Define if Server Side Encryption is enabled or not on the topic.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param serverSideEncryptionEnabled the value to set
         * @return the dsl builder
         */
        default Sns2EndpointBuilder serverSideEncryptionEnabled(
                boolean serverSideEncryptionEnabled) {
            doSetProperty("serverSideEncryptionEnabled", serverSideEncryptionEnabled);
            return this;
        }
        /**
         * Define if Server Side Encryption is enabled or not on the topic.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param serverSideEncryptionEnabled the value to set
         * @return the dsl builder
         */
        default Sns2EndpointBuilder serverSideEncryptionEnabled(
                String serverSideEncryptionEnabled) {
            doSetProperty("serverSideEncryptionEnabled", serverSideEncryptionEnabled);
            return this;
        }
        /**
         * The subject which is used if the message header 'CamelAwsSnsSubject'
         * is not present.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param subject the value to set
         * @return the dsl builder
         */
        default Sns2EndpointBuilder subject(String subject) {
            doSetProperty("subject", subject);
            return this;
        }
        /**
         * Define if the subscription between SNS Topic and SQS must be done or
         * not.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param subscribeSNStoSQS the value to set
         * @return the dsl builder
         */
        default Sns2EndpointBuilder subscribeSNStoSQS(boolean subscribeSNStoSQS) {
            doSetProperty("subscribeSNStoSQS", subscribeSNStoSQS);
            return this;
        }
        /**
         * Define if the subscription between SNS Topic and SQS must be done or
         * not.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param subscribeSNStoSQS the value to set
         * @return the dsl builder
         */
        default Sns2EndpointBuilder subscribeSNStoSQS(String subscribeSNStoSQS) {
            doSetProperty("subscribeSNStoSQS", subscribeSNStoSQS);
            return this;
        }
        /**
         * If we want to trust all certificates in case of overriding the
         * endpoint.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param trustAllCertificates the value to set
         * @return the dsl builder
         */
        default Sns2EndpointBuilder trustAllCertificates(
                boolean trustAllCertificates) {
            doSetProperty("trustAllCertificates", trustAllCertificates);
            return this;
        }
        /**
         * If we want to trust all certificates in case of overriding the
         * endpoint.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param trustAllCertificates the value to set
         * @return the dsl builder
         */
        default Sns2EndpointBuilder trustAllCertificates(
                String trustAllCertificates) {
            doSetProperty("trustAllCertificates", trustAllCertificates);
            return this;
        }
        /**
         * Set the overriding uri endpoint. This option needs to be used in
         * combination with overrideEndpoint option.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param uriEndpointOverride the value to set
         * @return the dsl builder
         */
        default Sns2EndpointBuilder uriEndpointOverride(
                String uriEndpointOverride) {
            doSetProperty("uriEndpointOverride", uriEndpointOverride);
            return this;
        }
        /**
         * Set whether the SNS client should expect to load credentials on an
         * AWS infra instance or to expect static credentials to be passed in.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param useDefaultCredentialsProvider the value to set
         * @return the dsl builder
         */
        default Sns2EndpointBuilder useDefaultCredentialsProvider(
                boolean useDefaultCredentialsProvider) {
            doSetProperty("useDefaultCredentialsProvider", useDefaultCredentialsProvider);
            return this;
        }
        /**
         * Set whether the SNS client should expect to load credentials on an
         * AWS infra instance or to expect static credentials to be passed in.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param useDefaultCredentialsProvider the value to set
         * @return the dsl builder
         */
        default Sns2EndpointBuilder useDefaultCredentialsProvider(
                String useDefaultCredentialsProvider) {
            doSetProperty("useDefaultCredentialsProvider", useDefaultCredentialsProvider);
            return this;
        }
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param accessKey the value to set
         * @return the dsl builder
         */
        default Sns2EndpointBuilder accessKey(String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
        /**
         * Amazon AWS Secret Key.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param secretKey the value to set
         * @return the dsl builder
         */
        default Sns2EndpointBuilder secretKey(String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
    }

    /**
     * Proxy enum for <code>software.amazon.awssdk.core.Protocol</code> enum.
     */
    enum Protocol {
        HTTP,
        HTTPS;
    }

    public interface Sns2Builders {
        /**
         * AWS Simple Notification System (SNS) (camel-aws2-sns)
         * Send messages to an AWS Simple Notification Topic using AWS SDK
         * version 2.x.
         * 
         * Category: cloud,messaging,mobile
         * Since: 3.1
         * Maven coordinates: org.apache.camel:camel-aws2-sns
         * 
         * Syntax: <code>aws2-sns:topicNameOrArn</code>
         * 
         * Path parameter: topicNameOrArn (required)
         * Topic name or ARN
         * 
         * @param path topicNameOrArn
         * @return the dsl builder
         */
        default Sns2EndpointBuilder aws2Sns(String path) {
            return Sns2EndpointBuilderFactory.endpointBuilder("aws2-sns", path);
        }
        /**
         * AWS Simple Notification System (SNS) (camel-aws2-sns)
         * Send messages to an AWS Simple Notification Topic using AWS SDK
         * version 2.x.
         * 
         * Category: cloud,messaging,mobile
         * Since: 3.1
         * Maven coordinates: org.apache.camel:camel-aws2-sns
         * 
         * Syntax: <code>aws2-sns:topicNameOrArn</code>
         * 
         * Path parameter: topicNameOrArn (required)
         * Topic name or ARN
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path topicNameOrArn
         * @return the dsl builder
         */
        default Sns2EndpointBuilder aws2Sns(String componentName, String path) {
            return Sns2EndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static Sns2EndpointBuilder endpointBuilder(String componentName, String path) {
        class Sns2EndpointBuilderImpl extends AbstractEndpointBuilder implements Sns2EndpointBuilder {
            public Sns2EndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new Sns2EndpointBuilderImpl(path);
    }
}