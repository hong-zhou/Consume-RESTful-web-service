package com.hongzhou.contractclient.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestOperations;

import com.hongzhou.contractDto.Contract;

/**
 * 
 * @author Hong Zhou
 * @Created on 04-12-2018
 *
 */
@Component
public class ContractClient {
	
	@Autowired
	private RestOperations restOperations;
	
	private final String url;
	
	@Autowired
	public ContractClient(@Value("${contract.service.url}") final String url) {
		this.url = url;
	}
	
	public Contract getContract(final int contractNumber) {
		return restOperations.getForObject(url,Contract.class, contractNumber);
	}

}
