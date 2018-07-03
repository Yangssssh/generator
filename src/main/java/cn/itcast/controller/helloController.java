package cn.itcast.controller;

import cn.itcast.entity.Hello;
import cn.itcast.service.helloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@RequestMapping("/test")
@Controller
public class helloController {
    @Autowired
    private helloService helloservice;

    /*@RequestMapping("/hello.action")
    public ModelAndView testhello() throws Exception{
        Hello hel=helloservice.findById("HelloWorld!!");
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("hel",hel);
        modelAndView.setViewName("hello");
        return modelAndView;
    }*/
    @RequestMapping("/hello.action")
    public String test(Model model) throws Exception{
           Hello hel=helloservice.findById("HelloWorld!!");
           model.addAttribute("hel",hel);
           return "hello";
    }
}
