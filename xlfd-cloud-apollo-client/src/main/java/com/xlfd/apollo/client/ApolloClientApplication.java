package com.xlfd.apollo.client;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableApolloConfig
public class ApolloClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApolloClientApplication.class, args);
	}
}
