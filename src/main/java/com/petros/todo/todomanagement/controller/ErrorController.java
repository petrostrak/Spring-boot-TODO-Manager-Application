/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.petros.todo.todomanagement.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author petros_trak
 */

@Controller("error")
public class ErrorController {
        
    public ModelAndView handleException(HttpServletRequest request, Exception ex) {
        ModelAndView mv = new ModelAndView();
        
        mv.addObject("exception", ex.getLocalizedMessage());
        mv.addObject("url", request.getRequestURI());
        
        mv.setViewName("error");
        return mv;
    }
}
