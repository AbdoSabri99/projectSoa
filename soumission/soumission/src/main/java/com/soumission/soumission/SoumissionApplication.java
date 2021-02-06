package com.soumission.soumission;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class SoumissionApplication {
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate()
	{
		HttpComponentsClientHttpRequestFactory clientCompenentsClientHttpRequestFactory=new HttpComponentsClientHttpRequestFactory();
		clientCompenentsClientHttpRequestFactory.setConnectTimeout(3000);
		return  new RestTemplate(clientCompenentsClientHttpRequestFactory);
	}

	public static void main(String[] args) {
		SpringApplication.run(SoumissionApplication.class, args);
	}

}
