package com.prj.money.api.cors;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.prj.money.api.config.property.MoneyApiProperty;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class CorsFilter implements Filter{
	
	private final static String OPTIONS = "OPTIONS";
	private final static String ORIGIN = "Origin";
	
	@Autowired
	private MoneyApiProperty moneyPropertie;
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		 HttpServletRequest req = (HttpServletRequest) request;
		 HttpServletResponse resp = (HttpServletResponse) response;
		 

		 resp.setHeader("Access-Control-Allow-Origin", moneyPropertie.getOrigemPermitida());
		 resp.setHeader("Access-Control-Allow-Credentials", "true");
		 
		 if(OPTIONS.equals(req.getMethod()) && moneyPropertie.getOrigemPermitida().equals(req.getHeader(ORIGIN))) {
			 resp.setHeader("Access-Control-Allow-Methods", "POST, GET, DELETE, PUT, OPTIONS");
			 resp.setHeader("Access-Control-Allow-Headers", "Authorization, Content-Type, Accept");
			 resp.setHeader("Access-Control-Max-Age", "3600");
			
			 resp.setStatus(HttpServletResponse.SC_OK);
		 }else {
			 chain.doFilter(req, resp);
		 }
	}
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	@Override
	public void destroy() {
	}

}
