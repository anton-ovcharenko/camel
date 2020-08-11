/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.resteasy;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.http.HttpEndpointConfigurer;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class ResteasyEndpointConfigurer extends HttpEndpointConfigurer implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        ResteasyEndpoint target = (ResteasyEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "async": target.setAsync(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "eagercheckcontentavailable":
        case "eagerCheckContentAvailable": target.setEagerCheckContentAvailable(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "httpmethodrestrict":
        case "httpMethodRestrict": target.setHttpMethodRestrict(property(camelContext, java.lang.String.class, value)); return true;
        case "matchonuriprefix":
        case "matchOnUriPrefix": target.setMatchOnUriPrefix(property(camelContext, boolean.class, value)); return true;
        case "muteexception":
        case "muteException": target.setMuteException(property(camelContext, boolean.class, value)); return true;
        case "optionsenabled":
        case "optionsEnabled": target.setOptionsEnabled(property(camelContext, boolean.class, value)); return true;
        case "password": target.setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyclientclass":
        case "proxyClientClass": target.setProxyClientClass(property(camelContext, java.lang.String.class, value)); return true;
        case "responsebuffersize":
        case "responseBufferSize": target.setResponseBufferSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "resteasymethod":
        case "resteasyMethod": target.setResteasyMethod(property(camelContext, java.lang.String.class, value)); return true;
        case "servletname":
        case "servletName": target.setServletName(property(camelContext, java.lang.String.class, value)); return true;
        case "sethttpresponseduringprocessing":
        case "setHttpResponseDuringProcessing": target.setSetHttpResponseDuringProcessing(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "skipservletprocessing":
        case "skipServletProcessing": target.setSkipServletProcessing(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "traceenabled":
        case "traceEnabled": target.setTraceEnabled(property(camelContext, boolean.class, value)); return true;
        case "username": target.setUsername(property(camelContext, java.lang.String.class, value)); return true;
        default: return super.configure(camelContext, obj, name, value, ignoreCase);
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = super.getAllOptions(target);
        answer.put("async", boolean.class);
        answer.put("bridgeErrorHandler", boolean.class);
        answer.put("eagerCheckContentAvailable", boolean.class);
        answer.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        answer.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        answer.put("httpMethodRestrict", java.lang.String.class);
        answer.put("matchOnUriPrefix", boolean.class);
        answer.put("muteException", boolean.class);
        answer.put("optionsEnabled", boolean.class);
        answer.put("password", java.lang.String.class);
        answer.put("proxyClientClass", java.lang.String.class);
        answer.put("responseBufferSize", java.lang.Integer.class);
        answer.put("resteasyMethod", java.lang.String.class);
        answer.put("servletName", java.lang.String.class);
        answer.put("setHttpResponseDuringProcessing", java.lang.Boolean.class);
        answer.put("skipServletProcessing", java.lang.Boolean.class);
        answer.put("traceEnabled", boolean.class);
        answer.put("username", java.lang.String.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        ResteasyEndpoint target = (ResteasyEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "async": return target.isAsync();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "eagercheckcontentavailable":
        case "eagerCheckContentAvailable": return target.isEagerCheckContentAvailable();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "httpmethodrestrict":
        case "httpMethodRestrict": return target.getHttpMethodRestrict();
        case "matchonuriprefix":
        case "matchOnUriPrefix": return target.isMatchOnUriPrefix();
        case "muteexception":
        case "muteException": return target.isMuteException();
        case "optionsenabled":
        case "optionsEnabled": return target.isOptionsEnabled();
        case "password": return target.getPassword();
        case "proxyclientclass":
        case "proxyClientClass": return target.getProxyClientClass();
        case "responsebuffersize":
        case "responseBufferSize": return target.getResponseBufferSize();
        case "resteasymethod":
        case "resteasyMethod": return target.getResteasyMethod();
        case "servletname":
        case "servletName": return target.getServletName();
        case "sethttpresponseduringprocessing":
        case "setHttpResponseDuringProcessing": return target.getSetHttpResponseDuringProcessing();
        case "skipservletprocessing":
        case "skipServletProcessing": return target.getSkipServletProcessing();
        case "traceenabled":
        case "traceEnabled": return target.isTraceEnabled();
        case "username": return target.getUsername();
        default: return super.getOptionValue(obj, name, ignoreCase);
        }
    }
}

