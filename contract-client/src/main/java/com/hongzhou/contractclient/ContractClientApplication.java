package com.hongzhou.contractclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hongzhou.contractDto.Contract;
import com.hongzhou.contractclient.client.ContractClient;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class ContractClientApplication implements CommandLineRunner {
	
	@Autowired
	private ContractClient contractClient;
	
	public static void main(String[] args) {
		SpringApplication.run(ContractClientApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Contract contract = contractClient.getContract(2);	
		log.info("Response:{}:" + contract );
	}
}
