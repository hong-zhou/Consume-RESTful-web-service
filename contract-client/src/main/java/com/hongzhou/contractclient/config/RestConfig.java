package com.hongzhou.contractclient.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

/**
 * 
 * @author Hong Zhou
 * @created 04-12-2018
 *
 */
@Configuration
public class RestConfig {
	
	@Bean
	public RestOperations createRestTemplate(final ClientHttpRequestFactory clientHttpRequestFactory) {
		return new RestTemplate(clientHttpRequestFactory);
	}
	
	@Bean
	public ClientHttpRequestFactory createClientHttpRequestFactory(@Value("${connect.timeout}") final int connectTimeout, @Value("${read.timeout}") int readTimeout) {
		HttpComponentsClientHttpRequestFactory httpComponentsClientRequestFactory = new HttpComponentsClientHttpRequestFactory();
		httpComponentsClientRequestFactory.setReadTimeout(readTimeout);
		httpComponentsClientRequestFactory.setConnectionRequestTimeout(connectTimeout);
		
		return httpComponentsClientRequestFactory;		
	}

}
