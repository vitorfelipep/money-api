package com.prj.money.api.config.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

@ConfigurationProperties("moneyApi")
@Getter 
public class MoneyApiProperty {
	
	@Setter
	private String origemPermitida = "http://localhost:8080";
	
	private final SecurityApp security = new SecurityApp();
	
	@Getter @Setter
	public static class SecurityApp {
		
		private boolean enableHttps;
	}
	
}
