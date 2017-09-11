/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anuk.sample.controller;


import com.anuk.sample.entity.person;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author anukshakya
 */
@Controller
public class sampleController {
    
    
    @RequestMapping(value="/hello")
    public String showIndex()
    {
       return "hello";
    
    }
    
    @RequestMapping(value="/sudip")
    public void showData(@ModelAttribute("per") person per, HttpServletResponse res) throws Exception
    {
     
    res.getWriter().println("Name : "+ per.getName()+"Age : "+per.getAge());
    }
    
    
}
