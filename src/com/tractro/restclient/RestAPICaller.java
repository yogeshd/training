package com.tractro.restclient;

import java.io.IOException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.tractro.restclient.DTO;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;
import com.sun.jersey.api.client.filter.LoggingFilter;

public final class RestAPICaller {

	private RestAPICaller() {

	}

	private static final Logger LOGGER = LoggerFactory.getLogger(RestAPICaller.class);

	private static final Client CLIENT = Client.create();
	private static final ObjectMapper MAPPER = new ObjectMapper();

	public static ClientResponse get(String clientId, String requestURL) {
		LOGGER.debug(" requestURL = " + requestURL);
		WebResource webResource = CLIENT.resource(requestURL);
		return null;//webResource.type(CheckoutCommonConstants.CONTENT_TYPE).header(CheckoutCommonConstants.X_CLIENT_ID, clientId).get(ClientResponse.class);
	}

	public static ClientResponse post(String clientId, String requestURL, String postData) {
		LOGGER.debug(" requestURL = " + requestURL);
		LOGGER.debug(" postData = " + postData);
		WebResource webResource = CLIENT.resource(requestURL);
		return null;//webResource.type(CheckoutCommonConstants.CONTENT_TYPE).header(CheckoutCommonConstants.X_CLIENT_ID, clientId).post(ClientResponse.class, postData);
	}

	public static <E extends ExternalAPI> E get(String clientId, String requestURL, Class<E> returnType)  {
		LOGGER.debug(" calling api url :" + requestURL);
		WebResource webResource = CLIENT.resource(requestURL);
		ClientResponse apiResponse = null;//webResource.type(CheckoutCommonConstants.CONTENT_TYPE).header(CheckoutCommonConstants.X_CLIENT_ID, clientId).get(ClientResponse.class);
		String jsonResponse = apiResponse.getEntity(String.class);
		int httpStatus = apiResponse.getStatus();
		LOGGER.debug(" httpStatus :" + httpStatus);
		LOGGER.debug(" response : " + jsonResponse);
		E api=null;
		try {
			api = MAPPER.readValue(jsonResponse, returnType);
			api.setHttpStatus(httpStatus);
		} catch (JsonParseException e) {
			//throw new CheckoutAPIException(" error while parsing " + requestURL, e);
		} catch (JsonMappingException e) {
			//throw new CheckoutAPIException(" mapping error for " + requestURL, e);
		} catch (IOException e) {
			//throw new CheckoutAPIException(" unable to connect to the service " + requestURL, e);
		}
		return api;
	}

	public static <E extends ExternalAPI> E post(String clientId, String requestURL, DTO postData, Class<E> returnType)  {
		LOGGER.debug(" requestURL = " + requestURL);
		LOGGER.debug(" postData = " + postData);
		LOGGER.debug(" calling api url :" + requestURL);
		E api=null;
		try {
			String strPostData = MAPPER.writeValueAsString(postData);
			LOGGER.debug(" calling api post data : " + strPostData);
			WebResource webResource = CLIENT.resource(requestURL);
			
			 final HTTPBasicAuthFilter authFilter = new HTTPBasicAuthFilter("iapp_user", "rockinINthefr33worlD");     
			 CLIENT.addFilter(authFilter);     
			 CLIENT.addFilter(new LoggingFilter()); 
			
			//ClientResponse apiResponse = webResource.type(CheckoutCommonConstants.CONTENT_TYPE).header(CheckoutCommonConstants.X_CLIENT_ID, clientId).post(ClientResponse.class, strPostData);
			ClientResponse apiResponse = webResource.type("application/json").header("X_CLIENT_ID", clientId).post(ClientResponse.class, strPostData);
			String jsonResponse = apiResponse.getEntity(String.class);
			LOGGER.debug(" response : " + jsonResponse);
			int httpStatus = apiResponse.getStatus();
			LOGGER.debug(" httpStatus :" + httpStatus);
			api = MAPPER.readValue(jsonResponse, returnType);
			api.setHttpStatus(httpStatus);
		} catch (JsonParseException e) {
			//throw new CheckoutAPIException(" error while parsing " + requestURL, e);
		} catch (JsonMappingException e) {
			//throw new CheckoutAPIException(" mapping error for " + requestURL, e);
		} catch (IOException e) {
			//throw new CheckoutAPIException(" unable to connect to the service " + requestURL, e);
		}
		return api;
	}
	
	public static void main(String arg[]){
	  TestThis postdata=new TestThis();
	  postdata.setDevice_id("aae9122b9d2664352c09cc4ee9a1e050");
	  postdata.setUser_id("aae9122b9d2664352c09cc4ee9a1e050");
	  post("abc","https://ias.livenation.com/users/register",postdata,ResponseThis.class);
	}
}
