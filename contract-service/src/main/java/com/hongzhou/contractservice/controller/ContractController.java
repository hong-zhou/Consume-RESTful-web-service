package com.hongzhou.contractservice.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hongzhou.contractDto.Contract;

/**
 * 
 * @author Hong Zhou
 * @created 04-12-2018
 *
 */
@RestController
@RequestMapping(ContractController.CONTRACT_BASE_URI)
public class ContractController {
	
	public static final String CONTRACT_BASE_URI = "service/v1/contracts";
	
	@RequestMapping(value = "{contractNumber}")
	public Contract getContract(@PathVariable final int contractNumber) {
		Contract contract = new Contract();
		contract.setName("Hong Zhou");
		contract.setContractNumber(contractNumber);
		
		return contract;
	}

}
