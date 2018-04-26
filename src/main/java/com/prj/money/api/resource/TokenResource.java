package com.prj.money.api.resource;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tokens")
public class TokenResource {
	
	private final static String URL_OAUTH_TOKEN = "/oauth/token";
	private final static String REFRESH_TOKEN = "refreshToken";
	
	@DeleteMapping("/revoke")
	public void revoke(HttpServletRequest req, HttpServletResponse resp) {
		Cookie cookie = new Cookie(REFRESH_TOKEN, null);
		cookie.setHttpOnly(true);
		cookie.setSecure(false); //TODO mudar em produção
		cookie.setPath(req.getContextPath() + URL_OAUTH_TOKEN);
		cookie.setMaxAge(0);
		
		resp.addCookie(cookie);
		resp.setStatus(HttpStatus.NO_CONTENT.value());
	}
}
