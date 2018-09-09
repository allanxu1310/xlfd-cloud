package com.xlfd.api.gateway;

import com.xlfd.api.gateway.filter.AccessFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy  //启用网关路由
@EnableEurekaClient
@EnableOAuth2Sso    //启用OAuth2单点登录
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

	/**
	 * 资源过滤器
	 * @return
	 */
	@Bean
	public AccessFilter accessFilter(){
		return new AccessFilter();
	}

}
