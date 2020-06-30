package com.yangq.selfmotivation.handle;

import com.yangq.selfmotivation.exception.ElasticsearchException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * <p>
 * 统一异常处理
 * </p>
 *
 * @package: com.xkcoding.exception.handler.handler
 * @description: 统一异常处理
 * @author: yangkai.shen
 * @date: Created in 2018/10/2 9:26 PM
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: yangkai.shen
 */
@ControllerAdvice
@Slf4j
public class DemoExceptionHandler {
	private static final String DEFAULT_ERROR_VIEW = "error";



	/**
	 * 统一 es 异常处理
	 *
	 * @param exception ElasticsearchException
	 * @return 统一跳转到异常页面
	 */
	@ExceptionHandler(value = ElasticsearchException.class)
	public ModelAndView pageErrorHandler(ElasticsearchException exception) {
		log.error("【ElasticsearchException】:{}", exception.getMessage());
		ModelAndView view = new ModelAndView();
		view.addObject("message", exception.getMessage());
		view.setViewName(DEFAULT_ERROR_VIEW);
		return view;
	}
}
