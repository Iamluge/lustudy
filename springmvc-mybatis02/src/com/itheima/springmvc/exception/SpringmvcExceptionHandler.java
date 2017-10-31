package com.itheima.springmvc.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class SpringmvcExceptionHandler implements HandlerExceptionResolver{

	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object object,
			Exception exception) {
		ModelAndView modelAndView =new ModelAndView();
		modelAndView.addObject("error","未知异常！！！");
		modelAndView.setViewName("error");
		return modelAndView;
	}

}
