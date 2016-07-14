package com.redq.latte.controller.error;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

import com.redq.latte.common.response.RestErrorObject;
import com.redq.latte.common.response.RestErrorResponse;
import com.redq.latte.common.response.RestResponse;

/**
 * General error handler for the application.
 */
@ControllerAdvice
class ExceptionHandler {

	Logger log = LoggerFactory.getLogger(this.getClass());

	/**
	 * Handle exceptions thrown by handlers.
	 */
	@ResponseBody
	@org.springframework.web.bind.annotation.ExceptionHandler(value = Exception.class)
	public RestResponse exception(HttpServletRequest req, Exception e) {
		log.error(req.getRequestURI() + " general error", e);
		
		RestErrorObject error = new RestErrorObject("", e.getMessage());
		RestErrorResponse response = new RestErrorResponse(error);
		return response;
	}
}