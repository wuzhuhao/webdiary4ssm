package com.ssm.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import util.JsonUtils;
import util.Result;

import java.io.IOException;
//implements HandlerExceptionResolver
@ControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger logger;

    static {
        logger = LogManager.getLogger(GlobalExceptionHandler.class);
    }

    @ExceptionHandler(value = Exception.class)
    public ModelAndView defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        ModelAndView mav = new ModelAndView();
        mav.addObject("exception", e);
        mav.addObject("url", req.getRequestURL());
        mav.setViewName("errorPage");
        return mav;
    }

    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
            logger.error("服务器出错", e);
        //如果是ajax请求，就返回一个json格式的出错提示信息
        if (httpServletRequest.getHeader("X-Requested-With") != null) {
            try {
                httpServletResponse.getWriter().println(JsonUtils.objectToJson(Result.failure("服务器出错了")));
            } catch (IOException ex) {
                logger.error("服务器失败时发送错误提示信息失败", ex);
            }
            //返回一个空的ModelAndView表示已经手动生成响应
            //return null表示使用默认的处理方式，等于没处理
            return new ModelAndView();
        } else {
            return new ModelAndView("errorPage");
        }
    }
}

