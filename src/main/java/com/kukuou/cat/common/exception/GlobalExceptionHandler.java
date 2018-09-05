package com.kukuou.cat.common.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 全局异常处理
 *
 * @author olx
 * @date 2018/9/4/004
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    /**
     * 异常的捕捉
     * @return 页面
     */
    //@ExceptionHandler(BusinessException.class)
    //public ModelAndView defaultErrorHandlePage(HttpServletRequest req, BusinessException e) {
    //    ModelAndView modelAndView = new ModelAndView();
    //    modelAndView.addObject("message",e.getMessage());
    //    modelAndView.addObject("url",req.getRequestURL());
    //    modelAndView.setViewName("error");
    //    return modelAndView;
    //}

    /**
     * 返回异常数据
     * @return 方法二
     */
    //@ExceptionHandler(BusinessException.class)
    //@ResponseBody
    //public String defaultErrorHandlePage(HttpServletRequest req, BusinessException e) {
    //    return e.getMessage()+req.getRequestURL();
    //}

    /**
     * 方法三
     * @return 返回统一的JSON返回对象
     */
    @ExceptionHandler(BusinessException.class)
    @ResponseBody
    public Response<String> defaultErrorHandlePage(HttpServletRequest req, BusinessException e) {
        Response<String> response = new Response<>();
        response.setData("异常");
        response.setErrorCode(e.getErrorCode());
        response.setErrorMessage(e.getMessage());
        response.setUrl(req.getRequestURL().toString());
        return response;
    }


}
