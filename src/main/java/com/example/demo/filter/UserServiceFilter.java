package com.example.demo.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class UserServiceFilter implements Filter {

	private Logger log = LoggerFactory.getLogger(UserServiceFilter.class);

	@Override
	public void init(FilterConfig arg0) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) request;
		log.info(req.getRequestURI());
		log.info(req.getMethod());
		log.info(req.getRemoteAddr());
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		System.out.println("User Service Filter Destroy()");
		Filter.super.destroy();
	}

	// other methods
}
